package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.56y, reason: invalid class name */
/* loaded from: 56y.class */
public final class C56y implements AnonymousClass544 {
    public final AYC A00;
    public final MigColorScheme A01;
    public final QuickPromotionDefinition.Creative A02;

    public C56y(AYC ayc, MigColorScheme migColorScheme, QuickPromotionDefinition.Creative creative) {
        this.A01 = migColorScheme;
        this.A00 = ayc;
        this.A02 = creative;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        11T.A0F(anonymousClass544, 0);
        if (!(anonymousClass544 instanceof C56y)) {
            return false;
        }
        C56y c56y = (C56y) anonymousClass544;
        boolean z = false;
        if (c56y == null) {
            return false;
        }
        if (11T.A0O(this.A01, c56y.A01) && 11T.A0O(this.A00, c56y.A00)) {
            z = 4YV.A1a(this.A02, c56y.A02, false);
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C56y.class.hashCode();
    }
}
