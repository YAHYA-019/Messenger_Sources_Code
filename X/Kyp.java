package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.browser.lite.webview.SystemWebView;

/* loaded from: Kyp.class */
public abstract class Kyp {
    public static Handler A00;
    public static LVT A01;
    public static Kkt A02;
    public static KeI A03;
    public static final LAK A04 = new LAK();

    public static void A00() {
        LVT lvt;
        Looper mainLooper;
        Kkt kkt = A02;
        if (kkt != null) {
            AbstractC3252Jnp abstractC3252Jnp = kkt.A02;
            Context A002 = SystemWebView.A00(abstractC3252Jnp);
            if (A002 == null || (mainLooper = A002.getMainLooper()) == null) {
                abstractC3252Jnp.A0B();
            } else {
                new Handler(mainLooper).post(new LkS(abstractC3252Jnp));
            }
        }
        A02 = null;
        KeI keI = A03;
        if (keI == null || (lvt = A01) == null) {
            return;
        }
        ((2Cy) 1Br.A0B(keI.A00)).D61(lvt);
    }
}
