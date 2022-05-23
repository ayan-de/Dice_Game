import java.util.*;
import javax.lang.model.util.ElementScanner14;
class DiceGame
{
    public static void main(String[] args)
    {
        int low=1;
        int high=6;
        int playerone=0;
        int playertwo=0;
        System.out.println("Lets start the Dice Game");
        System.out.println("Games Rules");
        System.out.println("");
        
            System.out.println("Player 1 will start the game");
            playerone=randomInt(low, high);
            System.out.println(playerone);
            playertwo=randomInt(low, high);
            System.out.println(playertwo);
            if(playerone==6)
            {
                System.out.println("Player One wins");

            }
            else if(playertwo==6)
            {
                System.out.println("Player Two Wins");
            }
            else
            {
                System.out.println("DRAW");
            }
        
    }
    public static int randomInt(int loww,int highh)
    {
        int result=(int)(Math.random()*(highh-loww+1))+loww;
        return result;
    }
}