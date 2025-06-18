import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class TaskThree {
    //TODO: replace data from files to other file.
    public static void main(String[] args) throws IOException {

        Scanner scanner;
        Path[] pathUsers = new Path[4];
        for (int i = 0; i < 4; i++){
            System.out.println("Input path " + (i + 1) + " .");
            scanner = new Scanner(System.in);
            pathUsers[i] = Paths.get("D:/Java521/Java521KoptevaFilesIO/src/Data/" + scanner.nextLine() + ".txt");;
        }
        int countBytes = 0;
        for (int i = 0; i < 3; i++) {
            List<String> lines = Files.readAllLines(pathUsers[i]);
            for (int j = 0; j < lines.size(); j++) {
                byte[] buffer = lines.get(j).getBytes();
                countBytes =+ buffer.length;
            }
            Files.write(pathUsers[3], lines, StandardOpenOption.APPEND);
        }
        System.out.println(countBytes + "bytes wos writen.");
    }
}
