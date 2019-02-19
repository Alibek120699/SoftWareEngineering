import java.util.Vector;
import java.util.Enumeration;

public class ShoppingCart {
    private Vector<Item> items;
    ShoppingCart(){
        this.items = new Vector<Item>();
    }

    ShoppingCart(Vector<Item> items){
        this.items = items;
    }

    public void setItems(Vector<Item> items){
        this.items = items;
    }

    public Vector<Item> getItems(){
         return items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public String toString(){
        String res = " now is going to buy:\n";
        for(int i=0; i<items.size(); i++){
            res += items.get(i);
            res += "\n";
        }
        return res;
    }


}
