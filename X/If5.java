package X;

import com.facebook.rsys.audio.gen.AudioApi;

/* loaded from: If5.class */
public final class If5 implements JGN {
    public final 1Br A00 = 1Bq.A00(115668);

    public void Cm2(HBP hbp) {
        AudioApi AXg;
        if (hbp != null) {
            1Bn.A0A(115739);
            Ia1 A0d = GOq.A0d();
            if (A0d == null || (AXg = A0d.A02.AXg()) == null) {
                return;
            }
            AXg.setAudioOutputRoute(Hvn.A00(hbp));
            IEj A0o = GOp.A0o(this.A00);
            synchronized (A0o) {
                A0o.A08.ALc("RtcAudioHandler", "Audio output route changed to %s", hbp.toString());
                A0o.A0A.A00 = hbp;
            }
        }
    }
}
