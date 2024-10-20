package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: L6v.class */
public abstract class L6v {
    public static final Path A00 = DKC.A0B();
    public static final Matrix A01 = GOn.A0F();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x01c0, code lost:
    
        if (r333 > 7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01f4, code lost:
    
        if (r333 > 7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0220, code lost:
    
        if (r333 < (r0 - 7.0f)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0273, code lost:
    
        if (r0 >= ((r0 + 9.0f) / 2.0f)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02b7, code lost:
    
        if (r0 >= ((r0 + 9.0f) / 2.0f)) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Bitmap A00(X.KqN r301, int r302, int r303) {
        /*
            Method dump skipped, instructions count: 3453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L6v.A00(X.KqN, int, int):android.graphics.Bitmap");
    }

    public static final void A01(Canvas canvas, Paint paint, RectF rectF, float f) {
        Matrix matrix = A01;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.postScale(rectF.width() / f, rectF.height() / f, rectF.left, rectF.top);
        Path path = A00;
        path.transform(matrix);
        canvas.drawPath(path, paint);
    }
}
