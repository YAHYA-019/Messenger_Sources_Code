package X;

import java.util.Arrays;

/* loaded from: MAE.class */
public final class MAE extends M9i implements 5Yu {
    public static final MAE A00 = new MAE();

    public MAE() {
        super(LvD.A01);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C0rl) obj).A00.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.MA2, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        long[] jArr = ((C0rl) obj).A00;
        ?? obj2 = new Object();
        obj2.A01 = jArr;
        int length = jArr.length;
        obj2.A00 = length;
        if (length < 10) {
            long[] copyOf = Arrays.copyOf(jArr, M9i.A00(length));
            11T.A0A(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ void A03(Object obj, 5Z6 r303, int i, boolean z) {
        MA2 ma2 = (MA2) obj;
        4YV.A1N(r303, ma2);
        long AM6 = r303.AM2(this.A00, i).AM6();
        int A002 = ma2.A00() + 1;
        long[] jArr = ma2.A01;
        int length = jArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            jArr = Arrays.copyOf(jArr, A002);
            11T.A0A(jArr);
            ma2.A01 = jArr;
        }
        int i3 = ma2.A00;
        ma2.A00 = i3 + 1;
        jArr[i3] = AM6;
    }
}
