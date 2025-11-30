import java.util.Arrays;
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
        //Method for finding the row with the maximum number of non-null elements --> calling matrix A and returning array of type int
        int[] array_counters = maxNums(A);

        System.out.print("The number or non-null elements on each row is: " + Arrays.toString(array_counters));

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

    //Define method for finding the row with the maximum number of non-null elements
    static int[] maxNums(int[][] A) {
        //Declare array 'array_counters' that contains the indexes of the rows with the max num of non-null elements
        int[] array_counters = new int[A.length];
        //Loop through array indexes from i = 0 to A.length, incrementing i by 1 (++i) --> rows
        for (int i = 0; i < A.length; ++i) {
            //Inside this loop --> loop from j = 0 to A[0].length, incrementing j by 1 (++j) --> columns
            for (int j = 0; j < A[0].length; ++j) {
                //Set condition for identifying non-null numbers on each row of matrix A
                if (A[i][j] != 0) {
                    array_counters[i]++;
                }
            }
        }
        displayMaxNum(array_counters);
       return array_counters;
    }

    static void displayMaxNum(int[] array_counters) {
        //Declare variable 'maxVal' of type int and initialize it
        int maxValue = 0;
        //Declare array 'indexes' of type int that contains the indexes of array 'array_counters'
        int[] indexes = new int[array_counters.length];
        //Loop though 'array_counters' from i = 0 to array_counters.length, incrementing i by 1 (++i)
        for (int i = 0; i < array_counters.length; ++i) {
            //Set condition to check if maxValue is smaller than the value of array_counters and
            //mark the max value indexes in the array
           if (maxValue < array_counters[i]) {
               //Resetting the array in case there were larger values in the past
               indexes = new int[array_counters.length];
               //Change value of maxValue to value of array_counters because the condition above is met
               maxValue = array_counters[i];
               //Set value of indexes to 1 to mark that the value of the row is a maximum
               indexes[i] = 1;
           }
           //Set condition to check if maxValue is equal to the value of array_counters and
           //mark the max value indexes in the array
           else if (maxValue == array_counters[i]) {
               //Set value of indexes to 1 to mark that the value of the row is a maximum
               indexes[i] = 1;
           }
        }
        //Display message
        System.out.print("The rows with the max number of non-null elements are: ");
        //Loop though 'indexes' to check the positions marked as max value
        for (int i = 0; i < indexes.length; ++i) {
            //Set condition to identify the positions marked as max value (1)
            if (indexes[i] == 1) {
                //Display value of max position
                System.out.print(i + ", ");
            }
        }
        System.out.print("\n");
        //Display the max value of non-null numbers on a row
        System.out.println("The max value of non-null elements is: " + maxValue);
    }
}