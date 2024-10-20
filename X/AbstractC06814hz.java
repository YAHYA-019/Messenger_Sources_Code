package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

/* renamed from: X.4hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hz.class */
public abstract class AbstractC06814hz {
    public static final boolean A00(2EU r301, C03183xW c03183xW) {
        if (c03183xW == null || r301 == null) {
            return false;
        }
        Bitmap bitmap = (Bitmap) r301.A09();
        bitmap.setHasAlpha(true);
        boolean z = c03183xW.A01;
        boolean z2 = c03183xW.A00;
        if (z) {
            NativeRoundingFilter.toCircleFast(bitmap, z2);
            return true;
        }
        NativeRoundingFilter.toCircle(bitmap, z2);
        return true;
    }
}
