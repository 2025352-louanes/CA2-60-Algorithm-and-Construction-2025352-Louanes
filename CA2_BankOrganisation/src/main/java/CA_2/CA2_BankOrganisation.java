/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CA_2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CA2_BankOrganisation {
    
    // Scanner object for user input
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // Create FileHandler object
        FileHandler fileHandler = new FileHandler();

        // Read employees file
        fileHandler.readFile("src/main/resources/Applicants_Form.txt");
        
        int choice;
        
        do{
            // Display ENUM menu
            MenuOption.displayMenu();

            System.out.print("Select an option: ");
            
            // Input validation
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }

            choice = scanner.nextInt();
            
            switch (choice) {

                case 1:
                    System.out.println("SORT selected"); //Call sorting method
                    break;

                case 2:
                    System.out.println("SEARCH selected"); //Call searching method
                    break;
                    
                case 3:
                    System.out.println("ADD RECORD selected"); 
                    break;

                case 4:
                    System.out.println("CREATE BINARY TREE selected");
                    break;

                case 5:
                    System.out.println("DISPLAY EMPLOYEES selected");
                    
                    //Display employees from file
                    fileHandler.displayEmployees();
                    break;
                    
                case 6:
                    System.out.println("Exit program ");
                    break;
                    
                default:
                    System.out.println("Invalid option! Try again.");            
           }
            System.out.println();
        
        }while (choice != MenuOption.EXIT.getValue());
    }
}
