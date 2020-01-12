
public class Tortue extends Tuile {
	
	private String orientation;
	
	// Constructeur de la tortue
	public Tortue(String type, int positionX, int positionY, String orientation) {
		this.type = type;
		this.positionX = positionX;
		this.positionY = positionY;
		this.orientation = orientation;
	}
	
	public String getOrientation() {
		return this.orientation;
	}
}