public class Item {
    private String name;
    private Integer id;
    private Integer storeId;
    private Double price;
    private static Integer indexOfId = 0;

    {
        indexOfId++;
    }

    Item(String name, Integer storeId, Double price){
        this.name = name;
        this.id = indexOfId;
        this.storeId = storeId;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getStoreId(){
        return storeId;
    }

    public void setStoreId(Integer storeId){
        this.storeId = storeId;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String toString(){
        return name;
    }
}
