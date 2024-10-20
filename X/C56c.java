package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.56c, reason: invalid class name */
/* loaded from: 56c.class */
public final class C56c implements AnonymousClass544 {
    public final MigColorScheme A00;
    public final CharSequence A01;
    public final CharSequence A02;

    public C56c(MigColorScheme migColorScheme, CharSequence charSequence, CharSequence charSequence2) {
        11T.A0F(migColorScheme, 3);
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A00 = migColorScheme;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        11T.A0F(anonymousClass544, 0);
        boolean z = false;
        if (!(anonymousClass544 instanceof C56c)) {
            return false;
        }
        C56c c56c = (C56c) anonymousClass544;
        if (11T.A0O(this.A02, c56c.A02) && 11T.A0O(this.A01, c56c.A01)) {
            z = 4YV.A1a(this.A00, c56c.A00, false);
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 0J6.A01(this.A02, this.A01, this.A00);
    }
}
