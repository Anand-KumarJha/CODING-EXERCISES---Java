import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int number, sum = 0, count = 0; long average = 0;
        Scanner myScanner = new Scanner (System.in);

        while (true){
            boolean hasNextInt = myScanner.hasNextInt();
            if(hasNextInt){
                number = myScanner.nextInt();
                sum += number;
                count++;
            }else {
                break;
            }

        }double a = (double) sum / count;
        average = Math.round((a));
        System.out.println("SUM = " + sum + " AVG = " + average);


    }
}