package X;

import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: J1w.class */
public final class J1w implements Runnable {
    public static final String __redex_internal_original_name = "MessengerInterEffectLinkingController$notifyInterLinkEffectFetch$1$onEffectLoadSuccess$1";
    public final /* synthetic */ Hfy A00;
    public final /* synthetic */ EffectItem A01;
    public final /* synthetic */ I4D A02;
    public final /* synthetic */ String A03;

    public J1w(Hfy hfy, EffectItem effectItem, I4D i4d, String str) {
        this.A02 = i4d;
        this.A00 = hfy;
        this.A03 = str;
        this.A01 = effectItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I4D i4d = this.A02;
        Hfy hfy = this.A00;
        String str = this.A03;
        EffectItem effectItem = this.A01;
        IP3 ip3 = hfy.A01;
        String str2 = ip3.A0L.A00;
        if (hfy.A03 && str2 != null && str2.equals(str)) {
            ip3.A00(1Br.A03(ip3.A0F), effectItem, i4d);
        }
    }
}
