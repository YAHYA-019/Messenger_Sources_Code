package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4vc.class */
public final class C11034vc extends 2vU {
    public static final InterstitialTrigger A00 = new InterstitialTrigger(ActionId.RTMP_CONNECTION_FAILED, (String) null);

    public String Arn() {
        return "9280";
    }

    public C4Hx BC9(InterstitialTrigger interstitialTrigger) {
        return C4Hx.A02;
    }

    public ImmutableList BHB() {
        ImmutableList of = ImmutableList.of((Object) A00);
        11T.A0A(of);
        return of;
    }
}
