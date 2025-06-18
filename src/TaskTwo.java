import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) throws IOException {
        System.out.println("Input path.");
        Scanner scanner = new Scanner(System.in);
        String pathUsers = scanner.nextLine();

        Path userPath = Paths.get("D:/Java521/Java521KoptevaFilesIO/src/Data/" + pathUsers + ".txt");
        System.out.println("Input word for search.");
        scanner = new Scanner(System.in);
        String keyWord = scanner.nextLine();

        System.out.println("Input word for replace.");
        scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        List<String> lines = Files.readAllLines(userPath);
        List<String> newLines = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < lines.size(); i++){
            String[] temp = lines.get(i).split(keyWord);
            count += temp.length;
            newLines.add(lines.get(i).replaceAll(keyWord, word));
        }

        Files.write(userPath, newLines);
        System.out.println("Number of changes: " + count);
    }
}
