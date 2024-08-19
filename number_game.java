import java.util.*;

public class number_game {
    public static void main(String[] args) {
        System.out.print("\n\t\t\t\t\t\t    Number Game");
        System.out.println("\n\t\t\t**************Guess the number and win the points**************");
        System.out.println("YOU HAVE 5 CHANCES");
        Scanner sc = new Scanner(System.in);
        int win=0;
        int lose=5;
        int random = (int) (Math.random() * 100) + 1;
        System.out.println("generated random numbers is__");
        for (int i = 5; i >= 1; --i) {
            System.out.print("guess the generated number : ");
            int gnum = sc.nextInt();
            if (random == gnum) {
                System.out.println("correct");
                win++;
                if(i==1){
                    System.out.println("your attempts are over");
                    System.out.println("random number is " + random);
                    System.out.println("you scored "+win+" out of 5");
                }
                else{
                    System.out.println("you have "+ (i-1 )+" chances");
                }
            } else if (random > gnum) {
                System.out.println("too low");
                lose--;
                if (i == 1) {
                    System.out.println("your attempts are over");
                    System.out.println("random number is " + random);
                    System.out.println("you scored "+lose+" out of 5");
                } else {
                    System.out.println("you have "+ (i-1 )+" chances");
                }
            } else {
                System.out.println("too high");
                lose--;
                if (i == 1) {
                    System.out.println("your attempts are over");
                    System.out.println("random number is " + random);
                    System.out.println("you scored "+lose+" out of 5");
                } else {
                    System.out.println("you have "+ (i-1 )+" chances");
                }
            }
        }
        sc.close();
    }
}