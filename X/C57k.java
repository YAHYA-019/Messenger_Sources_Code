package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.57k, reason: invalid class name */
/* loaded from: 57k.class */
public final class C57k implements AnonymousClass544 {
    public final AnonymousClass553 A00;
    public final MigColorScheme A01;

    public C57k(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = anonymousClass553;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        if (anonymousClass544 instanceof C57k) {
            return Objects.equal(this.A01, ((C57k) anonymousClass544).A01);
        }
        return false;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 0J6.A00(C57k.class, this.A01);
    }
}
