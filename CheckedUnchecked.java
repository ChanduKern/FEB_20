import java.io.FileReader;
import java.io.IOException;

public class CheckedUnchecked {
    public static void main(String[] args) {

        int a = 10 / 0;
        try {
            FileReader file = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}