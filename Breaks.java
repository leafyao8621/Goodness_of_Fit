import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class Breaks {
    private ArrayList<Double> breaks = new ArrayList<>();
    public Breaks(Scanner s) {

        while (s.hasNextDouble()) {
            breaks.add(s.nextDouble());
        }
    }
    public ArrayList<Double> getBreaks() {
        return breaks;
    }
}
