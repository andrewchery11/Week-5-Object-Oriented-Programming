package logger;

public class SpacedLogger implements Logger {

	  @Override
	    public void log(String message) {
	        // Build the spaced message
	        String spacedMessage = "";
	        for (int i = 0; i < message.length(); i++) {
	            spacedMessage += message.charAt(i); // Append the character
	            if (i < message.length() - 1) {
	                spacedMessage += " "; // Add a space if not the last character
	            }
	        }
	        System.out.println(spacedMessage); // Print the spaced message
	    }

	    @Override
	    public void error(String message) {
	        // Build the spaced error message
	        String spacedMessage = "ERROR: ";
	        for (int i = 0; i < message.length(); i++) {
	            spacedMessage += message.charAt(i); // Append the character
	            if (i < message.length() - 1) {
	                spacedMessage += " "; // Add a space if not the last character
	            }
	        }
	        System.out.println(spacedMessage); // Print error message
	    }
	}