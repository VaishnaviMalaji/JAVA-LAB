public class Circle extends Shape {
    Circle(int radius)
    {
        a=radius;
        b=0;
    }
    void PrintArea()
    {
        System.out.println("Circle Area:"+(Math.PI*a*a));
    }
}

