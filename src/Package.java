public class Package extends Delivery {
    Item packedItem;

    //constructor to create package
    public Package (Item content, Customer sender, Customer receiver, int packageNo)
    {
        super(sender,receiver,packageNo);
        this.packedItem=content;

    }

    //getWeight method of packedItem
    @Override
    public double getWeight(){
        return packedItem.getWeight();
    }

    //returns properties of the package.
    public String toString() {
        String packageContent="";
        packageContent="Packed Item :- "+packedItem+". Package Number :- "+this.getPackageNo()+"Package Weight :- "+getWeight()+". This package was sent by :- "
            + super.getSender()+". This package is recieved by :- "+super.getReceiver();
        return packageContent;
    }
}
