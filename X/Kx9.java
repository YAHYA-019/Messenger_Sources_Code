package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* loaded from: Kx9.class */
public abstract class Kx9 {
    public static final ThreadLocal A00 = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(Paint paint, Integer num) {
        PorterDuff.Mode A002;
        PorterDuffXfermode porterDuffXfermode = null;
        if (Build.VERSION.SDK_INT >= 29) {
            if (num != null) {
                porterDuffXfermode = KVD.A00(num);
            }
            KVF.A00(paint, porterDuffXfermode);
        } else {
            if (num != null && (A002 = KVE.A00(num)) != null) {
                porterDuffXfermode = new PorterDuffXfermode(A002);
            }
            paint.setXfermode(porterDuffXfermode);
        }
    }
}
