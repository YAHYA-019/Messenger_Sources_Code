package X;

import android.R;
import com.facebook.quickpromotion.ui.QuickPromotionLoginInterstitialBloksActivityV2;

/* loaded from: F5u.class */
public final class F5u {
    public String A00;
    public String A01;
    public final java.util.Map A02 = 1BK.A1C();
    public final /* synthetic */ QuickPromotionLoginInterstitialBloksActivityV2 A03;

    public F5u(QuickPromotionLoginInterstitialBloksActivityV2 quickPromotionLoginInterstitialBloksActivityV2) {
        this.A03 = quickPromotionLoginInterstitialBloksActivityV2;
    }

    public static final void A00(F5u f5u, Eo5 eo5) {
        String str = f5u.A00;
        String str2 = eo5.A03;
        if (11T.A0O(str, str2)) {
            return;
        }
        C06c A0D = 7zU.A0D(f5u.A03);
        A0D.A0M(eo5.A01, R.id.content);
        A0D.A04();
        f5u.A00 = str2;
    }
}
