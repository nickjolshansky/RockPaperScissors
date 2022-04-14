package game;
import java.util.Random;

public class Player {
    private String name;
    private int score;
    private String rpsChoice; //rock paper or scissors

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void incrementScore(){
        score++;
    }
    public String getRpsChoice() {
        return rpsChoice;
    }
    public void setRpsChoice() {
        switch (new Random().nextInt(3)){
            case 0:
                this.rpsChoice = "rock";
                break;
            case 1:
                this.rpsChoice = "paper";
                break;
            case 2:
                this.rpsChoice = "scissors";
                break;
            default:
                System.out.println("Sorry, there was an issue generating " + this.name + "'s move.");
        }
    }


    public static void checkPlayerMoves(Player p1, Player p2){
        System.out.println(p1.name + " used " + p1.rpsChoice + ".\n" + p2.name + " used " + p2.rpsChoice + ".");

        if(p1.rpsChoice.equals(p2.rpsChoice)){
            System.out.println("Both players used the same move.");
        }
        else if(p1.rpsChoice.equals("rock")){
            if(p2.rpsChoice.equals("paper")){
                p2.playerWins();
            }
            else{
                p1.playerWins();
            }
        }
        else if(p1.rpsChoice.equals("paper")){
            if(p2.rpsChoice.equals("scissors")){
                p2.playerWins();
            }
            else{
                p1.playerWins();
            }
        }
        else if(p1.rpsChoice.equals("scissors")){
            if(p2.rpsChoice.equals("rock")){
                p2.playerWins();
            }
            else{
                p1.playerWins();
            }
        }
    }

    private void playerWins(){
        System.out.println(this.name + " is the winner!");
        this.incrementScore();
    }
}
