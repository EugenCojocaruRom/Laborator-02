import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare and read variable n of type int from keyboard
        int n = sc.nextInt();
        //Display value m
        System.out.print("m = ");
        //Declare and read variable m of type int from keyboard
        int m = sc.nextInt();
        //Declare array A of type int
        int[] A;
        //Set number of n elements in array A
        A = new int[n];
        //Declare array B of type int
        int[] B;
        //Set number of m elements in array B
        B = new int[m];
        //Declare array C of type int
        int[] C;
        //Set number of elements in array C based on the number of elements in A and B
        if (n > m) {
            C = new int[n];
        } else {
            C = new int[m];
        }

        //Method for reading array A
        readA(A, sc);
        //Method for reading array B
        readB(B, sc);
        //Method for displaying array A
        displayA(A);
        //Method for displaying array B
        displayB(B);
        //Method for calculating array C - intersection of A and B
        calculateC(A, B);
        //Method for displaying array C
//        displayC(C);
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

    //Define method for calculating and displaying array C - intersection of A and B
    static int[] calculateC(int[] A, int[] B) {
        //Initialize counter
        int count = 0;
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Inside the loop for A -> loop through array B from j = 0 to length of B, incrementing j by 1
            for (int j = 0; j < B.length; ++j) {
                //Set condition for comparing the elements of A with the elements of B
                if (A[i] == B[j]) {
                    //If an element of A is equal to an element of B, increment counter
                    count++;
                    //Stop loop after a valid value is found
                    break;
                }
            }
        }
        //Declare array C and set its values depending on the counter
        int[] C = new int[count];
        //Initializing variable x for array C
        int x = 0;
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Inside the loop for A -> loop through array B from j = 0 to length of B, incrementing j by 1
            for (int j = 0; j < B.length; ++j) {
                //Set condition for comparing the elements of A with the elements of B
                if (A[i] == B[j]) {
                    //If an element of A is equal to an element of B, set the element of C as equal to the element of A
                    C[x] = A[i];
                    //After setting the element of C as equal to the element of A, increment x
                    ++x;
                    //Stop loop after setting a value for C
                    break;
                }
            }
        }
        //Display the elements of C
        System.out.print("The elements of array C are: " + Arrays.toString(C));
        //Return value of C
        return C;
    }
}