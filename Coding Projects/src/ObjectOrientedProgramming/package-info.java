package ObjectOrientedProgramming;
//1. Logger interface
public interface Logger {
 void log(String message);
 void error(String message);
}

//2. AsteriskLogger class
public class AsteriskLogger implements Logger {
 @Override
 public void log(String message) {
     System.out.println("***" + message + "***");
 }

 @Override
 public void error(String message) {
     int length = message.length() + 13;
     String border = "*".repeat(length);
     System.out.println(border);
     System.out.println("***Error: " + message + "***");
     System.out.println(border);
 }
}

//3. SpacedLogger class
public class SpacedLogger implements Logger {
 private String addSpaces(String message) {
     return String.join(" ", message.split(""));
 }

 @Override
 public void log(String message) {
     System.out.println(addSpaces(message));
 }

 @Override
 public void error(String message) {
     System.out.println("ERROR: " + addSpaces(message));
 }
}

//4. App class with main method
public class App {
 public static void main(String[] args) {
     Logger asteriskLogger = new AsteriskLogger();
     Logger spacedLogger = new SpacedLogger();

     // Test AsteriskLogger
     asteriskLogger.log("Hello");
     asteriskLogger.error("Hello");

     // Test SpacedLogger
     spacedLogger.log("Hello");
     spacedLogger.error("Hello");
 }
}
