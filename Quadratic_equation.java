import java.util.Scanner;
import java.lang.Math;
class Quadratic_equation
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter A value:");
        int A=S.nextInt();
        System.out.println("Enter B value:");
        int B=S.nextInt();
        System.out.println("Enter C value:");
        int C=S.nextInt();
        double discriminant, x,x1,x2;

        if(A==0)
        {
            System.out.println("Not a Quadratic Equation(A cannot be equal to 0)");
        }
        else
        {
            discriminant=(B*B)-(4*A*C);
            if(discriminant<0)
            {
                System.out.println("No Real Solutions");
            }
            else if (discriminant==0)
            {
                x=(-B/(2.0)*A);
                System.out.println("One Real Solution,"+x);
            }
            else
            {
                x1=(-B+Math.sqrt(discriminant))/(2.0*A);
                x2=(-B-Math.sqrt(discriminant))/(2.0*A);
                System.out.println("Two Real solutions= "+x1+","+x2);
            }
        }
        S.close();
    }
}
