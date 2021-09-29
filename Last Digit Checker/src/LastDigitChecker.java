public class LastDigitChecker {
    public static boolean hasSameLastDigit( int a , int b , int c ){

        if(isValid(a) && isValid(b) && isValid(c)){

            int firstLSB = a % 10;
            int secondLSB = b % 10;
            int thirdLSB = c % 10;

            return firstLSB == secondLSB || secondLSB == thirdLSB || thirdLSB == firstLSB;


        }else {
            return false;
        }

    }

    public static boolean isValid (int x){

        return x > 9 && x < 1001;

    }
}