package X;

import android.graphics.drawable.Drawable;
import com.facebook.inject.FbInjector;

/* renamed from: X.1u2, reason: invalid class name */
/* loaded from: 1u2.class */
public final class C1u2 {
    public final C00i A00 = new 1BQ(33112);

    public final int A00() {
        return A04(C1u3.A1w, C1u4.SIZE_32);
    }

    public final int A01(2MQ r302) {
        return A02(r302, 2Re.A03);
    }

    public int A02(2MQ r302, 2Re r303) {
        C1u5 c1u5 = (C1u5) this.A00.get();
        11T.A0F(r302, 0);
        11T.A0F(r303, 1);
        C1u5.A00();
        return ((2Rf) c1u5.A01.get()).A01(r302, r303);
    }

    public final int A03(C1u3 c1u3) {
        return A04(c1u3, C1u4.SIZE_32);
    }

    public int A04(C1u3 c1u3, C1u4 c1u4) {
        C1u5 c1u5 = (C1u5) this.A00.get();
        11T.A0F(c1u3, 0);
        11T.A0F(c1u4, 1);
        C1u5.A00();
        return ((C1u6) c1u5.A02.get()).A01(c1u3, c1u4);
    }

    public Drawable A05(2MQ r302, 2Re r303) {
        C1u5 c1u5 = (C1u5) this.A00.get();
        11T.A0F(r302, 0);
        11T.A0F(r303, 1);
        C1u5.A00();
        Drawable drawable = FbInjector.A00().getResources().getDrawable(((2Rf) c1u5.A01.get()).A01(r302, r303));
        11T.A0A(drawable);
        return drawable;
    }

    public Drawable A06(2MQ r302, 2Re r303, int i) {
        C1u5 c1u5 = (C1u5) this.A00.get();
        11T.A0F(r302, 0);
        C1u5.A00();
        Drawable A01 = ((C1uu) c1u5.A00.get()).A01(((2Rf) c1u5.A01.get()).A01(r302, r303), i);
        if (A01 != null) {
            return A01;
        }
        throw AnonymousClass001.A0N("Required value was null.");
    }

    public final Drawable A07(C1u3 c1u3) {
        return A09(c1u3, C1u4.SIZE_32, -1);
    }

    public final Drawable A08(C1u3 c1u3, int i) {
        return A09(c1u3, C1u4.SIZE_32, i);
    }

    public Drawable A09(C1u3 c1u3, C1u4 c1u4, int i) {
        C1u5 c1u5 = (C1u5) this.A00.get();
        11T.A0F(c1u3, 0);
        11T.A0F(c1u4, 1);
        C1u5.A00();
        Drawable A01 = ((C1uu) c1u5.A00.get()).A01(((C1u6) c1u5.A02.get()).A01(c1u3, c1u4), i);
        if (A01 != null) {
            return A01;
        }
        throw AnonymousClass001.A0N("Required value was null.");
    }
}
