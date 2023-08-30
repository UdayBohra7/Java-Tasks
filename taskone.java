import java.util.Random;
import java.util.Scanner;

public class taskone {
public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  int userguess;
    while(true){
    Random rn = new Random();
    int randomnum = rn.nextInt(5)+1;
    
      while(true){
        System.out.println("Please enter your number from range: 1 to 5 -> ");
        userguess = sc.nextInt();
        if(userguess<=5 && userguess>=1){
        break;
         }
        System.out.println(userguess+" is not a valid number");
        }

       int difference; 
     System.out.println("The generated number is = "+randomnum);
     if(userguess==randomnum){
        System.out.println("your guess is correct and you won the game!");
        }
       else if(userguess<randomnum){
           difference = randomnum - userguess;
           
           if(difference == 1 || difference == 2)
        System.out.println("your guess is too close");
            else{
              System.out.println("your guess is too high");
            }
          } 
         else{
           difference = userguess - randomnum;
           
           if(difference == 1 || difference == 2)
        System.out.println("your guess is too close");
            else{
              System.out.println("your guess is too high");
            }
         } 
      
       if(userguess==randomnum){
          break;
       }
     
      }
      sc.close();
}
}
