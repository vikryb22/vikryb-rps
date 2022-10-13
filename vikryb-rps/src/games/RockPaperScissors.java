package games;

import java.util.Scanner;
public class RockPaperScissors {
    Player player;
    Fist alFist;

    RockPaperScissors game(String playName, int playerScore) {

        player = new Player(playName, playerScore);
        alFist = new Fist();
    }
    void playGame ()
    {

        System.out.println(player.getName());
        System.out.println(player.toString());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rock, paper, scissor");
        String playerMove=scanner.nextLine();

        int randomNumer = scanner.nextByte();

        String computerMove;

        if(randomNumer== 0){
            computerMove="ROCK";}
        else if(randomNumer == 1){
            computerMove = "PAPER";
        }
        else {
            computerMove ="SCISSORS";
        }
        System.out.println("Computer chose" + computerMove + "!");

        // print results

        if(playerMove.equals(computerMove)) {
            System.out.println("Oavgjort");
        }
        else if(computerChose(playerMove, computerMove)){
            System.out.println("Player wins!");
        } else {
            System.out.print ("Computer wins!");


        }
    }

}