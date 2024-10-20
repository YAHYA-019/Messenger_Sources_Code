package X;

/* loaded from: MAD.class */
public final class MAD extends M9i implements 5Yu {
    public static final MAD A00 = new MAD();

    public MAD() {
        super(LvC.A01);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C0ri) obj).A00.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.MA1, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        int[] iArr = ((C0ri) obj).A00;
        ?? obj2 = new Object();
        obj2.A01 = iArr;
        int length = iArr.length;
        obj2.A00 = length;
        if (length < 10) {
            obj2.A01 = JQz.A1a(iArr, M9i.A00(length));
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ void A03(Object obj, 5Z6 r303, int i, boolean z) {
        MA1 ma1 = (MA1) obj;
        4YV.A1N(r303, ma1);
        int AM3 = r303.AM2(this.A00, i).AM3();
        int A002 = ma1.A00() + 1;
        int[] iArr = ma1.A01;
        int length = iArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            iArr = JQz.A1a(iArr, A002);
            ma1.A01 = iArr;
        }
        int i3 = ma1.A00;
        ma1.A00 = i3 + 1;
        iArr[i3] = AM3;
    }
}
