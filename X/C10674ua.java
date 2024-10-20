package X;

import android.net.Uri;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.4ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ua.class */
public final class C10674ua extends 44R {
    public final 1Br A00 = 1BK.A0E();

    public boolean A03(InterstitialTrigger interstitialTrigger, QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        String A00;
        1BK.A1M(quickPromotionDefinition, contextualFilter);
        if (interstitialTrigger == null) {
            return false;
        }
        boolean z = false;
        if (interstitialTrigger.A01 == null || (A00 = C7ll.A00(interstitialTrigger, quickPromotionDefinition.promotionId)) == null || A00.length() == 0) {
            return false;
        }
        if (((FbSharedPreferences) this.A00.get()).ArU(1G3.A00(4GI.A01, Uri.encode(A00)), 0) < Integer.parseInt(contextualFilter.value)) {
            z = true;
        }
        return z;
    }
}
