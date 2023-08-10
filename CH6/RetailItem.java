package CH6;

public class RetailItem {
    String description;
    int unitsOnHand;
    double price;

    RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public void setUnitsOnHand(int unitsOnHand){
        this.unitsOnHand = unitsOnHand;
    }
    public void setPrice(double price){
        this.price= price;
    }
    public String getDescription(){
        return description;
    }
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
    public double getPrice(){
        return price;
    }

    public void display(){
        System.out.print(getDescription() + " ");
        System.out.print(getUnitsOnHand() + " ");
        System.out.println(getPrice() + " ");
    }
    public static void main(String[] args){
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        item1.display();
        item2.display();
        item3.display();

    }
}
