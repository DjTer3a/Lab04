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
public abstract class Person implements Locatable {
    String name;
    int posX;
    int posY;

    /**
     * Constructor creates Company with Employees and customers.
     * 
     * @param x,y
     */
    public void setPos(int x, int y){
        this.posX=x;
        this.posY=y;
    }

    /**
     * Constructor creates Person.
     * 
     * @param name,x,y
     */
    public Person(String name, int x, int y){
        this.name=name;
        setPos(x,y);
    }

    /**
     * Constructor creates Person.
     * 
     * @param name
     */
    public Person(String name){
        this.name=name;
        setPos(0,0);
    }


    /**
     * Sets the name of the Person.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the Person.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Returns  posX of the Person.
     * 
     * @return int
     */
    public int getX(){
        return this.posX;
    }

    /**
     * Returns  posY of the Person.
     * 
     * @return int
     */
    public int getY(){
        return this.posY;
    }
}
