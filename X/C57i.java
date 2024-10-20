package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.57i, reason: invalid class name */
/* loaded from: 57i.class */
public final class C57i implements AnonymousClass544 {
    public final AnonymousClass553 A00;
    public final MigColorScheme A01;
    public final CharSequence A02;
    public final boolean A03;
    public final boolean A04;

    public C57i(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, CharSequence charSequence, boolean z, boolean z2) {
        this.A02 = charSequence;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = migColorScheme;
        this.A00 = anonymousClass553;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544 instanceof C57i) {
            C57i c57i = (C57i) anonymousClass544;
            if (Objects.equal(this.A02, c57i.A02) && this.A03 == c57i.A03 && this.A04 == c57i.A04) {
                z = 4YV.A1Z(this.A01, c57i.A01);
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 0J6.A02(C57i.class, this.A02, Boolean.valueOf(this.A04), this.A01);
    }
}
