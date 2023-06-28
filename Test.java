abstract class Shape{
    double dim1,dim2;
    Shape(double a,double b){
        dim1=a;
        dim2=b;
    }

   abstract void area();
}
class Rect extends Shape{
    Rect(double a,double b){
        super(a,b);
    }
    void area(){
        System.out.println("Area of Rectangle is:"+(dim1*dim2));
    }
}
class Triangle extends Shape{
    Triangle(double a,double b){
        super(a,b);
    }
    void  area(){
        System.out.println("Area of Triangle is:"+(0.5*dim1*dim2));
    }
}
class circle extends Shape{
    circle(double a){
        super(a,0);
    }
    void area(){
        System.out.println("Area of circle is: "+(Math.PI*dim1*dim1));
    }
}
public class Test {
    public static void main(String[] args) {
        Shape s;
        s=new Rect(10,20);
        s.area();
        s=new Triangle(20,23);
        s.area();
        s=new circle(20);
        s.area();

    }
}
