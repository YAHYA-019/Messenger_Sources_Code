package X;

import android.content.Context;
import android.os.Handler;

/* loaded from: Gtm.class */
public final class Gtm extends GuG implements JPm {
    public final Icn A00;

    public Gtm(JOW jow) {
        super(jow);
        Hvf hvf = JNy.A01;
        JOW jow2 = ((GuG) this).A00;
        Icn icn = (Icn) jow2.Adn(hvf);
        if (icn == null) {
            Handler A00 = HGc.A00(jow);
            Context context = jow2.getContext();
            JQ7 jq7 = (JQ7) jow2.AdD(JQ7.A00);
            JQ9 jq9 = (JQ9) jow2.AdD(JQ9.A00);
            7zS.A16(1, context, jq7, jq9);
            Object obj = false;
            Object Adn = jow2.Adn(JPm.A00);
            boolean A1V = AnonymousClass001.A1V(Adn != null ? Adn : obj);
            I1d i1d = new I1d();
            Handler AoV = jq7.AoV("Lite-CPU-Frames-Thread");
            11T.A0A(AoV);
            this.A00 = new Icn(context, A00, AoV, IOT.A00, i1d, jq9, true, true, false, A1V);
        } else {
            JQ9 jq92 = (JQ9) jow2.AdD(JQ9.A00);
            if (jq92 != null) {
                icn.A04 = jq92;
            }
            this.A00 = icn;
        }
        Hvf hvf2 = JNy.A02;
        Object A0g = 7zN.A0g();
        Object Adn2 = jow2.Adn(hvf2);
        float A002 = 7zM.A00(Adn2 != null ? Adn2 : A0g);
        if (A002 == 0.0f) {
            throw AnonymousClass001.A0N("scaleFactor cannot be 0");
        }
        this.A00.A08(A002);
    }

    public static GuJ A00(IcA icA, JQC jqc, GuJ guJ) {
        icA.A01(jqc, guJ);
        icA.A01(new Gtm(icA), JPm.A01);
        GuJ guJ2 = JPy.A01;
        icA.A01(new C2415Gcc(icA), guJ2);
        return guJ2;
    }

    @Override // X.JQC
    public GuJ Ase() {
        return JPm.A01;
    }
}
