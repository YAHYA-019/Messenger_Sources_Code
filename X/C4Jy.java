package X;

/* renamed from: X.4Jy, reason: invalid class name */
/* loaded from: 4Jy.class */
public abstract class C4Jy {
    public final C4Jd A00;

    public C4Jy(C4Jd c4Jd) {
        this.A00 = c4Jd;
    }

    public int A00() {
        if (this instanceof C4K0) {
            return 9;
        }
        if ((this instanceof C4K2) || (this instanceof C4K3) || (this instanceof C4K4) || (this instanceof C4K1)) {
            return 7;
        }
        return this instanceof C4Jz ? 5 : 6;
    }

    public boolean A01(C4Kf c4Kf) {
        Integer num;
        Integer num2;
        boolean z;
        if (this instanceof C4K0) {
            z = c4Kf.A0B.A07;
        } else {
            if (this instanceof C4K3) {
                num = c4Kf.A0B.A02;
                num2 = 0S2.A0N;
            } else if (this instanceof C4K4) {
                num = c4Kf.A0B.A02;
                num2 = 0S2.A0Y;
            } else {
                if (!(this instanceof C4K1)) {
                    return this instanceof C4Jz ? c4Kf.A0B.A04 : c4Kf.A0B.A05;
                }
                num = c4Kf.A0B.A02;
                num2 = 0S2.A01;
            }
            z = false;
            if (num == num2) {
                return true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r303 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r0.A01 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 183
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Jy.A02(java.lang.Object):boolean");
    }
}
