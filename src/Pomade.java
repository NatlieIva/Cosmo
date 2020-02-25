public class Pomade extends DecorativeCosmetic implements MakeUpper {
    private String matt;

    public Pomade(String name, double price, int volume, String color, String matt) {
        super(name, price, volume, color);
        this.matt = matt;
    }

    public String getMatt() {
        return matt;
    }

    public void setMatt(String matt) {
        this.matt = matt;
    }

    @Override
    public String toString() {
        return "- POMADE <" + getName() + ">, " + matt + ", " + getPrice() + " RUB, " + getVolume() + " ml.";
    }

    @Override
    public void makeUp() {
        System.out.println("Make up lips ");
    }
}

