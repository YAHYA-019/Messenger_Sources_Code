package X;

import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.endtoend.EndToEnd;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0gl, reason: invalid class name */
/* loaded from: 0gl.class */
public class C0gl {
    public ArrayList A01 = AnonymousClass001.A0s();
    public final WebViewClient A02 = new WebViewClient();
    public boolean A00 = false;

    public void A01(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        SslCertificate certificate = sslError.getCertificate();
        if (EndToEnd.isRunningEndToEndTest() && certificate != null) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                if (certificate.toString().equals(it.next().toString())) {
                    sslErrorHandler.proceed();
                    return;
                }
            }
        }
        this.A02.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public void A02(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A02.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void A03(WebView webView, int i, String str, String str2) {
        this.A02.onReceivedError(webView, i, str, str2);
    }

    public void A04(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A02.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void A05(WebView webView, String str) {
        this.A02.onPageFinished(webView, str);
    }

    public void A06(WebView webView, String str, Bitmap bitmap) {
        this.A02.onPageStarted(webView, str, bitmap);
    }

    public boolean A07(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A02.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
