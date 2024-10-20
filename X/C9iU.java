package X;

import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.9iU, reason: invalid class name */
/* loaded from: 9iU.class */
public abstract class C9iU {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r304 != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.drawable.RippleDrawable A00(X.C5ye r301, com.facebook.mig.scheme.interfaces.MigColorScheme r302, com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo r303) {
        /*
            r0 = r301
            r1 = r302
            X.4YV.A1N(r0, r1)
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r303
            int r0 = r0.A0O
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L22
        L12:
            r0 = r302
            int r0 = r0.B9e()
            r305 = r0
            r0 = 0
            r1 = r304
            r2 = r305
            android.graphics.drawable.RippleDrawable r0 = X.7zN.A07(r0, r1, r2)
            return r0
        L22:
            r0 = r302
            int r0 = r0.AYp()
            r304 = r0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9iU.A00(X.5ye, com.facebook.mig.scheme.interfaces.MigColorScheme, com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo):android.graphics.drawable.RippleDrawable");
    }

    public static final RippleDrawable A01(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 0);
        return 7zN.A07(0.0f, C2qb.A00(migColorScheme, migColorScheme.AYp()), migColorScheme.B9e());
    }

    public static final void A02(View view) {
        view.setElevation(7zL.A01(view.getResources(), R.dimen.mapbox_four_dp));
        view.setOutlineProvider(C5B1.A00());
    }
}
