package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.9ey, reason: invalid class name */
/* loaded from: 9ey.class */
public final class C9ey {
    public final 1Br A00 = 1BK.A0D();

    public static final void A00(BOr bOr, C9ey c9ey, String str, String str2, String str3, long j) {
        String A00 = AbE.A00(ActionId.WAIT_FOR_BLOCKERS);
        2R2 A01 = 2R2.A01(1Br.A02(c9ey.A00));
        if (4YU.A1X(A01)) {
            A01.A0E("action", str);
            7zU.A17(A01, "event", A00, j);
            7zV.A0r(bOr, A01, str2, str3);
            7zU.A18(A01, (java.util.Map) null);
        }
    }
}
