package request;

public class Request {
    public static int quantity;

    private int price;
    private String name;

    public Request(int p, String n){
        this.price = p;
        this.name = n;
    }

    public static int getQuantity(){
        return quantity;
    }

    protected int getPrice(){
        return price;
    }

    protected String getName(){
        return name;
    }

}
