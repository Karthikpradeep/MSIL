package p3;
import java.util.HashMap;
import java.util.Map;
class Restaurant {
    private final HashMap<String, Double> menu;
    private final HashMap<String, Integer> ratings;
    public Restaurant() {
        menu = new HashMap<>();
        ratings = new HashMap<>();
    }
    public void addItem(String itemName, double price) {
        menu.put(itemName, price);
    }
    public void removeItem(String itemName) {
        menu.remove(itemName);
    }
    public void addRating(String ratingText, int rating) {
        ratings.put(ratingText, rating);
    }
    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int totalRating = 0;
        for (int rating : ratings.values()) {
            totalRating += rating;
        }
        return (double) totalRating / ratings.size();
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - rs " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();

        myRestaurant.addItem("Burger", 199);
        myRestaurant.addItem("Pizza", 299);
        myRestaurant.addItem("Biryani", 130);
        myRestaurant.addRating("Good food", 4);
        myRestaurant.addRating("Excellent service", 5);

        myRestaurant.displayMenu();
        myRestaurant.removeItem("Burger");
        myRestaurant.displayMenu();
        System.out.println("Average Rating: " + myRestaurant.calculateAverageRating());
    }
}

