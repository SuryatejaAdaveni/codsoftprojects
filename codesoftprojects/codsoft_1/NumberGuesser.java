import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {
    int win,totalroundsplayed=0;
    int score=0;
    int correctattempt=1,attemtindex=0;
    int[] attempts=new int[100];
public void play(){
    @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
    Random ra=new Random();
    int userguss=0;
    int computerguss=ra.nextInt(100)+1;
   while (true) {
    totalroundsplayed++;
    for(int n=0;n<11;n++){
       if(n<10){
                 System.out.print("Guess a number: ");
                userguss=sc.nextInt();
                if(userguss>100){
                    System.out.println("very high");
                }
                else if (userguss<0){
                    System.out.println("invalid type only positive values are allowed");
                }
                else if(userguss>computerguss){
                    System.out.println("too high");
                }
                else if (userguss<computerguss){
                    System.out.println("Too low");
                }
                else if(userguss==computerguss){
                    System.out.println("You guessed the correct number");
                    System.out.println("You guessed the number in "+correctattempt+" attempts");
                    win++;
                    attempts[attemtindex]=correctattempt;
                    correctattempt=1;
                    attemtindex++;
                    score++;
                    break;
                }
                correctattempt++;
        } 
        else{
            correctattempt=0;
            System.out.println("you reached the guessing limit which is 10./n Try to complete in 10 guesses");
            break;
        }
       
    }
    break;
   }
}
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NumberGuesser n=new NumberGuesser();
        n.play();
        
        int played=1;
        while(true){
            System.out.println("want to play again press 1 or type anything to quit and score board will be showed");
            int plays=sc.nextInt();
            if (plays==1){
                n.play();
                played++;
            }
            else{
                System.out.println("Number of wins in 10 guesses is : won "+ n.win + " / out of " + n.totalroundsplayed );
                System.out.println("Number of times played:"+played);
                System.out.println("your guessed tne number correct "+n.score+" times in play of "+played+" times");
                for(int z=1;z<played;z++){
                    System.out.println("your attemps in "+ z +" time is:"+n.attempts[z]);
                }
                break;
            }
        } 
    }
}
