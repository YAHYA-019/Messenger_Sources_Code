package X;

import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.facebook.user.model.User;

/* renamed from: X.39j, reason: invalid class name */
/* loaded from: 39j.class */
public final class C39j extends 44R {
    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        User user = (User) 1Bn.A0A(83430);
        boolean z = false;
        if (user != null && user.A0T.asBoolean(false)) {
            z = true;
        }
        return z;
    }
}
