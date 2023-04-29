import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileUtils.createFile("file1.txt");
        FileUtils.writeInFile("1\n2\n3\n4\n5\n6\n7\n8\n9\n10", "file1.txt");

        try {
            int[] array = ArrayUtils.readFromFile("file1.txt");
            int sum = ArrayUtils.sum(array);
            System.out.println("Array: " + java.util.Arrays.toString(array));
            System.out.println("Sum: " + sum);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } catch (InvalidNumberException e) {
            System.out.println("Invalid number: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }
}