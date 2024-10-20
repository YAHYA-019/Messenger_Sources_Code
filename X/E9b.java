package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.facebook.messaging.about.MessengerAboutLicenseActivity;

/* loaded from: E9b.class */
public final class E9b extends C0gl {
    public final int A00;
    public final Object A01;

    public E9b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C0gl
    public void A01(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (2 - this.A00 == 0) {
            7zT.A1S(webView, sslErrorHandler, sslError);
            0fH.A0o("QuicksilverWebViewActivity", sslError.toString());
        }
        super.A01(webView, sslErrorHandler, sslError);
    }

    @Override // X.C0gl
    public void A02(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (2 - this.A00 == 0) {
            7zT.A1S(webView, webResourceRequest, webResourceResponse);
            0fH.A0o("QuicksilverWebViewActivity", webResourceResponse.toString());
        }
        super.A02(webView, webResourceRequest, webResourceResponse);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.C0gl
    public void A03(WebView webView, int i, String str, String str2) {
        switch (this.A00) {
            case 1:
                7zS.A16(0, webView, str, str2);
                super.A03(webView, i, str, str2);
                ((MessengerAboutLicenseActivity) this.A01).A03 = true;
                return;
            case 2:
                7zS.A16(0, webView, str, str2);
                0fH.A0o("QuicksilverWebViewActivity", 0Pz.A0D(i, str));
            default:
                super.A03(webView, i, str, str2);
                return;
        }
    }

    @Override // X.C0gl
    public void A04(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (2 - this.A00 == 0) {
            7zT.A1S(webView, webResourceRequest, webResourceError);
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(webResourceError.getErrorCode());
            0fH.A0o("QuicksilverWebViewActivity", AnonymousClass001.A0a(webResourceError.getDescription(), A0k));
        }
        super.A04(webView, webResourceRequest, webResourceError);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (r306 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b6, code lost:
    
        r306.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r306 == null) goto L23;
     */
    @Override // X.C0gl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(android.webkit.WebView r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r304
            switch(r0) {
                case 0: goto Lbd;
                case 1: goto L23;
                default: goto L1c;
            }
        L1c:
            r0 = r301
            r1 = r302
            r2 = r303
            super.A05(r1, r2)
            return
        L23:
            r0 = r302
            r1 = r303
            X.1BK.A1M(r0, r1)
            r0 = r301
            r1 = r302
            r2 = r303
            super.A05(r1, r2)
            r0 = r301
            java.lang.Object r0 = r0.A01
            com.facebook.messaging.about.MessengerAboutLicenseActivity r0 = (com.facebook.messaging.about.MessengerAboutLicenseActivity) r0
            r305 = r0
            r0 = r305
            com.facebook.widget.listview.EmptyListViewItem r0 = r0.A02
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L50
            java.lang.String r0 = "emptyItemView"
            r307 = r0
        L47:
            r0 = r307
            X.11T.A0L(r0)
        L4c:
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L50:
            r0 = 8
            r308 = r0
            r0 = r306
            r1 = r308
            r0.setVisibility(r1)
            r0 = r305
            boolean r0 = r0.A03
            r304 = r0
            java.lang.String r0 = "basicWebView"
            r309 = r0
            java.lang.String r0 = "connectionErrorContainer"
            r307 = r0
            r0 = r304
            if (r0 == 0) goto L8f
            r0 = r305
            com.facebook.webview.BasicWebViewDoNotUse r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lae
            r0 = r306
            r1 = r308
            r0.setVisibility(r1)
            r0 = r305
            android.view.ViewGroup r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Lb6
            goto L47
        L8f:
            r0 = r305
            android.view.ViewGroup r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L47
            r0 = r306
            r1 = r308
            r0.setVisibility(r1)
            r0 = r305
            com.facebook.webview.BasicWebViewDoNotUse r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Lb6
        Lae:
            r0 = r309
            X.11T.A0L(r0)
            goto L4c
        Lb6:
            r0 = r306
            r1 = 0
            r0.setVisibility(r1)
            return
        Lbd:
            r0 = r302
            r1 = r303
            X.11T.A0H(r0, r1)
            r0 = r301
            r1 = r302
            r2 = r303
            super.A05(r1, r2)
            r0 = r301
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9b.A05(android.webkit.WebView, java.lang.String):void");
    }

    @Override // X.C0gl
    public void A06(WebView webView, String str, Bitmap bitmap) {
        if (this.A00 != 0) {
            super.A06(webView, str, bitmap);
        } else {
            super.A06(webView, str, bitmap);
            ((View) this.A01).setVisibility(0);
        }
    }

    @Override // X.C0gl
    public boolean A07(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (2 - this.A00 != 0) {
            return super.A07(webView, renderProcessGoneDetail);
        }
        11T.A0F(renderProcessGoneDetail, 1);
        String A0f = 0Pz.A0f("onRenderProcessGone priority: ", ", didCrash: ", renderProcessGoneDetail.rendererPriorityAtExit(), renderProcessGoneDetail.didCrash());
        0fH.A0o("QuicksilverWebViewActivity", A0f);
        E1r e1r = ((E9Z) this.A01).A00;
        if (e1r == null) {
            return true;
        }
        11T.A0F(A0f, 0);
        if (1BL.A0Q().AZk(36320167600667778L)) {
            e1r.A03 = true;
            E1r.A02(e1r);
            return true;
        }
        if (e1r.A0W().isPresent() && e1r.A0W().get() != null) {
            1Iw A0W = 7zL.A0W(4YU.A08((GOF) e1r.A0W().get()));
            FFJ ffj = new FFJ(A0W);
            C2148Dfc c2148Dfc = new C2148Dfc(A0W);
            c2148Dfc.A0g(A0W.A0D(2131964937));
            ffj.A00 = c2148Dfc;
            FFJ.A01(ffj, "CoplayContainerPresenter");
        }
        e1r.A0f(A0f);
        return true;
    }
}
