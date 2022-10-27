public class BonusMilesService {
    public int calculate(int price, int minimumMiles) {
        int miles = price / minimumMiles;
        return miles;
    }
}
