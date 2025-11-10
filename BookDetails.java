import java.util.Scanner;
public class BookDetails{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of books:");
int n=sc.nextInt();
sc.nextLine();
Book[] books=new Book[n];
for(int i=0;i<n;i++){
System.out.println("\nEnter details for book"+(i+1)+";");
System.out.println("Enter book name:");
String name=sc.nextLine();
System.out.println("Enter Author:");
String author=sc.nextLine();
System.out.println("Enter Price: ");
double price=sc.nextDouble();
System.out.println("Enter number of pages:");
int num_pages=sc.nextInt();
sc.nextLine();

books[i]=new Book(name,author,price,num_pages);
}
System.out.println("\n---Book Details----");
for(int i=0;i<n;i++){
System.out.println("\nBook"+(i+1)+":\n"+books[i].toString());
}
sc.close();
}
}