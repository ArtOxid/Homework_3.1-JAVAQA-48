public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int minimumMiles = 20;
        int miles = service.calculate(price, minimumMiles);
        System.out.println(miles);
    }
}