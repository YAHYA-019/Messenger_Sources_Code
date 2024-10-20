package X;

import com.facebook.device.DeviceConditionHelper;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.39q, reason: invalid class name */
/* loaded from: 39q.class */
public final class C39q extends 44R {
    public final 1Br A00 = 1Bq.A00(17096);

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        11T.A0F(contextualFilter, 1);
        return AnonymousClass001.A1Q(((DeviceConditionHelper) 1Br.A0B(this.A00)).A03(false) ? 1 : 0, Boolean.parseBoolean(contextualFilter.value) ? 1 : 0);
    }
}
