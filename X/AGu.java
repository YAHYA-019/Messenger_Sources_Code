package X;

import android.content.Context;
import com.facebook.interstitial.triggers.InterstitialTrigger;

/* loaded from: AGu.class */
public final class AGu implements Runnable {
    public static final String __redex_internal_original_name = "ThreadviewinterstitialImplementation$onThreadOpened$1";
    public final /* synthetic */ InterstitialTrigger A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ 6G0 A02;
    public final /* synthetic */ 6Fz A03;

    public AGu(InterstitialTrigger interstitialTrigger, 1Br r303, 6G0 r304, 6Fz r305) {
        this.A02 = r304;
        this.A03 = r305;
        this.A00 = interstitialTrigger;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        4bW r0 = (4bW) 1Br.A0B(this.A01);
        Context context = this.A02.getContext();
        11T.A0A(context);
        r0.A00(context, this.A03.BDe(), 9sV.A00, this.A00);
    }
}
