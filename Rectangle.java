public class Rectangle extends Shape {
    Rectangle(int length, int breadth)
    {
        a=length;
        b=breadth;
    }
    void PrintArea()
    {
        System.out.println("Rectangle Area:"+(a*b));
    }
}
