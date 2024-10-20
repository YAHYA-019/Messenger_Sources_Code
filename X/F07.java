package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: F07.class */
public abstract class F07 {
    public static final 8NL A00(FyG fyG, DLQ dlq, long j) {
        if (dlq.A05 != 16621) {
            throw AnonymousClass001.A0L("Expected Canvas group command.");
        }
        String A0B = dlq.A0B();
        float A00 = DKH.A00(j);
        float A01 = F09.A01(A0B, A00, A00);
        String A0C = dlq.A0C();
        float A002 = FFf.A00(j);
        long A003 = EXL.A00(A01, F09.A01(A0C, A002, A002));
        DLQ A0p = DKC.A0p(dlq);
        DrG A004 = A0p != null ? EUE.A00(A0p, j) : DrG.A07;
        DLQ A05 = dlq.A05();
        Dr8 A005 = A05 != null ? EUB.A00(A05, A003) : null;
        boolean A006 = F2Z.A00(dlq, 41, false);
        List A0G = dlq.A0G();
        11T.A0A(A0G);
        ArrayList A0z = 1BL.A0z(A0G);
        Iterator it = A0G.iterator();
        while (it.hasNext()) {
            A0z.add(A01(fyG, DKE.A0j(it), A003));
        }
        return new 8NL(A005, A004, A0z, A003, A006);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b4, code lost:
    
        if (r307 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0215, code lost:
    
        if (r307 == false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v210, types: [X.Dq6] */
    /* JADX WARN: Type inference failed for: r0v244, types: [X.Dq6] */
    /* JADX WARN: Type inference failed for: r1v35, types: [X.Dq6] */
    /* JADX WARN: Type inference failed for: r1v55, types: [X.Dq6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.AYX A01(X.FyG r301, X.DLQ r302, long r303) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F07.A01(X.FyG, X.DLQ, long):X.AYX");
    }
}
