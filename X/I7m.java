package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* loaded from: I7m.class */
public final class I7m {
    public int A00;
    public int A01;
    public int A02;
    public I9C A03;
    public RUM A04;
    public Qy2[] A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public 2DX A0A;
    public final float[] A0B;

    public I7m() {
        this(GOp.A0H());
    }

    public I7m(2DX r302) {
        this.A0A = r302;
        this.A04 = new RUM();
        this.A0B = new float[96];
        this.A05 = new Qy2[96];
        this.A08 = 0.0f;
        this.A07 = 0.0f;
        this.A02 = -1;
        this.A09 = 0;
        this.A06 = 0.0f;
        this.A01 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v201, types: [java.lang.Object, X.Qy2] */
    public static void A00(Typeface typeface, I7m i7m, int i) {
        float[] fArr;
        int i2;
        Paint A09 = DKC.A09();
        A09.setAntiAlias(true);
        A09.setTextSize(i);
        A09.setColor(-1);
        A09.setTypeface(typeface);
        Paint.FontMetrics fontMetrics = A09.getFontMetrics();
        i7m.A08 = (float) Math.ceil(Math.abs(fontMetrics.bottom) + Math.abs(fontMetrics.top));
        i7m.A07 = (float) Math.ceil(Math.abs(fontMetrics.descent));
        char[] cArr = new char[2];
        i7m.A06 = 0.0f;
        float[] fArr2 = new float[2];
        int i3 = 0;
        char c = ' ';
        int i4 = 0;
        do {
            cArr[0] = c;
            A09.getTextWidths(cArr, 0, 1, fArr2);
            fArr = i7m.A0B;
            float f = fArr2[0];
            fArr[i4] = f;
            if (f > i7m.A06) {
                i7m.A06 = f;
            }
            i4++;
            c = (char) (c + 1);
        } while (c <= '~');
        cArr[0] = ' ';
        A09.getTextWidths(cArr, 0, 1, fArr2);
        float f2 = fArr2[0];
        fArr[i4] = f2;
        float f3 = i7m.A06;
        if (f2 > f3) {
            i7m.A06 = f2;
            f3 = f2;
        }
        float f4 = i7m.A08;
        int i5 = (int) f3;
        i7m.A01 = i5;
        int i6 = (int) f4;
        i7m.A00 = i6;
        if (i5 <= i6) {
            i5 = i6;
        }
        if (i5 < 6 || i5 > 180) {
            return;
        }
        if (i5 <= 24) {
            i2 = 256;
        } else if (i5 <= 40) {
            i2 = 512;
        } else {
            i2 = 2048;
            if (i5 <= 80) {
                i2 = 1024;
            }
        }
        i7m.A09 = i2;
        2EU A04 = i7m.A0A.A04(i2, i2);
        Bitmap bitmap = (Bitmap) A04.A09();
        Canvas canvas = new Canvas(bitmap);
        bitmap.eraseColor(0);
        float f5 = 0.0f;
        float f6 = ((i7m.A00 - 1) - i7m.A07) - 0.0f;
        float f7 = 0.0f;
        char c2 = ' ';
        do {
            cArr[0] = c2;
            canvas.drawText(cArr, 0, 1, f7, f6, A09);
            float f8 = i7m.A01;
            f7 += f8;
            if ((f7 + f8) - 0.0f > i7m.A09) {
                f6 += i7m.A00;
                f7 = 0.0f;
            }
            c2 = (char) (c2 + 1);
        } while (c2 <= '~');
        cArr[0] = ' ';
        canvas.drawText(cArr, 0, 1, f7, f6, A09);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i7 = iArr[0];
        i7m.A02 = i7;
        GLES20.glBindTexture(3553, i7);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glBindTexture(3553, 0);
        A04.close();
        float f9 = 0.0f;
        do {
            Qy2[] qy2Arr = i7m.A05;
            float f10 = i7m.A09;
            int i8 = i7m.A01;
            float f11 = i8 - 1;
            int i9 = i7m.A00;
            float f12 = i9 - 1;
            ?? obj = new Object();
            float f13 = f5 / f10;
            ((Qy2) obj).A00 = f13;
            float f14 = f9 / f10;
            ((Qy2) obj).A02 = f14;
            ((Qy2) obj).A01 = f13 + (f11 / f10);
            ((Qy2) obj).A03 = f14 + (f12 / f10);
            qy2Arr[i3] = obj;
            float f15 = i8;
            f5 += f15;
            if (f15 + f5 > f10) {
                f9 += i9;
                f5 = 0.0f;
            }
            i3++;
        } while (i3 < 96);
    }
}
