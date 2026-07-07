package Mainmethod;
import java.util.Scanner;

import fooddeliverysystem.Customer;
import fooddeliverysystem.Deliveryperson;
import fooddeliverysystem.Restaurant;
import services.Customerservice;
import services.foodservice;
import services.Orderservices;

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Customerservice customerService = new Customerservice();
        foodservice foodService = new foodservice();
        Orderservices orderService = new Orderservices();

        int choice;

        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // ================= ADMIN MENU =================
                case 1:
                    int adminChoice;
                    do {
                        System.out.println("\n--- ADMIN MENU ---");
                        System.out.println("1. Add Restaurant");
                        System.out.println("2. View Restaurants");
                        System.out.println("3. Add Delivery Person");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        adminChoice = sc.nextInt();

                        switch (adminChoice) {

                            case 1:
                                System.out.print("Enter Restaurant ID: ");
                                int rId = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter Restaurant Name: ");
                                String rName = sc.nextLine();

                                Restaurant r = new Restaurant(rId, rName);
                                foodService.addRestaurant(r);

                                System.out.println("Restaurant Added!");
                                break;

                            case 2:
                                System.out.println(foodService.getRestaurants());
                                break;

                            case 3:
                                System.out.print("Enter DeliveryPerson ID: ");
                                int dId = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter Name: ");
                                String dName = sc.nextLine();
                                System.out.print("Enter Contact No: ");
                                long contact = sc.nextLong();

                                Deliveryperson dp = new Deliveryperson(dId, dName, contact);
                                orderService.addDeliveryPerson(dp);

                                System.out.println("Delivery Person Added!");
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                    } while (adminChoice != 0);
                    break;

                // ================= CUSTOMER MENU =================
                case 2:
                    int customerChoice;
                    do {
                        System.out.println("\n--- CUSTOMER MENU ---");
                        System.out.println("1. Add Customer");
                        System.out.println("2. View Customers");
                        System.out.println("3. View Food Items");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        customerChoice = sc.nextInt();

                        switch (customerChoice) {

                            case 1:
                                System.out.print("Enter Customer ID: ");
                                int cId = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter Name: ");
                                String cName = sc.nextLine();
                                System.out.print("Enter Contact No: ");
                                long cContact = sc.nextLong();

                                Customer c = new Customer(cId, cName, cContact);
                                customerService.addCustomer(c);

                                System.out.println("Customer Added!");
                                break;

                            case 2:
                                System.out.println(customerService.getCustomers());
                                break;

                            case 3:
                                System.out.println(foodService.getAllFoodItems());
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                    } while (customerChoice != 0);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}



