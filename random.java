import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        int i;
        int ran = (int)(Math.random()*100);
        System.out.println(ran);
        Scanner sc = new Scanner(System.in);
        int number[] = new int[3];
        boolean isRunning = true;
        while(isRunning){
        
        for(i = 0;i<3;i++){
            System.out.println("Guess the generated random number(1 to 100):");
            number[i] = sc.nextInt();
            if(i<3){
            if(number[i]==ran){
                System.out.println("Hey! The number is correct");
            }
            else if(number[i]>ran){
                System.out.println("The number is too long!");
            }
            else if(number[i]<ran){
                 System.out.println("The number is too short!");
            }
            else{
                 System.out.println("Oh! The number is incorrect");
            }
        }
        else{
            System.out.println("You have reached the maximum number of attempts");
        }
            
        }
        
         System.out.println("Would you like to play Again?(y/n):");
        String input = sc.next();
        isRunning = (input.equalsIgnoreCase("y"));
      }
       
   }
}
