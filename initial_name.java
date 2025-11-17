import java.util.Scanner;

public class initial_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        String[] words = fullName.split(" ");
        String initials = "";

        for(String word : words) {
            if(!word.isEmpty()) {
                initials += Character.toUpperCase(word.charAt(0));
            }
        }

        System.out.println("Your initials are: " + initials);
        sc.close();
    }
}
