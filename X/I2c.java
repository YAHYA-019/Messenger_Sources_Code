package X;

import java.util.List;

/* loaded from: I2c.class */
public final class I2c {
    public final int A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I2c() {
        /*
            r301 = this;
            X.0ty r0 = X.C0ty.A00
            r302 = r0
            r0 = r301
            r1 = r302
            r2 = r302
            r3 = r302
            r4 = r302
            r5 = r302
            r6 = r302
            r7 = r302
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I2c.<init>():void");
    }

    public I2c(List list, List list2, List list3, List list4, List list5, List list6, List list7, int i) {
        this.A00 = i;
        this.A02 = list;
        this.A05 = list2;
        this.A06 = list3;
        this.A01 = list4;
        this.A04 = list5;
        this.A07 = list6;
        this.A03 = list7;
    }

    public final boolean A00() {
        boolean z = true;
        if (!(!this.A02.isEmpty()) && !1BK.A1Y(this.A05) && !1BK.A1Y(this.A06) && !1BK.A1Y(this.A01) && !1BK.A1Y(this.A04) && !1BK.A1Y(this.A07) && !1BK.A1Y(this.A03)) {
            z = false;
        }
        return z;
    }
}
