package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.57c, reason: invalid class name */
/* loaded from: 57c.class */
public final class C57c implements AnonymousClass544 {
    public final MigColorScheme A00;
    public final CharSequence A01;

    public C57c(MigColorScheme migColorScheme, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = migColorScheme;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if ((anonymousClass544 instanceof C57c) && this == anonymousClass544) {
            C57c c57c = (C57c) anonymousClass544;
            if (Objects.equal(this.A01, c57c.A01)) {
                z = 4YV.A1Z(this.A00, c57c.A00);
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C57c.class.hashCode() + 31;
    }
}
