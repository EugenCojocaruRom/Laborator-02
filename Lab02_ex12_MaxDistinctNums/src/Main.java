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
        /*Method for finding the row with the maximum number of distinct elements
            --> calling matrix A and returning an array of type int*/
        int[] rows_counter = maxDistinct(A);
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

    //Define the method for finding the row(s) with the maximum number of distinct elements
    static int[] maxDistinct(int[][] A) {
        //Declare array 'rows_counter' that contains the indexes of the rows with the max number of distinct elements
        int[] rows_counter = new int[A.length];
        //Loop through array indexes from i = 0 to A.length, incrementing i by 1 (++i) --> rows
        for (int i = 0; i < A.length-1; ++i) {
            //Inside this loop --> loop from j = 0 to A[0].length, incrementing j by 1 (++j) --> columns
            for (int j = 0; j < A[i].length-1; ++j) {
                //Set condition for identifying distinct numbers on each row of matrix A
                if (A[i][j] == A[i][j+1] || A[i+1][j] == A[i+1][j+1]) {
                    break;
                } else {
                    rows_counter[i]++;
                }
            }
        }
        displayMaxDistinct(rows_counter);
        return rows_counter;
    }

    //Define the method for displaying the row(s) with the maximum number of distinct elements
    static void displayMaxDistinct(int[] rows_counter) {
        /*Declare variable 'maxNum' of type int and initialize it
        (initial value set to 1, because the is at least 1 distinct number on each row)*/
        int maxNum = 1;
        //Declare array 'indexRows' of type int that contains the indexes of array 'rows_counter'
        int[] indexRows = new int[rows_counter.length];
        //Loop though 'rows_counter' from i = 0 to rows_counter.length, incrementing i by 1 (++i)
        for (int i = 0; i < rows_counter.length; ++i) {
            /*Set condition to check if maxNum is smaller than the value of rows_counter
            and mark the indexes for the max value(s) in the array*/
            if (maxNum < rows_counter[i]) {
                //Resetting array 'rows_counter' in case there were larger values in the past
                indexRows = new int[rows_counter.length];
                //Change the value of maxNum to the value of rows_counter when the condition above is met
                maxNum = rows_counter[i];
                //Set the value of indexRows to 1 to mark that the value of the row is a maximum number of distinct elements
                indexRows[i] = 1;
            }
            /*Set condition to check if maxNum is equal to the value of rows_counter
            and mark the max value indexes in the array*/
            else if (maxNum == rows_counter[i]) {
                //Set the value of indexRows to 1 to mark that the value of the row is a maximum number of distinct elements
                indexRows[i] = 1;
            }
        }
        //Display the first part of the message regarding the row(s) with the maximum number of distinct elements
        System.out.print("The row(s) with the maximum number of distinct elements is/are: ");
        //Loop through 'indexRows' to check the positions marked as max value
        for (int i = 0; i < indexRows.length; ++i) {
            //Set the condition to identify the positions marked as max value (i.e. 1)
            if (indexRows[i] == 1) {
                //Display the position in the array 'indexRows' of the value for the maximum number of distinct elements
                System.out.print(i + ", ");
            }
        }
        //Display an empty line
        System.out.println(" ");
        //Display the maximum value of distinct elements on a row
        System.out.print("The maximum number of distinct elements on a row is: " + maxNum);
    }
}