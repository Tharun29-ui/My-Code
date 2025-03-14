import java.util.Scanner;

public class InputValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Please enter a valid integer: ");
            
            try {
                number = scanner.nextInt(); 
                break; 
            } catch (Exception e) {
                System.out.println("Invalid input! Try again.");
                scanner.nextLine(); }}
        System.out.println("You entered: " + number);
        scanner.close(); }}
