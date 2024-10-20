package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Fcq.class */
public final class Fcq implements 1Gx {
    public final /* synthetic */ C01s A00;
    public final /* synthetic */ 44J A01;
    public final /* synthetic */ 4HC A02;
    public final /* synthetic */ QuickPromotionDefinition A03;
    public final /* synthetic */ GG9 A04;

    public Fcq(C01s c01s, 44J r303, 4HC r304, QuickPromotionDefinition quickPromotionDefinition, GG9 gg9) {
        this.A03 = quickPromotionDefinition;
        this.A02 = r304;
        this.A04 = gg9;
        this.A01 = r303;
        this.A00 = c01s;
    }

    public /* bridge */ /* synthetic */ void ADO(Object obj, Object obj2) {
        RuntimeException A0T;
        String str = (String) obj;
        boolean A1W = 1BL.A1W(str, obj2);
        try {
            QuickPromotionDefinition quickPromotionDefinition = this.A03;
            if (quickPromotionDefinition != null) {
                JSONObject A1F = DKC.A1F(str);
                if (!11T.A0O(A1F.getString("promotionID"), quickPromotionDefinition.promotionId)) {
                    return;
                }
                String string = A1F.getString("action");
                ENT A00 = EXW.A00(string);
                if (A00 != null) {
                    4HC r0 = this.A02;
                    4HB r02 = A00.qpActionEventEnum;
                    11T.A0F(r02, A1W ? 1 : 0);
                    r0.A03(r02, quickPromotionDefinition.promotionId);
                    GG9 gg9 = this.A04;
                    if (gg9 != null) {
                        gg9.BhR(A00);
                        return;
                    }
                    return;
                }
                new JSONException(0Pz.A0W("Invalid action: ", string));
            } else {
                A0T = AnonymousClass001.A0T("Unexpected action, QP is null");
            }
            throw A0T;
        } catch (Exception e) {
            this.A00.D12("QP_invalid_nt_action", StringFormatUtil.formatStrLocaleSafe("Invalid NT action %s data: %s", obj2, str), e);
        }
    }
}
