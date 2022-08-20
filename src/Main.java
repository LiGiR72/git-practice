public class Main {
    public static void main(String[] args) {
       int[] sales = {5, 10 , 8, 2};
       SalesManager salesManager = new SalesManager(sales);
       System.out.println(salesManager.max());
    }
}