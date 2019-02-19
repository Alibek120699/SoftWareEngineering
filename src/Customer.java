public class Customer {
    private ShoppingCart shoppingCart;
    private String name;
    private Store store;

    public Customer(){
        this.name = "undefined";
        this.shoppingCart = new ShoppingCart();
        this.store = null;
    }

    Customer(String name, Store store){
        this.shoppingCart = new ShoppingCart();
        this.name = name;
        this.store = store;
    }

    public void setShoppingCart(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public ShoppingCart getShoppingCart(){
        return shoppingCart;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setStore(Store store){
        this.store = store;
    }

    public Store getStore(){
        return store;
    }

    public String toString(){
        return "Customer " + name;
    }
}

