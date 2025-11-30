import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare variable n of type int and read it from the keyboard
        int n = sc.nextInt();
        //Display value m
        System.out.print("m = ");
        //Declare variable m of type int and read it from the keyboard
        int m = sc.nextInt();
        //Declare bidimensional array A
        int[][] A;
        //Set the values of array A to n and m
        A = new int[n][m];

        //Method for reading array A
        readA(A, sc);
        //Method for displaying array A
        displayA(A);
        //Method for displaying the maximum number of elements equal to 1 on a row of array A
        displayMax1(A);

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
        System.out.print("The values of array A are: \n");
        //Loop through each row of array A
        for (int[] row : A) {
            //Inside this loop --> loop through each element on each row
            for (int x : row) {
                //Display values of A
                System.out.print(x + ", ");
            }
            //Display each row on a separate line
            System.out.println();
        }
        //Display an empty line
        System.out.println(" ");
        return A;
    }

    //Define method for finding the maximum number of elements equal to 1 in array A
    static int[][] displayMax1(int[][] A) {
        //Declare and initialize variable maxCount
        int maxCount = 0;
        //Loop through array A from i = 0 to length of A, incrementing i by 1 --> rows
        for (int i = 0; i < A.length; ++i) {
            //Declare and initialize a counter for the columns
            int countCol = 0;
            //Inside this loop --> loop through array A from j = 0 to length of A[0].length, incrementing i by 1 --> columns
            for (int j = 0; j < A[0].length; ++j) {
                //Set the conditions for finding the maximum number of elements equal to 1
                if (A[i][j] == 1) {
                    countCol++;
                }
                if (countCol > maxCount) {
                    maxCount = countCol;
                }
            }
        }
        //Display the result - maximum number of elements equal to 1 in array A
        System.out.print("The maximum number of elements equal to 1 on a row in array A is " + maxCount);
        return A;
    }
}