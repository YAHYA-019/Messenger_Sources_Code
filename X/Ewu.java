package X;

import java.util.HashMap;

/* loaded from: Ewu.class */
public final class Ewu {
    public static int A03 = 254;
    public final C00i A00 = 1Bi.A02(04J.class, (Class) null);
    public final C00i A02 = 1Bi.A02(C01s.class, (Class) null);
    public final C00i A01 = 1Bi.A02(C0qy.class, (Class) null);

    public void A00() {
        if (C0et.A0C.equals(((C0qy) this.A01.get()).A02) && A03 == -2) {
            A03 = -1;
        }
    }

    public void A01(String str, Throwable th) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("state", str);
        A0u.put("exception_type", AnonymousClass001.A0Y(th));
        A0u.put("exception_message", th.getMessage());
        1UG A0A = AbG.A0A(1ZG.A03, 1BK.A07(this.A00), 1BJ.A00(1500));
        if (A0A.isSampled()) {
            A0A.A7R("event_name", "oauth_token_fetch_state");
            A0A.A6J("event_info", A0u);
            A0A.BZL();
        }
    }
}
