package X;

import java.util.List;

/* renamed from: X.Gjz, reason: case insensitive filesystem */
/* loaded from: Gjz.class */
public final class C2645Gjz extends C04v implements JLN {
    public final GjW A00;
    public final C2612Gj1 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    public C2645Gjz(GjW gjW, C2612Gj1 c2612Gj1, String str, String str2, String str3, List list, boolean z, boolean z2) {
        this.A02 = str;
        this.A00 = gjW;
        this.A01 = c2612Gj1;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = list;
    }

    public String AeG() {
        return this.A02;
    }

    public Integer AeJ() {
        throw 0Q8.createAndThrow();
    }

    public boolean BTL() {
        return false;
    }

    public boolean BXH() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (X.11T.A0O(((X.C2645Gjz) r302).A02, r301.A02) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.C2645Gjz
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r302
            X.Gjz r0 = (X.C2645Gjz) r0
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.A02
            r304 = r0
            r0 = r301
            java.lang.String r0 = r0.A02
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L2d
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L2d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2645Gjz.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return this.A02.hashCode();
    }
}
