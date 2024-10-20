package X;

import android.webkit.WebView;

/* loaded from: G2v.class */
public final class G2v implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverWebView$QuicksilverWebViewClient$1";
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ E9f A01;

    public G2v(WebView webView, E9f e9f) {
        this.A01 = e9f;
        this.A00 = webView;
    }

    @Override // java.lang.Runnable
    public void run() {
        E9a e9a = this.A01.A00;
        e9a.A00++;
        WebView webView = this.A00;
        if (webView.isShown() && e9a.A01 == 0) {
            webView.reload();
        }
    }
}
