import java.io.*;
import java.util.*;

public class Game {
	private Player player;
	private ArrayList<Enemy> enemies = new ArrayList<>();
	private ArrayList<String> log = new ArrayList<>();

	public Game() {
	}

	public Game(Player player) {
		this.player = player;
		log.add("Kreiran igrač: " + player);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player p) {
		if (p == null)
			throw new IllegalArgumentException("Player ne može biti null");
		this.player = p;
		log.add("Postavljen igrač: " + p);
	}

	public List<Enemy> getEnemies() {
		return enemies;
	}

	public List<String> getLog() {
		return log;
	}

	public void addEnemy(Enemy e) {
		if (e == null)
			throw new IllegalArgumentException("Enemy ne može biti null");
		enemies.add(e);
		log.add("Dodat neprijatelj: " + e);
	}

	public boolean checkCollision(GameObject a, GameObject b) {
		if (a == null || b == null)
			return false;
		return a.intersects(b);
	}

	public void decreaseHealth(Player p, Enemy e) {
		int dmg = e.getEffectiveDamage();
		int nh = p.getHealth() - dmg;
		if (nh < 0)
			nh = 0;
		p.setHealth(nh);
		log.add("HIT: Player by " + e.getType() + " for " + dmg + " -> health=" + p.getHealth());
	}

	public List<Enemy> findByType(String query) {
		List<Enemy> res = new ArrayList<>();
		String q = query.toLowerCase();
		for (Enemy e : enemies) {
			if (e.getType().toLowerCase().contains(q)) {
				res.add(e);
			}
		}
		return res;
	}

	public List<Enemy> collidingWithPlayer() {
		List<Enemy> res = new ArrayList<>();
		if (player == null)
			return res;
		for (Enemy e : enemies) {
			if (player.intersects(e)) {
				res.add(e);
			}
		}
		return res;
	}

	public void resolveCollisions() {
		if (player == null)
			return;
		for (Enemy e : enemies) {
			if (player.intersects(e)) {
				decreaseHealth(player, e);
				if (player.getHealth() <= 0) {
					log.add("Player je poražen u sudaru sa: " + e.getType());
					return;
				}
			}
		}
		log.add("Player je preživio sve kolizije.");
	}

	public static ArrayList<Enemy> loadEnemiesFromCSV(String path) throws IOException {
		ArrayList<Enemy> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			int lineNum = 0;

			String header = br.readLine();
			lineNum++;

			while ((line = br.readLine()) != null) {
				lineNum++;
				line = line.trim();
				if (line.isEmpty())
					continue;

				String[] parts = line.split(",", -1);
				if (parts.length != 10) {
					throw new IllegalArgumentException(
							"Linija " + lineNum + ": očekivano 10 kolona, dobiveno " + parts.length);
				}

				for (int i = 0; i < parts.length; i++) {
					parts[i] = parts[i].trim();
				}

				String type = parts[0];
				String cls = parts[1];

				int damage, health, x, y;
				try {
					damage = Integer.parseInt(parts[2]);
					health = Integer.parseInt(parts[3]);
					x = Integer.parseInt(parts[4]);
					y = Integer.parseInt(parts[5]);
				} catch (NumberFormatException ex) {
					throw new IllegalArgumentException(
							"Linija " + lineNum + ": damage/health/x/y nisu ispravni brojevi");
				}

				String shape = parts[6];
				String wStr = parts[7];
				String hStr = parts[8];
				String rStr = parts[9];

				Collidable collider;

				if (shape.equalsIgnoreCase("rectangle")) {
					int w, h;
					try {
						w = Integer.parseInt(wStr);
						h = Integer.parseInt(hStr);
					} catch (NumberFormatException ex) {
						throw new IllegalArgumentException(
								"Linija " + lineNum + ": width/height moraju biti zadati za rectangle");
					}
					collider = new RectangleCollider(w, h);

				} else if (shape.equalsIgnoreCase("circle")) {
					int r;
					try {
						r = Integer.parseInt(rStr);
					} catch (NumberFormatException ex) {
						throw new IllegalArgumentException("Linija " + lineNum + ": radius mora biti zadat za circle");
					}
					collider = new CircleCollider(r);

				} else {
					throw new IllegalArgumentException("Linija " + lineNum + ": nepoznat shape '" + shape + "'");
				}

				Enemy enemy;
				if (cls.equalsIgnoreCase("melee")) {
					enemy = new MeleeEnemy(type, x, y, collider, damage, health);
				} else if (cls.equalsIgnoreCase("boss")) {
					enemy = new BossEnemy(type, x, y, collider, damage, health);
				} else {
					throw new IllegalArgumentException(
							"Linija " + lineNum + ": nepoznata class vrijednost '" + cls + "'");
				}

				list.add(enemy);
			}
		}

		return list;
	}
}