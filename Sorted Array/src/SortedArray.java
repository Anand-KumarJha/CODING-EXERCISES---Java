import java.util.Scanner;
public class SortedArray {

    public static int[] getIntegers(int size){
        int[] inputArray = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    public static void printArray(int[] arrayName){
        for(int i = 0; i < arrayName.length; i++){
            System.out.println("Element " + i + " Contents " + arrayName[i]);
        }
    }

    public static int[] sortIntegers(int[] inputArray){
        int[] sortedArray = new int[inputArray.length];
        for(int i = 0; i < inputArray.length; i++){
            sortedArray[i] = inputArray[i];
        }
        boolean check = true;
        int temp;
        while(check) {
            check = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    check = true;
                }
            }
        }return sortedArray;
    }

}
