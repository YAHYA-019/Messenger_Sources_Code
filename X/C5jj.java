package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5jj, reason: invalid class name */
/* loaded from: 5jj.class */
public final class C5jj {
    public final 1Br A00;

    public C5jj() {
        1Br A00 = 1Bq.A00(16385);
        this.A00 = A00;
        ((2yD) A00.A00.get()).AZk(36325003733848321L);
    }

    public final List A00() {
        String BCy = ((2yD) this.A00.A00.get()).BCy(36888993069074249L);
        11T.A0A(BCy);
        List A0M = 0CU.A0M(BCy, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
        ArrayList arrayList = new ArrayList(C1A3.A1D(A0M, 10));
        Iterator it = A0M.iterator();
        while (it.hasNext()) {
            arrayList.add(0CU.A06((String) it.next()).toString());
        }
        return arrayList;
    }

    public final boolean A01() {
        return ((2yD) this.A00.A00.get()).AZr(1GD.A05, 36325003733979395L);
    }

    public final boolean A02() {
        return ((2yD) this.A00.A00.get()).AZr(1GD.A05, 36325003734044932L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r304.AZr(X.1GD.A05, r305) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(com.facebook.messaging.model.threadkey.ThreadKey r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0.A1L()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r301
            boolean r0 = r0.A01()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L37
            r0 = r301
            X.1Br r0 = r0.A00
            X.2yD r0 = X.1Br.A07(r0)
            r304 = r0
            r0 = 36325003733782784(0x810d6600045100, double:3.035416858069342E-306)
            r305 = r0
        L1f:
            X.1GD r0 = X.1GD.A05
            r307 = r0
            r0 = r304
            r1 = r307
            r2 = r305
            boolean r0 = r0.AZr(r1, r2)
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 != 0) goto L3b
        L37:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L3b:
            r0 = r303
            return r0
        L3d:
            r0 = r302
            boolean r0 = r0.A0z()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L37
            r0 = r301
            boolean r0 = r0.A02()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L37
            r0 = r301
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36325003733913858(0x810d6600065102, double:3.035416858152234E-306)
            r305 = r0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5jj.A03(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }
}
