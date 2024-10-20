package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.rsys.state.gen.State;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9lt, reason: invalid class name */
/* loaded from: 9lt.class */
public final class C9lt {
    public static final 5Vt A01;
    public static final C9lt A02 = new Object();
    public static final C9Le A00 = new C9Le();
    public static final 9PW A03 = new 9PW((QuickPerformanceLogger) 1Bi.A03(16520));
    public static final java.util.Map A04 = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9lt, java.lang.Object] */
    static {
        5Vs A002 = C9dr.A00(8LW.A02, null, AVv.A00);
        A01 = new 5Vt((9PW) null, "CALL_ENDED_NO_OP_STORE", A002.Anq(), A002, true);
    }

    public static final 5Vt A00(String str) {
        11T.A0F(str, 0);
        C00j.A05("RpStores.getStoreForLocalCallId", -524061286);
        try {
            Object computeIfAbsent = A04.computeIfAbsent(str, new AHd(str));
            11T.A0A(computeIfAbsent);
            5Vt r0 = (5Vt) computeIfAbsent;
            if (11T.A0O(r0, A01)) {
                IDO.A02("RpStores", 0Pz.A0W("Accessing an RpStore after the Call has ended & UI is finished. localCallId=", str));
            }
            C00j.A01(1226204948);
            return r0;
        } catch (Throwable th) {
            C00j.A01(270771411);
            throw th;
        }
    }

    public static final void A01(String str) {
        11T.A0F(str, 0);
        IDO.A00.A03("RpStores", 0Pz.A0W("finalizeStore for localCallId: ", str), (Throwable) null);
        C9ei.A00().execute(new AE0(str));
    }

    public final 5Vt A02() {
        5Vt r0;
        State A002;
        Object obj = null;
        if (A00.A00) {
            Iterator A1A = 1BK.A1A(A04);
            while (true) {
                if (!A1A.hasNext()) {
                    break;
                }
                Object next = A1A.next();
                2JS r02 = ((8LW) ((G7y) next).getState()).A00;
                if (r02 != null && (A002 = HKc.A00(r02)) != null && A002.isActive) {
                    obj = next;
                    break;
                }
            }
            return (5Vt) obj;
        }
        synchronized (this) {
            Iterator A1A2 = 1BK.A1A(A04);
            while (true) {
                if (!A1A2.hasNext()) {
                    break;
                }
                Object next2 = A1A2.next();
                2JS r03 = ((8LW) ((5Vt) next2).getState()).A00;
                if (r03 != null) {
                    State A003 = HKc.A00(r03);
                    if (A003 != null && A003.isActive) {
                        obj = next2;
                        break;
                    }
                }
            }
            r0 = (5Vt) obj;
        }
        return r0;
    }
}
