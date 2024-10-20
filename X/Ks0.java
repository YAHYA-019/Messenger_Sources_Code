package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: Ks0.class */
public class Ks0 {
    public int A00;
    public int A01;
    public int A02;
    public LBJ A05 = null;
    public LBJ A04 = null;
    public LBJ[] A06 = new LBJ[4];
    public Paint A07 = DKC.A0A(2);
    public int A03 = 0;
    public final Rect A08 = DKC.A0C();
    public final RectF A09 = DKC.A0D();

    public void A00(Canvas canvas, float f, float f2) {
        Bitmap A02;
        LBJ lbj = this.A05;
        Bitmap bitmap = null;
        Bitmap A022 = lbj != null ? lbj.A02() : null;
        Bitmap bitmap2 = LBJ.A0F;
        if (A022 != bitmap2) {
            if (A022 != null) {
                Paint paint = this.A07;
                paint.setAlpha(255);
                canvas.drawBitmap(A022, f, f2, paint);
                return;
            }
            Paint paint2 = this.A07;
            paint2.setAlpha(255);
            LBJ[] lbjArr = this.A06;
            int i = 0;
            int i2 = 0;
            do {
                LBJ lbj2 = lbjArr[i];
                if (lbj2 != null && lbj2.A04 == this.A02 + 1 && lbjArr[i].A02() != null) {
                    i2++;
                }
                i++;
            } while (i < 4);
            LBJ lbj3 = this.A04;
            if (lbj3 != null) {
                bitmap = lbj3.A02();
            }
            if (i2 != 4) {
                if (bitmap != null && bitmap != bitmap2) {
                    int i3 = this.A02;
                    LBJ lbj4 = this.A04;
                    int i4 = i3 - lbj4.A04;
                    int i5 = 1 << i4;
                    int i6 = lbj4.A00 >> i4;
                    int i7 = i5 - 1;
                    int i8 = (this.A00 & i7) * i6;
                    int i9 = (i7 & this.A01) * i6;
                    Rect rect = this.A08;
                    rect.set(i8, i9, i8 + i6, i6 + i9);
                    RectF rectF = this.A09;
                    LBJ lbj5 = this.A04;
                    rectF.set(f, f2, lbj5.A01 + f, lbj5.A00 + f2);
                    canvas.drawBitmap(bitmap, rect, rectF, paint2);
                }
                if (i2 <= 0) {
                    return;
                }
            }
            int i10 = 0;
            do {
                int i11 = 0;
                do {
                    LBJ lbj6 = lbjArr[(i10 << 1) + i11];
                    if (lbj6 != null && lbj6.A04 == this.A02 + 1 && (A02 = lbj6.A02()) != null && A02 != bitmap2) {
                        int i12 = lbj6.A00;
                        int i13 = i12 >> 1;
                        float f3 = (i13 * i10) + f;
                        float f4 = (i13 * i11) + f2;
                        Rect rect2 = this.A08;
                        rect2.set(0, 0, lbj6.A01, i12);
                        RectF rectF2 = this.A09;
                        float f5 = i13;
                        rectF2.set(f3, f4, f3 + f5, f5 + f4);
                        canvas.drawBitmap(A02, rect2, rectF2, paint2);
                    }
                    i11++;
                } while (i11 < 2);
                i10++;
            } while (i10 < 2);
        }
    }

    public String toString() {
        String str;
        StringBuilder A10 = JR1.A10(this);
        A10.append("{tile=");
        LBJ lbj = this.A05;
        str = "{x}";
        if (lbj == null) {
            lbj = str;
        }
        A10.append(lbj);
        A10.append(", mParentTile=");
        LBJ lbj2 = this.A04;
        A10.append(lbj2 != null ? lbj2 : "{x}");
        A10.append(", status=");
        return AbstractC2327GOs.A0W(A10, this.A03);
    }
}
