public class RectangleCollider implements Collidable {
	private int width;
	private int height;

	public RectangleCollider(int width, int height) {
		if (width <= 0 || height <= 0) {
			throw new IllegalArgumentException("Širina i visina pravougaonika moraju biti > 0");
		}
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public boolean intersects(Collidable other) {

		if (other instanceof RectangleCollider) {
			return true;
		} else if (other instanceof CircleCollider) {
			return true;
		}
		return false;
	}
}