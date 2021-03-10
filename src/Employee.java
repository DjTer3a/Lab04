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
public class Employee extends Person {
    
    // Instance variables/Properties.
    final int MAX_JOBS = 5;
    int currentJobs;
    Delivery[] deliveries;
    double salary;
    int employeeNo;
    boolean available;

    /**
     * Constructor for class Employee.
     * 
     * @param employeeNo,name
     */
    public Employee(int employeeNo, String name) {
        super(name);

        this.employeeNo = employeeNo;
        this.available = true;
        this.currentJobs = 0;

        deliveries = new Delivery[MAX_JOBS];
    }


    /**
     * Adjusts salary of employee.
     * @param value
     */
    public void adjustSalary(double value) {
        this.salary += value;
    }

    /**
     * Returns the availability of an Employee.
     * 
     * @return boolean
     */
    public boolean getAvailability() {

        if (this.currentJobs < this.MAX_JOBS) {
            this.available = true;
        } else {
            this.available = false;
        }

        return this.available;

    }

    /**
     * Assigns a job to an Employee.
     * 
     * @param sendItem,sender,receiver,packageNo
     */
    public void addJob(Item sendItem, Customer sender, Customer receiver, int packageNo) {

        if (this.currentJobs < MAX_JOBS) {

            if (sendItem.getWeight() > 0.1) {
                deliveries[currentJobs] = new Package(sendItem, sender, receiver, packageNo);
            } else {
                deliveries[currentJobs] = new Mail(sendItem.getContent(), sender, receiver, packageNo);
            }

            this.currentJobs += 1;

        }
    }

    /**
     * Gets deliveries pending.
     * @return int
     */
    public int getDeliveries()
    {
        return deliveries.length;
    }

    /**
     * Deliver packages by an Employee.
     */
    public void deliverPackages() {

        for (int i = 0; i < this.deliveries.length; i++) {
            System.out.println(this.deliveries[i]);
            this.deliveries[i] = null;
        }

        this.currentJobs = 0;

    }

    

    /**
     * Applies toString() to the Employee.
     * 
     * @return String
     */
    public String toString() {
        return "name: " + super.getName() + " currentJobs: " + this.currentJobs + " deliveries: " + this.deliveries
                + " salary: " + this.salary + " employeeNo: " + this.employeeNo + " available: " + this.available;
    }
}
