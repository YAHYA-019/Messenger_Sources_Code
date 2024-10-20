package X;

/* loaded from: Lp5.class */
public final class Lp5 implements Runnable {
    public static final String __redex_internal_original_name = "CallbackWithHandler$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Kds A01;
    public final /* synthetic */ Kp8 A02;

    public Lp5(Kds kds, Kp8 kp8, int i) {
        this.A02 = kp8;
        this.A01 = kds;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Kds kds = this.A01;
        int i = this.A00;
        0Qs r0 = kds.A00;
        if (r0 != null) {
            r0.A01(i);
        }
    }
}
