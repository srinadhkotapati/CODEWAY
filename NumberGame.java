import java.util.*;

public class NumberGame {
  public static void main(String[] args) {
    Random ran = new Random();
    int Randomnumber = ran.nextInt(100);
    Scanner in = new Scanner(System.in);
    System.out.println("Number should be between 0 and 100.");
    while (true) {
      int Guess = in.nextInt();

      if (Guess < Randomnumber) {
        System.out.println("Your number is too low ,please try again!!");
      } else if (Guess > Randomnumber) {
        System.out.println("Your number is too high,please try again!!");
      } else {
        System.out.println("Congratulations!! Your guess is correct.");
        break;
      }

    }
  }

}

