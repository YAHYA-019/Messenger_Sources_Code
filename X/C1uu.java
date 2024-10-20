package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.inject.FbInjector;

/* renamed from: X.1uu, reason: invalid class name */
/* loaded from: 1uu.class */
public final class C1uu {
    public static final 0AE A01;
    public static final 1Xo A02;
    public static final C1uv A03 = new Object();
    public static final C3m8 A04;
    public static final 1Xo A05;
    public final Resources A00;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1uv, java.lang.Object] */
    static {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1uu.m365clinit():void");
    }

    public C1uu() {
        Resources resources = FbInjector.A00().getResources();
        11T.A0A(resources);
        this.A00 = resources;
    }

    public static final Drawable A00(Resources resources, Drawable drawable, int i) {
        return A03.A03(resources, drawable, i);
    }

    public Drawable A01(int i, int i2) {
        Drawable drawable;
        synchronized (this) {
            drawable = null;
            if (i != 0) {
                try {
                    Drawable A022 = A02(i, i2);
                    A04.A5A(this.A00.getResourceEntryName(i), A022);
                    drawable = A022;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        return drawable;
    }

    public final Drawable A02(int i, int i2) {
        Drawable newDrawable;
        Throwable th;
        synchronized (this) {
            if (((1CO) 1Bi.A03(16387)).AZk(72339189275492575L)) {
                Drawable drawable = this.A00.getDrawable(i);
                if (drawable == null) {
                    new Resources.NotFoundException(0Pz.A0T("Resource not found: ", i));
                    throw th;
                }
                newDrawable = drawable.mutate();
                11T.A0A(newDrawable);
                newDrawable.setColorFilter(C1uv.A00(i2));
                newDrawable.getConstantState();
            } else {
                C03v c03v = C1uw.A02;
                C1uw c1uw = (C1uw) c03v.A3p();
                if (c1uw == null) {
                    new Object();
                }
                c1uw.A01 = i;
                c1uw.A00 = i2;
                1Xo r0 = A05;
                Drawable.ConstantState constantState = (Drawable.ConstantState) r0.A02(c1uw);
                boolean z = true;
                if (constantState == null) {
                    Drawable drawable2 = this.A00.getDrawable(i);
                    if (drawable2 == null) {
                        new Resources.NotFoundException(0Pz.A0T("Resource not found: ", i));
                        throw th;
                    }
                    newDrawable = drawable2.mutate();
                    11T.A0A(newDrawable);
                    newDrawable.setColorFilter(C1uv.A00(i2));
                    Drawable.ConstantState constantState2 = newDrawable.getConstantState();
                    if (constantState2 != null) {
                        r0.A04(c1uw, constantState2);
                        z = false;
                    }
                } else {
                    newDrawable = constantState.newDrawable(this.A00);
                    11T.A0A(newDrawable);
                }
                if (z) {
                    c03v.Ccj(c1uw);
                }
            }
        }
        return newDrawable;
    }
}
