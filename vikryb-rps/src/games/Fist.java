package games;

import java.util.Random;

public class Fist {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS =2;
    private Random random;

    Fist (){
        random = new Random();
        // namn - är random, Random-namn som stå i biblioteket
    }
    // en metoden som när den anropas
    public int play(){
        Random random = new Random();
        int result= random.nextInt(3);
return result;



        }
}
