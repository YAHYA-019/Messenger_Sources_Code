package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.56w, reason: invalid class name */
/* loaded from: 56w.class */
public final class C56w implements AnonymousClass544 {
    public final AYC A00;
    public final MigColorScheme A01;
    public final QuickPromotionDefinition.Creative A02;

    public C56w(AYC ayc, MigColorScheme migColorScheme, QuickPromotionDefinition.Creative creative) {
        this.A01 = migColorScheme;
        this.A00 = ayc;
        this.A02 = creative;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        11T.A0F(anonymousClass544, 0);
        if (!(anonymousClass544 instanceof C56w)) {
            return false;
        }
        C56w c56w = (C56w) anonymousClass544;
        boolean z = false;
        if (c56w == null) {
            return false;
        }
        if (11T.A0O(this.A01, c56w.A01) && 11T.A0O(this.A00, c56w.A00)) {
            z = 4YV.A1a(this.A02, c56w.A02, false);
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C56w.class.hashCode();
    }
}
