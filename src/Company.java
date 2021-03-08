import java.util.ArrayList;

public class Company implements Locatable{
    
    final int EMPLOYEE_CAPACITY = 15;
    Employee[] employees;
    ArrayList<Customer> customers;
    int numOfEmployees;
    int employeeNo;
    int packageNo;
    int posX;
    int posY;

    public Company( int x, int y){
        setPos(x, y);
    }


    public boolean addEmployee( Employee candidate){
        
    }

    public void addCustomer ( Customer customer){

    }

    public void deliverPackages(){

    }

    public String toString(){

    }



    //gets posX
    public int getX(){
        return this.posX;
    }

    //gets posY
    public int getY(){
        return this.posY;
    }

}
