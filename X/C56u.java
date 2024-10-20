package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.56u, reason: invalid class name */
/* loaded from: 56u.class */
public final class C56u implements AnonymousClass544 {
    public final Bk0 A00;
    public final MigColorScheme A01;

    public C56u(Bk0 bk0, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = bk0;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        11T.A0F(anonymousClass544, 0);
        if (!(anonymousClass544 instanceof C56u)) {
            return false;
        }
        C56u c56u = (C56u) anonymousClass544;
        boolean z = false;
        if (c56u == null) {
            return false;
        }
        if (11T.A0O(this.A01, c56u.A01) && 11T.A0O(this.A00, c56u.A00)) {
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C56u.class.hashCode();
    }
}
