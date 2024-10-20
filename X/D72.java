package X;

import android.content.Context;

/* loaded from: D72.class */
public final class D72 implements Runnable {
    public static final String __redex_internal_original_name = "InspirationMsqrdCapabilityHelper$getMediaEffectServiceHostCapabilitiesMap$buildCapabilitiesRunnable$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CN1 A01;

    public D72(Context context, CN1 cn1) {
        this.A01 = cn1;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CN1 cn1 = this.A01;
        if (cn1.A00 == null) {
            Context context = this.A00;
            java.util.Map A01 = FGY.A01(context, (CxK) 1Br.A0B(cn1.A01), CN1.A00(context, cn1));
            if (A01 == null) {
                throw 1BK.A0h();
            }
            cn1.A00 = A01;
        }
    }
}
