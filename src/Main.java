import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Fabian's Password Generator");
        System.out.println("1 | Generate a Password");
        System.out.println("2 | Exit");

        Scanner scanner = new Scanner(System.in);

        int choice;
        choice = scanner.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.println("Invalid Choice");
            choice = scanner.nextInt();
        }

        switch (choice) {
            case 2:
                System.exit(0);
                break;
            case 1:
                System.out.println("Generating Password...");
                break;
            default:
                break;
        }

        System.out.println("Enter the password length");
        int passwordLength = scanner.nextInt();

        System.out.println("Please choose the password specifications");
        System.out.println("1 | lowercase characters");
        System.out.println("2 | lower and uppercase characters");
        System.out.println("3 | lower and uppercase characters with numbers");
        System.out.println("4 | lower and uppercase characters with numbers and symbols");

        choice = scanner.nextInt();
        while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            System.out.println("Invalid Choice");
            choice = scanner.nextInt();
        }

        Random ran = new Random();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String numbers = "123456789";


        StringBuilder string;
        String result;
        switch (choice) {

            case 1:
                System.out.println("Generating a Password");
                string = new StringBuilder();
                for (int i = 0; i < passwordLength; i++) {
                    string.append((char) (ran.nextInt(26) + 'a'));
                }
                result = string.toString();
                System.out.println("Password: " + result);
                break;
            case 2:
                System.out.println("Generating a Password");
                string = new StringBuilder();
                String upperLower = upper + lower;
                for (int i = 0; i < passwordLength; i++) {
                    string.append(upperLower.charAt(ran.nextInt(51)));

                }
                result = string.toString();
                System.out.println("Password: " + result);
                break;
            case 3:
                System.out.println("Generating a Password");
                String upperLowerNumber = upper + lower + numbers;
                string = new StringBuilder();
                for (int i = 0; i < passwordLength; i++) {
                    string.append(upperLowerNumber.charAt(ran.nextInt(60)));
                }
                result = string.toString();
                System.out.println("Password: " + result);
                break;
            case 4:
                System.out.println("Generating a Password");
                string = new StringBuilder();
                for (int i = 0; i < passwordLength; i++) {
                    string.append((char) (ran.nextInt(93) + '!'));
                }
                result = string.toString();
                System.out.println("Password: " + result);
            default:
                break;
        }


    }


}