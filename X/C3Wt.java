package X;

import android.graphics.Bitmap;

/* renamed from: X.3Wt, reason: invalid class name */
/* loaded from: 3Wt.class */
public final class C3Wt implements 2EW {
    public final int A00;
    public final Object A01;

    public C3Wt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void Cci(Object obj) {
        int byteCount;
        if (this.A00 != 0) {
            ((2Gx) this.A01).A01.Cci(obj);
            return;
        }
        Bitmap bitmap = (Bitmap) obj;
        try {
            2H1 r0 = (2H1) this.A01;
            synchronized (r0) {
                if (bitmap == null) {
                    byteCount = 0;
                } else {
                    try {
                        byteCount = bitmap.getAllocationByteCount();
                    } catch (NullPointerException unused) {
                        byteCount = bitmap.getByteCount();
                    }
                }
                C0By.A05(AnonymousClass001.A1P(r0.A00), "No bitmaps registered.");
                long j = byteCount;
                long j2 = r0.A01;
                boolean z = false;
                if (j <= j2) {
                    z = true;
                }
                C0By.A07(z, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(byteCount), Long.valueOf(j2));
                r0.A01 -= j;
                r0.A00--;
            }
        } finally {
            bitmap.recycle();
        }
    }
}
