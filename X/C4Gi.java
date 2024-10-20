package X;

import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.4Gi, reason: invalid class name */
/* loaded from: 4Gi.class */
public final class C4Gi implements C4Gf {
    @Override // X.C4Gf
    public C4Gy A8f(C4Gc c4Gc, 44I r303) {
        11T.A0F(r303, 0);
        11T.A0F(c4Gc, 1);
        4GM r0 = c4Gc.A0G;
        QuickPromotionDefinition quickPromotionDefinition = r303.A00;
        int intValue = r0.A00(quickPromotionDefinition.promotionId).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                return new C4Gy(null, null, null, null, "Promotion set to Force Off", null, false, true, false);
            }
            if (!quickPromotionDefinition.A04) {
                return C4Gx.A00();
            }
        }
        return new C4Gy(null, null, null, null, null, null, true, true, false);
    }

    @Override // X.C4Gf
    public String DAM() {
        return null;
    }
}
