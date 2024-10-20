package X;

import com.facebook.browser.lite.webview.SystemWebView;

/* loaded from: Lmz.class */
public final class Lmz implements Runnable {
    public static final String __redex_internal_original_name = "BrowserAutoRetryController$1";
    public final /* synthetic */ KSp A00;
    public final /* synthetic */ AbstractC3252Jnp A01;

    public Lmz(KSp kSp, AbstractC3252Jnp abstractC3252Jnp) {
        this.A00 = kSp;
        this.A01 = abstractC3252Jnp;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((SystemWebView) this.A01).A03.reload();
        KSp kSp = this.A00;
        int i = kSp.A01;
        int i2 = 2000;
        if (i == 0) {
            i2 = 4000;
        }
        kSp.A00 += i2;
        kSp.A01 = i + 1;
    }
}
