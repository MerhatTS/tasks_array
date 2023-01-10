import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[] {5,6,9,82,3,5,4,99,63};

        System.out.println("Исходный массив: "+ Arrays.toString(arr));
        int maxIndex = 0;
        int minIndex = 0;
        System.out.println("Найти максимальный и минимальный элементы массива ");
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[maxIndex]){
                maxIndex=i;
            }else if (arr[i] < arr[minIndex]){
                minIndex=i;
            }
        }
        System.out.println("Максимальный элемент: "+arr[maxIndex]);
        System.out.println("Минимальный элемент: "+arr[minIndex]);
    }
}