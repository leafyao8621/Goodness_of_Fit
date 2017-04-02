import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
public class Bin {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File(args[0]));
        Breaks b = new Breaks(s);
        ArrayList<Double> breaks = b.getBreaks();
        s = new Scanner(new File(args[1]));
        int[] bins = new int[breaks.size() + 1];
        double cnt = 0;
        while (s.hasNextDouble()) {
            Double inp = s.nextDouble();
            int ind = 0;
            while(ind < breaks.size() && inp >= breaks.get(ind)) {
                ind++;
            }
            bins[ind]++;
            cnt++;
        }
        System.out.println(Arrays.toString(bins));
        double e = cnt / bins.length;
        double su = 0;
        for (Integer i: bins) {
            su += (i - e) * (i - e) / e;
        }
        System.out.println(e);
        System.out.println(su);
    }
}
