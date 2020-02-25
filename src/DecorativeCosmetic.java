abstract class DecorativeCosmetic extends Cosmetics{
    private String color;

    public DecorativeCosmetic(String name, double price, int volume, String color) {
        super(name, price, volume);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
