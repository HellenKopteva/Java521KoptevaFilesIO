import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) throws IOException {
        System.out.println("Input path.");
        Scanner scanner = new Scanner(System.in);
        String pathUsers = scanner.nextLine();

        Path userPath = Paths.get("D:/Java521/Java521KoptevaFilesIO/src/Data/" + pathUsers + ".txt");

    }
}
