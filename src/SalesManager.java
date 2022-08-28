public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long stat() {
        long minIndex = 0;
        long maxIndex = 0;
        long meridian = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxIndex) {
                maxIndex = i;
            }
            if (sales[i] <= minIndex) {
                minIndex = sales[i];
            }
        }
        for (int i = 0; i < sales.length; i++) {
            if (i == maxIndex || i == minIndex) {
                continue;
            }
            meridian += sales[i];
        }
        return meridian / (sales.length - 2);
    }
}
