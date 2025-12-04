public class CircleCollider implements Collidable {
	private int radius;

	public CircleCollider(int radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Poluprečnik kruga mora biti > 0");
		}
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public boolean intersects(Collidable other) {
		if (other instanceof CircleCollider) {

			return true;
		} else if (other instanceof RectangleCollider) {

			return true;
		}
		return false;
	}
}