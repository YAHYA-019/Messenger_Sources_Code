package X;

import java.util.Arrays;

/* renamed from: X.Jd0, reason: case insensitive filesystem */
/* loaded from: Jd0.class */
public final class C2912Jd0 extends L7f {
    public final C2910Jcy A00;
    public final C2910Jcy A01;
    public final float[] A02;

    public C2912Jd0(C2910Jcy c2910Jcy, C2910Jcy c2910Jcy2) {
        super(c2910Jcy, c2910Jcy2, c2910Jcy, c2910Jcy2);
        float[] A03;
        this.A01 = c2910Jcy;
        this.A00 = c2910Jcy2;
        Kty kty = c2910Jcy.A07;
        Kty kty2 = c2910Jcy2.A07;
        if (LBe.A01(kty, kty2)) {
            A03 = LBe.A03(c2910Jcy2.A09, c2910Jcy.A0B);
        } else {
            float[] fArr = c2910Jcy.A0B;
            float[] fArr2 = c2910Jcy2.A09;
            float[] A00 = kty.A00();
            float[] A002 = kty2.A00();
            Kty kty3 = Kcy.A01;
            if (!LBe.A01(kty, kty3)) {
                float[] fArr3 = N23.A01.A00;
                float[] copyOf = Arrays.copyOf(Kcy.A04, 3);
                11T.A0A(copyOf);
                fArr = LBe.A03(LBe.A04(fArr3, A00, copyOf), fArr);
            }
            if (!LBe.A01(kty2, kty3)) {
                float[] fArr4 = N23.A01.A00;
                float[] copyOf2 = Arrays.copyOf(Kcy.A04, 3);
                11T.A0A(copyOf2);
                fArr2 = LBe.A02(LBe.A03(LBe.A04(fArr4, A002, copyOf2), c2910Jcy2.A0B));
            }
            A03 = LBe.A03(fArr2, fArr);
        }
        this.A02 = A03;
    }
}
