package X;

import android.net.Uri;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;

/* loaded from: Lqr.class */
public final class Lqr implements Runnable {
    public static final String __redex_internal_original_name = "BrowserLiteJSBridgeProxy$evaluateJS$2";
    public final /* synthetic */ BrowserLiteJSBridgeProxy A00;
    public final /* synthetic */ L2P A01;
    public final /* synthetic */ BrowserLiteJSBridgeCall A02;
    public final /* synthetic */ AbstractC3252Jnp A03;
    public final /* synthetic */ String A04;

    public Lqr(BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy, L2P l2p, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, AbstractC3252Jnp abstractC3252Jnp, String str) {
        this.A00 = browserLiteJSBridgeProxy;
        this.A03 = abstractC3252Jnp;
        this.A02 = browserLiteJSBridgeCall;
        this.A04 = str;
        this.A01 = l2p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3252Jnp abstractC3252Jnp = this.A03;
        BrowserLiteJSBridgeCall browserLiteJSBridgeCall = this.A02;
        if (Kbr.A00.contains(this.A04)) {
            String A08 = abstractC3252Jnp.A08();
            Uri uri = null;
            Uri A0O = A08 != null ? JQy.A0O(A08) : null;
            String str = browserLiteJSBridgeCall.A06;
            if (str != null) {
                uri = JQy.A0O(str);
            }
            if (A0O != null && A0O.getAuthority() != null && uri != null && uri.getAuthority() != null && 11T.A0O(A0O.getAuthority(), uri.getAuthority())) {
                String A00 = this.A01.A00();
                11T.A0D(A00);
                abstractC3252Jnp.A0I(A00);
                return;
            }
        }
        LCd.A04("BrowserLiteJSBridgeProxy", "Could not invoke js callback due to domain change", new Object[0]);
    }
}
