public class Main {
    public static void main(String[] args) {
        int[] sales = {25, 30, 12};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
