public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object x = new Integer(0);
            String s = (String) x;
        } catch (ClassCastException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}