package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Gkq, reason: case insensitive filesystem */
/* loaded from: Gkq.class */
public final class C2674Gkq extends 1LH {
    public final Drawable A00;
    public final String A01;

    public C2674Gkq(String str, Drawable drawable) {
        this.A01 = str;
        this.A00 = drawable;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        5BH A01 = 5BG.A01(c2k5.A05);
        A01.A00.A09 = this.A01;
        Drawable drawable = this.A00;
        if (drawable != null) {
            C07004ik A00 = C06984ii.A00();
            A00.A05(drawable);
            A01.A2Z(new C06974ih(A00));
        }
        A01.A0J();
        5BG r0 = A01.A00;
        11T.A0A(r0);
        return r0;
    }
}
