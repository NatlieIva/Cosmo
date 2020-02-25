public class Cleanser extends CareCosmetic {
    public Cleanser(String name, double price, int volume) {
        super(name, price, volume);
    }
    public void cleansing(){
        System.out.println("Clear skin");
    }

    @Override
    public String toString() {
        return "- CLEANSER <" + getName() + ">, " + getPrice() + " RUB, " + getVolume() + " ml.";
    }
}
