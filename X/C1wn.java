package X;

import java.util.Set;

/* renamed from: X.1wn, reason: invalid class name */
/* loaded from: 1wn.class */
public final class C1wn {
    public final 1Br A01 = 1Bq.A00(65997);
    public final 1Br A02 = 1Bu.A00(66524);
    public final 1Br A00 = 1Bq.A00(68885);

    public final boolean A00(Set set) {
        String str;
        String str2;
        if (11T.A0O(((C1wi) this.A00.A00.get()).A01(), true)) {
            0fH.A0j("PasskeyUpsellFlowHelper", "Device is onboarded");
            C1ud c1ud = (C1ud) this.A01.A00.get();
            if (C1ud.A00(c1ud).AZr(c1ud.A02, 36316426695223319L)) {
                0fH.A0j("PasskeyUpsellFlowHelper", "Passkey upsell is enabled");
                C00i c00i = this.A02.A00;
                C1wk A0G = 1BK.A0G(c00i);
                boolean AZn = C1wk.A03(A0G).AZn(C1wg.A01(A0G, 1NK.A5s, 1), false);
                0fH.A0j("NuxFlagManager", 0Pz.A1C("EB passkey upsell flow has been finished: ", AZn));
                0fH.A0j("PasskeyUpsellFlowHelper", 0Pz.A1C("Passkey upsell flow finished: ", AZn));
                if (AZn) {
                    return false;
                }
                if (set == null) {
                    str2 = "vdSet is null";
                } else {
                    if (set.contains(C96p.A0E)) {
                        0fH.A0j("PasskeyUpsellFlowHelper", "Passkey VD found in backup");
                        1BK.A0G(c00i).A0H();
                        return false;
                    }
                    str2 = "No passkey VD found in backup";
                }
                0fH.A0j("PasskeyUpsellFlowHelper", str2);
                return true;
            }
            str = "Passkey upsell is not enabled";
        } else {
            str = "Device is not onboarded";
        }
        0fH.A0j("PasskeyUpsellFlowHelper", str);
        return false;
    }
}
