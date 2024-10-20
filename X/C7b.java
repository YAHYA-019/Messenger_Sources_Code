package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: C7b.class */
public final class C7b {
    public final C00i A00 = AbH.A0S();
    public final C00i A01 = 1BV.A00(131260);
    public final C00i A03 = 1BV.A00(85267);
    public final C00i A02 = 1BQ.A01();

    public String A00(String str, int i, int i2, boolean z, boolean z2) {
        String str2;
        String str3;
        if (((1CQ) this.A01.get()).A09(ActionId.RTMP_CONNECTION_CONNECTED, false) || z2 || !1BK.A0R(this.A00).AZn(5SH.A0A, false)) {
            str2 = null;
            if (!z2) {
                int intValue = (i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0S2.A00 : 0S2.A0Y : 0S2.A0N : 0S2.A0C : 0S2.A01).intValue();
                if (intValue != 1) {
                    if (intValue == 2) {
                        if (!5SI.A03(1BK.A09(this.A02), 1BK.A0R(this.A00), str, i2, false)) {
                            str3 = "banner_not_seen_for_consent_based_normal_transparency";
                            ((C2Q) this.A03.get()).A00(BOe.A07, "HeaderTransparencyConsent", (String) null, i, i2, false, z);
                            return str3;
                        }
                    } else if (intValue == 0 && !5SI.A04(1BK.A0R(this.A00))) {
                        str3 = "banner_not_seen_for_normal_transparency";
                        ((C2Q) this.A03.get()).A00(BOe.A07, "HeaderTransparencyConsent", (String) null, i, i2, false, z);
                        return str3;
                    }
                } else if (!A01(i2, str, z)) {
                    str3 = "not_consented";
                    ((C2Q) this.A03.get()).A00(BOe.A07, "HeaderTransparencyConsent", (String) null, i, i2, false, z);
                    return str3;
                }
            }
        } else {
            ((C2Q) this.A03.get()).A00(BOe.A08, "HeaderRequestController", (String) null, i, i2, true, z);
            str2 = "opted_out";
        }
        return str2;
    }

    public boolean A01(int i, String str, boolean z) {
        C00i c00i = this.A00;
        if (!z) {
            return 5SI.A04(1BK.A0R(c00i));
        }
        return 5SI.A02(1BK.A09(this.A02), 1BK.A0R(c00i), str, i);
    }
}
