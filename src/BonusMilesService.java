public class BonusMilesService {
    public int calculate(int price) {
        price = 10_000;
        int minimumMiles = 20;
        int miles = price / minimumMiles;
        return miles;
    }
}
