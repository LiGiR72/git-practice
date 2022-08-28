public class Main {
    public static void main(String[] args) {
       long[] sales = {10, 10, 10, 10, 10};
       SalesManager salesManager = new SalesManager(sales);
       System.out.println(salesManager.max());
       System.out.println(salesManager.stat());
    }
}