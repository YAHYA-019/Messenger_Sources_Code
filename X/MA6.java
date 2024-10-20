package X;

import java.util.Arrays;

/* loaded from: MA6.class */
public final class MA6 extends M9i implements 5Yu {
    public static final MA6 A00 = new MA6();

    public MA6() {
        super(Lv5.A00);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        char[] cArr = (char[]) obj;
        11T.A0F(cArr, 0);
        return cArr.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.M9u] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        char[] cArr = (char[]) obj;
        11T.A0F(cArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = cArr;
        int length = cArr.length;
        obj2.A00 = length;
        if (length < 10) {
            char[] copyOf = Arrays.copyOf(cArr, M9i.A00(length));
            11T.A0A(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ void A03(Object obj, 5Z6 r303, int i, boolean z) {
        M9u m9u = (M9u) obj;
        4YV.A1N(r303, m9u);
        char ALr = r303.ALr(this.A00, i);
        int A002 = m9u.A00() + 1;
        char[] cArr = m9u.A01;
        int length = cArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            cArr = Arrays.copyOf(cArr, A002);
            11T.A0A(cArr);
            m9u.A01 = cArr;
        }
        int i3 = m9u.A00;
        m9u.A00 = i3 + 1;
        cArr[i3] = ALr;
    }
}
