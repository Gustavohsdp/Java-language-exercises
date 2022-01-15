package exercicio1;

public class Pontos {

	private int X;
	private int Y;

	public Pontos(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Pontos other = (Pontos) obj;
		if (this.X != other.X) {
			return false;
		}
		if (this.Y != other.Y) {
			return false;
		}
		return true;
	}

	public int getX() {
		return X;
	}

	public void setX(int X) {
		this.X = X;
	}

	public int getY() {
		return Y;
	}

	public void setY(int Y) {
		this.Y = Y;
	}

	public String toString() {
		return "Pontos{" + "X=" + X + ", Y=" + Y + '}';
	}

}
