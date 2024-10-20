package X;

import java.util.Collection;
import java.util.List;

/* loaded from: L9G.class */
public abstract class L9G {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0235, code lost:
    
        if (r302.A09() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x050f, code lost:
    
        if (r323 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x017b, code lost:
    
        if (r0.AZr(r0, 36311839669030425L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.LinkedHashMap A00(X.C11424wg r301, X.C11384wc r302) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9G.A00(X.4wg, X.4wc):java.util.LinkedHashMap");
    }

    public static final boolean A01(C11424wg c11424wg, C11384wc c11384wc, boolean z) {
        11T.A0H(c11424wg, c11384wc);
        1CO r0 = c11384wc.A00;
        if (!JR1.A1a(r0, z ? 1 : 0, 36311839671782965L) && !JR1.A1a(r0, z ? 1 : 0, 36311839671717428L)) {
            return false;
        }
        List<8Lu> list = (List) c11424wg.A0E.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (8Lu r02 : list) {
            if (r02.A00 == 0S2.A01 && r02.A01 == 0S2.A0Y) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A02(C11424wg c11424wg, C11384wc c11384wc, boolean z) {
        11T.A0H(c11424wg, c11384wc);
        1CO r0 = c11384wc.A00;
        if (!JR1.A1a(r0, z ? 1 : 0, 36311839671651891L) && !JR1.A1a(r0, z ? 1 : 0, 36311839671717428L)) {
            return false;
        }
        List<8Lu> list = (List) c11424wg.A0E.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (8Lu r02 : list) {
            if (r02.A00 == 0S2.A00 && r02.A01 == 0S2.A01) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A03(C11384wc c11384wc, boolean z) {
        1CO r0 = c11384wc.A00;
        String BCy = z ? r0.BCy(36874789620154764L) : r0.BDB(1GD.A07, 36874789620154764L);
        11T.A0D(BCy);
        return 1BK.A13(4YU.A13(BCy)).equals("pure_payment");
    }
}
