public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second) {

        int firstDigit, secondDigit = 0, secondFixed = second;
        if (first < 100 && first > 9 && second < 100 && second > 9) {

            while (first > 0) {
                firstDigit = first % 10;

                while (second > 0) {
                    secondDigit = second % 10;
                    if (firstDigit == secondDigit) {
                        return true;
                    } else {
                        second /= 10;
                    }
                }second = secondFixed;

                first /= 10;
            }

        } else {
            return false;
        }
        return false;

    }

}