package designpatterns02day03bridgepattern;

/**
 *
 * @author 1999k
 */
public class Test {

    public static void main(String[] args) {

//        Problem
//        RedCircle circle = new RedCircle();
//        circle.draw();
//        
//        BlueCircle circle1 = new BlueCircle();
//        circle1.draw();
//        
//        RedRectangle rectangle = new RedRectangle();
//        rectangle.draw();
//        Solution
// mekedi dn apita one shape ekkin object hadan apita kamathi color ekkin hadaganna puluwan ethakota kalin wage ekein ekata wena wenama classes hadganna awsya na
        System.out.println("");
        Circle circle1 = new Circle(new Red());
        circle1.draw();

        System.out.println("");
        Circle circle2 = new Circle(new Blue());
        circle2.draw();

        System.out.println("");
        Rectangle rectangle1 = new Rectangle(new Blue());
        rectangle1.draw();

        System.out.println("");
        Rectangle rectangle2 = new Rectangle(new Red());
        rectangle2.draw();

    }

}
//Problem............................................
//class RedCircle {
//
//    public void draw() {
//        System.out.println("Red Circle");
//    }
//    
//}
//class RedTraingle {
//
//    public void draw() {
//        System.out.println("Red Traingle");
//    }
//    
//}
//class BlueCircle {
//
//    public void draw() {
//        System.out.println("Blue Circle");
//    }
//    
//}
//class RedRectangle {
//
//    public void draw() {
//        System.out.println("Red Rectangle");
//    }
//    
//}

//Solution..............................................
//abstraction eka - methandi apita meka abstract class ekk widiyatama thiyanna wenawa mokda meka interface karoth api thiyaganna HAS_A reference eka instane nowi static ekk wena nisa e nisa meka abstrct thiyanan one
abstract class Shape {

    Colour colour;

    public Shape(Colour colour) {  // mekedi constructor eka hadaganna hethuwa thama mehema karoth witharai eka rule ekk wiidyata anik meyage type eken hadana hamotama eka kara yutui kiyala kiyanne ekai api e wage aniwaryen karanan one dewal super type eka atule dala thiyaganne
        this.colour = colour;
    }

    public abstract void draw();

}

class Circle extends Shape {

    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
        this.colour.fill();                     // object eka haddima apita one color eka illa gananwa wagema methndi mehema karoth witharai apita api gawa thina color eka shape eka haduwata passe apply wenne
    }

}

class Rectangle extends Shape {

    public Rectangle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
        this.colour.fill();
    }

}

//implementer eka - apita meka abstract class ekk hari interface ekk hari karathki mokda meke thinne abstract method witharak nisa
interface Colour {

    public abstract void fill();

}

class Red implements Colour {

    @Override
    public void fill() {
        System.out.println("Fill Colour Red");
    }

}

class Blue implements Colour {

    @Override
    public void fill() {
        System.out.println("Fill Colour Blue");
    }

}
