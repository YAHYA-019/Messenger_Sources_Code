package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ari, reason: case insensitive filesystem */
/* loaded from: Ari.class */
public final class C1748Ari extends 2vU {
    public static final InterstitialTrigger A03 = new InterstitialTrigger(822, (String) null);
    public ImmutableList A00;
    public final 1Br A01 = 1Bq.A00(98768);
    public final 1Br A02 = 1Bu.A00(66622);

    public String Arn() {
        return "9956";
    }

    public C4Hx BC9(InterstitialTrigger interstitialTrigger) {
        return C4Hx.A02;
    }

    public ImmutableList BHB() {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            immutableList = ImmutableList.of((Object) A03);
            this.A00 = immutableList;
            if (immutableList == null) {
                throw 1BK.A0h();
            }
        }
        return immutableList;
    }
}
