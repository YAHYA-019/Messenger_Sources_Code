package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.59k, reason: invalid class name */
/* loaded from: 59k.class */
public final class C59k implements AnonymousClass555 {
    public MigColorScheme A00;
    public final AnonymousClass553 A01;
    public final CharSequence A02;

    public C59k(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, CharSequence charSequence) {
        this.A02 = charSequence;
        this.A00 = migColorScheme;
        this.A01 = anonymousClass553;
    }

    @Override // X.AnonymousClass556
    public boolean BVf(AnonymousClass556 anonymousClass556) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(anonymousClass556, 0), C59k.class)) {
            return false;
        }
        C59k c59k = (C59k) anonymousClass556;
        if (11T.A0O(this.A02, c59k.A02)) {
            z = 4YV.A1a(this.A00, c59k.A00, false);
        }
        return z;
    }
}
