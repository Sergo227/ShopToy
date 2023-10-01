public class Toy{
    private int id;
    private String name;
    private double frequency;
    private int quantity;

    public Toy(int id, String name, double frequency, int quantity){
        this.id = id;
        this.name = name;
        this.frequency = frequency;
        this.quantity = quantity;
    }

    public int getId (){
        return id;
    }
    public void setId (int id){
        this.id=id;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getFrequency (){
        return   frequency;
    }
    public void setFrequency(double frequency){
        this.frequency=frequency;
    }
    public double getQuantity (){
        return   quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public void setQuantity(double d) {
    }
}