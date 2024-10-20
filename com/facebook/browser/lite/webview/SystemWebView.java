package com.facebook.browser.lite.webview;

import X.0Pz;
import X.0QE;
import X.0S2;
import X.0fH;
import X.AbstractC3252Jnp;
import X.JYJ;
import X.JYM;
import X.JYN;
import X.JvO;
import android.app.Activity;
import android.content.Context;
import android.view.autofill.AutofillManager;

/* loaded from: SystemWebView.class */
public final class SystemWebView extends AbstractC3252Jnp {
    public AutofillManager.AutofillCallback A00;
    public JYM A01;
    public JYN A02;
    public final JvO A03;

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, X.Kk8] */
    public SystemWebView(Context context) {
        long j = -1;
        super.A01 = j;
        this.A08 = j;
        this.A07 = j;
        this.A04 = j;
        this.A05 = j;
        this.A06 = j;
        super.A00 = j;
        this.A09 = j;
        super.A03 = j;
        super.A02 = j;
        this.A0R = true;
        this.A0Y = false;
        this.A0a = false;
        this.A0W = false;
        this.A0U = false;
        this.A0V = false;
        this.A0X = false;
        this.A0M = 0S2.A00;
        this.A0Z = false;
        this.A0b = false;
        this.A0K = false;
        this.A0L = false;
        this.A0B = null;
        ?? obj = new Object();
        obj.A02 = true;
        obj.A03 = false;
        obj.A00 = context;
        obj.A01 = this;
        this.A0I = obj;
        if (context instanceof Activity) {
            A0F(((Activity) context).getIntent());
        }
        this.A02 = null;
        this.A01 = null;
        long j2 = 32;
        0QE.A01(j2, 0Pz.A1C("Initialized SystemWebView: using Helium ", false), -80749814);
        this.A03 = new JvO(context, this);
        0fH.A0g(false, "com.facebook.browser.lite.webview.SystemWebView", "Initialized SystemWebView (extensions=%b).");
        0QE.A00(j2, -47691645);
        if (context.getSystemService(AutofillManager.class) != null) {
            this.A00 = new JYJ(this);
            ((AutofillManager) context.getSystemService(AutofillManager.class)).registerCallback(this.A00);
        }
    }

    public static Context A00(Object obj) {
        return ((SystemWebView) obj).A03.getContext();
    }
}
