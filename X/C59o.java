package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.59o, reason: invalid class name */
/* loaded from: 59o.class */
public final class C59o implements AnonymousClass555 {
    public MigColorScheme A00;
    public final AnonymousClass553 A01;
    public final CharSequence A02;

    public C59o(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, CharSequence charSequence) {
        this.A02 = charSequence;
        this.A00 = migColorScheme;
        this.A01 = anonymousClass553;
    }

    @Override // X.AnonymousClass556
    public boolean BVf(AnonymousClass556 anonymousClass556) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(anonymousClass556, 0), C59o.class)) {
            return false;
        }
        C59o c59o = (C59o) anonymousClass556;
        if (11T.A0O(this.A02, c59o.A02)) {
            z = 4YV.A1a(this.A00, c59o.A00, false);
        }
        return z;
    }
}
