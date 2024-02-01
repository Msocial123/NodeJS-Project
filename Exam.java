package shanmuk_exam;
import java.util.*;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
String firstName, lastName, email, phone, username, password, confirmPassword, dob;
        
        try {
            // Collect First Name
            System.out.print("Enter First Name: ");
            firstName = sc.nextLine();
            if (firstName.isEmpty()) {
                throw new Exception("First Name cannot be empty!");
            }
            
            // Collect Last Name
            System.out.print("Enter Last Name: ");
            lastName = sc.nextLine();
            if (lastName.isEmpty()) {
                throw new Exception("Last Name cannot be empty!");
            }
     
            // Collect Email
            System.out.print("Enter Email: ");
            email = sc.nextLine();
            if (email.isEmpty()) {
                throw new Exception("Phone Number cannot be empty!");
            }
            
            // Collect Phone Number
            System.out.print("Enter Phone Number: ");
            phone = sc.nextLine();
            if (phone.isEmpty()) {
                throw new Exception("Phone Number cannot be empty!");
            }
            
            // Collect UserName
            System.out.print("Enter Username: ");
            username = sc.nextLine();
            if (username.isEmpty()) {
                throw new Exception("Username cannot be empty!");
            }
            
            // Collect Password
            System.out.print("Enter Password: ");
            password = sc.nextLine();
            if (password.isEmpty()) {
                throw new Exception("Password cannot be empty!");
            }
            
            // Collect Confirm Password
            System.out.print("Enter Confirm Password: ");
            confirmPassword = sc.nextLine();
            if (!password.equals(confirmPassword)) {
                throw new Exception("Passwords do not match!");
            }
            
            // Collect Date of Birth
            System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
            dob = sc.nextLine();
            if (dob.isEmpty()) {
                throw new Exception("Date of Birth cannot be empty!");
            }
            
            // Print Customer Information
            System.out.println("Customer Information:");
            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(email);
            System.out.println(phone);
            System.out.println(username);
            System.out.println(password);
            System.out.println(dob);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

            
            