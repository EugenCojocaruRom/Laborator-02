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
        //Method for calculating and displaying the product of positive numbers on even rows and odd columns --> item a
        prodA(A);
        //Method for calculating and displaying the sum of odd positive numbers --> item b
        sumA(A);
        //Method for displaying the number of positive, negative and null elements --> item c
        numA(A);
        //Method for displaying the numbers found on odd rows and columns divisible by 3 --> item d
        odd3A(A);

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

    //Define method for calculating and displaying the product of positive numbers on even rows and odd columns
    static int[][] prodA(int[][] A) {
        //Declare variable 'prod' and initialize it with value 1
        int prod = 1;
        //Loop through array A from i = 0 to length of A, incrementing i by 1 --> rows
        for (int i = 0; i < A.length; ++i) {
            //Inside this loop --> loop through array A from j = 0 to length of A[0].length, incrementing i by 1 --> columns
            for (int j = 0; j < A[0].length; ++j) {
                //Set the condition for performing the multiplication
                if (A[i][j] > 0 && i % 2 == 0 && j % 2 != 0) {
                    //Calculate the product of the positive numbers on even rows and odd columns
                    prod *= A[i][j];
                }
            }
        }
        //Display the product of the numbers on even rows and odd columns
        System.out.print("The product of the numbers on even rows and odd columns is " + prod + "\n");
        return A;
    }

    //Define method for calculating and displaying the sum of odd positive numbers
    static int[][] sumA (int[][] A) {
        //Declare and initialize variable 'prod'
        int sum = 0;
        //Loop through array A from i = 0 to length of A, incrementing i by 1 --> rows
        for (int i = 0; i < A.length; ++i) {
            //Inside this loop --> loop through array A from j = 0 to length of A[0].length, incrementing i by 1 --> columns
            for (int j = 0; j < A[0].length; ++j) {
                //Set the condition for performing the addition
                if (A[i][j] > 0 && A[i][j] % 2 != 0) {
                    //Calculate the sum of odd positive numbers
                    sum += A[i][j];
                }
            }
        }
        //Display the sum of odd positive numbers
        System.out.print("The sum of odd positive numbers is " + sum + "\n");
        return A;
    }

    //Define method for displaying the number of positive, negative and null elements
    static int[][] numA (int[][] A) {
        //Declare variable 'countPos' for positive numbers and initialize it
        int countPos = 0;
        //Declare variable 'countNeg' for negative numbers and initialize it
        int countNeg = 0;
        //Declare variable 'countNull' for null numbers and initialize it
        int countNull = 0;
        for (int i = 0; i < A.length; ++i) {
            //Inside this loop --> loop through array A from j = 0 to length of A[0].length, incrementing i by 1 --> columns
            for (int j = 0; j < A[0].length; ++j) {
                //Set the condition for finding the positive numbers
                if (A[i][j] > 0) {
                    //Increment by 1 the counter for positive numbers
                    countPos++;
                } else if (A[i][j] < 0) {
                    //Increment by 1 the counter for negative numbers
                    countNeg++;
                } else { //--> Identify null numbers
                    //Increment by 1 the counter for null numbers
                    countNull++;
                }
            }
        }
        //Display the number of positive, negative and null elements in array A
        System.out.print("The number of positive elements in array A is " + countPos + "\n");
        System.out.print("The number of negative elements in array A is " + countNeg + "\n");
        System.out.print("The number of null elements in array A is " + countNull + "\n");
        return A;
    }

    //Define method for displaying the numbers found on odd rows and columns divisible by 3
    static int[][] odd3A(int[][] A) {
        //Display the first part of the label for numbers found on odd rows and columns divisible by 3
        System.out.print("The numbers found on odd rows and columns divisible by 3 are ");
        for (int i = 0; i < A.length; ++i) {
            //Inside this loop --> loop through array A from j = 0 to length of A[0].length, incrementing i by 1 --> columns
            for (int j = 0; j < A[0].length; ++j) {
                //Set the condition for identifying the numbers found on odd rows and columns divisible by 3
                if (i % 2 != 0 && j % 3 == 0) {
                    //Display the numbers found on odd rows and columns divisible by 3
                    System.out.print(A[i][j] + ", ");
                }
            }
        }
        return A;
    }
}