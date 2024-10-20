package X;

import com.facebook.browser.lite.webview.SystemWebView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: Ez2.class */
public class Ez2 {
    public WeakReference A00;
    public final EcE A02;
    public java.util.Map A01 = 1BK.A1C();
    public final MII A03 = new FbC();
    public final MII A04 = new LUd(this, 0);

    public Ez2(EcE ecE) {
        this.A02 = ecE;
    }

    public void A00(AbstractC3252Jnp abstractC3252Jnp) {
        this.A00 = 7zL.A14(abstractC3252Jnp);
        ((SystemWebView) abstractC3252Jnp).A03.addJavascriptInterface(this, "fbpayIAWBridge");
    }

    public void A01(AbstractC3252Jnp abstractC3252Jnp, String str) {
        abstractC3252Jnp.A0G(this.A03, 1BK.A15(Locale.ROOT, "fbpay.sendMessage(\"%s\")", Arrays.copyOf(new Object[]{str}, 1)), false);
    }

    public final void sendMessage(String str) {
        11T.A0F(str, 0);
        new GAf(this.A02.A00, str, null, 0).invoke(str);
    }
}
