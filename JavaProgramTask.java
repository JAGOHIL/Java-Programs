import java.util.Random;
import java.util.Scanner;
public class taskWeek9 {

    public static void main(String[] args) {
        

//Multiplication Table

//First we import the Scanner Utiliy class from Java, then we create a new scanner to enable the program to take user input

        Scanner input = new Scanner(System.in);

//Here we declare a variable for the multiplier, which will be incremented in the loop

        int val2 = 1;

//This is where we take the user input for the number they would like to produce the times table for.
        System.out.println("Please enter a number");
        int val = input.nextInt();

//This is where we ask the user to determine how long they want their multiplication table to be.

        System.out.println("Please enter the range");
        int range = input.nextInt();

//In the for loop, we declare an int varible known as i, which will start at zero up to the range declared by the user and after each loop will be incremented.

        for (int i = 0; i < range; i++) {
//At every iteration, it will take the value declared by the user and the multiplyer val2 and multiply them together, then print them to the console.
        }
        System.out.println(val + "x" + val2 + "=" + val * val2);
//At each iteration, the multipler will increase by 1.
        val2++;

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
       
//Task 2: Finding a leap year

//A leap year is a year that occurs every 4 years.

        for (int i = 1900; i < 2030; i++) {
//Since a leap year is every 4 years, it would mean that it would be divisable by 4, leaving no remainders, therefore the mod operator is a good choice for assessing each year.
            if (i % 4 == 0) {
                System.out.println(i + "This is a leap year");
//This if statement will evaluate the value at each iteration to determine whether the year is divisble by 4, if the expression is true, the system will print to the console, the value alongside a string that acknowledges as a leap year.
            }
//Also if the value is not divisable by 100 but 400, it still counts as a leap year, thus this if statement evaluates for values that meet that condition.
            if (i % 100 > 0 && i % 400 == 0) {
                System.out.println("This is a leap year");
            } else {
                System.out.println(i + "This is not a leap year");
            }
 
          //-----------------------------------------------------------------------------------------------------------------------------------------------------------------            

//Task 3: Fibonacci Numbers
            
//The fibonacci number sequence is a series of numbers where the next term is determined by the sum of the two previous numbers.

//Here we declare two variables that will be used in the while loop.
            int fib = 0;
            int fib2 = 1;
//The while loop will make iterations while the value of fib is less than 1 million(1,000,000), in which another variable is declared to take the sum of the fib and fib2 and since the term to term rules are the sum of the two previous terms, after each iteration, the first value fib and second value fib2 will update.
            while (fib < 1000000) {
                int sum = fib + fib2;
                fib = fib2;
                fib2 = sum;
                System.out.println(sum);
//In order to cause the values to move with the sequence, the first value will become the second value and the second value will become the sum, inorder for the next iteration to work according to the term to term rules of the sequence.
            }
            
          //-----------------------------------------------------------------------------------------------------------------------------------------------------------------           
            
// Task 4: Random Number guessing Game

//Here we start off by asking the user for their input, which will be their guess.

            Scanner num = new Scanner(System.in);

            System.out.println("Please enter a number between 1 to 1000");

            //We declare a double variable called number, which will take the users input which will be assessed in the later steps of the code.

            double number = num.nextDouble();

            //In order to generate a random number, we must import the random class from Java, in which we call in the random method.

            Random rand = new Random();

//Here we declare a double variable in which its value will be a random number from 0 to 1000, this is the variable that the user's guess will be assessed upon.

            double numberToGuess = rand.nextDouble(1000);

//We write an if statement to evaluate the user's input with the randomly generated number, in which if the user's input matches the random number generated, then the system will print out a message acknowledging that the user has won. 

            if (number == numberToGuess) {
                System.out.println("You guessed the right number");
            }
//Although if the user has not gotten the same number, then the program will evaluate whether the user's guess was greater or less than the random number, in which the system will print the messages accordingly.
            else if (number > numberToGuess) {
                System.out.println("Sorry, the your number is greater than the answer");
            } else {
                System.out.println("Sorry, the your number is lower than the answer");
            }
   
          //-----------------------------------------------------------------------------------------------------------------------------------------------------------------            

//Task 5: Triangle
//Here we start of with calling the scanner method to take in user inputs.
            Scanner icon = new Scanner(System.in);

//Here the program will ask the user for a value, which will be the building blocks of the shape.
            System.out.println("Please enter a value");
            String ic = icon.next();
//The program will also ask the user for a value, which will determine the number of rows that the triangle will have.
            System.out.println("Please enter the number of rows");
            int rowt = icon.nextInt();
            int rowtm = rowt * 2;

//In order to construct the triangle a for loop will be used, in which during each iteration, a row of the shape will be printed to the console. 

            for (int it = 1; it < rowtm; it += 2) {
//Here its important to note the sequences of the width of the rows, i.e 1,3,5,7,etc.... This for loop will print spaces for our triangle so that the next loop can print the shape of triangle at each iteration. The values will be incremented at each iteration, so that the next iteration can produce the next rows for the shape accordingly.
                for (int j = 0; j < (4 - it / 2); j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < it; k++) {
                    System.out.print(ic);
                }
                System.out.println("");
            }
            
          //-----------------------------------------------------------------------------------------------------------------------------------------------------------------

// Task 5 Rectangle

//For the rectangle program, the program will take 3 inputs from the user, an input to ask for a value that will be used as the building block for our shape, a value that will determine the number of rows the rectangle has and a value to determine the number of columns that the shape will have.

            Scanner rec = new Scanner(System.in);
            int rows, columns, r, c;

            System.out.println("Please enter a value");
            String recv = rec.next();

            System.out.println("Please enter the number of rows: ");
            rows = rec.nextInt();

            System.out.println("Please enter the number of columns: ");
            columns = rec.nextInt();

//This program will make use of the for loop which will run when the variables r and c reach the values of the rows and columns which are given by the user. During each iteration, the rows and columns of the rectangle will be printed into the console and at the end of the iteration, a new line will be printed, to ensure that the second row can be printed 

            for (r = 1; r <= rows; r++) {
                for (c = 1; c <= columns; c++) {
                    System.out.print(recv);
                }
                System.out.print("\n");
            }
            
          //-----------------------------------------------------------------------------------------------------------------------------------------------------------------           

//Task 5 right angled triangle

//Again like the previous programs, this one will also start of with taking in user input for the building block of the shape and the number of rows that the shape will have.

            Scanner tri = new Scanner(System.in);
            System.out.println("Please enter a value");
            String block = tri.next();
            System.out.println("Please enter the number of rows");
            int t = tri.nextInt();
            //We have declared the int variables x and s to be used in the for loop, those can also be declared in the loop as well.
            int x, s;
            
//The for loop for the right angled triangle will be similar to the for loop used to generate the equilateral  triangle, however since this is a right angle triangle there will be some differences, for instance on every iteration, the loop will print the block alongside a space as well as another line to go to the next iteration.
            for (x = 0; x < t; x++) {
                for (s = 0; s <= x; s++) {
                    System.out.print(block + "");
                }
                System.out.println();
            }

          //-----------------------------------------------------------------------------------------------------------------------------------------------------------------


        }
    }
}