import Shapes.model.Rect;
import Shapes.model.Shape;
import Shapes.model.Square;
import Shapes.model.Circle;
import Shapes.model.Triangle;
import Shapes.model.Elipse;

public class Test {

public static void main (String []args){

        Square Square= new Square(0, 0);  
        Rect Rect = new Rect (0, 0);
        Circle Circle = new Circle(0,0);
        Triangle Triangle=new Shapes.model.Triangle(0, 0);
        Elipse Elipse=new Shapes.model.Elipse(0, 0);
        Rect S = new Rect(0, 0);
        S.setHeight(10);
        S.setWidth(20);

        System.out.println("Area: "+ S.getArea());
        System.out.println("Area: "+ S.getPerimeter());


        Triangle.setSideSiza1(5);
        Triangle.setSideSiza2(4);
        Triangle.setSideSiza3(6);
        Elipse.setRadius2(10);
        Elipse.setRadius(4);
        Rect.setWidth(15);
        Rect.setHeight(2);
        Circle.setRadius(5);
        Square.setWidth(60);

       // Square.setHeight(60); 
        Rect.setHeight(5);
        Rect.setWidth(8); 


        System.out.println(" Area Elipse: "+ Elipse.getArea()+" Permetro: "+ Elipse.getPerimeter() );
        System.out.println("Area de el Triangulo es: "+ Triangle.getArea()+" Perimetro de el Triangulo es: "+ Triangle.getPerimeter());
        System.out.println("--Area circulo--" +Circle.getArea()+ "--Perimetro circulo --"+ Circle.getPerimeter());

        System.out.println("Height of Square: " + Square.getHeight()+ "Area of rect : "+ Rect.getArea());
}
}
