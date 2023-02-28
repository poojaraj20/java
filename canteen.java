import java.io.*;
import java.util.ArrayList;

class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private double price;
    private int quantity;
    
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Canteen implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Item> items;
    
    public Canteen() {
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }
}

public class CanteenManagement {
    private static final String fileName = "canteen.ser";
    
    public static void main(String[] args) {
        Canteen canteen = new Canteen();
        canteen.addItem(new Item("Coffee", 2.50, 10));
        canteen.addItem(new Item("Tea", 2.00, 20));
        canteen.addItem(new Item("Sandwich", 5.00, 15));
        
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(canteen);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + fileName);
        } catch (IOException i) {
            i.printStackTrace();
        }
        
        Canteen deserializedCanteen = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedCanteen = (Canteen) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Canteen class not found");
            c.printStackTrace();
            return;
        }
        
        System.out.println("Deserialized Canteen:");
        for (Item item : deserializedCanteen.getItems()) {
            System.out.println("Name: " + item.getName());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("Quantity: " + item.getQuantity());
        }
    }
}