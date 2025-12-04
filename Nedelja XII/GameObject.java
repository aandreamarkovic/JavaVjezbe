public abstract class GameObject {
	private int x;
	private int y;
	private Collidable collider;

	public GameObject(int x, int y, Collidable collider) {
		setX(x);
		setY(y);
		setCollider(collider);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x < 0) {
			throw new IllegalArgumentException("X koordinata ne može biti negativna!");
		}
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y < 0) {
			throw new IllegalArgumentException("Y koordinata ne može biti negativna!");
		}
		this.y = y;
	}

	public Collidable getCollider() {
		return collider;
	}

	public void setCollider(Collidable collider) {
		if (collider == null) {
			throw new IllegalArgumentException("Collider ne može biti null!");
		}
		this.collider = collider;
	}

	public boolean intersects(GameObject other) {
		if (other == null || this.collider == null || other.collider == null) {
			return false;
		}

		if (this.collider instanceof RectangleCollider && other.collider instanceof RectangleCollider) {
			RectangleCollider r1 = (RectangleCollider) this.collider;
			RectangleCollider r2 = (RectangleCollider) other.collider;

			return this.x < other.x + r2.getWidth() && this.x + r1.getWidth() > other.x
					&& this.y < other.y + r2.getHeight() && this.y + r1.getHeight() > other.y;
		} else if (this.collider instanceof CircleCollider && other.collider instanceof CircleCollider) {
			CircleCollider c1 = (CircleCollider) this.collider;
			CircleCollider c2 = (CircleCollider) other.collider;

			int deltaX = this.x - other.x;
			int deltaY = this.y - other.y;
			int radiusSum = c1.getRadius() + c2.getRadius();
			return (deltaX * deltaX + deltaY * deltaY) <= (radiusSum * radiusSum);
		} else if (this.collider instanceof RectangleCollider && other.collider instanceof CircleCollider) {
			RectangleCollider rect = (RectangleCollider) this.collider;
			CircleCollider circ = (CircleCollider) other.collider;

			int nearestX = Math.max(this.x, Math.min(other.x, this.x + rect.getWidth()));
			int nearestY = Math.max(this.y, Math.min(other.y, this.y + rect.getHeight()));
			int deltaX = other.x - nearestX;
			int deltaY = other.y - nearestY;
			return (deltaX * deltaX + deltaY * deltaY) <= (circ.getRadius() * circ.getRadius());
		} else if (this.collider instanceof CircleCollider && other.collider instanceof RectangleCollider) {

			CircleCollider circ = (CircleCollider) this.collider;
			RectangleCollider rect = (RectangleCollider) other.collider;
			int nearestX = Math.max(other.x, Math.min(this.x, other.x + rect.getWidth()));
			int nearestY = Math.max(other.y, Math.min(this.y, other.y + rect.getHeight()));
			int deltaX = this.x - nearestX;
			int deltaY = this.y - nearestY;
			return (deltaX * deltaX + deltaY * deltaY) <= (circ.getRadius() * circ.getRadius());
		}
		return false;
	}

	public abstract String getDisplayName();

	@Override
	public String toString() {
		return getDisplayName() + " na (" + x + "," + y + ")";
	}
}