package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: X.7ge, reason: invalid class name */
/* loaded from: 7ge.class */
public final class C7ge extends 44R {
    public boolean A03(InterstitialTrigger interstitialTrigger, QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        11T.A0F(contextualFilter, 1);
        InterstitialTriggerContext interstitialTriggerContext = interstitialTrigger != null ? interstitialTrigger.A01 : null;
        boolean z = false;
        if (interstitialTriggerContext != null) {
            Collection keySet = interstitialTriggerContext.A00.keySet();
            11T.A0A(keySet);
            if (((AbstractCollection) keySet).contains("target_user_rank")) {
                try {
                    if (Float.parseFloat(interstitialTriggerContext.A00("target_user_rank")) >= Float.parseFloat(contextualFilter.value)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return z;
    }
}
