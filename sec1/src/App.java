import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> mylist = new ArrayList<>();

        mylist.add("ANT");

        String fmt = "%s is in list: %s";
        String w1 = "ANT";
        String w2 = "BAT";
        boolean in1 = mylist.contains("ANT");
        boolean in2 = mylist.contains("BAT");

        System.out.println(String.format(fmt, w1, in1));
        System.out.println(String.format(fmt, w2, in2));
    }
}
