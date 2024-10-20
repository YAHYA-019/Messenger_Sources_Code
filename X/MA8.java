package X;

import java.util.Arrays;

/* loaded from: MA8.class */
public final class MA8 extends M9i implements 5Yu {
    public static final MA8 A00 = new MA8();

    public MA8() {
        super(Lv7.A00);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        float[] fArr = (float[]) obj;
        11T.A0F(fArr, 0);
        return fArr.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.M9w] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        float[] fArr = (float[]) obj;
        11T.A0F(fArr, 0);
        ?? obj2 = new Object();
        obj2.A01 = fArr;
        int length = fArr.length;
        obj2.A00 = length;
        if (length < 10) {
            float[] copyOf = Arrays.copyOf(fArr, M9i.A00(length));
            11T.A0A(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ void A03(Object obj, 5Z6 r303, int i, boolean z) {
        M9w m9w = (M9w) obj;
        4YV.A1N(r303, m9w);
        float ALx = r303.ALx(this.A00, i);
        int A002 = m9w.A00() + 1;
        float[] fArr = m9w.A01;
        int length = fArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            fArr = Arrays.copyOf(fArr, A002);
            11T.A0A(fArr);
            m9w.A01 = fArr;
        }
        int i3 = m9w.A00;
        m9w.A00 = i3 + 1;
        fArr[i3] = ALx;
    }
}
