import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare and read variable n from keyboard
        int n = sc.nextInt();
        //Declare array A of type int and set the number of elements to n
        int[] A = new int[n];

        //Method for reading array A
        readA(A, sc);
        //Method for displaying array A
        displayA(A);
        //Method for displaying that array A is order ascendingly or not
        ascendingA(A);
    }

    //Define method for reading array A
    static int[] readA(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Display values for array A
            System.out.print("A[" + i + "] = ");
            //Read values of array A from keyboard
            A[i] = sc.nextInt();
        }
        return A;
    }

    //Define method for displaying array A
    static int[] displayA(int[] A) {
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
        }
        //Display all elements of array A
        System.out.print("The elements of array A are: " + Arrays.toString(A) + "\n");
        //Return the value of A
        return A;
    }

    //Define method for checking that the elements of array A are in ascending order or not
    static int[] ascendingA(int[] A) {
        //Declare boolean for ascending order, initialize as 'true'
        boolean isAscending = true;
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length-1; ++i) {
            //Set condition for comparing the values of array A
            if (A[i] > A[i+1]) {
                //Set boolean to return 'false'
                isAscending = false;
                //Exit loop
                break;
            }
        }
        //Set the conditions for the messages to be displayed
        if (isAscending) {
            System.out.print("The elements of array A are in ascending order.");
        }
        else {
            System.out.print("The elements of array A are not in ascending order.");
        }
        return A;
    }
}