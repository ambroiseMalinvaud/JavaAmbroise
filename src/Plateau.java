
public class Plateau {

	private Tuile[][] board;

	// Constructeur du plateau
	public Plateau(int gameMode) {
		this.board = new Tuile[8][8];
	}
	
	// Retourne le plateau
	public Tuile[][] getBoard() {
		return this.board;
	}

	// Affichage du plateau
	public void displayBoard() {

		for (int i = 0; i < 8; i++) {
			System.out.println("");
			for (int j = 0; j < 8; j++) {
				try {
					System.out.print(board[i][j].getType() + "\t");
				} catch (Exception e) {
					System.out.print("." + "\t");
				}
			}
		}
	}
}