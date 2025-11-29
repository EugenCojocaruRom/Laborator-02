import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value n
        System.out.print("n = ");
        //Declare and read variable n from keyboard
        int n = sc.nextInt();
        //Declare array x and set the number of elements to n
        int[] x = new int[n];
        //Declare array y and set the number of elements to n
        int[] y = new int[n];

        //Method for reading array x
        readX(x, sc);
        //Method for displaying array x
        displayX(x);
        //Method for displaying array y
        displayY(y, x);
    }

    //Define method for reading array X
    static int[] readX(int[] x, Scanner sc) {
        //Loop through array x from i = 0 to length of x, incrementing i by 1
        for (int i = 0; i < x.length; ++i) {
            //Display values for array x
            System.out.print("x[" + i + "] = ");
            //Read values of array x
            x[i] = sc.nextInt();
        }
        return x;
    }

    //Define method for displaying array x
    static int[] displayX(int[] x) {
        //Display the first part of the label for array x
        System.out.print("The values of array x are: ");
        //Loop through array x from i = 0 to length of x, incrementing i by 1
        for (int i = 0; i < x.length; ++i) {
            System.out.print(x[i] + ", ");
        }
        //Display empty row
        System.out.println(" ");
        return x;
    }

    //Define method for displaying array y, containing the positive values from array x
    static int[] displayY(int[] y, int[] x) {
        //Set array y as equal to array x
        y = x;
        //Display the first part of the label for array y
        System.out.print("The values of array y are: ");
        //Loop through array y from j = 0 to length of y, incrementing j by 1
        for (int j = 0; j < y.length; ++j) {
            //Define condition for identifying positive numbers
            if (y[j] > 0) {
                //Display the values of array y
                System.out.print(y[j] + ", ");
            }
        }
        return y;
    }
}