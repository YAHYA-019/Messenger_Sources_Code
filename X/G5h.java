package X;

import android.content.Context;
import com.facebook.interstitial.triggers.InterstitialTrigger;

/* loaded from: G5h.class */
public final class G5h implements Runnable {
    public static final String __redex_internal_original_name = "InterstitialStartHelper$maybeStartInterstitial$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C05324dh A01;
    public final /* synthetic */ InterstitialTrigger A02;
    public final /* synthetic */ Class A03;
    public final /* synthetic */ Object A04;

    public G5h(Context context, C05324dh c05324dh, InterstitialTrigger interstitialTrigger, Class cls, Object obj) {
        this.A01 = c05324dh;
        this.A02 = interstitialTrigger;
        this.A03 = cls;
        this.A00 = context;
        this.A04 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C05324dh c05324dh = this.A01;
        C2t1 c2t1 = (C2t1) 1Br.A0B(c05324dh.A02);
        InterstitialTrigger interstitialTrigger = this.A02;
        2tJ A0O = c2t1.A0O(interstitialTrigger, this.A03);
        if (A0O != null) {
            7zP.A0N(c05324dh.A00).CY3(new G5g(this.A00, c05324dh, A0O, interstitialTrigger, this.A04));
        }
    }
}
