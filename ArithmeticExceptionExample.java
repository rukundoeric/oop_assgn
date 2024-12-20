public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int res = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}