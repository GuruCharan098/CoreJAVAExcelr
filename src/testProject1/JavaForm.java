package testProject1;

import java.util.*;

record User(String name, int age, String email) {}

public class JavaForm {
	
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            List<User> users = new ArrayList<>();
            System.out.println("User Form...!");

            while (true) {

                System.out.print("\nEnter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age;

                try {
                    age = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Age! Please enter a number.");
                    continue;
                }

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                users.add(new User(name, age, email));

                System.out.print("Add Another User? (yes/no): ");
                String choice = sc.nextLine();

                if (!choice.equalsIgnoreCase("yes")) {
                    break;
                }
            }

            System.out.println("\nAll Users...!");

            users.forEach(user ->
                System.out.printf("Name: %s | Age: %d | Email: %s%n",
                        user.name(), user.age(), user.email())
            );
        }
    }
}