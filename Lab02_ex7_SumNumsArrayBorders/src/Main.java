import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare variable n and read it from the keyboard
        int n = sc.nextInt();
        //Display value m
        System.out.print("m = ");
        //Declare variable m and read it from the keyboard
        int m = sc.nextInt();
        //Declare bidimensional array A
        int[][] A;
        //Set the values of array A to n and m
        A = new int[n][m];

        //Method for reading array A
        readA(A, sc);
        //Method for displaying array A
        displayA(A);
        //Method for displaying the sum of elements on array A's borders
        sumA(A);

    }

    //Define method for reading array A
    static int[][] readA(int[][] A, Scanner sc) {
        //Loop through array A from i = 0 to length of A, incrementing i by 1 --> rows
        for (int i = 0; i < A.length; ++i) {
            //Inside this loop --> loop through array A from j = 0 to length of A[0].length, incrementing i by 1 --> columns
            for (int j = 0; j < A[0].length; ++j) {
                //Display values of A
                System.out.print("A[" + i + "][" + j + "] = ");
                //Read the values of array A from keyboard
                A[i][j] = sc.nextInt();
            }
        }
        return A;
    }

    //Define method for displaying array A
    static int[][] displayA(int[][] A) {
        //Display the first part of the label for array A
        System.out.print("The values of array A are: ");
        //Loop through array A from i = 0 to length of A, incrementing i by 1 --> rows
        for (int i = 0; i < A.length; ++i) {
            //Inside this loop --> loop through array A from j = 0 to length of A[0].length, incrementing i by 1 --> columns
            for (int j = 0; j < A[0].length; ++j) {
                //Display values of A
                System.out.print(A[i][j] + ", ");
            }
        }
        //Display an empty line
        System.out.println(" ");
        return A;
    }

    //Define method for sum of the elements on the borders of array A
    static int[][] sumA(int[][] A) {
        //Declare and initialize variable sum
        int sum = 0;
        //Display the first part of the label for the sum
        System.out.print("The sum of elements ");
        //Loop through array A from i = 0 to length of A, incrementing i by 1 --> rows
        for (int i = 0; i < A.length; ++i) {
            //Inside this loop --> loop through array A from j = 0 to length of A[0].length, incrementing i by 1 --> columns
            for (int j = 0; j < A[0].length; ++j) {
                //Set condition for calculating the sum of the elements on the borders of array A
                if (i == 0 || i == A.length-1 || j == 0 || j == A[0].length-1) {
                    //Display values
                    System.out.print(A[i][j] + ", ");
                    //Calculate the sum of the elements on the borders of array A
                    sum += A[i][j];
                }
            }
        }
        //Display the sum of the elements on the borders of array A
        System.out.print("is " + sum);
        return A;
    }
}