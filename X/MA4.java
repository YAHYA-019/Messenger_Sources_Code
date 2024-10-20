package X;

import java.util.Arrays;

/* loaded from: MA4.class */
public final class MA4 extends M9i implements 5Yu {
    public static final MA4 A00 = new MA4();

    public MA4() {
        super(Lv3.A00);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        11T.A0F(zArr, 0);
        return zArr.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.M9s] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        11T.A0F(zArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = zArr;
        int length = zArr.length;
        obj2.A00 = length;
        if (length < 10) {
            boolean[] copyOf = Arrays.copyOf(zArr, M9i.A00(length));
            11T.A0A(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ void A03(Object obj, 5Z6 r303, int i, boolean z) {
        M9s m9s = (M9s) obj;
        4YV.A1N(r303, m9s);
        boolean ALn = r303.ALn(this.A00, i);
        int A002 = m9s.A00() + 1;
        boolean[] zArr = m9s.A01;
        int length = zArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            zArr = Arrays.copyOf(zArr, A002);
            11T.A0A(zArr);
            m9s.A01 = zArr;
        }
        int i3 = m9s.A00;
        m9s.A00 = i3 + 1;
        zArr[i3] = ALn;
    }
}
