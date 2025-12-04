public class BossEnemy extends Enemy {
	public BossEnemy(String type, int x, int y, Collidable collider, int damage, int health) {
		super(type, x, y, collider, damage, health);
	}

	@Override
	public int getEffectiveDamage() {

		return 2 * super.getEffectiveDamage();
	}

	@Override
	public String toString() {

		return "BOSS " + super.toString();
	}
}