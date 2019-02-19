import java.util.Vector;

public class Brain {
    Mall mall;
    Customer c1, c2, c3;
    ShoeStore s1;
    GameStore s2;
    BookStore s3;
    Item i1, i2, i3, i4, i5, i6;

    Brain(){
        this.mall = new Mall();
        this.c1 = new Customer();
        c1.setName("Almas");
        this.c2 = new Customer();
        c2.setName("Rauza");
        this.c3 = new Customer();
        c3.setName("Beksultan");

        // Shoes
        this.i1 = new Item("Oxfords",1,100.0);
        this.i2 = new Item("Loafers",1,200.0);
        this.s1 = new ShoeStore("Shoe Store");


        //Game
        this.i3 = new Item("CS:GO",2,100.0);
        this.i4 = new Item("FIFA",2,200.0);
        this.s2 = new GameStore("Game Store");

        //Book
        this.i5 = new Item("Game Of Thrones",3,100.0);
        this.i6 = new Item("Harry Potter",3,200.0);
        this.s3 = new BookStore("Book Store");

    }


    public void work(){
        // actions in the ShoeStore
        Vector<Item> goodsOfShoesStore = new Vector<>();
        goodsOfShoesStore.add(i1);
        goodsOfShoesStore.add(i2);
        s1.setItems(goodsOfShoesStore);
        Vector<Item> itemsFromShoeStore = s1.getItems();
        s1.addObserver();
        if(s1.getHasObserver()){
            System.out.println(s1.getName() + " has observer");
        }
        else{
            System.out.println(s1.getName() + " has not observer at now");
        }
        s1.enter(c1);
        System.out.println(s1.getName() + " now is visited by:\n" + s1.getCustomers());
        c1.getShoppingCart().addItem(itemsFromShoeStore.get(1));
        c1.getShoppingCart().addItem(itemsFromShoeStore.get(0));
        System.out.print(c1.toString() + c1.getShoppingCart());

        // actions in the GameStore
        Vector<Item> goodsOfGameStore = new Vector<>();
        goodsOfGameStore.add(i3);
        goodsOfGameStore.add(i4);
        s2.setItems(goodsOfGameStore);
        Vector<Item> itemsFromGameStore = s2.getItems();
        s2.addObserver();
        if(s2.getHasObserver()){
            System.out.println(s2.getName() + " has observer");
        }
        else{
            System.out.println(s2.getName() + " has not observer at now");
        }
        s2.enter(c2);
        s2.enter(c3);
        System.out.println(s2.getName() + " now is visited by:\n" + s2.getCustomers());
        s2.exit(c3);
        System.out.println(s2.getName() + " now is visited by:\n" + s2.getCustomers());
        c2.getShoppingCart().addItem(itemsFromGameStore.get(1));
        c2.getShoppingCart().addItem(itemsFromGameStore.get(0));
        System.out.print(c2.toString() + c2.getShoppingCart());

        // actions in the BookStore
        Vector<Item> goodsOfBookStore = new Vector<>();
        goodsOfBookStore.add(i5);
        goodsOfBookStore.add(i6);
        s3.setItems(goodsOfBookStore);
        Vector<Item> itemsFromBookStore = s3.getItems();
        //s3.addObserver();
        if(s3.getHasObserver()){
            System.out.println(s3.getName() + " has observer");
        }
        else{
            System.out.println(s3.getName() + " has not observer at now");
        }
        s3.enter(c3);
        System.out.println(s3.getName() + " now is visited by:\n" + s3.getCustomers());
        c3.getShoppingCart().addItem(itemsFromBookStore.get(0));
        c3.getShoppingCart().addItem(itemsFromBookStore.get(1));
        System.out.print(c3.toString() + c3.getShoppingCart());
    }
}