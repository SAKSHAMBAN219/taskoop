public class Product {
    private String productName;
    private int productId;
    private double price;
    private int stock;
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public int getProductId() {
        return productId;
    }
    public double getPrice() {
        return price;
    }
    public void purchase(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
        }
    }
    public void restock(int quantity) {
        stock += quantity;
    }
    public int getStock() {
        return stock;
    }
}
