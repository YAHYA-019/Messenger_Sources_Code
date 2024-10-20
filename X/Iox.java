package X;

/* loaded from: Iox.class */
public final class Iox implements Runnable {
    public static final String __redex_internal_original_name = "SingleDebouncer$runnable$1";
    public final /* synthetic */ HpH A00;

    public Iox(HpH hpH) {
        this.A00 = hpH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HpH hpH = this.A00;
        hpH.A01.invoke(hpH.A00.get());
    }
}
