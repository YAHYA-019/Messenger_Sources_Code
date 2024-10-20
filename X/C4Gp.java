package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Gp, reason: invalid class name */
/* loaded from: 4Gp.class */
public final class C4Gp {
    public final C4Gq A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
    
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        r312 = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0190, code lost:
    
        if (r0 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0193, code lost:
    
        r312 = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e9, code lost:
    
        if (r0 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C4Hu A00(X.C4Gc r301, X.C4Gp r302, X.44I r303, X.44N r304) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Gp.A00(X.4Gc, X.4Gp, X.44I, X.44N):X.4Hu");
    }

    public final HashMap A01(C4Gc c4Gc, 44I r303, 44N r304) {
        11T.A0G(r303, 0, r304);
        HashMap A0u = AnonymousClass001.A0u();
        for (44O r0 : (List) r304.A02.getValue()) {
            A0u.put(r0, Boolean.valueOf(this.A00.A00(c4Gc, r303, r0).A02));
        }
        Iterator it = ((List) r304.A01.getValue()).iterator();
        while (it.hasNext()) {
            A0u.putAll(A01(c4Gc, r303, (44N) it.next()));
        }
        return A0u;
    }
}
