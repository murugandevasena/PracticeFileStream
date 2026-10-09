import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory(ArrayList products) {
        this.products = new ArrayList<Product>();
    }

    public ArrayList getProducts() {
        return products;
    }

    public void addProducts(Product product){
        products.add(product);
    }

    public void removeProducts(Product product){
        products.remove(product);
    }

    //check The low inventory

    public void checkLowInventory(){
        for(Product product:products){
            if(product.getQuantity()<100){
                System.out.println("product count in stock "+product.getQuantity()+"."+"Place order ASAP");
            }
        }
    }
}
