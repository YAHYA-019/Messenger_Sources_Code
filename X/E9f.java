package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.HashMap;

/* loaded from: E9f.class */
public final class E9f extends C0gl implements C0h8 {
    public final /* synthetic */ E9a A00;

    public E9f(E9a e9a) {
        this.A00 = e9a;
    }

    private boolean A00(WebView webView, boolean z) {
        E9a e9a = this.A00;
        if (e9a.A01 > 0 || webView == null || !webView.isShown() || e9a.A00 >= 20) {
            return false;
        }
        C00i c00i = e9a.A0B;
        c00i.getClass();
        long A09 = 1BL.A09(c00i);
        long j = e9a.A02;
        if (A09 >= j) {
            long j2 = z ? 100 : 2000L;
            int i = e9a.A00;
            long min = Math.min(j2 * (1 << Math.min(i, 15)), z ? 5000L : 60000L);
            if (!z) {
                j = A09;
            }
            long j3 = min + j;
            long j4 = j3 - A09;
            if (j4 <= 0) {
                e9a.A02 = A09;
                e9a.A00 = i + 1;
                webView.reload();
            } else {
                e9a.A02 = j3;
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    new Handler(myLooper).postDelayed(new G2v(webView, this), j4);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // X.C0gl
    public void A03(WebView webView, int i, String str, String str2) {
        E9a e9a = this.A00;
        C00i c00i = e9a.A0C;
        AbstractC01593ro A00 = FIT.A00((FIT) 4YU.A0p(c00i), "quicksilver_web_client_error");
        if (A00 != null) {
            A00.A06("web_client_failing_url", str2);
            A00.A04("web_client_error_code", i);
            A00.A06("web_client_error_description", str);
            A00.A0A();
        }
        if (!A00(webView, true)) {
            ((FIT) 4YU.A0p(c00i)).A0D(str2, i, str);
            super.A03(webView, i, str, str2);
        } else {
            if (e9a.A0I) {
                return;
            }
            e9a.A0I = true;
            ((FIT) 4YU.A0p(c00i)).A0C("game_web_client_retried");
        }
    }

    @Override // X.C0gl
    public void A04(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        E9a e9a = this.A00;
        C00i c00i = e9a.A0C;
        FIT fit = (FIT) 4YU.A0p(c00i);
        String obj = webResourceRequest.getUrl().toString();
        int errorCode = webResourceError.getErrorCode();
        String valueOf = String.valueOf(webResourceError.getDescription());
        AbstractC01593ro A00 = FIT.A00(fit, "quicksilver_web_client_error");
        if (A00 != null) {
            A00.A06("web_client_failing_url", obj);
            A00.A04("web_client_error_code", errorCode);
            A00.A06("web_client_error_description", valueOf);
            A00.A0A();
        }
        if (!A00(webView, webResourceRequest.isForMainFrame())) {
            ((FIT) 4YU.A0p(c00i)).A0D(webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()));
            super.A04(webView, webResourceRequest, webResourceError);
        } else {
            if (e9a.A0I) {
                return;
            }
            e9a.A0I = true;
            ((FIT) 4YU.A0p(c00i)).A0C("game_web_client_retried");
        }
    }

    @Override // X.C0gl
    public void A05(WebView webView, String str) {
        super.A05(webView, str);
        if (webView.getProgress() == 100) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("url", str);
            ((FIT) 4YU.A0p(this.A00.A0C)).A0J("index_html_load_end", A0u);
        }
    }

    @Override // X.C0gl
    public void A06(WebView webView, String str, Bitmap bitmap) {
        super.A06(webView, str, bitmap);
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("url", str);
        ((FIT) 4YU.A0p(this.A00.A0C)).A0J("index_html_load_start", A0u);
    }

    @Override // X.C0gl
    public boolean A07(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        FIT fit;
        Object obj;
        E9a e9a = this.A00;
        C00i c00i = e9a.A0A;
        if (c00i == null || c00i.get() != null) {
            DZW A00 = ((EsM) 4YU.A0p(c00i)).A00();
            if (A00 != null) {
                String A0f = 0Pz.A0f("onRenderProcessGone priority: ", ", didCrash: ", renderProcessGoneDetail.rendererPriorityAtExit(), renderProcessGoneDetail.didCrash());
                GKb gKb = A00.A0E;
                if (webView == gKb && gKb != null && (gKb instanceof E9a) && !((E9a) gKb).A0H) {
                    FIT fit2 = A00.A08;
                    if (fit2 != null) {
                        HashMap A0u = AnonymousClass001.A0u();
                        A0u.put("reason", A0f);
                        fit2.A0J("webview_crash", A0u);
                    }
                    ((ViewGroup) A00.A01.getRootView()).removeView((View) A00.A0E);
                    A00.A0E.destroy();
                    DZW.A0D(A00, ((Ew4) A00.A0i.get()).A01(), true);
                    return true;
                }
                return true;
            }
            fit = (FIT) 4YU.A0p(e9a.A0C);
            obj = "webview crash and QuicksilverFragment is null";
        } else {
            fit = (FIT) 4YU.A0p(e9a.A0C);
            obj = "webview crash and mGameSessionFragmentContext is null";
        }
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u2.put("reason", obj);
        fit.A0J("webview_crash", A0u2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0107, code lost:
    
        if (r311.getHost().equals(r0.getHost()) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0w6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.0w6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [X.0w6, java.lang.Object] */
    @Override // X.C0h8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ANy(android.webkit.WebView r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9f.ANy(android.webkit.WebView, java.lang.String):boolean");
    }
}
