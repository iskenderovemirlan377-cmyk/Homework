import java.util.ArrayList;

public class Store {

    private ArrayList<Product> products = new ArrayList<>();
    private double totalRevenue = 0;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showAllProducts() {
        for (Product p : products) {
            p.displayProduct();
        }
    }

    public void sellProduct(int id, int quantity) {

        for (Product p : products) {

            if (p.getId() == id) {

                if (p.getQuantity() >= quantity) {

                    p.decreaseQuantity(quantity);

                    totalRevenue += p.getPrice() * quantity;

                    System.out.println("Product sold successfully!");

                } else {

                    System.out.println("Not enough stock!");
                }

                return;
            }
        }

        System.out.println("Product not found.");
    }

    public void showRevenue() {
        System.out.println("Total Revenue: $" + totalRevenue);
    }
}
