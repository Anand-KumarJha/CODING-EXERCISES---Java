public class LargestPrime {

    public static int getLargestPrime(int number){

        boolean check = false;
        int answer = -1;

        if ( number < 2 ){
            return -1;
        }else{

            for (int i = 2; i <= number ; i++){

                if(number % i == 0){
                    for (int j = 2 ; j < i || j == 2 ; j++){

                        check = false;

                        if (i % j == 0 && i != 2){
                            break;
                        }else{
                            check = true;
                        }
                    }
                    if (check) {
                        answer = i;

                    }

                }

            }

        }return answer;

    }

}
