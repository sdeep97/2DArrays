package TwoDArrays;

public class Ex1_GolfCard {


    public static void run(){

        String[] names = { "Bob", "Serena", "Gill", "Steve" };
        int[][] scorecard = new int[4][18];

        System.out.println( scorecard.length );

        scorecard[0][0] = 4;
        scorecard[1][0] = 3;
        scorecard[2][0] = 5;
        scorecard[3][0] = 4;


        scorecard[0][1] = 6;
        scorecard[1][1] = 3;
        scorecard[2][1] = 4;
        scorecard[3][1] = 4;


        scorecard[0][2] = 6;
        scorecard[1][2] = 2;
        scorecard[2][2] = 4;
        scorecard[3][2] = 3;

        System.out.println("Name           Scores"   );

        for( int row = 0; row < scorecard.length; row++ ){
        int totalScore = 0;
            for( int col = 0; col < scorecard[row].length; col++){
                System.out.print(scorecard[row][col] + "  ");
                totalScore += scorecard[row][col];
            }
            System.out.println(names[row] + " Total " + totalScore);
            System.out.println();

        }



    //using the same for loops, total and print each person's score

    //Separately from the above for loops, average the score for hole 1


    int hole1Total = 0;
        for (int row = 0; row < scorecard.length; row++) {
        hole1Total += scorecard[row][0];
    }
    double hole1Average = (double) hole1Total / scorecard.length;
        System.out.println("Average score for Hole 1: " + hole1Average);
}
}