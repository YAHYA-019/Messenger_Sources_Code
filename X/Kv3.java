package X;

import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: Kv3.class */
public abstract class Kv3 {
    public static final float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return L5a.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static final float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return L5a.A01(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
