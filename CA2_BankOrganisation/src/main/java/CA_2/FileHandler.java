/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class FileHandler {
    
    // Arraylist to store employees
    private ArrayList<Employee> employeeList;
    
    public FileHandler() {
        
        //This creates empty employee list
        employeeList = new ArrayList<>();
    }
    //Reads employee data from text file
    public void readFile(String filePath) {
        
        // Opens file for reading
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            
            // Skip first line (header row)
            br.readLine();
            
            //Read file line by line
             while ((line = br.readLine()) != null) {
                 
                 //Ignore empty lines
                 if (line.trim().isEmpty()) {
                    continue;
                 }  
                    // Split line using comma
                    String[] data = line.split(",");
                    
                    // Validate minimum number of columns
                    if (data.length < 9) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }
                
                //Extract required fields
                String firstName = data[0].trim();
                String lastName = data[1].trim();
                String department = data[5].trim();
                String managerType = data[7].trim();
                
                //Create employee object
                Employee employee = new Employee(
                         firstName,
                         lastName,
                         managerType,
                         department
                );
                //Add employee to Arraylist
                employeeList.add(employee);
            }

            System.out.println("File read successfully!");
            System.out.println("Total employees loaded: " + employeeList.size());

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
      }
      
    public ArrayList<Employee> getEmployeeList() {
        //Returns employee list
        return employeeList;
    }
    
    //Displays all employees
    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
