import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[] {5,6,9,82,3,5,4,99};

        System.out.println("Исходный массив: "+Arrays.toString(arr));
        int count = 3;
        System.out.print("Вывести первые 3 элемента массива: ");
        for (int i = 0; i < count; i++){
            System.out.print(arr[i]+" ");
        }
    }
}