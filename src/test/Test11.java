// both 0 as arg
// NO_DIV_ZERO
// NO_OUT_OF_BOUNDS
// Timon Blattner timonbl@ethz.ch

public class Test11 {
    public static void foo() {
        PrinterArray pa = new PrinterArray(0);
        pa.sendJob(0);
    }
}
