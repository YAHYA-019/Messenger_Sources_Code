package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.SparseArray;

/* loaded from: F3m.class */
public abstract class F3m {
    public static final SparseArray A00 = DKC.A0E();
    public static final C03v A01 = new C03v(2);

    public static int[] A00(Typeface typeface, int i) {
        int[] iArr;
        int A03 = 1BK.A03(typeface, i * 31);
        SparseArray sparseArray = A00;
        synchronized (sparseArray) {
            iArr = (int[]) sparseArray.get(A03);
        }
        if (iArr != null) {
            return iArr;
        }
        C03v c03v = A01;
        El2 el2 = (El2) c03v.A3p();
        if (el2 == null) {
            el2 = new El2();
        }
        Paint paint = el2.A01;
        Rect rect = el2.A02;
        Paint.FontMetricsInt fontMetricsInt = el2.A00;
        paint.setTextSize(i);
        paint.setTypeface(typeface);
        paint.getFontMetricsInt(fontMetricsInt);
        paint.getTextBounds("T", 0, 1, rect);
        int height = rect.height();
        int[] iArr2 = {height, (-fontMetricsInt.ascent) - height, fontMetricsInt.descent};
        c03v.Ccj(el2);
        synchronized (sparseArray) {
            sparseArray.put(A03, iArr2);
        }
        return iArr2;
    }
}
