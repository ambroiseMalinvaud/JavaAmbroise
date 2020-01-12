import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Joueur {
	
	private int number;
	private Tortue tortue;
	private ArrayList<Card> hand; // Main du joueur
	private ArrayList<Card> deck; // Pioche du joueur
	private ArrayList<Card> discard; // Pile de défausse
	private ArrayDeque<Card> program; // Programme d'insctructions
	
	// Constructeur du joueur
	public Joueur(int number, Tortue tortue) {
		this.number = number;
		this.tortue = tortue;
		this.hand = new ArrayList<Card>();
		this.deck = new ArrayList<Card>();
		this.program = new ArrayDeque<Card>();
		
		// Instanciation des cartes et ajout à deck
		for(int i = 0; i < 19; i++) {
			Card card = new Card("B");
			this.deck.add(card);
		}
		
		for(int i = 0; i < 9; i++) {
			Card card = new Card("J");
			this.deck.add(card);
		}
		
		for(int i = 0; i < 9; i++) {
			Card card = new Card("V");
			this.deck.add(card);
		}
		
		Collections.shuffle(this.deck);
		
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public ArrayList<Card> getDeck() {
		return this.deck;
	}
	
	public ArrayList<Card> getHand() {
		return this.hand;
	}
	
	public ArrayDeque<Card> getProgram() {
		return this.program;
	}
	
	// Remplir la main du joueur
	public void refillHand() {
		while(this.hand.size() < 5) {
			Collections.shuffle(this.deck);
			
			Card pick = this.deck.get(0);
			
			this.deck.remove(0);
			
			this.hand.add(pick);
		}
	}
	
	public void displayHand(Joueur joueur) {
		for (Card s : joueur.getHand()) {
			 System.out.println(s.getColor());
		}
	}
}













