package X;

import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.39v, reason: invalid class name */
/* loaded from: 39v.class */
public final class C39v extends 44R {
    public final 1Br A00 = 1Bq.A00(66259);
    public final 1Br A01 = 1Bq.A00(66572);
    public final 1Br A02;
    public final 1De A03;

    public C39v(1De r302) {
        this.A03 = r302;
        this.A02 = 1Bu.A03(r302.A00, 67219);
    }

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        C00i c00i = this.A01.A00;
        ((C2cw) c00i.get()).A02(0S2.A0C, 0S2.A0u);
        C00i c00i2 = this.A02.A00;
        boolean A09 = ((C2cr) c00i2.get()).A09();
        if (!A09) {
            ((C2cw) c00i.get()).A04("LOW_DISKSPACE_QP_FILTER_FAILED");
            return A09;
        }
        boolean AZk = 1Br.A05(this.A00).AZk(36322293611709749L);
        C2cw c2cw = (C2cw) c00i.get();
        if (AZk) {
            c2cw.A04("LOW_DISKSPACE_QP_FILTER_PASSED_FORCE_SKIP");
            ((C2cr) c00i2.get()).A05(false);
            return false;
        }
        c2cw.A05("LOW_DISKSPACE_QP_FILTER_PASSED");
        ((C2cw) c00i.get()).A01();
        return A09;
    }
}
