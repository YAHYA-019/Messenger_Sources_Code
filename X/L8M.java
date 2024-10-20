package X;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: L8M.class */
public final class L8M {
    public ConcurrentMap A00 = JQx.A13();
    public ConcurrentMap A01 = JQx.A13();
    public static final Logger A03 = JQx.A15(L8M.class);
    public static final L8M A02 = new L8M();

    public static Kq9 A00(L8M l8m, String str) {
        Kq9 kq9;
        synchronized (l8m) {
            ConcurrentMap concurrentMap = l8m.A00;
            if (!concurrentMap.containsKey(str)) {
                throw JQx.A10(0Pz.A0W("No key manager found for key type ", str));
            }
            kq9 = (Kq9) concurrentMap.get(str);
        }
        return kq9;
    }

    public void A01(KMC kmc, Kq9 kq9) {
        GeneralSecurityException A10;
        synchronized (this) {
            if (kmc.A00()) {
                try {
                    String str = kq9.A03;
                    ConcurrentMap concurrentMap = this.A01;
                    if (!concurrentMap.containsKey(str) || AnonymousClass001.A1V(concurrentMap.get(str))) {
                        ConcurrentMap concurrentMap2 = this.A00;
                        Kq9 kq92 = (Kq9) concurrentMap2.get(str);
                        if (kq92 != null) {
                            Class<?> cls = kq92.getClass();
                            Class<?> cls2 = kq9.getClass();
                            if (!cls.equals(cls2)) {
                                A03.warning(0Pz.A0W("Attempted overwrite of a registered key manager for key type ", str));
                                A10 = JQy.A10("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, cls.getName(), cls2.getName()});
                            }
                        }
                        concurrentMap2.putIfAbsent(str, kq9);
                        this.A01.put(str, true);
                    } else {
                        A10 = JQx.A10(0Pz.A0W("New keys are already disallowed for key type ", str));
                    }
                    throw A10;
                } catch (Throwable th) {
                    th = th;
                }
            } else {
                th = JQx.A10("Cannot register key manager: FIPS compatibility insufficient");
            }
            throw th;
        }
    }

    public void A02(Kq9 kq9) {
        synchronized (this) {
            A01(KMC.A00, kq9);
        }
    }
}
