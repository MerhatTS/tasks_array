import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[] {5,6,9,82,3,5,4,99,63};

        System.out.println("Исходный массив: "+ Arrays.toString(arr));
        System.out.print("Вывести чётные элементы массива по порядку: ");
        for (int i = 1; i < arr.length; i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}