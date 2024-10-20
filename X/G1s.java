package X;

import com.facebook.browser.lite.webview.SystemWebView;

/* loaded from: G1s.class */
public final class G1s implements Runnable {
    public static final String __redex_internal_original_name = "BaseOffsiteFbPaySDKInjector$loadUrl$1$1";
    public final /* synthetic */ AbstractC3252Jnp A00;
    public final /* synthetic */ String A01;

    public G1s(AbstractC3252Jnp abstractC3252Jnp, String str) {
        this.A00 = abstractC3252Jnp;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3252Jnp abstractC3252Jnp = this.A00;
        ((SystemWebView) abstractC3252Jnp).A03.loadUrl(this.A01);
    }
}
