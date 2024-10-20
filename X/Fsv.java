package X;

import android.os.Bundle;
import com.facebook.zero.optin.activity.ZeroOptinInterstitialActivityBase;

/* loaded from: Fsv.class */
public final class Fsv implements GIl {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ ZeroOptinInterstitialActivityBase A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public Fsv(Bundle bundle, ZeroOptinInterstitialActivityBase zeroOptinInterstitialActivityBase, String str, String str2) {
        this.A01 = zeroOptinInterstitialActivityBase;
        this.A02 = str;
        this.A00 = bundle;
        this.A03 = str2;
    }

    @Override // X.GIl
    public void BxV() {
        ZeroOptinInterstitialActivityBase zeroOptinInterstitialActivityBase = this.A01;
        ((1GU) 4YU.A0p(zeroOptinInterstitialActivityBase.A00)).Ciz(new G1I(this));
        1BK.A09(zeroOptinInterstitialActivityBase.A03).D0v("zero_rating", 0Pz.A0W("Error performing the server request for opt in state: ", this.A03));
    }

    @Override // X.GIl
    public void onSuccess(String str) {
        ((1GU) 4YU.A0p(this.A01.A00)).Ciz(new G1H(this));
    }
}
