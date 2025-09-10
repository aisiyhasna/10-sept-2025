public class Instruments {
    
    private String name;
    private Double price;

    //Default Constructor
    public Instruments() {
        name = "gitar";
        price = 900.000;
    }

    //Constructor parameter
    public Instruments(String n, Double p) {
        name = n;
        price  = p;
    
    }

    //Getter
    public String getName() {
        return name;
    }   
    public Double getPrice() {
        return price;
    }

    //setter
    public void setName(String n) {
        name = n;
    }
    public void setPrice(Double p) {
        price = p;
    }    
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Price: " + price);
    }
    
        
    }

