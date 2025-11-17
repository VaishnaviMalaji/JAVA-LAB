import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a word:");
        String word=sc.nextLine();

        String original = word.toLowerCase();
        String reverse="";

        for (int i=original.length() - 1; i>=0; i--){
            reverse=reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println(word+" is a palindrome.");
        }
        else{
            System.out.println(word +" is NOT a palindrome.");
        }
        sc.close();
    }
}
