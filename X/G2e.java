package X;

import com.facebook.payments.p2m.messenger.plugins.payment.ctahandler.bloksasynccontroller.P2mBloksAsyncControllerXmaHandler;

/* loaded from: G2e.class */
public final class G2e implements Runnable {
    public static final String __redex_internal_original_name = "P2mBloksAsyncControllerXmaHandler$invoke$1";
    public final /* synthetic */ P2mBloksAsyncControllerXmaHandler A00;
    public final /* synthetic */ String A01;

    public G2e(P2mBloksAsyncControllerXmaHandler p2mBloksAsyncControllerXmaHandler, String str) {
        this.A00 = p2mBloksAsyncControllerXmaHandler;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        P2mBloksAsyncControllerXmaHandler p2mBloksAsyncControllerXmaHandler = this.A00;
        String str2 = this.A01;
        JZj jZj = p2mBloksAsyncControllerXmaHandler.A00;
        if (jZj == null) {
            JSp jSp = new JSp(p2mBloksAsyncControllerXmaHandler.A02);
            jSp.A0K(false);
            jSp.A0J(str2);
            jZj = jSp.A04();
            p2mBloksAsyncControllerXmaHandler.A00 = jZj;
        }
        if (jZj != null) {
            try {
                jZj.show();
            } catch (Exception e) {
                Ef8 ef8 = (Ef8) 1Br.A0B(p2mBloksAsyncControllerXmaHandler.A03);
                String A00 = 4YT.A00(1598);
                1UG A08 = 1BK.A08(1Br.A02(ef8.A00), "user_click_p2mxma_atomic");
                if (A08.isSampled()) {
                    0DA r0 = new 0DA();
                    r0.A07("view_name", ef8.toString());
                    r0.A07("target_name", A00);
                    r0.A06("invoice_id", 4YV.A0j());
                    str = "";
                    r0.A07("target_url", str);
                    r0.A07("target_url_base", str);
                    r0.A07("target_url_subpath", str);
                    A08.A7R("session_id", AbstractC11504wo.A01());
                    A08.A5c(EnumC11554wt.A0G, "product_type");
                    A08.A08();
                    A08.A6H("actual_event_time", AnonymousClass002.A0G());
                    A08.A7T(r0, "event_payload");
                    String message = e.getMessage();
                    A08.A7R("error_message", message != null ? message : "");
                    A08.A7R("error_stacktrace", C0ra.A00(e));
                    A08.BZL();
                }
            }
        }
    }
}
