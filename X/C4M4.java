package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4M4, reason: invalid class name */
/* loaded from: 4M4.class */
public abstract class C4M4 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.marketplace.plugins.marketplacefolder.MarketplaceDrawerFolderKillSwitch", "messaging.marketplace.marketplacefolder.MarketplaceDrawerFolderKillSwitch", andIncrement);
            try {
                try {
                    boolean z = false;
                    if (!((1Wa) 1Bi.A03(66347)).A00()) {
                        2Mb r0 = (2Mb) 1Bi.A03(68519);
                        if (r0.A00() && r0.A03()) {
                            if (((2OJ) 1Bi.A03(66535)).A00()) {
                                z = true;
                            }
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.marketplace.marketplacefolder.MarketplaceDrawerFolderKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.marketplace.marketplacefolder.MarketplaceDrawerFolderKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
