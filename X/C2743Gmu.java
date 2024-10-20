package X;

import android.content.Context;

/* renamed from: X.Gmu, reason: case insensitive filesystem */
/* loaded from: Gmu.class */
public final class C2743Gmu extends GWa {
    public /* bridge */ /* synthetic */ String A0J(Object obj) {
        Context context;
        int i;
        int i2 = ((Ram) obj).A02;
        if (i2 < 60) {
            context = ((GWa) this).A01;
            i = 2131958755;
        } else {
            if (i2 < 3600) {
                return 1BK.A0v(((GWa) this).A01, Integer.valueOf((int) Math.floor(i2 / 60.0d)), 2131958756);
            }
            context = ((GWa) this).A01;
            i = 2131958757;
        }
        return context.getString(i);
    }

    public /* bridge */ /* synthetic */ String A0K(Object obj) {
        return HvH.A00(((Ram) obj).A03);
    }

    public /* bridge */ /* synthetic */ String A0L(Object obj) {
        return HvH.A01(((Ram) obj).A03);
    }

    public /* bridge */ /* synthetic */ String A0M(Object obj) {
        return ((Ram) obj).A04;
    }

    public /* bridge */ /* synthetic */ String A0N(Object obj) {
        return ((Ram) obj).A06;
    }
}
