package bsu.comp152;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
       Rectangle rect1 = new Rectangle(10.1, 6.774);
        Rectangle rect2 = new Rectangle(10.1, 6.774);
// dont use == to comapre objects, use an equals method
        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
        /*
         * After we write a constructor that takes
         * two parameters, the default constructor
         * with zero parameters doesnt work by default anymore
         */

        //Rectangle rect2 = new Rectangle();

        System.out.println(rect1.toString());

        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());

        rect1.setLength(5.77);
        rect1.setWidth(3.2);

        System.out.println(rect1);

        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());

        System.out.println(rect1.isSquare());
        System.out.println(rect1.getArea());

        rect1.rotate();
        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());

        rect1.randomize();
        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());

       Rectangle rect3 = new Rectangle(30,10);
     System.out.println(rect3.stretchLength(1.5));
     System.out.println(rect3.getWidth());

     System.out.printf("rect1: %7.3f rect2: %7.3f rect3: %7.3f" ,33.871, rect2.getLength(), rect3.getLength());


    }
}
