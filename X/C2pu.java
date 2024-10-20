package X;

/* renamed from: X.2pu, reason: invalid class name */
/* loaded from: 2pu.class */
public final class C2pu implements C2ot {
    public final C2ot[] A00;

    public C2pu(C2ot... c2otArr) {
        this.A00 = c2otArr;
    }

    @Override // X.C2ot
    public 1LI CfM(1Iw r302, Object obj, Object obj2) {
        1LI r305;
        11T.A0F(r302, 0);
        C2ot[] c2otArr = this.A00;
        int length = c2otArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            r305 = null;
            if (i2 >= length) {
                break;
            }
            C2ot c2ot = c2otArr[i2];
            if (c2ot != null) {
                r305 = c2ot.CfM(r302, obj, obj2);
                if (r305 != null) {
                    break;
                }
            }
            i = i2 + 1;
        }
        return r305;
    }
}
