package Week06;

public class App {

	public static void main(String[] args) {
		  // Create a new deck of cards
	    Deck deck = new Deck();
	    
	    // Create two players
	    Player player1 = new Player("Player 1");
	    Player player2 = new Player("Player 2");

	    // Deal 26 cards to each player
	    for (int i = 0; i < 26; i++) {
	        player1.draw(deck);  // Player 1 draws a card from the deck
	        player2.draw(deck);  // Player 2 draws a card from the deck
	    }

	    // Compare the cards of both players
	    for (int i = 0; i < 26; i++) {
	    	
	        // Each player flips a card
	        Card card1 = player1.flip();  
	        Card card2 = player2.flip();  

	        // Print the cards that were flipped
	        System.out.print("Player 1 flips: ");
	        card1.describe();  
	        System.out.print("Player 2 flips: ");
	        card2.describe();  

	        // Compare the value of the cards and update scores
	        if (card1.getValue() > card2.getValue()) {
	            player1.incrementScore();  // Player 1 gets a point
	            System.out.println("Player 1 gets a point!");
	        } else if (card1.getValue() < card2.getValue()) {
	            player2.incrementScore();  // Player 2 gets a point
	            System.out.println("Player 2 gets a point!");
	        } else {
	            System.out.println("It's a tie!");
	        }

	        // Print current scores
	        System.out.println("Current Score - Player 1: " + player1.getScore() + ", Player 2: " + player2.getScore());
	        
	        System.out.println();
	    }

	    // Print final scores and determine the winner
	    System.out.println("Final Scores:");
	    System.out.println("Player 1: " + player1.getScore());  
	    System.out.println("Player 2: " + player2.getScore());  

	    if (player1.getScore() > player2.getScore()) {
	        System.out.println("Player 1 wins!");
	    } else if (player1.getScore() < player2.getScore()) {
	        System.out.println("Player 2 wins!");
	    } else {
	        System.out.println("It's a draw!");
	    }
	}
}


