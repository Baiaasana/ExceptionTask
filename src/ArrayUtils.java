import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static int[] readFromFile(String filename) throws IOException, InvalidNumberException {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int i = 0;
        while ((line = reader.readLine()) != null) {
            try {
                int num = Integer.parseInt(line);
                if (num < 0) {
                    throw new InvalidNumberException("Invalid number: " + num);
                }
                array[i] = num;
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + line);
            }
        }
        reader.close();
        return array;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        if (sum == Integer.MIN_VALUE) {
            throw new ArithmeticException("Overflow occurred");
        }
        return sum;
    }
}
