public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("invalid");
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
