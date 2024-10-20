package X;

import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.39u, reason: invalid class name */
/* loaded from: 39u.class */
public final class C39u extends 44R {
    public final 1Br A00 = 1Bq.A00(66572);
    public final 1Br A01;
    public final 1De A02;

    public C39u(1De r302) {
        this.A02 = r302;
        this.A01 = 1Bu.A03(r302.A00, 67219);
    }

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        C00i c00i = this.A00.A00;
        ((C2cw) c00i.get()).A02(0S2.A00, 0S2.A0N);
        boolean A08 = ((C2cr) 1Br.A0B(this.A01)).A08();
        C2cw c2cw = (C2cw) c00i.get();
        if (!A08) {
            c2cw.A04("EB_UPSELL_QP_FILTER_FAILED");
            return A08;
        }
        c2cw.A05("EB_UPSELL_QP_FILTER_PASSED");
        ((C2cw) c00i.get()).A01();
        return A08;
    }
}
