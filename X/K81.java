package X;

import android.view.View;

/* loaded from: K81.class */
public final class K81 extends KTH {
    public final 08D A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        if (r0 <= 0.5d) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public K81(android.view.View r302, X.08D r303) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r302
            int r0 = r0.getSystemUiVisibility()
            r1 = 8192(0x2000, float:1.148E-41)
            r0 = r0 & r1
            r304 = r0
            r0 = r304
            boolean r0 = X.AnonymousClass001.A1N(r0)
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A02 = r1
            r0 = r302
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.A02(r0)
            X.6Le r0 = r0.A0K
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L8b
            r0 = r306
            X.6Lm r0 = r0.A00
            android.content.res.ColorStateList r0 = r0.A0B
            r306 = r0
        L36:
            r0 = r306
            if (r0 == 0) goto L69
            r0 = r306
            int r0 = r0.getDefaultColor()
            r304 = r0
        L41:
            r0 = r304
            if (r0 == 0) goto L5e
            r0 = r304
            double r0 = X.1tG.A00(r0)
            r307 = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r309 = r0
            r0 = r307
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 > 0) goto L63
        L5e:
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
        L63:
            r0 = r301
            r1 = r304
            r0.A01 = r1
            return
        L69:
            r0 = r302
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r306 = r0
            r0 = r306
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L94
            r0 = r302
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            r306 = r0
            r0 = r306
            int r0 = r0.getColor()
            r304 = r0
            goto L41
        L8b:
            r0 = r302
            android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
            r306 = r0
            goto L36
        L94:
            r0 = r301
            r1 = r305
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K81.<init>(android.view.View, X.08D):void");
    }

    public static void A00(View view, K81 k81) {
        int paddingLeft;
        int i;
        int top = view.getTop();
        08D r0 = k81.A00;
        if (top < r0.A03()) {
            boolean z = k81.A01;
            int systemUiVisibility = view.getSystemUiVisibility();
            int i2 = systemUiVisibility & (-8193);
            if (z) {
                i2 = systemUiVisibility | 8192;
            }
            view.setSystemUiVisibility(i2);
            paddingLeft = view.getPaddingLeft();
            i = JQx.A0H(view, r0.A03());
        } else {
            if (view.getTop() == 0) {
                return;
            }
            boolean z2 = k81.A02;
            int systemUiVisibility2 = view.getSystemUiVisibility();
            int i3 = systemUiVisibility2 & (-8193);
            if (z2) {
                i3 = systemUiVisibility2 | 8192;
            }
            view.setSystemUiVisibility(i3);
            paddingLeft = view.getPaddingLeft();
            i = 0;
        }
        view.setPadding(paddingLeft, i, view.getPaddingRight(), view.getPaddingBottom());
    }
}
