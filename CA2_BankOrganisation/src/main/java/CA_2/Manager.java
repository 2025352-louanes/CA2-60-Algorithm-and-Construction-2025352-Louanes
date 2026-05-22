/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author HP
 */
public class Manager {
    private String managerType;

    public Manager(String managerType) {
        this.managerType = managerType;
    }

    public String getManagerType() {
        return managerType;
    }

     @Override
    public String toString() {
        return managerType;
    }

}
