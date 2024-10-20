package X;

import android.net.Uri;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.4ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ub.class */
public final class C10684ub extends 44R {
    public final 1Br A01 = 1BK.A0E();
    public final 1Br A00 = 1Bq.A00(99390);

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
        if (1Br.A00(this.A00) - 1BL.A0A((FbSharedPreferences) this.A01.get(), 1G3.A00(4GI.A06, Uri.encode(A00))) >= Long.parseLong(contextualFilter.value) * 1000) {
            z = true;
        }
        return z;
    }
}
