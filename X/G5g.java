package X;

import android.content.Context;
import com.facebook.interstitial.triggers.InterstitialTrigger;

/* loaded from: G5g.class */
public final class G5g implements Runnable {
    public static final String __redex_internal_original_name = "InterstitialStartHelper$maybeStartInterstitial$1$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C05324dh A01;
    public final /* synthetic */ 2tJ A02;
    public final /* synthetic */ InterstitialTrigger A03;
    public final /* synthetic */ Object A04;

    public G5g(Context context, C05324dh c05324dh, 2tJ r304, InterstitialTrigger interstitialTrigger, Object obj) {
        this.A01 = c05324dh;
        this.A00 = context;
        this.A03 = interstitialTrigger;
        this.A04 = obj;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C05324dh c05324dh = this.A01;
        Context context = this.A00;
        InterstitialTrigger interstitialTrigger = this.A03;
        Object obj = this.A04;
        2tJ r0 = this.A02;
        ((C2t1) 1Br.A0B(c05324dh.A02)).A0S().A00(r0.Arn());
        C05324dh.A00(context, c05324dh, r0, interstitialTrigger, obj);
    }
}
