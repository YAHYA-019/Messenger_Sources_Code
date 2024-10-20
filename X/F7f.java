package X;

import com.google.common.collect.ImmutableSet;

/* loaded from: F7f.class */
public final class F7f {
    public static final ImmutableSet A02 = ImmutableSet.A03("dialtone_photo_interstitial", "dialtone_video_interstitial", "dialtone_toggle_interstitial");
    public final C00i A01 = AbH.A0S();
    public final 2BQ A00 = (2BQ) 1Bi.A03(16964);

    public void A00(String str) {
        1Ky A0w = DKG.A0w();
        1Ql A0V = 1BL.A0V(this.A01);
        ImmutableSet immutableSet = A02;
        if (immutableSet.contains(str)) {
            1Du it = immutableSet.iterator();
            while (it.hasNext()) {
                A0V = A0V.putBoolean(A0w.A01(AnonymousClass001.A0i(it)), false);
            }
        } else {
            A0V = A0V.putBoolean(A0w.A01(str), false);
        }
        A0V.putBoolean(A0w.A01("upsell_dont_warn_again_checkbox_checked"), true);
        A0V.commit();
    }
}
