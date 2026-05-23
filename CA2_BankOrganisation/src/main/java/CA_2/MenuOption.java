/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author HP
 */
//MenuOption ENUM
public enum MenuOption {
    
    SORT(1, "Sort Employee Records"),
    SEARCH(2, "Search Employee"),
    ADD_RECORD(3, "Add New Employee"),
    CREATE_BINARY_TREE(4, "Generate Employee Hierarchy"),
    DISPLAY_EMPLOYEES(5, "Display All Employees"),
    EXIT(6, "Exit Program");

    // Menu option number
    private final int value;
    
    // Menu option description
    private final String description;
    
    MenuOption(int value, String description) {
        this.value = value;
        this.description = description;
    }
    //Returns menu number
    public int getValue() {
        return value;
    }
    //Returns menu description
    public String getDescription() {
        return description;
    }
    //Displays all menu options
    public static void displayMenu() {
        System.out.println("======================================");
        System.out.println("     BANK ORGANISATION SYSTEM");
        System.out.println("======================================");
    
        // Loop through ENUM values
        for (MenuOption option : MenuOption.values()) {

            System.out.println(option.getValue()
                    + ". "
                    + option.getDescription());
        }
    }
}
