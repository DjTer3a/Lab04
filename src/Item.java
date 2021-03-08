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
        return weight;
    }

    //gets content of item.
    public String getContent() {
        return content;
    }
}
