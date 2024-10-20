package X;

/* loaded from: J1i.class */
public final /* synthetic */ class J1i implements Runnable {
    public static final String __redex_internal_original_name = "SurfaceViewRenderer$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GU4 A02;

    public /* synthetic */ J1i(GU4 gu4, int i, int i2) {
        this.A02 = gu4;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GU4 gu4 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        gu4.A01 = i;
        gu4.A00 = i2;
        GU4.A00(gu4);
        gu4.requestLayout();
    }
}
