package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;

/* renamed from: X.7ll, reason: invalid class name */
/* loaded from: 7ll.class */
public abstract class C7ll {
    public static final String A00(InterstitialTrigger interstitialTrigger, String str) {
        InterstitialTriggerContext interstitialTriggerContext;
        if (interstitialTrigger == null || (interstitialTriggerContext = interstitialTrigger.A01) == null) {
            return null;
        }
        String A00 = interstitialTriggerContext.A00("client_context_id");
        String A002 = interstitialTriggerContext.A00("user_id");
        if (A00.length() == 0 || A002.length() == 0) {
            return null;
        }
        return 0Pz.A0z(str, "/", A002, "/", A00);
    }
}
