package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7nE, reason: invalid class name */
/* loaded from: 7nE.class */
public abstract class C7nE {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, 5yY r302, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.payments.p2p.messenger.plugins.referral.ReferralKillSwitch", "payments.p2p.messenger.referral.ReferralKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    Boolean A012 = 2yD.A01((2yD) r302.A00.get(), 2342155879669109846L);
                    A01 = A012;
                    A00 = i;
                    r301.A01(A012, (Exception) null, "payments.p2p.messenger.referral.ReferralKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "payments.p2p.messenger.referral.ReferralKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
