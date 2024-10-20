package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: Fcp.class */
public final class Fcp implements 1Gx {
    public final /* synthetic */ C01s A00;
    public final /* synthetic */ QuickPromotionDefinition A01;
    public final /* synthetic */ FHL A02;
    public final /* synthetic */ Runnable A03;

    public Fcp(C01s c01s, QuickPromotionDefinition quickPromotionDefinition, FHL fhl, Runnable runnable) {
        this.A01 = quickPromotionDefinition;
        this.A02 = fhl;
        this.A03 = runnable;
        this.A00 = c01s;
    }

    public /* bridge */ /* synthetic */ void ADO(Object obj, Object obj2) {
        String str = (String) obj;
        11T.A0H(str, obj2);
        try {
            QuickPromotionDefinition quickPromotionDefinition = this.A01;
            if (quickPromotionDefinition != null) {
                FHL fhl = this.A02;
                if (fhl != null) {
                    if (11T.A0O(DKC.A1F(str).getString("promotionID"), quickPromotionDefinition.promotionId)) {
                        fhl.A03();
                        this.A03.run();
                        return;
                    }
                    return;
                }
            }
            throw AnonymousClass001.A0T("Unexpected action, QP is null");
        } catch (Exception e) {
            this.A00.D12("QP_invalid_nt_action", StringFormatUtil.formatStrLocaleSafe("Invalid NT action %s data: %s", obj2, str), e);
        }
    }
}
