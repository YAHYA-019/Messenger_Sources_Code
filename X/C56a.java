package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.56a, reason: invalid class name */
/* loaded from: 56a.class */
public final class C56a implements AnonymousClass544 {
    public final C9a7 A00;
    public final MigColorScheme A01;

    public C56a(C9a7 c9a7, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A00 = c9a7;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(anonymousClass544, 0), C56a.class)) {
            return false;
        }
        C56a c56a = (C56a) anonymousClass544;
        if (11T.A0O(this.A01, c56a.A01)) {
            z = 4YV.A1a(this.A00, c56a.A00, false);
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C56a.class.hashCode();
    }
}
