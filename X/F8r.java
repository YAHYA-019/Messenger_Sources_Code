package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: F8r.class */
public final class F8r {
    public long A00;
    public final 1Br A01 = 7zM.A0T();

    public static final UserFlowLogger A00(F8r f8r) {
        return 4YV.A0Z(f8r.A01);
    }

    public final void A01(String str) {
        1Br r0 = this.A01;
        4YV.A0Z(r0).flowMarkPoint(this.A00, str);
        4YV.A0Z(r0).flowEndSuccess(this.A00);
        this.A00 = 0L;
    }

    public final void A02(String str) {
        4YV.A0Z(this.A01).flowMarkPoint(this.A00, str);
    }
}
