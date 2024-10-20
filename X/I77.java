package X;

import android.graphics.RectF;

/* loaded from: I77.class */
public final class I77 {
    public static final RectF A01 = GOq.A0M();
    public final C4yx A00;

    public I77() {
        C4yx c4yx = (C4yx) 1Bn.A0A(116144);
        11T.A0F(c4yx, 1);
        this.A00 = c4yx;
    }

    public static final HYr A00(I77 i77, HkO hkO, int i, int i2) {
        C4yx c4yx = i77.A00;
        RectF rectF = A01;
        7Xn r0 = 7Xn.A03;
        c4yx.A02(rectF, hkO, r0, null, 1BK.A0b(), 0.0f, 0, false);
        return HLZ.A00(hkO, c4yx.A02(rectF, hkO, r0, null, 1BK.A0b(), 0.0f, 0, false).A00(), i, i2);
    }
}
