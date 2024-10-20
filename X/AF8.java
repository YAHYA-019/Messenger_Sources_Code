package X;

/* loaded from: AF8.class */
public final class AF8 implements Runnable {
    public static final String __redex_internal_original_name = "OrcaRsysSdk$handleCallIntent$onCallStart$1$1";
    public final /* synthetic */ Ia0 A00;
    public final /* synthetic */ Ia3 A01;

    public AF8(Ia0 ia0, Ia3 ia3) {
        this.A00 = ia0;
        this.A01 = ia3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HrI hrI = this.A00.A00;
        if (hrI != null) {
            Ia3 ia3 = this.A01;
            11T.A0D(ia3);
            hrI.A00(ia3);
        }
    }
}
