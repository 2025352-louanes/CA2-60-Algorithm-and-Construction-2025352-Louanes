/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class SearchService {
    
    //Recursive Binary Search
    public Employee binarySearch(ArrayList<Employee> employeeList,String targetName,int left,int right) {
        
        // Base case: employee not found
        if (left > right) {
            return null;
        }
        //Find middle index
        int middle = (left + right) / 2;
        
        //Get middle employee name
        String middleName = employeeList.get(middle).getFullName();
        
        //Compare names ignoring case
        int comparison = targetName.compareToIgnoreCase(middleName);
        
        //Employee found
        if (comparison == 0) {
             return employeeList.get(middle);
        }
        // Search left half
        else if (comparison < 0) {
            return binarySearch(employeeList,targetName,left,middle - 1);
        }
        // Search half right
        else{
            return binarySearch(employeeList,targetName,middle + 1,right);
        }
    }
    //Displays employee search result
    public void displayEmployee(Employee employee) {
        if (employee == null) {
            System.out.println("\nEmployee not found.");
            
        }else {
            System.out.println("\nEMPLOYEE FOUND");
            System.out.println("================================");
            System.out.println("Name: "+ employee.getFullName());
            System.out.println("Manager Type: "+ employee.getManagerType());
            System.out.println("Department: "+ employee.getDepartment());
        }
    }
}
