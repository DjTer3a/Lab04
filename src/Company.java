import java.util.ArrayList;
import java.util.Random;

public class Company implements Locatable{
    
    final int EMPLOYEE_CAPACITY = 15;
    Employee[] employees;
    ArrayList<Customer> customers;
    int numOfEmployees;
    int employeeNo;
    int packageNo;
    int posX;
    int posY;

    // constructor
    Company(int x, int y) {
        setPos(x, y);

        this.numOfEmployees = 0;
        this.employees = new Employee[0];
        this.customers = new ArrayList<Customer>();
    }

    /**
     * Returns the X position of the Company
     * 
     * @return int
     */
    public int getX() {
        return this.posX;
    }

    /**
     * Returns the Y position of the Company
     * 
     * @return int
     */
    public int getY() {
        return this.posY;
    }

    /**
     * Sets the X and Y pos for the Company
     * 
     * @param x
     * @param y
     */
    public void setPos(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    /**
     * Adds an employee to the company and returns true if the employee is
     * successfully added
     * 
     * @param candidate
     * @return
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
     * Adds the given customer to the Company
     * 
     * @param candidate
     * @return
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Removes an employee from the Company and returns true if the employee at the
     * given index is deleted
     * 
     * @param candidate
     * @return
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
     * Creates a deliverable object from the item if an employee is available and
     * returns true, otherwise it returns false
     * 
     * @param candidate
     * @return
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
     * Deliver all the packages via Employees and print the delivery information.
     * Displays type, no, sender and receiver info (name and loc) for each delivery.
     * 
     * @param candidate
     * @return
     */
    public void deliverPackages() {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].currentJobs > 0) {
                this.employees[i].deliverPackages();
            }
        }
    }

    

    /**
     * Lists and prints all the information related to the Company. Includes
     * deliveries, employees, and customers.
     * 
     * @param candidate
     * @return
     */
    public String toString() {
        String companyContent="";
        companyContent="The company currently has the following number of employees :- "+numOfEmployees
            +", and the following number of customers :- "+(customers.size()+1)+". The number of packages being delieverd is :- "+getTotalJobs();
        return companyContent;
    }
}
