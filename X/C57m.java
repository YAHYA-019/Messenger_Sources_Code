package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.57m, reason: invalid class name */
/* loaded from: 57m.class */
public final class C57m implements AnonymousClass544 {
    public final AaY A00;
    public final MigColorScheme A01;
    public final String A02;

    public C57m(AaY aaY, MigColorScheme migColorScheme, String str) {
        this.A02 = str;
        this.A01 = migColorScheme;
        this.A00 = aaY;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == C57m.class) {
            if (this == anonymousClass544) {
                return true;
            }
            C57m c57m = (C57m) anonymousClass544;
            if (Objects.equal(this.A02, c57m.A02)) {
                z = 4YV.A1Z(this.A01, c57m.A01);
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C57m.class.hashCode() + 31;
    }
}
