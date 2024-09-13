package Week06;

public class Card {

 int value; 
 String name;
 
 	// constructor (a.k.a method)
 
	 public Card(int value, String name) {
	        this.value = value;
	        this.name = name;
	 }
	 
	 
	 
	 // Getters and Setters 
	    public int getValue() {
	        return value;
	    }
	 // this.value = value; assigns the parameter value to the value field of the current card.
	    public void setValue(int value) {
	        this.value = value;
	    }
	 
	 // returns the current value of the name field when the getName() method is called.
	    public String getName() {
	        return name;
	    }
	 // This assigns the parameter name to the name field of the current card.
	    public void setName(String name) {
	        this.name = name;
	       
	    }

	    // Describe the card
	    //public method that does not return any value but prints out description of card. 
	    
	    public void describe() {
	        System.out.println(name);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
