import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of subjects :");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your marks for all the subjects:");
        for (int i = 0; i < size; i++) {
            int val = in.nextInt();
            arr[i] = val;
        }
        int sum = 0;
        int length = arr.length;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / length;
        System.out.println("Averege of your marks is:" + avg);

        if (avg >= 90) {
            System.out.println(" O grade");
        }
       else if (avg >= 80 && avg <= 89) {
            System.out.println("S grade");
        }
      else  if (avg >= 70 && avg <= 79) {
            System.out.println("A grade");
        }
       else if (avg >= 60 && avg <= 69) {
            System.out.println("B grade");
        }
       else if (avg >= 50 && avg <= 59) {
            System.out.println("C grade");
        }
       else if (avg >= 40 && avg <= 49) {
            System.out.println("D grade");

        }

        else {
            System.out.println("You are Fail");
        }

    }
}
