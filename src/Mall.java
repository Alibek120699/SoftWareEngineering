import java.util.Vector;
import java.util.Enumeration;

public class Mall {
    private String name;
    private Vector<Store> stores;
    private Vector<Customer> customers;

    public Mall(){
        this.name = "Undefined";
        this.stores = new Vector<Store>();
        this.customers = new Vector<Customer>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setStores(Vector<Store>stores){
        this.stores = stores;
    }

    public void getStores(){
        for(int i= 0;i<stores.size();i++)
        {
            System.out.println(stores.get(i));
        }
    }

    public void setCustomers(Vector<Customer> customers){
        this.customers = customers;
    }

    public void  getCustomers(){
        for(int i =0 ;i<customers.size();i++)
        {
            System.out.println(customers.get(i));
        }
    }

    public void enter(Customer c){
        customers.add(c);
    }

    public void exit(Customer c){
        customers.remove(c);
    }
    public void addStore(Store s)
    {
        stores.add(s);
    }
    public  void getShoppingCart(Customer cs)
    {
        System.out.println(cs.getShoppingCart());
    }

}
