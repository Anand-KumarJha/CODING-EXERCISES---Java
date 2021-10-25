import java.util.Scanner;
public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }return array;

    }
    private static int findMin(int[] array){
        int min = array[1];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{8,2,14,23,7}));
    }

}
