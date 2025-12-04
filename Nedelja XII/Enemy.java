public class Enemy extends GameObject implements Attacker {
	private String type;
	private int damage;
	private int health;

	public Enemy(String type, int x, int y, Collidable collider, int damage, int health) {
		super(x, y, collider);
		setType(type);
		setDamage(damage);
		setHealth(health);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type == null || type.trim().isEmpty()) {
			throw new IllegalArgumentException("Tip neprijatelja ne može biti prazan!");
		}
		this.type = type.trim();
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (damage < 0) {
			throw new IllegalArgumentException("Damage ne može biti negativan!");
		}
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0) {
			throw new IllegalArgumentException("Health ne može biti negativan!");
		}
		this.health = health;
	}

	@Override
	public int getEffectiveDamage() {
		return damage;
	}

	@Override
	public String getDisplayName() {
		return type;
	}

	@Override
	public String toString() {
		return type + " (health=" + health + ", damage=" + damage + ", pos=(" + getX() + "," + getY() + "))";
	}
}