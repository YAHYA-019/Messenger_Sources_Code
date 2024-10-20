package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: Hyu.class */
public final class Hyu {
    public HSr A00;
    public final Context A01;
    public final BetterTextView A02;
    public final BetterTextView A03;

    public Hyu(Context context, LinearLayout linearLayout, HSr hSr) {
        this.A02 = (BetterTextView) C09s.A01(linearLayout, 2131362052);
        this.A03 = (BetterTextView) C09s.A01(linearLayout, 2131362053);
        this.A00 = hSr;
        this.A01 = context;
    }

    public static void A00(Hyu hyu) {
        2OB r0 = hyu.A02;
        if (r0 != null) {
            r0.setSelected(true);
            DKF.A11(hyu.A01, r0, 2132213765);
            r0.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        2OB r02 = hyu.A03;
        if (r02 != null) {
            r02.setSelected(false);
            DKF.A11(hyu.A01, r02, 2132213766);
            r02.setShadowLayer(2.0f, 2.0f, 2.0f, 2132213837);
        }
    }
}
