import java.util.Arrays;
public class ReverseArray {
    public static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int temp, count = array.length - 1;

        for(int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[count];
            array[count] = temp;
            count--;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));

    }

}