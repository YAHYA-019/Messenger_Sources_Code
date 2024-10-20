package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.payments.jsbasedpayment.logging.JSBasedPaymentLoggingParamters;
import com.google.common.base.Joiner;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: I2g.class */
public final class I2g {
    public JJa A00;
    public final Context A01;
    public final 1Gz A02;
    public final Rwq A03;
    public final Rwr A04;
    public final Rws A05;
    public final Rwk A06;
    public final Rwl A07;
    public final HJr A08;

    public I2g(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A08 = (HJr) 1Bn.A0A(116188);
        Rwr rwr = new Rwr(this);
        this.A04 = rwr;
        Rws rws = new Rws(this);
        this.A05 = rws;
        Rwq rwq = new Rwq(this);
        this.A03 = rwq;
        Rwk rwk = new Rwk(this);
        this.A06 = rwk;
        Rwl rwl = new Rwl(this);
        this.A07 = rwl;
        this.A02 = new C01o(rwr, rws, rwq, rwk, rwl);
    }

    public static final void A00(I2g i2g) {
        i2g.A04.A00 = null;
        i2g.A05.A00 = null;
        i2g.A03.A00 = null;
    }

    public final void A01() {
        Bundle bundle;
        Object obj = this.A00;
        if (obj == null || (bundle = ((BrowserLiteJSBridgeCall) obj).A02) == null) {
            throw 1BK.A0h();
        }
        HashMap A0u = AnonymousClass001.A0u();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            11T.A0D(A0i);
            A0u.put(A0i, bundle.getString(A0i));
        }
        A0u.put("JS_BRIDGE_BROWSER_DISPLAY_HEIGHT_RATIO", String.valueOf(bundle.getDouble("JS_BRIDGE_BROWSER_DISPLAY_HEIGHT_RATIO")));
        Joiner joiner = new Joiner(" ");
        String A00 = JQw.A00(50);
        A0u.put(A00, joiner.join(C0s8.A10(bundle.getStringArrayList(A00))));
        A0u.put("JS_BRIDGE_LOG_SOURCE", bundle.getString("JS_BRIDGE_LOG_SOURCE"));
        String string = bundle.getString("JS_BRIDGE_PAGE_ID");
        if (string == null) {
            throw 1BK.A0h();
        }
        new JSBasedPaymentLoggingParamters(0S2.A00, string, A0u);
        this.A00 = null;
        this.A04.A00 = null;
        this.A05.A00 = null;
        this.A03.A00 = null;
        this.A01.unregisterReceiver(this.A02);
    }
}
