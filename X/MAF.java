package X;

import java.util.Arrays;

/* loaded from: MAF.class */
public final class MAF extends M9i implements 5Yu {
    public static final MAF A00 = new MAF();

    public MAF() {
        super(LvE.A01);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C0rn) obj).A00.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.MA3, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        short[] sArr = ((C0rn) obj).A00;
        ?? obj2 = new Object();
        obj2.A01 = sArr;
        int length = sArr.length;
        obj2.A00 = length;
        if (length < 10) {
            short[] copyOf = Arrays.copyOf(sArr, M9i.A00(length));
            11T.A0A(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ void A03(Object obj, 5Z6 r303, int i, boolean z) {
        MA3 ma3 = (MA3) obj;
        4YV.A1N(r303, ma3);
        short AMD = r303.AM2(this.A00, i).AMD();
        int A002 = ma3.A00() + 1;
        short[] sArr = ma3.A01;
        int length = sArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            sArr = Arrays.copyOf(sArr, A002);
            11T.A0A(sArr);
            ma3.A01 = sArr;
        }
        int i3 = ma3.A00;
        ma3.A00 = i3 + 1;
        sArr[i3] = AMD;
    }
}
