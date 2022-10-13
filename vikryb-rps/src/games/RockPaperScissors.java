package games;

import java.util.Scanner;

public class RockPaperScissors {

    Player player ;
    Fist aIFist;

    //constructor: anropas med new constructor in i
    RockPaperScissors(String playerName, int playerScore) {
        player = new Player("lucas", 0);
        aIFist = new Fist();
    }
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors("lucas", 0);
        game.playGame();
    }
    void playGame() {
        int score1=0; //player
        int score2=0; //aIFist
        for (int i=0; i<3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Rock, paper, scissors");
            String choice=scanner.nextLine();
            String stringresult="";
            int intresult=aIFist.play();


            if(intresult== Fist.ROCK){
                stringresult="ROCK";
            }
            if(intresult== Fist.PAPER){
                stringresult="PAPER";
            }
            if(intresult== Fist.SCISSORS){
                stringresult="SCISSORS";
            }
            if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("ROCK")){
                System.out.println("Du valde " +choice+ " och "+ "datorn gav "+ stringresult + " då oavgjort");
                score1++; score2++;
            }if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("PAPER")){
                System.out.println("Du valde " +choice+ " och "+"datorn gav "+ stringresult + " då datorn vann");
                score2++;
            }if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("SCISSORS")){
                System.out.println("Du valde " +choice+ " och "+ "datorn gav "+ stringresult + " då du vann");
                score1++;
            }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("PAPER")){
                System.out.println("Du valde " +choice+ " och "+ "datorn gav "+ stringresult + " då oavgjort");
                score1++; score2++;
            }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("ROCK")){
                System.out.println("Du valde " +choice+ " och "+ "datorn gav "+ stringresult + " då du vann");
                score1++;
            }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("SCISSORS")){
                System.out.println("Du valde " +choice+ " och "+ "datorn gav "+ stringresult +" då datorn vann");
                score2++;
            }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("SCISSORS")){
                System.out.println("Du valde " +choice+ " och "+ "datorn gav "+ stringresult + " då oavgjort");
                score1++; score2++;
            }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("ROCK")){
                System.out.println("Du valde " +choice+ " och "+ "datorn gav "+ stringresult+" då datorn vann");
                score2++;
            }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("PAPER")){
                System.out.println("Du valde " +choice+ " och "+ "datorn gav "+ stringresult + " då du vann");
                score1++;
            }
        }if(score1>score2){
            System.out.println("Resultat; Du van");
        }
        else if (score2>score1){
            System.out.println("Resultat; Datorn vann");
        }else{
            System.out.println("Resultat; oavgjort");
        }

    }
}