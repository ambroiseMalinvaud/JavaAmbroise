public class Main {
	
	public static void main(String[] args) {
		
		int gameMode = 2;
		
		Jeu game = new Jeu(gameMode);
		
		System.out.println(game.joueur1.getDeck().size());
		System.out.println(game.joueur1.getHand().size());
		
		game.joueur1.refillHand();
		
		game.board.displayBoard();
		
		game.joueur1.displayHand(game.joueur1);
	}
}