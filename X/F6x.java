package X;

import android.content.Context;
import android.os.Bundle;
import java.util.NoSuchElementException;

/* loaded from: F6x.class */
public final class F6x {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        if (r314 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.FYu A00(android.content.Context r301, X.FZn r302, X.GLc r303, X.GJ1 r304, java.lang.Integer r305) {
        /*
            r0 = r304
            r306 = r0
            r0 = r304
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = 3
            r307 = r0
            r0 = r301
            r308 = r0
            r0 = r301
            boolean r0 = r0 instanceof android.app.Activity
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L36
            r0 = r301
            r310 = r0
            r0 = r301
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.View r0 = X.DKD.A0B(r0)
            r311 = r0
            r0 = 2131367929(0x7f0a17f9, float:1.8355794E38)
            r312 = r0
            java.lang.String r0 = "app_root_window"
            r310 = r0
            r0 = r311
            r1 = r312
            r2 = r310
            r0.setTag(r1, r2)
        L36:
            r0 = r302
            r313 = r0
            r0 = r302
            android.util.SparseArray r0 = r0.A01
            r310 = r0
            r0 = 0
            r311 = r0
            r0 = r310
            if (r0 == 0) goto L53
            r0 = r310
            android.util.SparseArray r0 = r0.clone()
            r314 = r0
            r0 = r314
            if (r0 != 0) goto L5f
        L53:
            android.util.SparseArray r0 = new android.util.SparseArray
            r314 = r0
            r0 = r314
            r1 = r307
            r0.<init>(r1)
        L5f:
            r0 = r302
            java.lang.String r0 = r0.A06
            r310 = r0
            r0 = r314
            r1 = 2131362417(0x7f0a0271, float:1.8344614E38)
            r2 = r310
            r0.put(r1, r2)
            r0 = 2131362452(0x7f0a0294, float:1.8344685E38)
            r309 = r0
            r0 = r314
            r1 = r309
            r2 = r303
            r0.put(r1, r2)
            r0 = 2131362453(0x7f0a0295, float:1.8344687E38)
            r312 = r0
            r0 = r302
            X.GHQ r0 = r0.A02
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L99
            r0 = r310
            int r0 = r0.B97()
            r309 = r0
            r0 = r309
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r311 = r0
        L99:
            r0 = r314
            r1 = r312
            r2 = r311
            r0.put(r1, r2)
            X.FYu r0 = new X.FYu
            r315 = r0
            r0 = r305
            r301 = r0
            r0 = r315
            r1 = r308
            r2 = r314
            r3 = r313
            r4 = r306
            r5 = r305
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r303
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r1 = r315
            r0.addObserver(r1)
            r0 = r315
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F6x.A00(android.content.Context, X.FZn, X.GLc, X.GJ1, java.lang.Integer):X.FYu");
    }

    public final FYu A01(Context context, Bundle bundle, GLc gLc, GJ1 gj1) {
        int i;
        try {
            int i2 = bundle.getInt("bloks_screen_navigation_state", 0);
            Integer[] A1a = DKD.A1a();
            int length = A1a.length;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= length) {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                Integer num = A1a[i4];
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == i2) {
                    return A00(context, FZn.A0B.A01(bundle), gLc, gj1, num);
                }
                i3 = i4 + 1;
            }
        } catch (ERL e) {
            Bundle bundle2 = bundle.getBundle("key_screen_container_props_bundle");
            FGT.A00((FyG) null, "ScreenContainerDelegate", 0Pz.A0W("Failed to properly initialize screen props for screen with appId: ", bundle2 != null ? bundle2.getString("key_app_id") : null), e);
            throw e;
        }
    }
}
