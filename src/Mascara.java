public class Mascara extends DecorativeCosmetic implements MakeUpper {
    private String resistant;

    public Mascara(String name, double price, int volume, String color, String resistant) {
        super(name, price, volume, color);
        this.resistant = resistant;
    }

    public String getResistant() {
        return resistant;
    }

    @Override
    public String toString() {
        return "- MASCARA <" + getName() + ">, " + getColor() + ", " + resistant + ", " + getPrice() + " RUB, " + getVolume() + " ml.";
    }

    @Override
    public void makeUp() {
        System.out.println("Make up eyelashes!");
    }
}
