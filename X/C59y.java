package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.59y, reason: invalid class name */
/* loaded from: 59y.class */
public final class C59y implements AnonymousClass555 {
    public final MigColorScheme A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public C59y(MigColorScheme migColorScheme, String str, boolean z, boolean z2) {
        str.getClass();
        this.A03 = z;
        this.A02 = z2;
        this.A01 = str;
        this.A00 = migColorScheme;
    }

    @Override // X.AnonymousClass556
    public boolean BVf(AnonymousClass556 anonymousClass556) {
        boolean z = false;
        if (anonymousClass556 instanceof C59y) {
            C59y c59y = (C59y) anonymousClass556;
            if (this.A03 == c59y.A03 && this.A02 == c59y.A02 && this.A01.equals(c59y.A01) && Objects.equal(this.A00, c59y.A00)) {
                z = true;
            }
        }
        return z;
    }
}
