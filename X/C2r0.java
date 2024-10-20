package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.2r0, reason: invalid class name */
/* loaded from: 2r0.class */
public final class C2r0 {
    public static void A00(Context context, C2fd c2fd, C2qg c2qg, C2r1 c2r1) {
        if (c2fd == null) {
            c2fd = C2fd.A0T;
        }
        C2r6 c2r6 = (C2r6) 1Bn.A0A(17100);
        Number number = (Number) c2qg.A07.get(c2fd);
        int intValue = number != null ? number.intValue() : c2fd.shouldDrawBackgroundBehindBadge ? c2qg.A00 : 0;
        boolean z = c2fd.canResizeBadgeIcon;
        Drawable drawable = null;
        C2r7 c2r7 = (C2r7) ((c2fd != C2fd.A0a || 1JF.A0B(c2qg.A0B)) ? c2qg.A08.get(c2fd) : c2r6.A00.get());
        if (c2r7 != null) {
            drawable = c2r7.AJ5(context, c2fd, c2qg);
        }
        C1qN c1qN = c2qg.A08;
        C2r7 c2r72 = (C2r7) c1qN.get(c2fd);
        int AYi = c2r72 == null ? c2qg.A01 : c2r72.AYi();
        C2r7 c2r73 = (C2r7) c1qN.get(c2fd);
        int A00 = c2r73 == null ? 0 : C0A8.A00(context, c2r73.AYj());
        if (c2r1.A07 != drawable) {
            c2r1.A07 = drawable;
            if (drawable != null) {
                drawable.mutate();
                c2r1.A07.setAlpha(c2r1.A00);
                ColorFilter colorFilter = c2r1.A06;
                if (colorFilter != null) {
                    c2r1.A07.setColorFilter(colorFilter);
                }
                C2r1.A00(c2r1.A07, c2r1);
            }
            c2r1.invalidateSelf();
        }
        c2r1.A0A.setColor(intValue);
        c2r1.invalidateSelf();
        Integer num = z ? c2qg.A0A : 0S2.A01;
        c2r1.A08 = c2qg.A09;
        C2r1.A00(c2r1.A07, c2r1);
        c2r1.invalidateSelf();
        int i = c2qg.A03;
        int i2 = c2qg.A04;
        c2r1.A04 = i;
        c2r1.A05 = i2;
        c2r1.invalidateSelf();
        c2r1.A09 = num;
        C2r1.A00(c2r1.A07, c2r1);
        c2r1.invalidateSelf();
        float f = 0.0f / 0.0f;
        if (AYi == -1) {
            AYi = c2r1.A03;
        }
        if (AYi >= 0 && c2r1.A01 != AYi) {
            c2r1.A01 = AYi;
            c2r1.invalidateSelf();
        }
        if (A00 < 0 || c2r1.A02 == A00) {
            return;
        }
        c2r1.A02 = A00;
        c2r1.invalidateSelf();
    }
}
