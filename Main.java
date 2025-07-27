public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer(101, "Alice", "Developer", 50000);
        dev.setPerformance("Good");
        dev.setRemarks(dev.reviewPerformance());
        dev.setBonus(dev.calculateBonus());

        System.out.println(dev); // Calls toString()
    }
}
