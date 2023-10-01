
public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Конструктор", 70, 20);
        Toy toy2 = new Toy(2, "Робот", 50, 30);
        Toy toy3 = new Toy(3, "Кукла", 50, 50);
    
        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);

        store.setToyFrequencies(1, 30);
        store.buy();

        Toy purchaseToy = store.getPurchaseToy();
        if (purchaseToy != null){
            System.out.println("Купленная игрушка: " + purchaseToy.getName());
        }
}
}
