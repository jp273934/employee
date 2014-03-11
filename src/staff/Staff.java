/*
 * Name: Jeremy Parris
 * Date: March 10, 2014
 */

package staff;

import javax.swing.JOptionPane;


public class Staff 
{

   
    public static void main(String[] args) 
    {
        String input;
        String input1;
        String input2;
        String input3;
        
        int id;
        
        Employee[] employee = new Employee[2];
        
        
        
        for(int i = 0; i < employee.length; i++)
        {
            input = JOptionPane.showInputDialog(null, "Enter employee's name");
            
            employee[i].setName(input);
            
            input1 = JOptionPane.showInputDialog(null, "Enter employee's id number");
            
            id = Integer.parseInt(input);
            
            employee[i].setId(id);
            
            input2 = JOptionPane.showInputDialog(null, "Enter employee's department");
            
            employee[i].setDepartment(input);
            
            input3 = JOptionPane.showInputDialog(null, "Enter employee's position");
            employee[i].setPosition(input);
        }
        
        for(int i = 0; i < employee.length; i++)
        {
           employee[i].message();
        }
    }
    
}
