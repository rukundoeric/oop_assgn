import java.io.*;
public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("missing_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}