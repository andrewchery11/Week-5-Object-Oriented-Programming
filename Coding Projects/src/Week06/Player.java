package Week06;

import java.util.ArrayList;
import java.util.List;


public class Player {
	List<Card> hand; 
	int score; 
	String name;
	
	// Method (constructor)
	public Player(String name ) {
		
		// sets players name to provided value 
		this.name = name;
		
	// a new ArrayList to store the player’s cards.
		this.hand = new ArrayList <>();
		
	//sets the beginning score of the player to 0.
		this.score = 0; 
	}
	
    // describe the player
	 public void describe() {
		 
	        System.out.println(name + "'s hand:");
	        
	        //goes through each card in the player's hand
	        for (Card card : hand) {
	        	
	        	//calls the describe() method on each Card
	            card.describe();
	        }
	        System.out.println("Score: " + score);
	    }
	 public Card flip() {
		 
		    // Check if the hand is empty
		    if (hand.isEmpty()) {
		    	
		        return null; // Return null if there are no cards in the hand
		    }

		    // Gets index of the last card in the hand
		    int lastIndex = hand.size() - 1;

		    // Gets the last card from the hand
		    Card topCard = hand.get(lastIndex);

		    // Remove the last card from the hand
		    hand.remove(lastIndex);

		    // Return the card that was removed
		    return topCard;
		}
	
	
	//draw a card from the given Deck and add it to the player's hand.
	  public void draw(Deck deck) {
		  
//calls the draw method on the deck to get a card from the deck.
	        Card card = deck.draw();
	        
	        //checks if the card we got isn't null. If it’s null, it mean the deck is empty.
	        if (card != null) {
	        	
	        	//adds card to hand if card isn't null 
	            hand.add(card);
	        }
	    }
	  
	
	  
	  // increment the player's score
	    public void incrementScore() {
	        score++;
	    }

	    // getter method to retrieve the player’s current score

	    public int getScore() {
	        return score;
	    }
	    // method to retrieve the player’s name.
	    public String getName() {
	        return name;
	    }

		
	

		
		}
	
	  
	  
	  
	  
	  
	  
	  
	  
	  


	
	
	
	
	
	
	


