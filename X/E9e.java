package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment;
import com.facebook.widget.FbImageView;

/* loaded from: E9e.class */
public final class E9e extends C0gl implements C0h8 {
    public final /* synthetic */ SearchBottomSheetFragment A00;

    public E9e(SearchBottomSheetFragment searchBottomSheetFragment) {
        this.A00 = searchBottomSheetFragment;
    }

    @Override // X.C0gl
    public void A01(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        SearchBottomSheetFragment searchBottomSheetFragment = this.A00;
        SearchBottomSheetFragment.A0A(searchBottomSheetFragment, "IABSearch.openSearchBottomSheet.PageSSLError", 1008351974);
        RYc rYc = searchBottomSheetFragment.A00;
        String str = null;
        if (rYc != null) {
            RYc.A00(EQM.A01, rYc, (Long) null, sslError != null ? 1BK.A0l(sslError.getPrimaryError()) : null, (String) null);
        }
        super.A01(webView, sslErrorHandler, sslError);
        if (sslError != null) {
            str = sslError.getUrl();
        }
        SearchBottomSheetFragment.A09(searchBottomSheetFragment, 0S2.A0j, str);
    }

    @Override // X.C0gl
    public void A02(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        SearchBottomSheetFragment searchBottomSheetFragment = this.A00;
        SearchBottomSheetFragment.A0A(searchBottomSheetFragment, "IABSearch.openSearchBottomSheet.PageHTTPError", 1008351974);
        SearchBottomSheetFragment.A0A(searchBottomSheetFragment, "IABSearch.openSearchBottomSheet.PageHTTPError", 1008347943);
        7zP.A0e(searchBottomSheetFragment.A08).markerEnd(1008347943, (short) 2);
        RYc rYc = searchBottomSheetFragment.A00;
        if (rYc != null) {
            RYc.A00(EQM.A01, rYc, (Long) null, webResourceResponse != null ? 1BK.A0l(webResourceResponse.getStatusCode()) : null, (String) null);
        }
        super.A02(webView, webResourceRequest, webResourceResponse);
    }

    @Override // X.C0gl
    public void A04(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Long l;
        SearchBottomSheetFragment searchBottomSheetFragment = this.A00;
        SearchBottomSheetFragment.A0A(searchBottomSheetFragment, "IABSearch.openSearchBottomSheet.PageError", 1008351974);
        SearchBottomSheetFragment.A0A(searchBottomSheetFragment, "IABSearch.openSearchBottomSheet.PageError", 1008347943);
        RYc rYc = searchBottomSheetFragment.A00;
        if (rYc != null) {
            EQM eqm = EQM.A02;
            String str = null;
            if (webResourceError != null) {
                l = 1BK.A0l(webResourceError.getErrorCode());
                CharSequence description = webResourceError.getDescription();
                if (description != null) {
                    str = description.toString();
                }
            } else {
                l = null;
            }
            RYc.A00(eqm, rYc, (Long) null, l, str);
        }
        super.A04(webView, webResourceRequest, webResourceError);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0w6, java.lang.Object] */
    @Override // X.C0gl
    public void A05(WebView webView, String str) {
        Uri A01;
        SearchBottomSheetFragment searchBottomSheetFragment = this.A00;
        SearchBottomSheetFragment.A0A(searchBottomSheetFragment, "IABSearch.openSearchBottomSheet.PageLoad", 1008351974);
        7zP.A0e(searchBottomSheetFragment.A08).markerEnd(1008347943, (short) 2);
        super.A05(webView, str);
        SearchBottomSheetFragment.A09(searchBottomSheetFragment, (str == null || (A01 = C0A2.A01(new Object(), str)) == null || !"https".equals(A01.getScheme())) ? 0S2.A0N : 0S2.A01, str);
    }

    @Override // X.C0gl
    public void A06(WebView webView, String str, Bitmap bitmap) {
        SearchBottomSheetFragment searchBottomSheetFragment = this.A00;
        SearchBottomSheetFragment.A0A(searchBottomSheetFragment, "IABSearch.openSearchBottomSheet.PageLoadStart", 1008351974);
        SearchBottomSheetFragment.A0A(searchBottomSheetFragment, "IABSearch.openSearchBottomSheet.PageLoadStart", 1008347943);
        super.A06(webView, str, bitmap);
        FbImageView fbImageView = searchBottomSheetFragment.A03;
        if (fbImageView != null) {
            fbImageView.setVisibility(8);
        }
        2OB r0 = searchBottomSheetFragment.A01;
        if (r0 != null) {
            r0.setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // X.C0h8
    public boolean ANy(WebView webView, String str) {
        ?? r0 = this.A00;
        7zP.A0e(r0.A08).markerStart(1008347943);
        if (str == null) {
            return false;
        }
        if (!r0.A09.contains(str)) {
            FragmentActivity activity = r0.getActivity();
            if (activity == null) {
                return false;
            }
            2aK.A03((Integer) null, 2Zo.A00(), new AJJ(webView, (Object) r0, str, (0DR) null, 0), 7zO.A16(activity), 2);
            return true;
        }
        SearchBottomSheetFragment.A07(r0, KOr.A1Y);
        String str2 = r0.A04;
        if (str2 == null) {
            11T.A0L("blockingHtml");
            throw 0Q8.createAndThrow();
        }
        webView.loadDataWithBaseURL(null, str2, "text/html", "UTF-8", null);
        return true;
    }
}
