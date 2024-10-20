package X;

import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: J2n.class */
public final class J2n implements Runnable {
    public static final String __redex_internal_original_name = "MontageEffectsAssetProxy$downloadEffectIfNeededAysnc$1";
    public final /* synthetic */ JCf A00;
    public final /* synthetic */ JIT A01;
    public final /* synthetic */ C2778Gnv A02;
    public final /* synthetic */ EffectItem A03;
    public final /* synthetic */ boolean A04;

    public J2n(JCf jCf, JIT jit, C2778Gnv c2778Gnv, EffectItem effectItem, boolean z) {
        this.A02 = c2778Gnv;
        this.A03 = effectItem;
        this.A01 = jit;
        this.A00 = jCf;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2778Gnv c2778Gnv = this.A02;
        EffectItem effectItem = this.A03;
        c2778Gnv.A04(this.A00, this.A01, effectItem, this.A04);
    }
}
