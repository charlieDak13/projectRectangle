package bsu.comp152;
import java.util.Random;
// blueprint class for creating and manipulating Rectangle objects
// objects have information and actions assosiated with them
//we store info in "instance variables"
// they keep the data for rectangle object private
// length and width accessible directly only from inside rectangle class
public class Rectangle
{
  public double length;
  private double width;
// Constructor
  /*
  this constructor takes 2 parameters
  constructor have no return type --> not even void
  name od constructor is same as class

   */
  public Rectangle(double len, double wid)
  {
    length = len;
    width = wid;
  }
// mutators (setters)
  public void setLength(double len) {length = len;}
  public void setWidth(double wid) {width = wid;}
public void rotate()
{
  double len1 = length;
  length = width;
  width = len1;
}
public void randomize(){
    Random rand = new Random();
    setLength(rand.nextInt(21) + (rand.nextInt(100)/100.0));
    setWidth(rand.nextInt(21) + (rand.nextInt(100)/100.0));
}
  // Accessors (getters)
  public double getLength() {return length;}
  public double getWidth() {return width;}
  @Override
  public String toString(){
    return "Length = " + length + ", width = "+ width;}
  public boolean equals(Rectangle other){
    return (length == other.length) && (width == other.width);
  }
  public boolean isSquare(){
    return (getLength() == getWidth());
  }
  public double getArea(){
    return (getLength() * getWidth());
  }

  public double stretchLength(double stretchFactor){
   length = length * stretchFactor;
   return length;
  }


}
