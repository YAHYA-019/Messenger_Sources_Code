package X;

import java.util.Set;

/* loaded from: Ipa.class */
public final class Ipa implements Runnable {
    public static final String __redex_internal_original_name = "LivingRoomRemoteControl$unloadInternal$1";
    public final /* synthetic */ Hqi A00;

    public Ipa(Hqi hqi) {
        this.A00 = hqi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hqi hqi = this.A00;
        GgT ggT = ((IRw) 1Br.A0B(hqi.A0E)).A03;
        IS0 is0 = hqi.A03;
        11T.A0F(is0, 0);
        Set set = ((IRp) ggT).A00;
        set.remove(is0);
        JJo jJo = hqi.A0G;
        if (jJo != null) {
            set.remove(jJo);
        }
        JJo jJo2 = hqi.A0H;
        if (jJo2 != null) {
            set.remove(jJo2);
        }
        Object obj = hqi.A04.get();
        11T.A0A(obj);
        set.remove(obj);
        Ro6 ro6 = hqi.A02;
        11T.A0F(ro6, 0);
        set.remove(ro6);
        ((IRp) 1Br.A0B(hqi.A0D)).A00.clear();
        hqi.A0F = null;
        hqi.A0G = null;
        hqi.A0H = null;
    }
}
