import java.util.Scanner;
public class Student {
    String usn; 
    String name;
    int[] credits,marks;

    void accept_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USN:");
        usn=sc.next();
        System.out.println("Enter Name:");
        name=sc.next();
        credits=new int[4];
        marks=new int[4];
        System.out.println("Enter details of Credits and Marks in order for 4 subjects:");
        for(int i=0; i<4; i++){
            System.out.println("Enter Credits for subject"+(i+1)+":");
            credits[i]=sc.nextInt();
            System.out.println("Enter Marks for subject"+(i+1)+":");
            marks[i]=sc.nextInt();
        }
    }
    
    void display(){
        System.out.println("\nStudent Details");
        System.out.println("USN:"+usn);
        System.out.println("Name:"+name);
        for(int i=0; i<4; i++){
            System.out.println("Subject"+(i+1)+"-->Credits:"+credits[i]+", Marks:"+marks[i]);
        }
    }

    double calc(){
        int total_credits=0;
        double totalGradePoints=0;
        for(int i=0; i<4; i++){
            total_credits+=credits[i];
            totalGradePoints+=gradepoints(marks[i])*credits[i];
        }
        return totalGradePoints/total_credits;
    }


    int gradepoints(int marks){
        if(marks>=90)  return 10;
        else if(marks>=80) return 9;
        else if(marks>=70) return 8;
        else if(marks>=60) return 7;
        else if(marks>=50) return 6;
        else if(marks>=40) return 5;
        else return 0;
    }
}
