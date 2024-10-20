package X;

import android.app.Activity;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.39m, reason: invalid class name */
/* loaded from: 39m.class */
public final class C39m extends 44R {
    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        Activity A09 = ((1Od) 1Bi.A03(16616)).A09();
        boolean z = false;
        if (A09 != null) {
            1Rv r0 = (1Rv) 1Bi.A03(67262);
            boolean A05 = r0.A05(A09, "android.permission.ACCESS_COARSE_LOCATION");
            boolean A08 = r0.A08("android.permission.ACCESS_COARSE_LOCATION");
            if (!A05 && !A08) {
                z = true;
            }
        }
        return z;
    }
}
