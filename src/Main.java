public class Main {
    public static void main(String[] args) {
        // Checks if 9 is a positive number.
        checkNumber(9);

        // Checks if -5 is a negative number.
        checkNumber(-5);
    }

    /**
     * Checks if the number passed is positive, negative or zero.
     */
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}