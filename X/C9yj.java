package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9yj, reason: invalid class name */
/* loaded from: 9yj.class */
public final class C9yj implements AnonymousClass544 {
    public final C9a7 A00;
    public final MigColorScheme A01;

    public C9yj(C9a7 c9a7, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A00 = c9a7;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(anonymousClass544, 0), C9yj.class)) {
            return false;
        }
        C9yj c9yj = (C9yj) anonymousClass544;
        if (11T.A0O(this.A01, c9yj.A01)) {
            z = 4YV.A1a(this.A00, c9yj.A00, false);
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C9yj.class.hashCode();
    }
}
