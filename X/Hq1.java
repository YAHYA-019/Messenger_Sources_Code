package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

/* loaded from: Hq1.class */
public final class Hq1 {
    public IP7 A00;
    public HXY A01;
    public Long A02;
    public final 1De A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;

    public Hq1(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A06 = 1Bu.A03(r0, 115738);
        this.A05 = 1Bu.A03(r0, 115285);
        this.A04 = 1Bu.A03(r0, 67579);
    }

    public final void A00(Integer num) {
        if (this.A02 != null && num != 0S2.A15) {
            1Br.A0C(this.A06);
            VideoEffectCommunicationApi A00 = HvW.A00();
            if (A00 != null) {
                A00.setGroupEffectStatus(this.A02, 5);
            }
        }
        1Br.A0C(this.A06);
        VideoEffectCommunicationApi A002 = HvW.A00();
        if (A002 != null) {
            A002.multipeerStopListening();
        }
        IP7 ip7 = this.A00;
        if (ip7 != null) {
            ip7.A01.clear();
            ip7.A00.clear();
        }
        this.A02 = null;
        this.A00 = null;
    }
}
