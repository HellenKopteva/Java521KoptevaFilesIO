import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("D:/Java521/Java521KoptevaFilesIO/src/Data/file1.txt");
//        Path path1 = Paths.get("D:/Java521/Java521KoptevaFilesIO/src/Data/file2.txt");
//        Path path2 = Paths.get("D:/Java521/Java521KoptevaFilesIO/src/Data/file3.txt");
//        Path path3 = Paths.get("D:/Java521/Java521KoptevaFilesIO/src/Data/file4.txt");
//        try {
//            Files.createFile(path);
//            Files.createFile(path1);
//            Files.createFile(path2);
//            Files.createFile(path3);
//            System.out.println("File is created");
//        } catch (FileAlreadyExistsException e) {
//            System.out.println("File exist already");;
//        }
        System.out.println("Input path.");
        Scanner scanner = new Scanner(System.in);
        String pathUsers = scanner.nextLine();

        Path userPath = Paths.get("D:/Java521/Java521KoptevaFilesIO/src/Data/" + pathUsers + ".txt");
        List<String> lines = Files.readAllLines(userPath);
        int linesCount = 0;
        int charsCount = 0;
        int numbersCount = 0;
        int signCount = 0;
        for (String line : lines){
            for (int i = 0; i < line.length(); i++){
                char c = line.charAt(i);
                if (Character.isDigit(c)){
                    numbersCount++;
                }
                else {
                    if (Character.isLetter(c)){
                        charsCount++;
                    }
                    else {
                        signCount++;
                    }
                }
            }
            linesCount++;
        }
        System.out.println(linesCount + " strings are in file.");
        System.out.println(numbersCount + " numbers are in file.");
        System.out.println(charsCount + " chars are in file.");
        System.out.println(signCount + " signs are in file.");
    }
}
