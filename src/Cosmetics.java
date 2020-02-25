abstract class Cosmetics {
    private String name;
    private double price;
    private int volume;

    public Cosmetics(String name, double price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

}
