import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class ToyStore {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> purchaseToys;
    private String purchaseFile;
    
    public ToyStore() { 
        toys = new ArrayList<Toy>();
        purchaseToys = new ArrayList<Toy>();
        purchaseFile = "purchase_file.txt";
    }   
  
    public void addToy(Toy toy){      
        toys.add(toy);
        }
        
    
    public void setToyFrequencies(int id, double frequencies) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setFrequency(frequencies);
                // break;
                }
            }
        }
    
    public void buy() {
        purchaseToys.clear();
        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getFrequency()){
                purchaseToys.add(toy);
            }
        }
    }
    public Toy getPurchaseToy() {
        if (!purchaseToys.isEmpty()) {
            Toy purchaseToy = purchaseToys.remove(0);
            purchaseToy.setQuantity(purchaseToy.getQuantity() - 1);
            
            try {
                FileWriter writer = new FileWriter(purchaseFile, true);
                writer.write(purchaseToy.getName() + "\n");
                writer.close();
        }
            catch (IOException e){
                e.printStackTrace();
            }
        return purchaseToy;}
        else {
            System.out.println("Игрушки закончились");
            return null;
        }
    }
}
