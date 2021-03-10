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
public abstract class Delivery {
    int packageNo;
    Customer sender;
    Customer receiver;

    /**
     * Constructor for class Delivery.
     * 
     * @param sender,receiver,packageNo
     */
    public Delivery(Customer sender, Customer receiver, int packageNo){
        this.sender=sender;
        this.receiver=receiver;
        this.packageNo=packageNo;
    }
    
    /**
     * Gets sender of item.
     */
    public Customer getSender() {
        return sender;
    }

    /**
     * Gets receiver of item.
     */
    public Customer getReceiver(){
        return receiver;
    }

    /**
     * Gets packageNo of item.
     */
    public int getPackageNo() {
        return packageNo;
    }

    /**
     * Abstract method of getWeight.
     */
    abstract double getWeight();
}
