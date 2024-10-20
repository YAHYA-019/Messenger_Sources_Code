package X;

import java.nio.charset.Charset;

/* loaded from: Kp1.class */
public final class Kp1 {
    public final KBw A00;

    public Kp1(KBw kBw) {
        Charset charset = KdF.A04;
        this.A00 = kBw;
        kBw.A01 = this;
    }

    public void A00(ML1 ml1, Object obj, int i) {
        KBw kBw = this.A00;
        MQo mQo = (MQo) obj;
        LCa.A04(kBw, i);
        kBw.A04(((Lg5) mQo).A0C(ml1));
        ml1.DBK(kBw.A01, mQo);
    }
}
