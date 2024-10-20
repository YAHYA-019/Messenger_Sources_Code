package X;

import android.graphics.Bitmap;
import java.util.Vector;

/* loaded from: L40.class */
public final class L40 {
    public static final Vector A02 = new Vector();
    public int A00;
    public final Object[] A01;

    public L40(int i) {
        this.A01 = new Object[i];
        A02.add(this);
    }

    public Object A00() {
        synchronized (this) {
            int i = this.A00;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.A01;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.A00 = i2;
            return obj;
        }
    }

    public void A01() {
        synchronized (this) {
            Object[] objArr = this.A01;
            int length = objArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj != null && (obj instanceof Bitmap)) {
                        ((Bitmap) obj).recycle();
                    }
                    objArr[i2] = null;
                    i = i2 + 1;
                } else {
                    this.A00 = 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r0 = r301.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r0 >= r0.length) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r0[r0] = r302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r301.A00 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L6:
            r0 = r301
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L4f
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 >= r1) goto L2b
            r0 = r301
            java.lang.Object[] r0 = r0.A01     // Catch: java.lang.Throwable -> L4f
            r306 = r0
            r0 = r306
            r1 = r303
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L4f
            r306 = r0
            r0 = r306
            r1 = r302
            if (r0 == r1) goto L4c
            r0 = r303
            r1 = 1
            int r0 = r0 + r1
            r303 = r0
            goto L6
        L2b:
            r0 = r301
            java.lang.Object[] r0 = r0.A01     // Catch: java.lang.Throwable -> L4f
            r304 = r0
            r0 = r304
            int r0 = r0.length     // Catch: java.lang.Throwable -> L4f
            r307 = r0
            r0 = r305
            r1 = r307
            if (r0 >= r1) goto L4c
            r0 = r304
            r1 = r305
            r2 = r302
            r0[r1] = r2     // Catch: java.lang.Throwable -> L4f
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A00 = r1     // Catch: java.lang.Throwable -> L4f
        L4c:
            r0 = r301
            monitor-exit(r0)
            return
        L4f:
            r306 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r306
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L40.A02(java.lang.Object):void");
    }
}
