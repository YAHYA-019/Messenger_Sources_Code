package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.59s, reason: invalid class name */
/* loaded from: 59s.class */
public final class C59s implements AnonymousClass555 {
    public MigColorScheme A00;
    public final AnonymousClass553 A01;
    public final CharSequence A02;
    public final boolean A03;

    public C59s(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, CharSequence charSequence, boolean z) {
        this.A02 = charSequence;
        this.A03 = z;
        this.A00 = migColorScheme;
        this.A01 = anonymousClass553 == null ? AnonymousClass553.A01 : anonymousClass553;
    }

    @Override // X.AnonymousClass556
    public boolean BVf(AnonymousClass556 anonymousClass556) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(anonymousClass556, 0), C59s.class)) {
            return false;
        }
        C59s c59s = (C59s) anonymousClass556;
        if (11T.A0O(this.A02, c59s.A02) && this.A03 == c59s.A03) {
            z = 4YV.A1a(this.A00, c59s.A00, false);
        }
        return z;
    }
}
