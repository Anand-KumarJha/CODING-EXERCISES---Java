public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        if (number < 0)
        {
            number *= -1;
        }

        int reverse = 0 , LSB , tempNumber = number;

        while(tempNumber > 0 ){

            LSB = tempNumber % 10;
            tempNumber = tempNumber / 10;
            reverse = (reverse * 10) + LSB;

        }
        if(number == reverse){
            return true;
        }else{
            return false;
        }

    }

}
