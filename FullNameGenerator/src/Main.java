import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = getStringInput(scanner, "Please enter your first name:");
        String middleName = getStringInput(scanner, "Please enter your middle name:");
        String lastName = getStringInput(scanner, "Please enter your last name:");
        String suffix = getStringInput(scanner, "Please enter your title suffix:");

        middleName = (middleName.length() == 1)? (middleName + "."): middleName;

        if(!suffix.isBlank()) {
            System.out.println(firstName + " " + middleName + " " + lastName + ", " + suffix);
        }else{
            System.out.println(firstName + " " + middleName + " " + lastName);
        }


    }

    public static String getStringInput(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
}