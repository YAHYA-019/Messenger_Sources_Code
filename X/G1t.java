package X;

import com.facebook.browser.lite.webview.SystemWebView;

/* loaded from: G1t.class */
public final class G1t implements Runnable {
    public static final String __redex_internal_original_name = "BaseShopifyCheckoutSDKIAWController$metaCheckoutRequestCallback$1$1$1";
    public final /* synthetic */ DaW A00;
    public final /* synthetic */ String A01;

    public G1t(DaW daW, String str) {
        this.A00 = daW;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3252Jnp abstractC3252Jnp = this.A00.A00;
        if (abstractC3252Jnp != null) {
            ((SystemWebView) abstractC3252Jnp).A03.loadUrl(this.A01);
        }
    }
}
