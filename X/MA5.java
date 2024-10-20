package X;

import java.util.Arrays;

/* loaded from: MA5.class */
public final class MA5 extends M9i implements 5Yu {
    public static final MA5 A00 = new MA5();

    public MA5() {
        super(Lv4.A00);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        byte[] bArr = (byte[]) obj;
        11T.A0F(bArr, 0);
        return bArr.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.M9t] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        byte[] bArr = (byte[]) obj;
        11T.A0F(bArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = bArr;
        int length = bArr.length;
        obj2.A00 = length;
        if (length < 10) {
            byte[] copyOf = Arrays.copyOf(bArr, M9i.A00(length));
            11T.A0A(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ void A03(Object obj, 5Z6 r303, int i, boolean z) {
        M9t m9t = (M9t) obj;
        4YV.A1N(r303, m9t);
        byte ALp = r303.ALp(this.A00, i);
        int A002 = m9t.A00() + 1;
        byte[] bArr = m9t.A01;
        int length = bArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            bArr = Arrays.copyOf(bArr, A002);
            11T.A0A(bArr);
            m9t.A01 = bArr;
        }
        int i3 = m9t.A00;
        m9t.A00 = i3 + 1;
        bArr[i3] = ALp;
    }
}
