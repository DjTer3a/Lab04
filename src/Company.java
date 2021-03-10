/**
 * Lab 04 Instructions found in CS102_Lab04.pdf
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 10/03/2021
 */
import java.util.ArrayList;
import java.util.Random;

public class Company implements Locatable{
    
    //Instance variables/ Properties.
    final int EMPLOYEE_CAPACITY = 15;
    Employee[] employees;
    ArrayList<Customer> customers;
    int numOfEmployees;
    int employeeNo;
    int packageNo;
    int posX;
    int posY;

    /**
     * Constructor creates Company with Employees and customers.
     * 
     * @param x,y
     */
    Company(int x, int y) {
        setPos(x, y);

        this.numOfEmployees = 0;
        this.employees = new Employee[0];
        this.customers = new ArrayList<Customer>();
    }

    /**
     * Returns  posX of the Company. 
     * 
     * @return int
     */
    public int getX() {
        return this.posX;
    }

    /**
     * Returns  posY of the Company.
     * 
     * @return int
     */
    public int getY() {
        return this.posY;
    }

    /**
     * Sets  posX and posY of the Company. 
     * 
     * @param x,y
     */
    public void setPos(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    /**
     * Adds an employee to the Company and returns true if the employee is added.
     * 
     * @param candidate
     * @return boolean
     */
    public boolean addEmployee(Employee candidate) {

        if (this.numOfEmployees < EMPLOYEE_CAPACITY) {

            Employee[] newEmployeesArray = new Employee[this.employees.length + 1];

            for (int i = 0; i < this.employees.length; i++) {
                newEmployeesArray[i] = this.employees[i];
            }

            newEmployeesArray[this.employees.length] = candidate;

            this.employees = newEmployeesArray;

            this.numOfEmployees += 1;

            return true;

        }

        else {

            return false;

        }

    }

    /**
     * Adds a customer to the Company.
     * 
     * @param candidate
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Removes an employee from the Company and returns true if the employee is deleted.
     * 
     * @param candidate
     * @return boolean
     */
    public boolean terminateContract(int employeeIndex) {
        Employee[] newEmployeesArray = new Employee[this.employees.length - 1];
        boolean employeeTerminated = false;

        for (int i = 0; i < this.employees.length; i++) {

            if (i != employeeIndex || employeeTerminated) {

                int newArrayIndex = employeeTerminated ? i - 1 : i;

                newEmployeesArray[newArrayIndex] = this.employees[i];

            } else {

                employeeTerminated = true;

            }

        }

        this.employees = newEmployeesArray;

        return employeeTerminated;

    }

    /**
     * Creates a deliverable object of item if employee is available else returns false.
     * 
     * @param candidate
     * @return boolean
     */
    public boolean createDeliverable(Item sendItem, Customer sender, Customer receiver) {

        boolean employeeFound;
        this.packageNo = 100000 + (new Random()).nextInt(900000);

        employeeFound = false;

        for (int i = 0; i < this.employees.length && !employeeFound; i++) {
            employeeFound = this.employees[i].getAvailability();

            if (employeeFound) {
                this.employeeNo = i;
            }
        }

        if (employeeFound) {
            employees[this.employeeNo].addJob(sendItem, sender, receiver, this.packageNo);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Returns  total jobs of the Company.
     * 
     * @return int
     */
    public int getTotalJobs()
    {
        int totalJobs = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].currentJobs > 0) {
                totalJobs+=this.employees[i].getDeliveries();
            }
        }
        return totalJobs;
    }

    /**
     * Deliver all packages and print delivery information.
     */
    public void deliverPackages() {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].currentJobs > 0) {
                this.employees[i].deliverPackages();
            }
        }
    }

    

    /**
     * Lists and prints all the information related to the Company.
     * 
     * @param candidate
     */
    public String toString() {
        String CompanyContent="";
        CompanyContent="The Company currently has the following number of employees :- "+numOfEmployees
            +", and the following number of customers :- "+(customers.size()+1)+". The number of packages being delieverd is :- "+getTotalJobs();
        return CompanyContent;
    }
}
