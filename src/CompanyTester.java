import java.util.*;

public class CompanyTester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Create several items with different weights.
        Item item1 = new Item(0.05, "A sample mail item");
        Item item2 = new Item(0.1, "A mail that fits the limit");
        Item item3 = new Item(0.2, "A small package");
        Item item4 = new Item(1, "A mobile phone");   



        System.out.println("Enter customer one name : -");
        String customer1Name = scan.nextLine();
        System.out.println("Enter customer two name : -");
        String customer2Name = scan.nextLine();
        System.out.println("Enter employee one name : -");
        String employee1Name = scan.nextLine();
        System.out.println("Enter employee two name : -");
        String employee2Name = scan.nextLine();





        // 2. Create at least 2 Customers and 2 Employees.
        Customer customer1 = new Customer(customer1Name);
        Customer customer2 = new Customer(customer2Name);

        Employee employee1 = new Employee(1, employee1Name);
        Employee employee2 = new Employee(2, employee2Name);




        

        System.out.println("Enter the action that you want preformed");
        System.out.println("Enter 1 for the customers to send items to each other");
        System.out.println("Enter 2 for the company details");
        System.out.println("Enter 3 to print item details, customer details and employee details");
        int action = scan.nextInt();
        
            if(action == 1)
            {
                // 3. Customers send items to each other. Have a case where the Customer
                // couldn’t send the item, because there was no available Employee.
    
                Company amazon = new Company(5, 5);
    
                amazon.addEmployee(employee1);
                amazon.addEmployee(employee2);
    
                amazon.addCustomer(customer1);
                amazon.addCustomer(customer2);
    
                System.out.println(customer1.sendItem(amazon, item1, customer2));
                System.out.println(customer1.sendItem(amazon, item1, customer2));
                System.out.println(customer1.sendItem(amazon, item2, customer2));
                System.out.println(customer1.sendItem(amazon, item2, customer2));
                System.out.println(customer1.sendItem(amazon, item3, customer2));
                System.out.println(customer1.sendItem(amazon, item3, customer2));
                System.out.println(customer1.sendItem(amazon, item4, customer2));
                System.out.println(customer1.sendItem(amazon, item4, customer2));
                System.out.println(customer1.sendItem(amazon, item1, customer2));
                System.out.println(customer1.sendItem(amazon, item1, customer2));
                System.out.println(customer1.sendItem(amazon, item1, customer2));
    
                // 4. Get an employee busy by giving it the maximum amount of jobs
                System.out.println("Employee1 getAvailability(): " + employee1.getAvailability());
                System.out.println("Employee2 getAvailability(): " + employee2.getAvailability());
    
                // 5. Deliver items between customers.
                amazon.deliverPackages();
    
    
            }
            else if(action == 2)
            {
                Company amazon = new Company(5, 5);
    
                amazon.addEmployee(employee1);
                amazon.addEmployee(employee2);
    
                amazon.addCustomer(customer1);
                amazon.addCustomer(customer2);

                customer1.sendItem(amazon, item1, customer2);
                customer1.sendItem(amazon, item1, customer2);
                customer1.sendItem(amazon, item2, customer2);
                customer1.sendItem(amazon, item2, customer2);
                customer1.sendItem(amazon, item3, customer2);
                customer1.sendItem(amazon, item3, customer2);
                customer1.sendItem(amazon, item4, customer2);
                customer1.sendItem(amazon, item4, customer2);
                customer1.sendItem(amazon, item1, customer2);
                customer1.sendItem(amazon, item1, customer2);
                customer1.sendItem(amazon, item1, customer2);
    
                // 5. Deliver items between customers.
                amazon.deliverPackages();

                System.out.println(amazon.toString());
            }
            else if(action == 3)
            {
                System.out.println(item1);
                System.out.println(item2);
                System.out.println(item3);
                System.out.println(item4);
    
                System.out.println(customer1);
                System.out.println(customer2);
    
                System.out.println(employee1);
                System.out.println(employee2);
            }
            else
            {
                System.out.println("The input is invalid.");
                System.out.println("Enter a valid input ");
                action = scan.nextInt();
            }
       



            scan.close();

        

    }

}