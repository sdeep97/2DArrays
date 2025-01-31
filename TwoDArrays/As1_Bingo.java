package TwoDArrays;

public class As1_Bingo {

    public static void run (){

  char [] allLetters  = {'B', 'I', 'N', 'G', 'O'};







    }

    public static int [] generateArray (int length, int min, int max ){

        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = myRandom(min, max);
        }

        return result;


    }


    public static int myRandom (int min, int max){
        int num =  (int) (Math.random() * (max - min + 1)   + min);
        return num;
    }

}
