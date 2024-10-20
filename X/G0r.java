package X;

/* loaded from: G0r.class */
public final class G0r implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverWebView$2$1";
    public final /* synthetic */ E8P A00;

    public G0r(E8P e8p) {
        this.A00 = e8p;
    }

    @Override // java.lang.Runnable
    public void run() {
        E9a e9a = this.A00.A01;
        if (e9a.A00 > 0) {
            ((FIT) 4YU.A0p(e9a.A0C)).A0F("web_client_retry_attempts", String.valueOf(e9a.A00));
        }
    }
}
