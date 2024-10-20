package X;

import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: J2t.class */
public final class J2t implements Runnable {
    public static final String __redex_internal_original_name = "CallPresenter$applyEffect$1$1";
    public final /* synthetic */ EffectItem A00;
    public final /* synthetic */ GrS A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;

    public J2t(EffectItem effectItem, GrS grS, Integer num, Integer num2, String str) {
        this.A01 = grS;
        this.A00 = effectItem;
        this.A03 = num;
        this.A02 = num2;
        this.A04 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GrS.A08(this.A00, this.A01, this.A03, this.A02, this.A04);
    }
}
