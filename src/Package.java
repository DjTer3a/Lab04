public class Package extends Delivery {
    Item packedItem;

    //constructor to create package
    public Package (Item content, Customer sender, Customer receiver, int packageNo)
    {
        super(sender,receiver,packageNo);
        this.packedItem=content;
        this.sender=sender;
        this.receiver=receiver;
        this.packageNo=packageNo;

    }

    //getWeight method of packedItem
    @Override
    public double getWeight(){
        double weight =  packedItem.getWeight();
        return weight;
    }

    //returns properties of the package.
    public String toString() {
        String packageContent="";
        packageContent="Packed Item :- "+packedItem+". Package Number :- "+packageNo+"Package Weight :- "+getWeight()+". This package was sent by :- "
            + this.sender +". This package is recieved by :- "+this.receiver;
        return packageContent;
    }
}
