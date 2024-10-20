package com.facebook.messaging.dma.ui;

import X.0Q8;
import X.11T;
import X.1Bn;
import X.C0gl;
import X.CGw;
import X.E9W;
import X.E9c;
import X.Ero;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.ProgressBar;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.secure.securewebview.SecureWebView;

/* loaded from: MsplitContactExportWebviewLauncher.class */
public final class MsplitContactExportWebviewLauncher extends FbFragmentActivity {
    public ProgressBar A00;
    public CGw A01;
    public SecureWebView A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542770);
        View requireViewById = requireViewById(2131367233);
        11T.A0I(requireViewById, "null cannot be cast to non-null type com.facebook.secure.securewebview.SecureWebView");
        this.A02 = (SecureWebView) requireViewById;
        View requireViewById2 = requireViewById(2131365306);
        11T.A0I(requireViewById2, "null cannot be cast to non-null type android.widget.ProgressBar");
        this.A00 = (ProgressBar) requireViewById2;
        this.A03 = String.valueOf(getIntent().getStringExtra("initial_url"));
        String.valueOf(getIntent().getStringExtra("terminal_url"));
        E9c e9c = new E9c(this);
        ((C0gl) e9c).A00 = true;
        SecureWebView secureWebView = this.A02;
        String str = "secureWebView";
        if (secureWebView != null) {
            secureWebView.getSettings().setJavaScriptEnabled(true);
            SecureWebView secureWebView2 = this.A02;
            if (secureWebView2 != null) {
                secureWebView2.getSettings().setDomStorageEnabled(true);
                SecureWebView secureWebView3 = this.A02;
                if (secureWebView3 != null) {
                    secureWebView3.A06(e9c);
                    SecureWebView secureWebView4 = this.A02;
                    if (secureWebView4 != null) {
                        secureWebView4.A05(new E9W(this));
                        SecureWebView secureWebView5 = this.A02;
                        if (secureWebView5 != null) {
                            secureWebView5.addJavascriptInterface(new Ero(this), "privacyFlowJSInterface");
                            SecureWebView secureWebView6 = this.A02;
                            if (secureWebView6 != null) {
                                secureWebView6.clearCache(true);
                                SecureWebView secureWebView7 = this.A02;
                                if (secureWebView7 != null) {
                                    secureWebView7.clearHistory();
                                    SecureWebView secureWebView8 = this.A02;
                                    if (secureWebView8 != null) {
                                        secureWebView8.clearFormData();
                                        CookieManager.getInstance().removeAllCookies(null);
                                        CookieManager.getInstance().flush();
                                        CGw cGw = this.A01;
                                        if (cGw == null) {
                                            str = "secureWebViewHelper";
                                        } else {
                                            SecureWebView secureWebView9 = this.A02;
                                            if (secureWebView9 != null) {
                                                String str2 = this.A03;
                                                if (str2 != null) {
                                                    cGw.A00(secureWebView9, str2);
                                                    return;
                                                }
                                                str = "initialUrl";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A01 = (CGw) 1Bn.A0A(84925);
    }
}
