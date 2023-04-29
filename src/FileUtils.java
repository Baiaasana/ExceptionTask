import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils {
    public FileUtils() {}

    public static void createFile(String filename) throws IOException {
        File file = new File(filename);
        if (file.createNewFile()) {
            System.out.println("File created " + file.getName());
        } else {
            System.out.println("File Already created");
        }
    }

    public static void writeInFile(String data, String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write(data);
        fileWriter.close();
    }

    public static void readFromFile(String filename) throws IOException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void removeFile(String filename) {
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("file removed");
        } else {
            System.out.println("does not exist");
        }
    }
}

