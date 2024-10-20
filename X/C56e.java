package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.56e, reason: invalid class name */
/* loaded from: 56e.class */
public final class C56e implements AnonymousClass544 {
    public final AnonymousClass553 A00;
    public final MigColorScheme A01;
    public final CharSequence A02;

    public C56e(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, CharSequence charSequence) {
        1BK.A1K(migColorScheme, 3, anonymousClass553);
        this.A02 = charSequence;
        this.A01 = migColorScheme;
        this.A00 = anonymousClass553;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        11T.A0F(anonymousClass544, 0);
        boolean z2 = false;
        if (anonymousClass544 instanceof C56e) {
            z = true;
            if (anonymousClass544 != this) {
                C56e c56e = (C56e) anonymousClass544;
                if (11T.A0O(this.A02, c56e.A02)) {
                    z2 = 4YV.A1a(this.A01, c56e.A01, false);
                }
                return z2;
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 0J6.A02(C56e.class, this.A02, AnonymousClass001.A0K(), this.A01);
    }
}
