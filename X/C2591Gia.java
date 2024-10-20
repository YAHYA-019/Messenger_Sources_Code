package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.Gia, reason: case insensitive filesystem */
/* loaded from: Gia.class */
public final class C2591Gia extends 5bO {
    public final int A00;
    public final InterfaceC04494b5 A01;

    public C2591Gia() {
        this(90);
    }

    public C2591Gia(int i) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("rotate:degrees=");
        A0k.append(this);
        this.A01 = new 4bD(AnonymousClass001.A0d(".rotationDegrees", A0k));
        this.A00 = i % 90 != 0 ? 0 : i;
    }

    public InterfaceC04494b5 B43() {
        return this.A01;
    }

    public 2EU CZ2(Bitmap bitmap, 2DX r303) {
        boolean A1X = 1BL.A1X(bitmap, r303);
        Matrix A0F = GOn.A0F();
        A0F.setRotate(this.A00);
        2EU A00 = 2DX.A00(bitmap, A0F, r303, 0, 0, bitmap.getWidth(), bitmap.getHeight(), A1X);
        try {
            2EU A07 = A00.A07();
            11T.A0D(A07);
            A00.close();
            return A07;
        } catch (Throwable th) {
            2EU.A04(A00);
            throw th;
        }
    }

    public String getName() {
        return "RotatePostprocessor";
    }
}
