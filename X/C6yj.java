package X;

import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.6yj, reason: invalid class name */
/* loaded from: 6yj.class */
public abstract class C6yj {
    public static final void A00(ContextChain contextChain, java.util.Map map) {
        if (contextChain != null) {
            for (String str : map.keySet()) {
                if (!11T.A0O(str, "") && !7Qt.A00.contains(str)) {
                    contextChain.A01(str, map.get(str));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (r0.AZk(r301.A0z() ? 36323040934250676L : 36323040934185139L) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = 16385(0x4001, float:2.296E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2yD r0 = (X.2yD) r0
            r302 = r0
            r0 = 36323040934119602(0x810b9d000a48b2, double:3.034175575658786E-306)
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L3c
            r0 = r301
            boolean r0 = r0.A0z()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L42
            r0 = 36323040934250676(0x810b9d000c48b4, double:3.034175575741678E-306)
            r303 = r0
        L2b:
            r0 = r302
            r1 = r303
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L3f
        L3c:
            r0 = 1
            r305 = r0
        L3f:
            r0 = r305
            return r0
        L42:
            r0 = 36323040934185139(0x810b9d000b48b3, double:3.034175575700232E-306)
            r303 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6yj.A01(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }
}
