import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[] {5,6,9,82,3,5,4,99,63};

        System.out.println("Исходный массив: "+ Arrays.toString(arr));
        System.out.print("Вывести вторую половину массива: ");
        for (int i = arr.length/2; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}