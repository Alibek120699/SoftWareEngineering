import java.util.TreeSet;
import java.util.Vector;
import java.util.Enumeration;

public abstract class Store {

    private Integer storeId;
    private String name;
    private Vector<Item> items;
    private Vector<Customer> customers;
    private Boolean hasObserver;
    private static Integer indexOfId = 1;

    {
        indexOfId++;
        System.out.println(indexOfId);
    }

    public Store(String name){
        this.storeId = indexOfId;
        this.name = name;
        this.items = new Vector<Item>();
        this.customers = new Vector<Customer>();
        this.hasObserver = false;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setItems(Vector<Item> items){
        this.items = items;
    }

    public Vector<Item> getItems() {
        return items;
    }

    public void setCustomers(Vector<Customer> customers){
        this.customers = customers;
    }

    public Vector<Customer> getCustomers() {
        return customers;
    }

    public void enter(Customer c){
        customers.add(c);
    }

    public void exit(Customer c){
        System.out.println(c.getName() + " has leaved store " + this.name);
        customers.remove(c);
    }

    public Enumeration<Customer> customers(){
        Enumeration e = customers.elements();
        return e;
    }

    public void addObserver(){
        hasObserver = true;
    }

    public Boolean getHasObserver(){
        return hasObserver;
    }
}
