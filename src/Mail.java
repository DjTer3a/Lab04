public class Mail extends Delivery{
    String content="";

    //Contains content of the item
    public Mail(String content, Customer sender, Customer receiver, int packageNo)
    {
        super(sender,receiver,packageNo);
        this.content=content;
    }

    //returns 0.1 as weight of item.
    @Override
    public double getWeight(){
        return 0.1;
    }

    //returns properties of the mail.
    public String toString() {
        String mailContent="";
        mailContent="Package Content :- "+this.content+". Package Number :- "+super.getPackageNo()+"Package Weight :- "+getWeight()+". This package was sent by :- "
            + super.getSender() +". This package is recieved by :- "+super.getReceiver();
        return mailContent;
    }
}
