/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userInputString = JOptionPane.showInputDialog(null, "Enter your name ");
        JOptionPane.showMessageDialog(null, "hello" + userInputString+"!");
        
        String ageInput = JOptionPane.showInputDialog(null, "Enter your age:");
        int age= Integer.parseInt(ageInput);
        int futureAge= age + 5;
        
        JOptionPane.showMessageDialog(null, "In 5 years you will be "+futureAge+"yearsold!");
    }
    
}
