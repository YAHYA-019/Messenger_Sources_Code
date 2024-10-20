package X;

import android.webkit.WebResourceResponse;

/* loaded from: Lqp.class */
public final class Lqp implements Runnable {
    public static final String __redex_internal_original_name = "BrowserLiteWebViewClient$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ WebResourceResponse A01;
    public final /* synthetic */ C3251Jnn A02;
    public final /* synthetic */ AbstractC3252Jnp A03;
    public final /* synthetic */ String A04;

    public Lqp(WebResourceResponse webResourceResponse, C3251Jnn c3251Jnn, AbstractC3252Jnp abstractC3252Jnp, String str, long j) {
        this.A02 = c3251Jnn;
        this.A03 = abstractC3252Jnp;
        this.A04 = str;
        this.A01 = webResourceResponse;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC3252Jnp abstractC3252Jnp = this.A03;
        String str = this.A04;
        boolean A1T = AnonymousClass001.A1T(this.A01);
        long j = this.A00;
        if (abstractC3252Jnp.A0K()) {
            return;
        }
        boolean z = true;
        LCd.A03("BrowserLiteWebView", "FB tracking %s requested", new Object[]{str});
        switch (str.hashCode()) {
            case 3710:
                if (str.equals("tr")) {
                    z = false;
                    break;
                } else {
                    return;
                }
            case 98107086:
                if (!str.equals("ga_js")) {
                    return;
                }
                break;
            case 1017223877:
                if (str.equals("ga_collect")) {
                    z = 2;
                    break;
                } else {
                    return;
                }
            case 1457680597:
                if (str.equals("fbevents")) {
                    z = 3;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        long j2 = -1;
        switch (z) {
            case false:
                if (abstractC3252Jnp.A09 == j2) {
                    abstractC3252Jnp.A09 = j;
                    abstractC3252Jnp.A0d = A1T;
                    return;
                }
                return;
            case true:
                if (abstractC3252Jnp.A03 == j2) {
                    abstractC3252Jnp.A03 = j;
                    abstractC3252Jnp.A0T = A1T;
                    return;
                }
                return;
            case true:
                if (abstractC3252Jnp.A02 == j2) {
                    abstractC3252Jnp.A02 = j;
                    abstractC3252Jnp.A0S = A1T;
                    return;
                }
                return;
            default:
                if (abstractC3252Jnp.A00 == j2) {
                    abstractC3252Jnp.A00 = j;
                    abstractC3252Jnp.A0c = A1T;
                    return;
                }
                return;
        }
    }
}
