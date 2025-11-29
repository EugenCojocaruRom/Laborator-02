import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard
        int n = sc.nextInt();
        //Declare array A and set the number of its elements to n
        int[] A = new int[n];
        //Declare array b and set the number of its elements to n
        int[] B = new int[n];

        //Method for reading array A
        readA(A, sc);
        //Method for displaying array A
        displayA(A);
        //Method for displaying array B, containing the numbers from A that are perfect squares
        displayB(B, A);
    }

    //Define method for reading array A
    static int[] readA(int[] A, Scanner sc) {
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Display values of A
            System.out.print("A[" + i + "] = ");
            //Read the values of array A from keyboard
            A[i] = sc.nextInt();
        }
        return A;
    }

    //Define method for displaying array A
    static int[] displayA(int[] A) {
        //Display the first part of the label for array A
        System.out.print("The values of array A are: ");
        //Loop through array A from i = 0 to length of A, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Display the values of array A
            System.out.print(A[i] + ", ");
        }
        //Display empty line
        System.out.println(" ");
        return A;
    }

    /*Define method for identifying the numbers from array A that are perfect squares
    and displaying them in array B*/
    static int[] displayB(int[] B, int[] A) {
        //Display the first part of the label for array B
        System.out.print("The values of array B are: ");
        //Loop through array B from i = 0 to length of B, incrementing i by 1
        for (int i = 0; i < A.length; ++i) {
            //Declare variable x of type double, equal to the square root of an element of array A
            double x = (double) Math.sqrt(A[i]);
            //Set condition to check if x is a perfect square root of an element of array A
            if (x % 2 == 0 || x % 2 == 1) {
                //Set the element of array B as equal to the element of array A
                B[i] = A[i];
                //Display the values of array B
                System.out.print(B[i] + ", ");
            }
        }
        return B;
    }
}