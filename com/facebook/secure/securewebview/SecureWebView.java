package com.facebook.secure.securewebview;

import X.0ER;
import X.0eS;
import X.0fH;
import X.0jP;
import X.0jY;
import X.0kL;
import X.16E;
import X.AnonymousClass001;
import X.C0A2;
import X.C0fs;
import X.C0gl;
import X.C0w6;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: SecureWebView.class */
public class SecureWebView extends WebView {
    public C0w6 A00;
    public 0eS A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final 0kL A06;
    public final Context A07;

    public SecureWebView(Context context) {
        super(context);
        this.A06 = new 0kL(this);
        this.A07 = C0fs.A00(context, this);
        A00();
    }

    public SecureWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = new 0kL(this);
        this.A07 = C0fs.A00(context, this);
        A00();
    }

    public SecureWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new 0kL(this);
        this.A07 = C0fs.A00(context, this);
        A00();
    }

    public SecureWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A06 = new 0kL(this);
        this.A07 = C0fs.A00(context, this);
        A00();
    }

    public SecureWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        this.A06 = new 0kL(this);
        this.A07 = C0fs.A00(context, this);
        A00();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0w6, java.lang.Object] */
    private void A00() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        A01(settings);
        A02(settings);
        ?? obj = new Object();
        this.A03 = AnonymousClass001.A0s();
        this.A00 = obj;
        this.A05 = false;
        this.A04 = false;
    }

    public static void A01(WebSettings webSettings) {
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
    }

    public static void A02(WebSettings webSettings) {
        webSettings.setMixedContentMode(1);
    }

    public static final void A03(SecureWebView secureWebView, 0ER r302, String str, Collection collection) {
        if (collection != null) {
            try {
                if (!r302.A01(C0A2.A03(str))) {
                    0fH.A14(secureWebView.A02, "SecureUriWebView cannot load the cookie for the url \n%s\n. Please verify your cookie settings.\n", new Object[]{str});
                    return;
                }
                try {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.flush();
                    cookieManager.setAcceptCookie(true);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        cookieManager.setCookie(str, AnonymousClass001.A0i(it));
                    }
                } catch (IllegalArgumentException unused) {
                }
            } catch (SecurityException e) {
                0fH.A0z(secureWebView.A02, "Parse url run triggers the exception on url: \n%s\n", e, new Object[]{str});
            }
        }
    }

    public static final void A04(SecureWebView secureWebView, 0ER r302, String str, Collection collection, Map map) {
        if (secureWebView.A01.A00(secureWebView.getContext(), str).intValue() == 0) {
            Iterator it = secureWebView.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("execute");
            }
            A03(secureWebView, r302, str, collection);
            super.loadUrl(str, map);
        }
    }

    public final void A05(0jY r302) {
        C0w6 c0w6;
        if (this.A04 && (c0w6 = this.A00) != null) {
            c0w6.Cg0("webview.SecureWebView", "WebChromeClient has been set already", null);
        }
        this.A04 = true;
        super.setWebChromeClient(new 0jP(r302));
    }

    public final void A06(final C0gl c0gl) {
        C0w6 c0w6;
        if (this.A05 && (c0w6 = this.A00) != null) {
            c0w6.Cg0("webview.SecureWebView", "WebViewClient has been set already", null);
        }
        this.A05 = true;
        super.setWebViewClient(new WebViewClient(c0gl) { // from class: X.0gb
            public boolean A00 = false;
            public final C0gl A01;

            {
                this.A01 = c0gl;
            }

            private boolean A00(WebView webView, String str, boolean z) {
                boolean z2 = false;
                if (webView instanceof SecureWebView) {
                    SecureWebView secureWebView = (SecureWebView) webView;
                    this.A00 = true;
                    0eS r0 = secureWebView.A01;
                    boolean z3 = false;
                    if ((z ? r0.A00(secureWebView.getContext(), str) : r0.A01(str)) != 0S2.A00) {
                        z3 = true;
                    }
                    Object obj = this.A01;
                    boolean ANy = obj instanceof C0h8 ? ((C0h8) obj).ANy(secureWebView, str) : false;
                    if (z3 || ANy) {
                        this.A00 = false;
                        if (z3 || ANy) {
                            z2 = true;
                        }
                    }
                }
                return z2;
            }

            @Override // android.webkit.WebViewClient
            public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                this.A01.A02.doUpdateVisitedHistory(webView, str, z);
            }

            @Override // android.webkit.WebViewClient
            public void onFormResubmission(WebView webView, Message message, Message message2) {
                this.A01.A02.onFormResubmission(webView, message, message2);
            }

            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView webView, String str) {
                this.A01.A02.onLoadResource(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageCommitVisible(WebView webView, String str) {
                this.A01.A02.onPageCommitVisible(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                this.A01.A05(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (webView instanceof SecureWebView) {
                    SecureWebView secureWebView = (SecureWebView) webView;
                    0kL r0 = secureWebView.A06;
                    if (r0.A02 && r0.A03.getSettings().getJavaScriptEnabled()) {
                        r0.A01 = false;
                        String str2 = str;
                        try {
                            Uri A04 = C0A2.A04(str);
                            str2 = 0Pz.A0j(A04.getScheme(), "://", A04.getAuthority());
                        } catch (Exception unused) {
                        }
                        r0.A00 = str2;
                    }
                    if (this.A00) {
                        this.A00 = false;
                    } else if (this.A01.A00 && secureWebView.A01.A01(str) != 0S2.A00) {
                        secureWebView.stopLoading();
                        return;
                    }
                    this.A01.A06(secureWebView, str, bitmap);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
                this.A01.A02.onReceivedClientCertRequest(webView, clientCertRequest);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                this.A01.A03(webView, i, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                this.A01.A04(webView, webResourceRequest, webResourceError);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                this.A01.A02.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                this.A01.A02(webView, webResourceRequest, webResourceResponse);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
                this.A01.A02.onReceivedLoginRequest(webView, str, str2, str3);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                this.A01.A01(webView, sslErrorHandler, sslError);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return this.A01.A07(webView, renderProcessGoneDetail);
            }

            @Override // android.webkit.WebViewClient
            public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
                this.A01.A02.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }

            @Override // android.webkit.WebViewClient
            public void onScaleChanged(WebView webView, float f, float f2) {
                this.A01.A02.onScaleChanged(webView, f, f2);
            }

            @Override // android.webkit.WebViewClient
            public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
                this.A01.A02.onUnhandledKeyEvent(webView, keyEvent);
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                return this.A01.A02.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
                return this.A01.A02.shouldOverrideKeyEvent(webView, keyEvent);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return A00(webView, webResourceRequest.getUrl().toString(), AnonymousClass001.A1N(webResourceRequest.isForMainFrame() ? 1 : 0));
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return A00(webView, str, true);
            }
        });
    }

    public void A07(String str) {
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        loadUrl(str, null);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map map) {
        A04(this, 16E.A00, str, null, map);
    }
}
