package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: F5l.class */
public final class F5l {
    public final ActivityManager A00;
    public final JNI A01;
    public final ETX A02;
    public volatile WeakHashMap A03 = new WeakHashMap(2);

    public F5l(Context context, ETX etx, JNI jni) {
        this.A01 = jni;
        this.A02 = etx;
        this.A00 = (ActivityManager) context.getSystemService("activity");
    }

    public static void A00(F5l f5l) {
        if (((C2051Daa) f5l.A02).A01.AZk(2342167351522250354L)) {
            Iterator A0x = AnonymousClass001.A0x(f5l.A03);
            while (A0x.hasNext()) {
                ((GFM) AnonymousClass001.A0z(A0x).getKey()).Ald();
            }
        }
    }
}
