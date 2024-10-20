package com.facebook.webview;

import X.0ER;
import X.0Pz;
import X.0YV;
import X.0eS;
import X.0gO;
import X.0lC;
import X.11T;
import X.16E;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.2Ao;
import X.40W;
import X.AnonymousClass001;
import X.C01s;
import X.C0fs;
import X.F5x;
import X.Frt;
import X.GOb;
import X.QTK;
import X.RKJ;
import X.Rwf;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebSettings;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: BasicWebViewDoNotUse.class */
public class BasicWebViewDoNotUse extends SecureWebView {
    public C01s A00;
    public 0gO A01;
    public RKJ A02;

    public BasicWebViewDoNotUse(Context context) {
        this(context, null, 0);
    }

    public BasicWebViewDoNotUse(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BasicWebViewDoNotUse(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0fs c0fs = new C0fs();
        c0fs.A02();
        super.A01 = c0fs.A01();
        A08(context);
    }

    public void A08(Context context) {
        2Ao r0 = (2Ao) 1Bi.A03(16917);
        String str = (String) 1Bn.A0E(context, (1BY) null, 83600);
        C01s A0I = 1BL.A0I();
        40W r02 = (40W) 1Bi.A03(98414);
        0gO r03 = (0gO) 1Bi.A03(98830);
        this.A00 = A0I;
        this.A02 = new RKJ(r0, r02);
        this.A01 = r03;
        Rwf rwf = new Rwf(A0I, this);
        0ER r04 = 16E.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        11T.A0F(r04, 0);
        A0s2.add(r04);
        super.A01 = new 0eS(rwf, new 0YV(), A0s, A0s2);
        setHapticFeedbackEnabled(false);
        setLongClickable(true);
        setOnLongClickListener(new 0lC());
        WebSettings settings = getSettings();
        settings.setUserAgentString(0Pz.A0j(settings.getUserAgentString(), " ", str));
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            Log.w("BasicWebViewMigrationUtils", "JavaScript enabled error", e);
        }
        A05(new QTK(this));
    }

    @Override // com.facebook.secure.securewebview.SecureWebView, android.webkit.WebView
    public void loadUrl(String str, Map map) {
        resumeTimers();
        HashMap A0u = AnonymousClass001.A0u();
        if (map != null) {
            A0u.putAll(map);
        }
        RKJ rkj = this.A02;
        if (rkj != null) {
            2Ao r0 = rkj.A00;
            2Ao.A00(r0);
            A0u.put("x-fb-net-hni", r0.A0J);
            2Ao.A00(r0);
            A0u.put("x-fb-sim-hni", r0.A0L);
            2Ao.A00(r0);
            A0u.put("x-fb-net-sid", r0.A0K);
            40W r02 = rkj.A01;
            Object obj = r02.A01.get();
            11T.A0A(obj);
            if (AnonymousClass001.A1V(obj)) {
                A0u.putAll(r02.A00);
            }
        }
        0gO r03 = this.A01;
        if (r03 != null) {
            F5x Cig = ((GOb) ((Frt) r03).A00.get()).Cig(str);
            str = Cig.A03 ? Cig.A02 : Cig.A00;
        }
        super.loadUrl(str, map);
    }
}
