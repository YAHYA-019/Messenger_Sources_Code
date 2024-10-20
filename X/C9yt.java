package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9yt, reason: invalid class name */
/* loaded from: 9yt.class */
public final class C9yt implements 55E {
    public final C1u3 A00;
    public final MigColorScheme A01;

    public C9yt(C1u3 c1u3, MigColorScheme migColorScheme) {
        11T.A0F(c1u3, 1);
        this.A00 = c1u3;
        this.A01 = migColorScheme;
    }

    public boolean BVi(55E r302) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(r302, 0), C9yt.class)) {
            return false;
        }
        C9yt c9yt = (C9yt) r302;
        if (this.A00 == c9yt.A00) {
            z = 4YV.A1a(this.A01, c9yt.A01, false);
        }
        return z;
    }
}
