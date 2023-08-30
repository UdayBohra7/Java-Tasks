import java.util.Scanner;

public class tasktwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String str= sc.nextLine();
        int counter = 1;
        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
            counter++;
        }
    }
    System.out.println("The number of words in your text:"+ counter);
    }
    
}
