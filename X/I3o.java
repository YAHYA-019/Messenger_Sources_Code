package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: I3o.class */
public final class I3o {
    public Long A00;
    public Long A01;
    public Long A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1De A06;

    public I3o(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        this.A03 = fbUserSession;
        this.A05 = 1Bq.A00(16705);
        this.A04 = 7zM.A0h(r303, 114938);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 2:
                return "halo_primary_controls";
            case 3:
                return "halo_details";
            case 4:
                return "reactions_tray";
            default:
                return "lower_hand_reminder_cta";
        }
    }

    public final void A01(Integer num) {
        UserFlowLogger A0Z = 4YV.A0Z(this.A05);
        long generateNewFlowId = A0Z.generateNewFlowId(989473313);
        AbI.A1U(A0Z, A00(num), generateNewFlowId, true);
        this.A00 = Long.valueOf(generateNewFlowId);
    }

    public final void A02(boolean z, Integer num) {
        if (!z) {
            A01(num);
            return;
        }
        UserFlowLogger A0Z = 4YV.A0Z(this.A05);
        long generateNewFlowId = A0Z.generateNewFlowId(989468398);
        AbI.A1U(A0Z, A00(num), generateNewFlowId, true);
        this.A02 = Long.valueOf(generateNewFlowId);
    }
}
