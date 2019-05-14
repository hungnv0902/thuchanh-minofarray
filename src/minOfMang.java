import java.util.Random;

public class minOfMang {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[10];
        Random rd = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }

        for(int j = 0; j < arr.length; j ++) {
            System.out.println(arr[j]);
        }

        int minArr = min(arr);
        System.out.println("GT nho nhat la " + minArr);
    }
    public static int min(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i ++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
