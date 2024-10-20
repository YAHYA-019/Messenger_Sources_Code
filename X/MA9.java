package X;

/* loaded from: MA9.class */
public final class MA9 extends M9i implements 5Yu {
    public static final MA9 A00 = new MA9();

    public MA9() {
        super(Lv8.A00);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        int[] iArr = (int[]) obj;
        11T.A0F(iArr, 0);
        return iArr.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.M9x, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        int[] iArr = (int[]) obj;
        11T.A0F(iArr, 0);
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
        M9x m9x = (M9x) obj;
        4YV.A1N(r303, m9x);
        int AM4 = r303.AM4(this.A00, i);
        int A002 = m9x.A00() + 1;
        int[] iArr = m9x.A01;
        int length = iArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            iArr = JQz.A1a(iArr, A002);
            m9x.A01 = iArr;
        }
        int i3 = m9x.A00;
        m9x.A00 = i3 + 1;
        iArr[i3] = AM4;
    }
}
