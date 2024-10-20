package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Fc, reason: invalid class name */
/* loaded from: 4Fc.class */
public abstract class C4Fc {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.nativepagereply.plugins.accountswitchhalfsheet.BusinessInboxAccountSwitchHalfSheetKillSwitch", "messaging.nativepagereply.accountswitchhalfsheet.BusinessInboxAccountSwitchHalfSheetKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(!((2yD) ((C2ib) 1Bi.A03(17077)).A01.get()).AZk(18299249331084087L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.nativepagereply.accountswitchhalfsheet.BusinessInboxAccountSwitchHalfSheetKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.nativepagereply.accountswitchhalfsheet.BusinessInboxAccountSwitchHalfSheetKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
