package games;

import java.util.Random;

public class Dice {

    public int numOfSides;


        // constructor, anrapas med keyword new
        public Dice(int numOfSides) {
            this.numOfSides = numOfSides;

        }
        //I wont on integer between 1 and 6!
        public int roll() {
        Random diceRandom = new Random();

        int result = diceRandom.nextInt(  6)+1;

           //  här ska det hända nät!

        return result;

    }



}
