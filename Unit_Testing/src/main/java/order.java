public class order {

    private int quantity;
    private String itemName;
    private double price;
    private double priceWithTex;

    public order() {}

    public order(int quantity, String itemName, double price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public order setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public order setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public order setPrice(double price) {
        this.price = price;
        return this;
    }

    public double getPriceWithTex() {
        return priceWithTex;
    }

    public order setPriceWithTex(double priceWithTex) {
        this.priceWithTex = priceWithTex;
        return this;
    }
}
