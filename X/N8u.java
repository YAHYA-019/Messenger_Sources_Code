package X;

/* loaded from: N8u.class */
public final class N8u implements Runnable {
    public static final String __redex_internal_original_name = "PapayaJobService$2$4";
    public final /* synthetic */ N8G A00;
    public final /* synthetic */ String A01;

    public N8u(N8G n8g, String str) {
        this.A00 = n8g;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A00.onLog(this.A01);
    }
}
