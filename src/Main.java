import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.println("+------------------------------------------------+");
        System.out.println("|                                                |");
        System.out.println("|                  ID CARD                       |");
        System.out.println("|                                                |");
        System.out.println("+------------------------------------------------+");
        System.out.println("| Name            : " + name);
        System.out.println("| Age             : " + age);
        System.out.println("| Gender          : " + gender);
        System.out.println("| Address         : " + address);
        System.out.println("| Phone Number    : " + phoneNumber);
        System.out.println("| Email           : " + email);
        System.out.println("+------------------------------------------------+");
    }
}
