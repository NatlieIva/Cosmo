public class MoistureCream extends Cream {
    public MoistureCream(String name, double price, int volume, String age) {
        super(name, price, volume, age);
    }

    @Override
    public String toString() {
        return "- MOISTURE CREAM <" + getName() + ">, " + getAge() + ", " + getPrice() + " RUB, " + getVolume() + " ml.";
    }

    public void moist(){
        System.out.println("Skin moisturizing");
    }
}
