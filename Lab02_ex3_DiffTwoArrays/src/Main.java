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
        //Display value m
        System.out.print("m = ");
        //Declare and read variable m from keyboard
        int m = sc.nextInt();
        //Declare array A of type int and set the number of elements to n
        int[] A = new int[n];
        //Declare array B of type int and set the number of elements to m
        int[] B = new int[m];

        //Method for reading array A
        readA(A, sc);
        //Method for reading array B
        readB(B, sc);
        //Method for displaying array A
        displayA(A);
        //Method for displaying array B
        displayB(B);
        //Method for calculating array C - difference between A and B / B and A
        diffAB(A, B);
    }


    //Define method for reading and displaying array A
    static int[] readA(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Display values for array A
            System.out.print("A[" + i + "] = ");
            //Read values of array A from keyboard
            A[i] = sc.nextInt();
        }
        //Return the value of A
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

    //Define method for reading array B
    static int[] readB(int[] B, Scanner sc) {
        //Loop through array B from j = 0 to length of B, incrementing j by 1
        for (int j = 0; j < B.length; ++j) {
            //Display values for array B
            System.out.print("B[" + j + "] = ");
            //Read values of array B from keyboard
            B[j] = sc.nextInt();
        }
        //Return the value of B
        return B;
    }

    //Define method for displaying array B
    static int[] displayB(int[] B) {
        //Loop through array B from j = 0 to length of B, incrementing j by 1
        for (int j = 0; j < B.length; ++j) {
        }
        //Display all elements of array B
        System.out.print("The elements of array B are: " + Arrays.toString(B) + "\n");
        //Return the value of B
        return B;
    }

    //Define method for calculating the difference between arrays A and B
    static void diffAB(int[] A, int[] B) {
        //Display the label for the difference between A and B
        System.out.print("The difference between arrays A and B is: ");
        //Declare variable n for length of array A
        int n = A.length;
        //Declare variable m for length of array B
        int m = B.length;
        //Set the condition for comparing n and m, and declare variables i and j
        if (n >= m) { int i, j;
            //Loop through array A from i = 0 to n, incrementing i by 1
            for (i = 0; i < n; ++i) {
                //Inside this loop --> loop through array B from j = 0 to m, incrementing j by 1
                for (j = 0; j < m; ++j) {
                    //Set condition for exiting the loop
                    if (A[i] == B[j]) {
                        //Exit the loop
                        break;
                    }
                }
                //Set condition for displaying a valid value
                if (j == m) {
                    //Display the value for the difference between A and B
                    System.out.print(A[i] + ", ");
                }
            }
        }
        //Set the condition for comparing m and n, and declare variables i and j
        else { int i, j;
            //Loop through array B from j = 0 to m, incrementing j by 1
            for (j = 0; j < m; ++j) {
                //Inside this loop --> loop through array A from i = 0 to n, incrementing i by 1
                for (i = 0; i < n; ++i) {
                    //Set condition for exiting the loop
                    if (B[j] == A[i]) {
                        //Exit the loop
                        break;
                    }
                }
                //Set condition for displaying a valid value
                if (i == n) {
                    //Display the value for the difference between B and A
                    System.out.print(B[j] + ", ");
                }
            }
        }
    }
}