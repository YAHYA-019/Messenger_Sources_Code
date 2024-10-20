package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1ni, reason: invalid class name */
/* loaded from: 1ni.class */
public final class C1ni extends 1Km implements C0mi {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public final C00i A01 = new 1BQ(66351);

    @Override // X.C0mi
    public C02S Au6() {
        return ((C0mi) 1Lo.A06(((1Fv) 1Bi.A03(66351)).A04(), 16726)).Au6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0059, code lost:
    
        if (r304 == null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.1Fy] */
    @Override // X.C0mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C5i(X.C03b r302) {
        /*
            r301 = this;
            r0 = r301
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            r303 = r0
            r0 = r302
            int r0 = r0.BHz()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            r305 = r0
            r0 = r302
            int r0 = r0.BHz()
            r306 = r0
            r0 = r306
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.Object r0 = r0.remove(r1)
            r0 = r305
            if (r0 == 0) goto L5c
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1Fv r0 = (X.1Fv) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.A06
            r1 = r305
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L71
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.1Fy r0 = (X.1Fy) r0
            r304 = r0
        L53:
            r0 = r304
            com.facebook.auth.usersession.FbUserSession r0 = (com.facebook.auth.usersession.FbUserSession) r0
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L60
        L5c:
            com.facebook.auth.usersession.FbUserSession r0 = X.1BL.A0F()
            r304 = r0
        L60:
            r0 = r304
            r1 = 16726(0x4156, float:2.3438E-41)
            java.lang.Object r0 = X.1Lo.A06(r0, r1)
            X.0mi r0 = (X.C0mi) r0
            r1 = r302
            r0.C5i(r1)
            return
        L71:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ni.C5i(X.03b):void");
    }

    @Override // X.C0mi
    public String getName() {
        return ((C0mi) 1Lo.A06(((1Fv) 1Bi.A03(66351)).A04(), 16726)).getName();
    }
}
