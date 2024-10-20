package X;

import android.content.Context;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.39o, reason: invalid class name */
/* loaded from: 39o.class */
public final class C39o extends 44R {
    public final 1De A00;

    public C39o(1De r302) {
        this.A00 = r302;
    }

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        11T.A0F(contextualFilter, 1);
        1BY r0 = this.A00.A00;
        C2sz c2sz = (C2sz) 1Lm.A07(1Fw.A06(1Bn.A0E((Context) null, r0, 16428)), r0, 66546);
        boolean z = false;
        if (c2sz.A01() && c2sz.A00() >= Integer.parseInt(contextualFilter.value)) {
            z = true;
        }
        return z;
    }
}
