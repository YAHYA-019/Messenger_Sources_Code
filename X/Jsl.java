package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: Jsl.class */
public final class Jsl extends 6OU implements 6OY {
    public int A00;
    public final LWB A01;
    public final float A02;
    public final float A03;
    public final Matrix A04;
    public final Paint A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jsl(5IW r302, 6OQ r303) {
        super(r302, r303);
        6OQ r0;
        int[] iArr;
        11T.A0F(r303, 1);
        LWB lwb = r302.A0Q;
        if (lwb == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = lwb;
        this.A05 = DKC.A0A(1);
        Matrix A0F = GOn.A0F();
        this.A04 = A0F;
        try {
            r0 = ((6OU) this).A0B;
            iArr = this.A01.A01;
        } catch (54H unused) {
        }
        if (iArr == null) {
            11T.A0L("bitmapIndices");
            throw 0Q8.createAndThrow();
        }
        5Ir A02 = r0.A02(iArr[this.A00]);
        if (A02 != null) {
            11T.A0A(A02.A00);
            float width = A02.A01.A01 / r0.getWidth();
            this.A02 = width;
            float height = A02.A01.A00 / r0.getHeight();
            this.A03 = height;
            A0F.preScale(width, height);
            return;
        }
        throw AnonymousClass001.A0N("Required value was null.");
    }

    private final Bitmap A00() {
        5Ir r303;
        6OQ r0;
        int[] iArr;
        try {
            r0 = ((6OU) this).A0B;
            iArr = this.A01.A01;
        } catch (54H unused) {
            r303 = null;
        }
        if (iArr == null) {
            11T.A0L("bitmapIndices");
            throw 0Q8.createAndThrow();
        }
        r303 = r0.A02(iArr[this.A00]);
        if (r303 == null) {
            return null;
        }
        Bitmap bitmap = r303.A00;
        11T.A0A(bitmap);
        if (bitmap.isRecycled()) {
            return null;
        }
        return bitmap;
    }

    public void A08() {
        super.A08();
        Matrix matrix = this.A04;
        matrix.reset();
        float f = this.A02;
        float f2 = ((6OU) this).A0B.A00;
        matrix.preScale(f * f2, this.A03 * f2);
    }

    public void A0A(float f) {
        this.A05.setAlpha(((6OU) this).A01);
        float f2 = ((6OU) this).A0B.A0E.A00 * (f - ((6OU) this).A04.A07);
        LWB lwb = this.A01;
        int i = (int) (lwb.A00 * f2);
        this.A00 = i;
        int[] iArr = lwb.A01;
        if (iArr == null) {
            11T.A0L("bitmapIndices");
            throw 0Q8.createAndThrow();
        }
        int length = iArr.length - 1;
        if (i > length) {
            i = length;
        }
        this.A00 = i;
        if (i < 0) {
            i = 0;
        }
        this.A00 = i;
    }

    public void A0B(Canvas canvas) {
        Bitmap A00 = A00();
        if (A00 != null) {
            canvas.drawBitmap(A00, this.A04, this.A05);
        }
    }

    public void A0F(RectF rectF) {
        11T.A0F(rectF, 0);
        Bitmap A00 = A00();
        if (A00 != null) {
            float width = A00.getWidth();
            6OQ r0 = ((6OU) this).A0B;
            rectF.set(0.0f, 0.0f, width * r0.A00 * this.A02, A00.getHeight() * r0.A00 * this.A03);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }
}
