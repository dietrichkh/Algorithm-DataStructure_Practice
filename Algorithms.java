import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Algorithms {

    private static void bubbleSort(int[] arr){
        for (int i = arr.length; i>2; i--){
            for (int j=0; j<i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args){
        int[] myList = new int[100];
        Random rand = new Random();
        for (int x = 0; x<100; x++){
            myList[x] = rand.nextInt(100);
        }

        bubbleSort(myList);
        System.out.println(Arrays.toString(myList));
    }
}
