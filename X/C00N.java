package X;

import android.os.Build;
import java.util.HashMap;

/* renamed from: X.00N, reason: invalid class name */
/* loaded from: 00N.class */
public final class C00N implements 0gG {
    public final int A00;
    public final C0fa A01;

    public C00N(C0fa c0fa) {
        0hH r0 = 0hH.A03;
        if (r0 == null) {
            throw AnonymousClass001.A0N("Did you call PreviousSessionHelper.init?");
        }
        this.A00 = r0.A01();
        this.A01 = c0fa;
    }

    public Integer Ayh() {
        return 0S2.A15;
    }

    public /* synthetic */ boolean BN1(Integer num) {
        return false;
    }

    public void CXo(C0qh c0qh, C0gq c0gq) {
        int i;
        if (Build.VERSION.SDK_INT < 30 || (i = this.A00) == 0) {
            return;
        }
        C0fa c0fa = this.A01;
        0FL A00 = c0fa.A00(i);
        if (A00 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("previousPid", String.valueOf(i));
            hashMap.put("currentTimestamp", String.valueOf(System.currentTimeMillis()));
            try {
                hashMap.put("processName", (String) c0fa.A00.get());
                String A01 = c0fa.A01();
                if (A01 != null) {
                    hashMap.put("latestExitInfoAnyProcess", A01);
                }
            } catch (Throwable unused) {
                hashMap.put("latestExitInfoAnyProcess", "exception");
            }
            C0iy.A00().Bwu("MissingExitInfo", null, hashMap);
            return;
        }
        C0qh.A01(C0g6.A1a, c0qh, A00.A02());
        C0qh.A01(C0g6.A1Z, c0qh, A00.A01());
        c0qh.A05(C0g6.A5b, A00.A08());
        C0qh.A01(C0g6.A1c, c0qh, A00.A03());
        C0qh.A01(C0g6.A1e, c0qh, A00.A04());
        c0qh.A04(C0g6.A1f, Long.valueOf(A00.A07()));
        c0qh.A02(C0g6.A0W, A00.A0B());
        c0qh.A05(C0g6.A5c, A00.A09());
        c0qh.A04(C0g6.A1b, Long.valueOf(A00.A05()));
        c0qh.A04(C0g6.A1d, Long.valueOf(A00.A06()));
        if (c0gq == C0gq.LARGE_REPORT) {
            c0qh.A05(C0g6.A5d, A00.A0A());
        }
    }
}
