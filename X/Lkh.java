package X;

/* loaded from: Lkh.class */
public final class Lkh implements Runnable {
    public static final String __redex_internal_original_name = "FileDartsLogger$1";
    public final /* synthetic */ Ks4 A00;

    public Lkh(Ks4 ks4) {
        this.A00 = ks4;
    }

    @Override // java.lang.Runnable
    public void run() {
        Ks4 ks4 = this.A00;
        if (((1Od) 1Br.A0B(ks4.A00)).A0E()) {
            return;
        }
        0fH.A0j("FileDartsLogger", "[executor start] saveEventsToFile()");
        ks4.A01();
        0fH.A0j("FileDartsLogger", "[executor end] saveEventsToFile()");
    }
}
