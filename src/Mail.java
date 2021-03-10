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
public class Mail extends Delivery{

    // Instance variables/Properties.
    String content="";

    /**
     * Constructor for class Mail.
     * 
     * @param content,sender,receiver,packageNo
     */
    public Mail(String content, Customer sender, Customer receiver, int packageNo)
    {
        super(sender,receiver,packageNo);
        this.content=content;
    }

    /**
     * Sets weight = 0.1 then gets weight.
     * 
     * @return double
     */
    @Override
    public double getWeight(){
        return 0.1;
    }


    /**
     * Applies toString() to the Mail.
     * 
     * @return String
     */
    public String toString() {
        String mailContent="";
        mailContent="Package Content :- "+this.content+". Package Number :- "+super.getPackageNo()+"Package Weight :- "+getWeight()+". This package was sent by :- "
            + super.getSender() +". This package is recieved by :- "+super.getReceiver();
        return mailContent;
    }
}
