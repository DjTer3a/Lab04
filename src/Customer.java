
public class Customer extends Person{

    Item currentItem;
    
    //constructor for Customer
    public Customer(String name) {
        super(name);
    }

    //gets and intializes currentItem
    public Item getCurrentItem() {
        this.currentItem = (Item) currentItem; 
        return currentItem;
    }

    //checks if there is an employee and if the cutomer has an item that is currently being sent to him
    public boolean sendItem( Company company, Item item, Customer receiver){
        if(Employee.getAvailability()){
            if(){
                
            }

            else{

            }
            return true;
        }
        else{
            return false;
        }
        }

    }
    



}
