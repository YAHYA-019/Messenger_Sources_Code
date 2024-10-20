package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: Bzn.class */
public final class Bzn {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(3Ed r302, String str) {
        BNy bNy = BNy.A01;
        Long A0n = str != null ? 1BK.A0n(str) : null;
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1133));
        if (A08.isSampled()) {
            A08.A5c(bNy, "flow");
            A08.A5c(r302, "event");
            A08.A6H("user_id", A0n);
            A08.A6H(TraceFieldType.ErrorCode, (Long) null);
            A08.A6J("extra_data", (java.util.Map) null);
            A08.BZL();
        }
    }
}
