package X;

/* loaded from: It9.class */
public final class It9 implements Runnable {
    public static final String __redex_internal_original_name = "SoundPoolPlayer$start$1";
    public final /* synthetic */ IfB A00;

    public It9(IfB ifB) {
        this.A00 = ifB;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IfB ifB = this.A00;
        ifB.A01 = -1;
        C00m c00m = ifB.A03;
        if (c00m != null) {
            c00m.invoke();
        }
    }
}
