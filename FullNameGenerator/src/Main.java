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
            System.out.println(firstLetterCapital(firstName) + " " + firstLetterCapital(middleName) + " "
                    + firstLetterCapital(lastName) + ", " + firstLetterCapital(suffix));
        }else{
            System.out.println(firstLetterCapital(firstName) + " " + firstLetterCapital(middleName) + " " + firstLetterCapital(lastName));
        }


    }

    public static String getStringInput(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }

    public static String firstLetterCapital(String name){
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}