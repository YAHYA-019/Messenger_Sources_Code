package X;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;

/* loaded from: Ilr.class */
public final class Ilr implements JJQ {
    public final int A00;
    public final Object A01;

    public Ilr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BM3(Throwable th) {
        if (this.A00 == 0) {
            ((Function1) this.A01).invoke(null);
        } else {
            0fH.A14("ImageFetcher", " Fail to fetch image.", new Object[]{th != null ? th.toString() : null});
            ((0DR) this.A01).resumeWith((Object) null);
        }
    }

    public void BMj(Bitmap bitmap, 2EU r303, String str) {
        if (this.A00 != 0) {
            ((0DR) this.A01).resumeWith(new C2636Gjo(bitmap, r303, str));
        } else {
            7zL.A1T(this.A01, bitmap);
        }
    }
}
