package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.90y, reason: invalid class name */
/* loaded from: 90y.class */
public final class C90y extends 44R {
    public C00i A01 = 1BQ.A02(33013);
    public C00i A00 = 1BQ.A02(99390);

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        boolean z = false;
        if (!1JF.A0B(contextualFilter.value)) {
            FbSharedPreferences A0R = 1BK.A0R(this.A01);
            1G2 r0 = 1NK.A1D;
            C00i c00i = this.A00;
            if (1BL.A08(c00i) - A0R.Av1(r0, 1BL.A08(c00i)) > Long.parseLong(contextualFilter.value) * 1000) {
                z = true;
            }
        }
        return z;
    }
}
