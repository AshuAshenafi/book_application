/**
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *       PSEUDOCODE    * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Start
 * instantiate scanner object to scan user income
 * declare variables for title, author, description, price, and number in stock
 * declare and initialize boolean variables for in_stock and while loop control
 * prompt user to enter title, author, description, price
 * 	WHILE ( control is true)
 * 		prompt user to enter quantity in stock
 * 		IF (number in stock is less than zero)
 * 			print qty can not be less than zero
 * 			prompt to try again
 * 		ELSE
 * 			cont = false
 * 		END IF
 * 		IF (number in stock is greater than zero)
 * 			in_stock = true
 * 		END IF
 * 	END WHILE
 * instantiate new book object with overloaded method
 * call getDisplayText() method
 * end
 *
 * * * * * * * * * * * * * * * * * *       TEST DATA - 1    * * * * * * * * * * * * * * * * * *
 *
 *Enter Book Title: GOSPEL
 * Enter Author Name: JD GREEAR
 * Enter Description: Christianity Revolutionary
 * Enter Price: 16.99
 * Enter quantity in Stock: 50
 *
 * Book Title: GOSPEL
 * Author: JD GREEAR
 * Description: Christianity Revolutionary
 * * * * * * * * * * * * * * * * * *       TEST DATA - 2    * * * * * * * * * * * * * * * * * *
 *
 * Enter Book Title: RICH DAD POOR DAD
 * Enter Author Name: Robert Kiyosaki
 * Enter Description: Financial Independence
 * Enter Price: 4.49
 * Enter quantity in Stock: -10
 * Quantity can't be less than zero.
 * Please try it again?
 * Enter quantity in Stock: 10
 *
 * Book Title: RICH DAD POOR DAD
 * Author: Robert Kiyosaki
 * Description: Financial Independence
 *
 */

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {

        // instantiate scanner object
        Scanner keyboard = new Scanner(System.in);

        // declare variables
        String title;
        String author;
        String description;
        double price;
        int number_in_stock;
        boolean in_stock = false;
        boolean cont = true;

        // prompt user to enter book information
        System.out.print("Enter Book Title: ");
        String input = keyboard.nextLine();
        title = input;


        System.out.print("Enter Author Name: ");
        input = keyboard.nextLine();
        author = input;

        System.out.print("Enter Description: ");
        input = keyboard.nextLine();
        description = input;

        System.out.print("Enter Price: ");
        double prc = keyboard.nextDouble();
        price = prc;


        while(cont == true){
            System.out.print("Enter quantity in Stock: ");
            int num = keyboard.nextInt();
            number_in_stock = num;

            if(number_in_stock < 0){
                System.out.println("Quantity can't be less than zero.");
                System.out.println("Please try it again?");
                cont = true;
            }
            else{
                cont = false;
            }
            if(number_in_stock > 0){
                in_stock = true;
            }

        }   // end of while loop


//        keyboard.nextLine();

        Book book1 = new Book(title, author, price, in_stock, description );
        book1.getDisplayText();

    }

}
