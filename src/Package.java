public class Package extends Delivery {
    Item packedItem;

    /**
     * Constructor for class Package.
     * 
     * @param content,sender,receiver,packageNo
     */
    public Package (Item content, Customer sender, Customer receiver, int packageNo)
    {
        super(sender,receiver,packageNo);
        this.packedItem=content;

    }

    /**
     * Gets weight of packedItem.
     * 
     * @return double
     */
    @Override
    public double getWeight(){
        return packedItem.getWeight();
    }

    /**
     * Applies toString() to the Package.
     * 
     * @return String
     */
    public String toString() {
        String packageContent="";
        packageContent="Packed Item :- "+packedItem+". Package Number :- "+this.getPackageNo()+"Package Weight :- "+getWeight()+". This package was sent by :- "
            + super.getSender()+". This package is recieved by :- "+super.getReceiver();
        return packageContent;
    }
}
