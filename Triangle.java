public class Triangle extends Shape {
    Triangle(int base, int height)
    {
        a=base;
        b=height;
    }
    void PrintArea()
    {
        System.out.println("Triangle Area:"+(0.5*a*b));
    }
}
