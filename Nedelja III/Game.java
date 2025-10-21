
public class Game {
	public static boolean checkCollision(Player p, Enemy e) {
		return p.getX() < e.getX() + e.getWidth() && p.getX() + p.getWidth() > e.getX()
				&& p.getY() < e.getY() + e.getHeight() && p.getY() + p.getHeight() > e.getY();
	}

	public static void decreaseHealth(Player p, Enemy e) {
		if (checkCollision(p, e)) {
			p.setHealth(p.getHealth() - e.getDamage());
		}
	}

	public static void main(String[] args) {
		Player player = new Player(10, 10, 30, 30, 100);
		Enemy enemy1 = new Enemy(20, 20, 30, 30, 20);
		Enemy enemy2 = new Enemy(100, 100, 30, 30, 50);

		System.out.println("Health prije sudara: " + player.getHealth());

		decreaseHealth(player, enemy1);
		decreaseHealth(player, enemy2);

		System.out.println("Health poslije sudara: " + player.getHealth());
	}
}
