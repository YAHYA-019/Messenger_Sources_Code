package X;

import android.webkit.WebView;
import com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment;

/* loaded from: G1u.class */
public final class G1u implements Runnable {
    public static final String __redex_internal_original_name = "SearchBottomSheetFragment$setUpWebviewClient$1$doAdditionalShouldOverrideUrlLoading$2$1";
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ SearchBottomSheetFragment A01;

    public G1u(WebView webView, SearchBottomSheetFragment searchBottomSheetFragment) {
        this.A00 = webView;
        this.A01 = searchBottomSheetFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.A00;
        String str = this.A01.A04;
        if (str == null) {
            11T.A0L("blockingHtml");
            throw 0Q8.createAndThrow();
        }
        webView.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
    }
}
