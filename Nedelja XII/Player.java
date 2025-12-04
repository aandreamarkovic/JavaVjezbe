public class Player extends GameObject {
	private String name;
	private int health;

	public Player(String name, int health, int x, int y, Collidable collider) {
		super(x, y, collider);
		setName(name);
		setHealth(health);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Ime igrača ne može biti prazno!");
		}
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0 || health > 100) {
			throw new IllegalArgumentException("Health igrača mora biti u rasponu 0–100!");
		}
		this.health = health;
	}

	@Override
	public String getDisplayName() {
		return name;
	}

	@Override
	public String toString() {
		return "Igrač " + name + " (zdravlje=" + health + ", pozicija=(" + getX() + "," + getY() + "))";
	}
}