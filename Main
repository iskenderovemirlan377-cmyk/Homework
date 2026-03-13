import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Store store = new Store();

        while (true) {

            System.out.println("\n==== STORE MENU ====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Sell Product");
            System.out.println("4. Show Revenue");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    Product p = new Product(id, name, price, quantity);

                    store.addProduct(p);

                    break;

                case 2:
                    store.showAllProducts();
                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    int pid = scanner.nextInt();

                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();

                    store.sellProduct(pid, qty);

                    break;

                case 4:
                    store.showRevenue();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    return;
            }
        }
    }
}
