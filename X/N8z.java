package X;

/* loaded from: N8z.class */
public final class N8z implements Runnable {
    public static final String __redex_internal_original_name = "PapayaJobService$2$2";
    public final /* synthetic */ N8G A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public N8z(N8G n8g, String str, boolean z, boolean z2) {
        this.A00 = n8g;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A00.CNg(this.A01, this.A03, this.A02);
    }
}
