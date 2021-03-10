
public class Customer extends Person{

    // Instance variables/Properties.
    public Item currentItem;

    /**
     * Constructor for class Customer.
     * 
     * @param name
     */
    public Customer(String name) {
        super(name);
    }


    /**
     * Returns the current item.
     * 
     * @return Item
     */
    public Item getCurrentItem() {
        return currentItem;
    }

    /**
     * Set the current item for the Customer.
     * 
     * @param item
     */
    public void setCurrentItem(Item item) {
        this.currentItem = item;
    }

    /**
     * Send an item for the Customer.
     * 
     * @param company,item,receiver
     * @return boolean
     */
    public boolean sendItem(Company company, Item item, Customer receiver) {

        Item itemToBeSent;

        itemToBeSent = currentItem == null ? item : currentItem;

        return company.createDeliverable(itemToBeSent, this, receiver);

    }

    /**
     * Applies toString() to Customer.
     * 
     * @return String
     */
    public String toString() {
        return "Customer: " + super.getName() + " currentItem: " + this.getCurrentItem();
    }

}