import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 9, 82, 3, 5, 4, 99, 63};

        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Вывести количество положительных и отрицательных элементов ");
        int pozitiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                pozitiveCount++;

            } else {
                negativeCount++;

            }
        }
        System.out.println("Количество положительных: "+pozitiveCount);
        System.out.println("Количество отрицательных: "+negativeCount);
    }
}