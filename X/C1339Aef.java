package X;

import java.util.List;

/* renamed from: X.Aef, reason: case insensitive filesystem */
/* loaded from: Aef.class */
public final class C1339Aef extends C04v implements DGp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1339Aef(AbU abU, List list) {
        this.A00 = 1;
        this.A01 = list;
        this.A02 = abU;
    }

    public C1339Aef(List list) {
        this.A00 = 0;
        this.A01 = list;
        this.A02 = AbU.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.C1339Aef) r302).A00 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.C1339Aef
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.Aef r0 = (X.C1339Aef) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A00
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r301
            if (r0 == r1) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1339Aef.A00(int, java.lang.Object):boolean");
    }

    @Override // X.DGp
    public List AgP() {
        return (List) this.A01;
    }

    @Override // X.DGp
    public AbU AuN() {
        return (AbU) this.A02;
    }

    public boolean equals(Object obj) {
        if (this.A00 == 0) {
            if (this != obj) {
                return A00(0, obj) && 11T.A0O(this.A01, ((C1339Aef) obj).A01);
            }
            return true;
        }
        if (this == obj) {
            return true;
        }
        if (!A00(1, obj)) {
            return false;
        }
        C1339Aef c1339Aef = (C1339Aef) obj;
        return 11T.A0O(this.A01, c1339Aef.A01) && this.A02 == c1339Aef.A02;
    }

    public int hashCode() {
        if (this.A00 == 0) {
            return this.A01.hashCode();
        }
        return 1BK.A03(this.A02, 1BL.A03(this.A01));
    }
}
