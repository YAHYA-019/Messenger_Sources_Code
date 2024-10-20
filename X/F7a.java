package X;

import com.facebook.secure.securewebview.SecureWebView;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: F7a.class */
public final class F7a {
    public SecureWebView A00;
    public ListenableFuture A01;

    public static final void A00(F7a f7a) {
        ListenableFuture listenableFuture = f7a.A01;
        if (listenableFuture != null && !listenableFuture.isDone() && !listenableFuture.isCancelled()) {
            listenableFuture.cancel(true);
        }
        f7a.A01 = null;
        SecureWebView secureWebView = f7a.A00;
        if (secureWebView != null) {
            secureWebView.stopLoading();
        }
    }

    public final void A01() {
        SecureWebView secureWebView = this.A00;
        if (secureWebView != null) {
            secureWebView.removeJavascriptInterface("GenericXmaYoutubePlayerWebviewJSBridge");
        }
        A00(this);
        SecureWebView secureWebView2 = this.A00;
        if (secureWebView2 != null) {
            secureWebView2.loadUrl("about:blank");
            secureWebView2.setTag(null);
            secureWebView2.clearHistory();
            secureWebView2.removeAllViews();
        }
        SecureWebView secureWebView3 = this.A00;
        if (secureWebView3 != null) {
            secureWebView3.onPause();
        }
        SecureWebView secureWebView4 = this.A00;
        if (secureWebView4 != null) {
            secureWebView4.destroy();
        }
    }
}
