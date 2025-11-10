import java.util.Scanner;
public class SGPA {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numstudents=sc.nextInt();
        Student[] students=new Student[numstudents];
        for (int i=0; i<numstudents; i++){
            students[i]=new Student();
            students[i].accept_details();
            students[i].display();
            System.out.println("SGPA:"+students[i].calc());
        }
    } 
}
