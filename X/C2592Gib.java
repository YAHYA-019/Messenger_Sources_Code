package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* renamed from: X.Gib, reason: case insensitive filesystem */
/* loaded from: Gib.class */
public final class C2592Gib extends 5bO {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final InterfaceC04494b5 A04;

    public C2592Gib() {
        this(20, 4.0f, 1291845632);
    }

    public C2592Gib(int i, float f, int i2) {
        this.A01 = i;
        this.A00 = f;
        this.A02 = i2;
        this.A03 = GOo.A0B();
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("tintblur:radius=");
        A0k.append(i);
        A0k.append(":downscale=");
        A0k.append(f);
        this.A04 = new 4bD(A0k.toString());
    }

    public InterfaceC04494b5 B43() {
        return this.A04;
    }

    public 2EU CZ2(Bitmap bitmap, 2DX r303) {
        1BK.A1M(bitmap, r303);
        float width = bitmap.getWidth();
        float f = this.A00;
        2EU A03 = r303.A03((int) (width / f), (int) (bitmap.getHeight() / f));
        try {
            Bitmap A0C = 7zL.A0C(A03);
            Canvas canvas = new Canvas(A0C);
            Rect rect = new Rect(0, 0, A0C.getWidth(), A0C.getHeight());
            Paint paint = this.A03;
            paint.setColorFilter(new PorterDuffColorFilter(this.A02, PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            NativeBlurFilter.iterativeBoxBlur(A0C, 2, this.A01);
            2EU A07 = A03.A07();
            11T.A0D(A07);
            A03.close();
            return A07;
        } catch (Throwable th) {
            2EU.A04(A03);
            throw th;
        }
    }

    public String getName() {
        return "TintAndBlurPostprocessor";
    }
}
