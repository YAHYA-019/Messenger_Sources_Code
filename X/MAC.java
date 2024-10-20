package X;

import java.util.Arrays;

/* loaded from: MAC.class */
public final class MAC extends M9i implements 5Yu {
    public static final MAC A00 = new MAC();

    public MAC() {
        super(LvB.A01);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C0rg) obj).A00.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.MA0, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        byte[] bArr = ((C0rg) obj).A00;
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
        MA0 ma0 = (MA0) obj;
        4YV.A1N(r303, ma0);
        byte ALo = r303.AM2(this.A00, i).ALo();
        int A002 = ma0.A00() + 1;
        byte[] bArr = ma0.A01;
        int length = bArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            bArr = Arrays.copyOf(bArr, A002);
            11T.A0A(bArr);
            ma0.A01 = bArr;
        }
        int i3 = ma0.A00;
        ma0.A00 = i3 + 1;
        bArr[i3] = ALo;
    }
}
