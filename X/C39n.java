package X;

import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.ImmutableList;

/* renamed from: X.39n, reason: invalid class name */
/* loaded from: 39n.class */
public final class C39n extends 44R {
    public final 1Br A00 = 1Bq.A00(49375);

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        boolean A1X = 1BL.A1X(quickPromotionDefinition, contextualFilter);
        boolean z = true;
        if (!Boolean.parseBoolean(contextualFilter.value)) {
            return A1X;
        }
        ImmutableList immutableList = quickPromotionDefinition.animations;
        if (immutableList.isEmpty()) {
            return false;
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            QuickPromotionDefinition.Animation animation = (QuickPromotionDefinition.Animation) it.next();
            String str = animation.id;
            String str2 = animation.assetUrl;
            if (str != null && str2 != null) {
                1Ph A00 = ((C11704xV) 1Br.A0B(this.A00)).A00(new 2qL(new 2qJ(str, str2), str), C2d1.A00);
                A00.A01();
                boolean z2 = true;
                if (A00.A05.get() == null) {
                    z2 = false;
                    A00.A00();
                }
                z &= z2;
            }
        }
        return z;
    }
}
