package X;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: X.69g, reason: invalid class name */
/* loaded from: 69g.class */
public abstract class C69g {
    public static final Drawable A00 = new ColorDrawable(0);

    public static Drawable A00(Resources resources, Drawable drawable, 5SA r303) {
        5CW r307;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            r307 = new 5CW(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), false);
        } else {
            if (!(drawable instanceof NinePatchDrawable)) {
                if (!(drawable instanceof ColorDrawable)) {
                    C0d7.A0D("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
                    return drawable;
                }
                C5bb c5bb = new C5bb(((ColorDrawable) drawable).getColor());
                A04(c5bb, r303);
                return c5bb;
            }
            r307 = new 5CX(drawable);
        }
        A04(r307, r303);
        return r307;
    }

    public static Drawable A01(Resources resources, Drawable drawable, 5SA r303) {
        5CA r307;
        try {
            if (2D9.A00().BWo()) {
                2D9.A02("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && r303 != null && r303.A04 == 0S2.A01) {
                if (drawable instanceof 5CC) {
                    5CA r0 = (5CC) drawable;
                    while (true) {
                        r307 = r0;
                        5CA AiL = r307.AiL();
                        if (AiL == r307 || !(AiL instanceof 5CA)) {
                            break;
                        }
                        r0 = AiL;
                    }
                    r307.CoF(A00(resources, r307.CoF(A00), r303));
                } else {
                    drawable = A00(resources, drawable, r303);
                }
            }
            if (2D9.A00().BWo()) {
                2D9.A01();
            }
            return drawable;
        } catch (Throwable th) {
            4YV.A14();
            throw th;
        }
    }

    public static Drawable A02(Drawable drawable, InterfaceC07034in interfaceC07034in) {
        if (2D9.A00().BWo()) {
            2D9.A02("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || interfaceC07034in == null) {
            if (2D9.A00().BWo()) {
                2D9.A01();
            }
            return drawable;
        }
        5CE r0 = new 5CE(drawable, interfaceC07034in);
        if (2D9.A00().BWo()) {
            2D9.A01();
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.5CY, X.69j, android.graphics.drawable.Drawable] */
    public static Drawable A03(Drawable drawable, 5SA r302) {
        try {
            if (2D9.A00().BWo()) {
                2D9.A02("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable == null || r302 == null || r302.A04 != 0S2.A00) {
                if (2D9.A00().BWo()) {
                    2D9.A01();
                }
                return drawable;
            }
            ?? c69j = new C69j(drawable);
            A04(c69j, r302);
            c69j.A00 = r302.A03;
            c69j.invalidateSelf();
            4YV.A14();
            return c69j;
        } catch (Throwable th) {
            4YV.A14();
            throw th;
        }
    }

    public static void A04(5CY r301, 5SA r302) {
        r301.Cmv(r302.A05);
        r301.Ctd(r302.A07);
        r301.CmI(r302.A02, r302.A00);
        r301.CsE(r302.A01);
        r301.CuE(r302.A06);
        r301.Ctx(false);
    }
}
