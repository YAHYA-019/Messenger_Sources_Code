package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.39s, reason: invalid class name */
/* loaded from: 39s.class */
public final class C39s extends 44R {
    public final 1Br A00;
    public final 1De A01;

    public C39s(1De r302) {
        this.A01 = r302;
        this.A00 = 1Bu.A03(r302.A00, 83719);
    }

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        11T.A0F(contextualFilter, 1);
        C00i c00i = this.A00.A00;
        Object systemService = ((Context) c00i.get()).getSystemService("power");
        11T.A0I(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        boolean z = false;
        if (((PowerManager) systemService).isIgnoringBatteryOptimizations(((Context) c00i.get()).getPackageName()) == Boolean.parseBoolean(contextualFilter.value)) {
            z = true;
        }
        return z;
    }
}
