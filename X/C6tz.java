package X;

import java.util.List;

/* renamed from: X.6tz, reason: invalid class name */
/* loaded from: 6tz.class */
public final class C6tz implements C6u0 {
    public final 1Br A00 = 1Bq.A00(65723);
    public final 1Br A02 = 1Bu.A00(66815);
    public final 1Br A01 = 1Bu.A00(66814);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r303 != 16) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C2fd A00(java.util.List r302, int r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L45
            r0 = 2
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L45
            r0 = 7
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto Lb4
            r0 = 8
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto Lb4
            r0 = 15
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L45
            r0 = 16
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L45
        L41:
            X.2fd r0 = X.C2fd.A0T
            return r0
        L45:
            r0 = r302
            boolean r0 = r0 instanceof java.util.Collection
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L63
            r0 = r302
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L63
            goto L41
        L63:
            r0 = r302
            java.util.Iterator r0 = r0.iterator()
            r307 = r0
        L6b:
            r0 = r307
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L41
            r0 = r307
            java.lang.Object r0 = r0.next()
            X.5fr r0 = (X.C5fr) r0
            r304 = r0
            r0 = r304
            com.facebook.user.model.UserKey r0 = r0.A03
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L6b
            r0 = r301
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1XZ r0 = (X.1XZ) r0
            r304 = r0
            r0 = r304
            r1 = r308
            boolean r0 = r0.BX3(r1)
            r305 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L6b
            X.2fd r0 = X.C2fd.A01
            return r0
        Lb4:
            X.2fd r0 = X.C2fd.A0e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6tz.A00(java.util.List, int):X.2fd");
    }

    @Override // X.C6u0
    public C2fr BFM(C2fd c2fd, String str, List list, int i) {
        return (str == null || !(0CU.A0O(str) ^ true)) ? ((6uF) this.A02.A00.get()).BFM(c2fd, str, list, i) : ((ABL) this.A01.A00.get()).BFM(c2fd, str, list, i);
    }
}
