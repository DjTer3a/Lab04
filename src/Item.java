public class Item {
    double weight;
    String content;

    //constructor for item.
    public Item(double weight, String content){
        this.weight = weight;
        this.content = content;
    }

    //gets weight of item.
    public double getWeight() {
        return this.weight;
    }

    //gets content of item.
    public String getContent() {
        return this.content;
    }

    /**
     * Returns the string representation of the Item
     * 
     * @return String
     */
    public String toString() {
        return "Weight: " + this.weight + " " + "Content: " + this.content;
    }
}
