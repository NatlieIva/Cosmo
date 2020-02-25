public class NutritiousCream extends Cream {
    public NutritiousCream(String name, double price, int volume, String age) {
        super(name, price, volume, age);
    }

    @Override
    public String toString() {
        return "- NUTRITION CREAM <" + getName() + ">, " + getAge() + ", " + getPrice() + " RUB, " + getVolume() + " ml.";
    }

    public void nourish() {
        System.out.println("Skin nutrition");
    }
}
