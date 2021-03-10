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
public class Item {

    // Instance variables/Properties.
    double weight;
    String content;

    /**
     * Constructor for class Item.
     * 
     * @param weight,content
     */
    public Item(double weight, String content){
        this.weight = weight;
        this.content = content;
    }

    /**
     * Gets weight of item.
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Gets content of item.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Applies toString() to the Item
     * 
     * @return String
     */
    public String toString() {
        return "Weight: " + this.weight + " " + "Content: " + this.content;
    }
}
