package X;

import com.facebook.profilo.provider.systemcounters.SystemCounterThread;

/* renamed from: X.0ma, reason: invalid class name */
/* loaded from: 0ma.class */
public abstract class C0ma {
    static {
        C0il.A0B("profilo_systemcounters");
    }

    public static void A00(int i) {
        SystemCounterThread.nativeAddToWhitelist(i);
    }
}
