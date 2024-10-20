package X;

import android.content.res.Resources;

/* renamed from: X.2pf, reason: invalid class name */
/* loaded from: 2pf.class */
public final class C2pf implements 2pC {
    public final C2pe A00;

    public C2pf() {
        this(null);
    }

    public C2pf(C2pe c2pe) {
        this.A00 = c2pe;
    }

    public 1LI AMJ(1LI r302, 1Iw r303, Object obj, Object obj2) {
        11T.A0F(r303, 0);
        11T.A0F(r302, 1);
        2dD A00 = C2dB.A00(r303);
        A00.A2X(r302);
        C2pe c2pe = this.A00;
        if (c2pe != null) {
            C26z c26z = C26z.TOP;
            Resources resources = r303.A0D.getResources();
            11T.A0A(resources);
            A00.A2A(c26z, c2pe.Chq(resources));
        }
        return A00.A2W();
    }
}
