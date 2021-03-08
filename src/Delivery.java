public abstract class Delivery {
    int packageNo;
    Customer sender;
    Customer receiver;

    //constructor for delivery.
    public Delivery(Customer sender, Customer receiver, int packageNo){
        this.sender=sender;
        this.receiver=receiver;
        this.packageNo=packageNo;
    }
    
    //gets sender of item.
    public Customer getSender() {
        return sender;
    }

    //gets receiver of item.
    public Customer getReceiver(){
        return receiver;
    }

    //gets packageNo of item.
    public int getPackageNo() {
        return packageNo;
    }

    //abstract method of getWeight.
    abstract double getWeight();
}
