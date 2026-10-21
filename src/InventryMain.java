import java.util.ArrayList;

public class InventryMain {
    static void main() {
        Product product= new Product("Surf Excel",100);
        Product product1= new Product("Hamam",50);
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(product);
        productArrayList.add(product1);
        Inventory inventory= new Inventory(productArrayList);
        inventory.addProducts(product);
        inventory.addProducts(product1);
        inventory.checkLowInventory();
    }
}
