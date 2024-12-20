import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("file_that_not_exist.txt"));
            file.readLine();
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }
}
