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
    public int stat(){
        int  min = 0;
        int max = 0;
        int meridian = 0;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
            if (sale < min) {
                min = sale;
            }
        }
        for (int sale: sales) {
            if (sale == min) {
                continue;
            }
            if(sale == max) {
                continue;
            }
            meridian += sale;
        }
        return meridian/(sales.length - 2);
    }
}
