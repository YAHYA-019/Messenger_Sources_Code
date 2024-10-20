package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5c1, reason: invalid class name */
/* loaded from: 5c1.class */
public final class C5c1 {
    public static final long A03 = C1ub.A00().Auy(36603111459133459L);
    public final 1Br A00;
    public final C5c0 A01;
    public final java.util.Map A02;

    public C5c1(C5c0 c5c0) {
        11T.A0F(c5c0, 1);
        this.A01 = c5c0;
        this.A00 = 1Bq.A00(33013);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A02 = linkedHashMap;
        C1ub c1ub = C1ub.A03;
        if (C1ub.A00().AZk(36321636481974854L)) {
            C5c2 c5c2 = C5c2.A02;
            C5c2 c5c22 = C5c2.A04;
            long j = A03;
            82Y[] r0 = {new 82Y(c5c22, j)};
            11T.A0F(r0, 0);
            List asList = Arrays.asList(r0);
            11T.A0A(asList);
            linkedHashMap.put(c5c2, asList);
            if (c1ub.A0H()) {
                82Y[] r02 = {new 82Y(c5c2, j), new 82Y(c5c22, j)};
                11T.A0F(r02, 0);
                List asList2 = Arrays.asList(r02);
                11T.A0A(asList2);
                linkedHashMap.put(c5c22, asList2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependency graph=");
        sb.append(linkedHashMap);
        0fH.A0j("ThrottleController", sb.toString());
    }

    public final void A00(C5c2 c5c2) {
        1G2 r305;
        this.A01.A00.A00.get();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Updating content fetch SUCCESS time for ");
        sb.append(c5c2);
        sb.append(" to ");
        sb.append(currentTimeMillis);
        sb.append("ms");
        0fH.A0j("ThrottleController", sb.toString());
        int ordinal = c5c2.ordinal();
        if (ordinal == 1) {
            r305 = 1NK.A1V;
        } else if (ordinal == 2) {
            r305 = 1NK.A1Z;
        } else if (ordinal != 3) {
            return;
        } else {
            r305 = 1NK.A1Y;
        }
        if (r305 != null) {
            1Ql edit = ((FbSharedPreferences) this.A00.A00.get()).edit();
            edit.CaH(r305, currentTimeMillis);
            edit.commitImmediately();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01(X.C5c2 r302) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5c1.A01(X.5c2):boolean");
    }
}
