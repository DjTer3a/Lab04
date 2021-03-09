public abstract class Person implements Locatable {
    String name;
    int posX;
    int posY;

    //sets position of x and y
    public void setPos(int x, int y){
        this.posX=x;
        this.posY=y;
    }

    //constructor for person with name and posX and posY
    public Person(String name, int x, int y){
        this.name=name;
        setPos(x,y);
    }

    //constructor for person with only name
    public Person(String name){
        this.name=name;
        setPos(0,0);
    }


    /**
     * Sets the name of the Person
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    //gets name of person
    public String getName(){
        return this.name;
    }

    //gets posX
    public int getX(){
        return this.posX;
    }

    //gets posY
    public int getY(){
        return this.posY;
    }
}
