package harshaExam;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String username;
    private String password;
    private String confirmPassword;
    private String dob;

    // Getters and setters for encapsulation
   

    // Constructor
    public Customer(String firstName, String lastName, String email, String phoneNumber, String username,
                    String password, String confirmPassword, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.dob = dob;
    }

    // Additional validation methods can be added
    

    // Display customer information
    public void displayCustomerInfo() {
        System.out.println("\nCustomer Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Username: " + username);
        // Note: For security reasons, we do not display the password in the console.
        System.out.println("Date of Birth: " + dob);
    }
}

public class RetailShopping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get customer details
            System.out.println("Welcome to the Retail Shopping Website!");
            System.out.println("Please provide your information to create an account.");

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            // Validate and handle Email input
            String email;
            do {
                System.out.print("Email ID: ");
                email = scanner.nextLine();
                if (!isValidEmail(email)) {
                    System.out.println("Error: Invalid email format. Please enter a valid email address.");
                }
            } while (!isValidEmail(email));

            // Validate and handle Phone Number input
            String phoneNumber;
            do {
                System.out.print("Phone Number: ");
                phoneNumber = scanner.nextLine();
                if (!isValidPhoneNumber(phoneNumber)) {
                    System.out.println("Error: Invalid phone number format. Please enter a valid numeric value.");
                }
            } while (!isValidPhoneNumber(phoneNumber));

            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            // Confirm Password
            String confirmPassword;
            do {
                System.out.print("Confirm Password: ");
                confirmPassword = scanner.nextLine();
                if (!confirmPassword.equals(password)) {
                    System.out.println("Error: Passwords do not match. Please try again.");
                }
            } while (!confirmPassword.equals(password));

            // Validate and handle Date of Birth input
            String dob;
            do {
                System.out.print("Date of Birth (YYYY-MM-DD): ");
                dob = scanner.nextLine();
                if (!isValidDate(dob)) {
                    System.out.println("Error: Invalid date format. Please enter the date in the format YYYY-MM-DD.");
                }
            } while (!isValidDate(dob));

            // Create a Customer object with the provided information
            Customer customer = new Customer(firstName, lastName, email, phoneNumber, username, password, confirmPassword, dob);

            // Display customer information
            customer.displayCustomerInfo();

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter the correct data type.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong. Please try again.");
        } finally {
            scanner.close();
        }
    }

    private static boolean isValidEmail(String email) {
        // Add your email validation logic here
        // Example: Simple email validation using regular expression
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        // Add your phone number validation logic here
        // Example: Simple phone number validation using regular expression
        String phoneRegex = "\\d{10}";
        return phoneNumber.matches(phoneRegex);
    }

    private static boolean isValidDate(String date) {
        // Add your date validation logic here
        // Example: Simple date validation using SimpleDateFormat
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            sdf.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}



	


