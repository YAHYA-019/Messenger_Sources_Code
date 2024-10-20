package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.4W2, reason: invalid class name */
/* loaded from: 4W2.class */
public final class C4W2 implements 1Ic {
    public final C00i A01 = 1BQ.A02(32933);
    public final C00i A02 = 1BQ.A02(32901);
    public final C00i A03 = 1BQ.A02(131221);
    public final C00i A00 = 1BQ.A02(66185);

    public static void A00(FbUserSession fbUserSession, C4W2 c4w2, ImmutableSet immutableSet) {
        1Du it = immutableSet.iterator();
        while (it.hasNext()) {
            4AG r0 = (4AG) it.next();
            1OZ BAD = r0.BAD();
            if (((45J) c4w2.A02.get()).A05(BAD)) {
                ((4AX) c4w2.A01.get()).A07(fbUserSession, r0.Aax(), BAD);
            }
        }
    }

    public void CSm(1Ka r302, 1Ka r303, Integer num, String str) {
        ImmutableSet A07;
        0fH.A03(C4W2.class, r302 != null ? r302.A01 : "null", r303.A01, str, num.intValue() != 0 ? "GLOBAL_SYNC" : "INITIAL_CREATE", "Re-registering push token due to family device id changing from %s to %s via source package %s with type %s");
        C4U9 c4u9 = (C4U9) this.A03.get();
        synchronized (c4u9) {
            A07 = ImmutableSet.A07(c4u9.A00);
        }
        FbUserSession A00 = 1Fw.A00();
        if (((1Bt) this.A00.get()).A04()) {
            A00(A00, this, A07);
        } else {
            new Thread((Runnable) new 4XE(A00, this, A07), "FamilyDeviceIdChangedTokenRefresher").start();
        }
    }
}
