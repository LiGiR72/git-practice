public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
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
