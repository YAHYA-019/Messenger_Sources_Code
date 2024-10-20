package X;

/* loaded from: J1o.class */
public final class J1o implements Runnable {
    public static final String __redex_internal_original_name = "FacecastDebugOverlayViewController$updateOverlay$1";
    public final /* synthetic */ I2d A00;
    public final /* synthetic */ CharSequence A01;
    public final /* synthetic */ CharSequence A02;
    public final /* synthetic */ String A03;

    public J1o(I2d i2d, CharSequence charSequence, CharSequence charSequence2, String str) {
        this.A00 = i2d;
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00(this.A02, this.A01, this.A03);
    }
}
