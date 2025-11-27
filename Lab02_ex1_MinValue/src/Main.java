import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for n
        System.out.print("n = ");
        //Declare and read n from keyboard
        int n = sc.nextInt();
        //Declare array A
        int[] A;
        //Set number of elements in array A
        A = new int[n];

        //Method to read and display array A
        readA(A, sc);
        //Method to display the minimum value in array A
        displayMinA(A);

    }
    //Define method to read and display array A
    static int[] readA(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Display values for array A
            System.out.print("A[" + i + "] = ");
            //Read values of array A from keyboard
            A[i] = sc.nextInt();
        }
        //Display the entire array
        System.out.println("The values of array A are: " + Arrays.toString(A));
        //Return A
        return A;
    }

    //Define method to find and display the minimum value in array A
    static int[] displayMinA(int[] A) {
        //Declare variable min as the smallest value in array A
        int min = A[0];
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Set condition for fining the smallest value in array A
            if (min > A[i]) {
                min = A[i];
            }
        }
        //Display the minimum value in array A
        System.out.print("The minimum value in array A is " + min);
        //Return A
        return A;
    }
}