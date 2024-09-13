package Week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
		List<Card> cards; 

		// method 
		public Deck() {
    	
    	// Initializes the cards as an ArrayList to hold the Card objects
        cards = new ArrayList<>();
        
        // Creates an array of strings representing the four suits in a deck of cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        // Loops through each suit in the suits array.
        for (String suit : suits) {
        	
        //Loops through card values from 2 to 14 
            for (int i = 2; i <= 14; i++) {
            	
            	// assigns a string value to the variable rank based on the integer value i. If i equals 11, the rank is set to Jack.
            	//12 is queen , and etc .
                String rank = switch (i) {
                    case 11 -> "Jack";
                    case 12 -> "Queen";
                    case 13 -> "King";
                    case 14 -> "Ace";
                    default -> String.valueOf(i);
                    
                    //If i isn't 11, 12, 13, or 14, the rank is set to the string representation of the value i.
                };
                cards.add(new Card(i, rank + " of " + suit));
            }
        }
        shuffle(); // Shuffle deck on creation
    }

    	// Shuffle the deck
    	public void shuffle() {
        Collections.shuffle(cards);
    }

    	// Draw a card from the deck
    	public Card draw() {
    	if (cards.isEmpty()) {
            // If the deck is empty, return null
            return null;
        }
        
        // Get the last card from the deck
        Card topCard = cards.get(cards.size() - 1);
        
        // Remove the last card from the deck
        cards.remove(cards.size() - 1);
        
        // Return the card that was removed
        return topCard;
    }
}
