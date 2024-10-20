package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: L9e.class */
public abstract class L9e {
    public static final ThreadLocal A02 = new Lxh();
    public static final ThreadLocal A03 = new Lxi();
    public static final ThreadLocal A04 = new Lxj();
    public static final ThreadLocal A00 = new Lxk();
    public static final float A01 = (float) (Math.sqrt(2.0d) / 2.0d);

    public static float A00(Matrix matrix) {
        float[] fArr = (float[]) A00.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = A01;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void A01(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) A02.get();
        Path path2 = (Path) A03.get();
        Path path3 = (Path) A04.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && DKC.A01(f2 - f, 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float min = Math.min(f4, f5);
            float max = Math.max(f4, f5);
            float f6 = f3 * length;
            float f7 = min + f6;
            float f8 = max + f6;
            if (f7 >= length && f8 >= length) {
                f7 = L9W.A00(f7, length);
                f8 = L9W.A00(f8, length);
            }
            if (f7 < 0.0f) {
                f7 = L9W.A00(f7, length);
            }
            if (f8 < 0.0f) {
                f8 = L9W.A00(f8, length);
            }
            if (f7 == f8) {
                path.reset();
                return;
            }
            if (f7 >= f8) {
                f7 -= length;
            }
            path2.reset();
            pathMeasure.getSegment(f7, f8, path2, true);
            if (f8 <= length) {
                if (f7 < 0.0f) {
                    path3.reset();
                    pathMeasure.getSegment(f7 + length, length, path3, true);
                }
                path.set(path2);
            }
            path3.reset();
            pathMeasure.getSegment(0.0f, f8 % length, path3, true);
            path2.addPath(path3);
            path.set(path2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        throw r301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0007: THROW (r0 I:java.lang.Throwable), block:B:7:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(java.io.Closeable r301) {
        /*
            r0 = r301
            r0.close()     // Catch: java.lang.RuntimeException -> L7 java.lang.Exception -> L8
        L6:
            return
        L7:
            throw r0
        L8:
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9e.A02(java.io.Closeable):void");
    }
}
