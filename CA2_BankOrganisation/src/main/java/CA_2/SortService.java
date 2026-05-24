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
public class SortService {
    
    public ArrayList<Employee> mergeSort(ArrayList<Employee> employeeList) {
        
        //Base case
        if (employeeList.size() <= 1) {
            return employeeList;
        }
        //Find middle index
        int middle = employeeList.size() / 2;
        
        //Left half
        ArrayList<Employee> left = new ArrayList<>(employeeList.subList(0, middle));
        
        //Right half
        ArrayList<Employee> right = new ArrayList<>(employeeList.subList(middle, employeeList.size()));
        
        //Recursive spliting
        left = mergeSort(left);
        right = mergeSort(right);
        
        //Merge sorted halves
        return merge(left, right);
    }
    //Merge two sorted lists
    private ArrayList<Employee> merge(ArrayList<Employee> left, ArrayList<Employee> right) {
        ArrayList<Employee> sortedList = new ArrayList<>();
        
        int leftIndex = 0;
        int rightIndex = 0;
        
        // Compare names alphabetically
        while (leftIndex < left.size()
                && rightIndex < right.size()) {
            
            String leftName = left.get(leftIndex).getFullName();
                    
            String rightName = right.get(rightIndex).getFullName();
            
            //Alphabetical comparison
            if (leftName.compareToIgnoreCase(rightName) <= 0) {
                
                sortedList.add(left.get(leftIndex));
                leftIndex++;
        }else{
                sortedList.add(right.get(rightIndex));
                rightIndex++;
           }
        }
        //Add remaining left items
        while (leftIndex < left.size()) {
            
            sortedList.add(left.get(leftIndex));
            leftIndex++;
        }
        //Add remaining right items 
        while (rightIndex < right.size()) {
            
            sortedList.add(right.get(rightIndex));
            rightIndex++;
        }
        return sortedList;
    }
    //Display first 20 employees
    public void displayFirst20(ArrayList<Employee> employeeList) {
        
        System.out.println("\nFIRST 20 SORTED EMPLOYEES");
        System.out.println("==============================");
        
        int limit = Math.min(20, employeeList.size());
        
        for (int i = 0; i < limit; i++) {
            System.out.println((i + 1) + ". " + employeeList.get(i));
        }
    }       
}
