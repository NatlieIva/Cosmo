public abstract class Cream extends CareCosmetic {
    private String age;
    public Cream(String name, double price, int volume, String age) {
        super(name, price, volume);
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}
