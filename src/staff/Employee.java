/*
 * Name:Jeremy Parris
 * Date: March 10, 2014
 */

package staff;


public class Employee 
{
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    //default constructor
    public Employee()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setId(int id)
    {
        idNumber = id;
    }
    
    public int getId()
    {
        return idNumber;
    }
    
    public void setDepartment(String department)
    {
        this.department = department;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public void setPosition(String position)
    {
        this.position = position;
    }
    public String getPosition()
    {
        return position;
    }
    
    public void message()
    {
        System.out.println(getName() + " " + getId() + " " + getDepartment() + getPosition());
    }
}
