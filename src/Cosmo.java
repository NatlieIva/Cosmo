import java.util.ArrayList;

public class Cosmo {
    public static void printList(ArrayList<Cosmetics> cosmetics) {
        for (Cosmetics cosmo : cosmetics) {
            System.out.println(cosmo);
        }
    }

    public static void main(String[] args) {
        ArrayList<Cosmetics> cosmeticBag = new ArrayList<>();
        Mascara mascara = new Mascara("Sabo", 250.5, 5, "black", "waterproof");
        Pomade pomade = new Pomade("Mac", 1500, 10, "Pink", "matt");
        cosmeticBag.add(mascara);
        cosmeticBag.add(pomade);
        ArrayList<Cosmetics> careCosmeticBag = new ArrayList<>();
        Cleanser cl = new Cleanser("Yves Rocher Hydro Vegetal", 450, 50);
        careCosmeticBag.add(cl);
        MoistureCream dailyCream = new MoistureCream("La Rosche Hydraphase", 1500, 15, "25+");
        careCosmeticBag.add(dailyCream);
        NutritiousCream nightCream = new NutritiousCream("La Roche Nutritic", 2000, 15, "for all age");
        careCosmeticBag.add(nightCream);

        System.out.println("In cosmetic bag: ");
        printList(cosmeticBag);
        System.out.println("\n In care cosmetic bag: ");
        printList(careCosmeticBag);

        System.out.println("\nIf you want make up, do it: ");
        System.out.print("1. ");
        cl.cleansing();
        System.out.print("2. ");
        dailyCream.moist();
        System.out.print("3. ");
        mascara.makeUp();
        System.out.print("4. ");
        pomade.makeUp();

        System.out.println("\nDo you want to sleep? Do it: ");
        System.out.print("1. ");
        cl.cleansing();
        System.out.print("2. ");
        nightCream.nourish();

    }
}