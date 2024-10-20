package com.facebook.webview;

import X.1BK;
import X.1Bi;
import X.1Bn;
import X.2yD;
import X.AbJ;
import X.AnonymousClass001;
import X.AnonymousClass488;
import X.C1628Ao6;
import X.EaK;
import X.F4W;
import X.GEY;
import X.GGW;
import X.RNL;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: FacebookWebViewDoNotUse.class */
public class FacebookWebViewDoNotUse extends BasicWebViewDoNotUse implements GEY {
    public Map A00;
    public AnonymousClass488 A01;
    public RNL A02;
    public C1628Ao6 A03;
    public F4W A04;
    public FbSharedPreferences A05;

    public FacebookWebViewDoNotUse(Context context) {
        this(context, null);
    }

    public FacebookWebViewDoNotUse(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FacebookWebViewDoNotUse(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.facebook.webview.BasicWebViewDoNotUse
    public void A08(Context context) {
        super.A08(context);
        FbSharedPreferences A0i = AbJ.A0i();
        C1628Ao6 c1628Ao6 = (C1628Ao6) 1Bi.A03(84238);
        F4W f4w = (F4W) 1Bn.A0A(99930);
        2yD A0K = 1BK.A0K();
        this.A05 = A0i;
        this.A03 = c1628Ao6;
        A0K.AZk(36310572643647858L);
        A0K.AZk(2342155145225310337L);
        A0K.BCy(36875085964968396L);
        this.A01 = new AnonymousClass488(((BasicWebViewDoNotUse) this).A00, "com.facebook.webview.FacebookWebViewDoNotUse");
        this.A04 = f4w;
        this.A00 = AnonymousClass001.A0u();
        RNL rnl = new RNL();
        this.A02 = rnl;
        if (this.A00.put("fbrpc", rnl.A01) != null) {
            throw new RuntimeException();
        }
    }

    public boolean ADj(Integer num, int i, int i2) {
        List list = EaK.A00;
        String url = getUrl();
        boolean z = false;
        if (url != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((GGW) it.next()).BWy(url)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        RNL rnl = this.A02;
        if (rnl != null) {
            rnl.A02.clear();
        }
        try {
            super.destroy();
        } catch (IllegalArgumentException e) {
            ((BasicWebViewDoNotUse) this).A00.softReport("webview_destroy_exception", e);
        }
    }
}
