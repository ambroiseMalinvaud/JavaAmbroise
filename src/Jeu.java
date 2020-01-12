
public class Jeu {
	
	public Joueur joueur1;
	public Joueur joueur2;
	public Joueur joueur3;
	public Joueur joueur4;
	
	public Tortue tortue1;
	public Tortue tortue2;
	public Tortue tortue3;
	public Tortue tortue4;
	
	public Joyau joyau1;
	public Joyau joyau2;
	public Joyau joyau3;
	public Joyau joyau4;
	
	public Plateau board;
	
	public Jeu(int gameMode) {
		
		// Création du plateau de jeu
		this.board = new Plateau(gameMode);
		
		// Initialisation d'un jeu à 2 joueurs
		if(gameMode == 2) {
			
			// Initialisation des tortues
			this.tortue1 = new Tortue("tBleu", 0, 1, "S");
			this.tortue2 = new Tortue("tRouge", 0, 5, "S");
			
			// Initialisation des joueurs
			this.joueur1 = new Joueur(1, tortue1);
			this.joueur2 = new Joueur(2, tortue2);
			
			// Initialisation des joyaux
			this.joyau1 = new Joyau("joyau", 7, 3);
			
			// Initialisation d'un mur
			Mur mur = new Mur("murP", 0, 7);
			
			// Ajout des tortues sur le plateau
			board.getBoard()[tortue1.getPositionX()][tortue1.getPositionY()] = tortue1;
			board.getBoard()[tortue2.getPositionX()][tortue2.getPositionY()] = tortue2;
			
			// Ajout du joyau sur le plateau
			board.getBoard()[joyau1.getPositionX()][joyau1.getPositionY()] = joyau1;
			
			//Ajout des murs sur le plateau
			for (int i = 0; i < 8; i++) {
				board.getBoard()[i][7] = mur;
			}
		}
		
		// Initialisation d'un jeu à 3 joueurs
		if(gameMode == 3) {
			
			// Initialisation des tortues
			this.tortue1 = new Tortue("tBleue", 0, 0, "S");
			this.tortue2 = new Tortue("tRouge", 0, 3, "S");
			this.tortue3 = new Tortue("tVerte", 0, 6, "S");
			
			// Initialisation des joueurs
			this.joueur1 = new Joueur(1, tortue1);
			this.joueur2 = new Joueur(2, tortue2);
			this.joueur3 = new Joueur(3, tortue3);
			
			// Initialisation des joyaux
			this.joyau1 = new Joyau("joyau1", 7, 0);
			this.joyau2 = new Joyau("joyau2", 7, 3);
			this.joyau3 = new Joyau("joyau3", 7, 6);
			
			// Initialisation d'un mur
			Mur mur = new Mur("murP", 0, 7);
			
			// Ajout des tortues sur le plateau
			board.getBoard()[tortue1.getPositionX()][tortue1.getPositionY()] = tortue1;
			board.getBoard()[tortue2.getPositionX()][tortue2.getPositionY()] = tortue2;
			board.getBoard()[tortue3.getPositionX()][tortue3.getPositionY()] = tortue3;
			
			// Ajout du joyau sur le plateau
			board.getBoard()[joyau1.getPositionX()][joyau1.getPositionY()] = joyau1;
			board.getBoard()[joyau2.getPositionX()][joyau2.getPositionY()] = joyau2;
			board.getBoard()[joyau3.getPositionX()][joyau3.getPositionY()] = joyau3;
			
			//Ajout des murs sur le plateau
			for (int i = 0; i < 8; i++) {
				board.getBoard()[i][7] = mur;
			}
		}
		
		// Initialisation d'un jeu à 4 joueurs
		if(gameMode == 4) {
			
			// Initialisation des tortues
			this.tortue1 = new Tortue("tBleue", 0, 0, "S");
			this.tortue2 = new Tortue("tRouge", 0, 2, "S");
			this.tortue3 = new Tortue("tVerte", 0, 5, "S");
			this.tortue4 = new Tortue("tRose", 0, 7, "S");
			
			// Initialisation des joueurs
			this.joueur1 = new Joueur(1, tortue1);
			this.joueur2 = new Joueur(2, tortue2);
			this.joueur3 = new Joueur(3, tortue3);
			this.joueur4 = new Joueur(4, tortue4);
			
			// Initialisation des joyaux
			this.joyau1 = new Joyau("joyau1", 7, 0);
			this.joyau2 = new Joyau("joyau2", 7, 6);
			
			// Ajout des tortues sur le plateau
			board.getBoard()[tortue1.getPositionX()][tortue1.getPositionY()] = tortue1;
			board.getBoard()[tortue2.getPositionX()][tortue2.getPositionY()] = tortue2;
			board.getBoard()[tortue3.getPositionX()][tortue3.getPositionY()] = tortue3;
			board.getBoard()[tortue4.getPositionX()][tortue4.getPositionY()] = tortue4;
			
			// Ajout du joyau sur le plateau
			board.getBoard()[joyau1.getPositionX()][joyau1.getPositionY()] = joyau1;
			board.getBoard()[joyau2.getPositionX()][joyau2.getPositionY()] = joyau2;
		}
		
		//board.displayBoard();
	}
}
