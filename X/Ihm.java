package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: Ihm.class */
public final class Ihm implements JJ7 {
    public String A02;
    public final 5Kz A03;
    public String A01 = "unknown";
    public long A00 = -1;
    public final 6UY A04 = new 6UY(20, true);
    public volatile String A05 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;

    public Ihm(5Kz r302) {
        this.A03 = r302;
    }

    public void A00(String str, String str2) {
        if (11T.A0O(this.A05, str)) {
            return;
        }
        this.A05 = str;
        if (str2 != null) {
            str = 0Pz.A0Y(str, str2, '-');
        }
        this.A04.A01(str);
    }

    @Override // X.JJ7
    public void CUZ() {
        this.A01 = "view_attached";
        5Kz r0 = this.A03;
        String str = this.A02;
        if (str == null) {
            str = "null";
        }
        r0.BcY(str, "surface_state_attach_player_view");
        A00("ATTACH_PLAYER_VIEW", null);
    }

    @Override // X.JJ7
    public void CUe() {
        A00("DETACH_PLAYER_VIEW", null);
        5Kz r0 = this.A03;
        String str = this.A02;
        if (str == null) {
            str = "null";
        }
        r0.BcY(str, "surface_state_detach_player_view");
    }
}
