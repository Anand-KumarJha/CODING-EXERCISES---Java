public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b){

        int i = 2,j = 2,answer = 0;

        if(a < 10 || b < 10){
            return -1;
        }else{

            while(i < a + 1){

                if(a % i == 0){
                    j = 2;
                    while (j < b + 1){
                        if(b % j == 0){
                            if(j == i) {
                                answer = j;
                            }
                        }j++;
                    }
                }
                i++;

            }

        }return answer;

    }
}