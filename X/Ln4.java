package X;

import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;

/* loaded from: Ln4.class */
public final class Ln4 implements Runnable {
    public static final String __redex_internal_original_name = "AutofillController$11";
    public final /* synthetic */ AutofillSharedJSBridgeProxy A00;
    public final /* synthetic */ C3243Jnf A01;

    public Ln4(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, C3243Jnf c3243Jnf) {
        this.A01 = c3243Jnf;
        this.A00 = autofillSharedJSBridgeProxy;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3216Jmt c3216Jmt = this.A01.A06;
        if (c3216Jmt != null) {
            c3216Jmt.A01(this.A00);
        }
    }
}
