package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.59m, reason: invalid class name */
/* loaded from: 59m.class */
public final class C59m implements AnonymousClass555 {
    public MigColorScheme A00;
    public CharSequence A01;
    public final AnonymousClass553 A02;
    public final CharSequence A03;
    public final boolean A04;

    public C59m(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, CharSequence charSequence, boolean z) {
        this.A03 = charSequence;
        this.A04 = z;
        this.A00 = migColorScheme;
        this.A02 = anonymousClass553 == null ? AnonymousClass553.A01 : anonymousClass553;
    }

    @Override // X.AnonymousClass556
    public boolean BVf(AnonymousClass556 anonymousClass556) {
        11T.A0F(anonymousClass556, 0);
        boolean z = false;
        if (!11T.A0O(anonymousClass556.getClass(), C59m.class)) {
            return false;
        }
        C59m c59m = (C59m) anonymousClass556;
        if (11T.A0O(this.A03, c59m.A03) && this.A04 == c59m.A04 && 11T.A0O(this.A00, c59m.A00) && 11T.A0O(this.A01, c59m.A01)) {
            z = true;
        }
        return z;
    }
}
