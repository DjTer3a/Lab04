
public class Customer extends Person{

    // properties
    public Item currentItem;

    // constructor
    public Customer(String name) {
        super(name);
    }

    // methods

    /**
     * Returns the current item
     * 
     * @return Item
     */
    public Item getCurrentItem() {
        return currentItem;
    }

    /**
     * Set the current item for the Customer
     * 
     * @param item
     */
    public void setCurrentItem(Item item) {
        this.currentItem = item;
    }

    /**
     * Send an item for the Customer
     * 
     * @param company
     * @param item
     * @param receiver
     * @return boolean
     */
    public boolean sendItem(Company company, Item item, Customer receiver) {

        Item itemToBeSent;

        itemToBeSent = currentItem == null ? item : currentItem;

        return company.createDeliverable(itemToBeSent, this, receiver);

    }

    /**
     * Returns the string representation of the Customer
     * 
     * @return String
     */
    public String toString() {
        return "Customer: " + super.getName() + " currentItem: " + this.getCurrentItem();
    }

}