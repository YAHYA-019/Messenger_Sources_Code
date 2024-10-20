package X;

import java.util.Arrays;

/* loaded from: MA7.class */
public final class MA7 extends M9i implements 5Yu {
    public static final MA7 A00 = new MA7();

    public MA7() {
        super(Lv6.A00);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        double[] dArr = (double[]) obj;
        11T.A0F(dArr, 0);
        return dArr.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.M9v] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        double[] dArr = (double[]) obj;
        11T.A0F(dArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = dArr;
        int length = dArr.length;
        obj2.A00 = length;
        if (length < 10) {
            double[] copyOf = Arrays.copyOf(dArr, M9i.A00(length));
            11T.A0A(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ void A03(Object obj, 5Z6 r303, int i, boolean z) {
        M9v m9v = (M9v) obj;
        4YV.A1N(r303, m9v);
        double ALt = r303.ALt(this.A00, i);
        int A002 = m9v.A00() + 1;
        double[] dArr = m9v.A01;
        int length = dArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            dArr = Arrays.copyOf(dArr, A002);
            11T.A0A(dArr);
            m9v.A01 = dArr;
        }
        int i3 = m9v.A00;
        m9v.A00 = i3 + 1;
        dArr[i3] = ALt;
    }
}
