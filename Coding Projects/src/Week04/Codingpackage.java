package Week04;

public class Codingpackage {

    public static void main(String[] args) {
   // 1. Array of ages
     int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

    // a. Subtract the value of the first element from the last element
    int firstAge = ages[0];
    int lastAge = ages[ages.length - 1];
    int result = lastAge - firstAge;
     System.out.println("1a. Subtraction result: " + result);

        // b. Create a new array ages2 with 9 elements
        int[] ages2 = new int[9];

        // Copying the original ages to the new array
        for (int i = 0; i < ages.length; i++) {
            ages2[i] = ages[i];
        }

        // ii. Repeat the subtraction using the new array
        int firstAge2 = ages2[0];
        int lastAge2 = ages2[ages2.length - 1];
        int result2 = lastAge2 - firstAge2;
        System.out.println("1b. Subtraction result with ages2: " + result2);

        // iii. The subtraction works dynamically with arrays of different lengths

        // c. Calculate the average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = (double) sum / ages.length;
        System.out.println("1c. Average age: " + averageAge);

        // 2. Array of names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("2a. Average number of letters per name: " + averageLetters);

        // b. Concatenate all names separated by spaces
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("2b. Concatenated names: " + concatenatedNames.toString().trim());

        // 3. Access the last element of an array
        int lastElement = ages[ages.length - 1];
        System.out.println("3. Last element of ages array: " + lastElement);

        // 4. Access the first element of an array
        int firstElement = ages[0];
        System.out.println("4. First element of ages array: " + firstElement);

        // 5. Create a new array nameLengths
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // 6. Calculate the sum of all elements in nameLengths array
        int sumOfLengths = 0;
        for (int length : nameLengths) {
            sumOfLengths += length;
        }
        System.out.println("6. Sum of name lengths: " + sumOfLengths);

        // 7. Method to concatenate a word n times
        System.out.println("7. Concatenated word: " + repeatWord("Hello", 3));

        // 8. Method to return full name
        System.out.println("8. Full name: " + getFullName("John", "Doe"));

        // 9. Method to check if sum of array is greater than 100
        int[] someInts = {10, 20, 30, 40}; // Example array
        System.out.println("9. Sum greater than 100: " + isSumGreaterThan100(someInts));

        // 10. Method to return the average of array elements
        double[] someDoubles = {1.5, 2.5, 3.5}; // Example array
        System.out.println("10. Average of doubles: " + getAverage(someDoubles));

        // 11. Method to compare the averages of two double arrays
        double[] array1 = {1.0, 2.0, 3.0};
        double[] array2 = {2.0, 3.0, 4.0};
        System.out.println("11. First array average > second array average: " + isFirstArrayAverageGreater(array1, array2));

        // 12. Method to check if we will buy a drink
        System.out.println("12. Will buy drink: " + willBuyDrink(true, 11.00));

        // 13. Custom method example
        System.out.println("13. Random even number: " + generateRandomEvenNumber(1, 100));
    }

    // 7. Method to repeat a word n times
    public static String repeatWord(String word, int n) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < n; i++) {
            repeated.append(word);
        }
        return repeated.toString();
    }

    // 8. Method to return full name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9. Method to check if the sum of an array is greater than 100
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    // 10. Method to get the average of an array of doubles
    public static double getAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // 11. Method to compare the averages of two double arrays
    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
        return getAverage(array1) > getAverage(array2);
    }

    // 12. Method to decide whether to buy a drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    // 13. Custom method to generate a random even number between min and max
    // This method generates a random even number within a specified range
    public static int generateRandomEvenNumber(int min, int max) {
        if (min % 2 != 0) min++; // Ensure min is even
        if (max % 2 != 0) max--; // Ensure max is even
        return min + 2 * (int) (Math.random() * ((max - min) / 2 + 1));
    }
}
