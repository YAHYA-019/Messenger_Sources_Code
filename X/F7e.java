package X;

import com.facebook.common.util.TriState;

/* loaded from: F7e.class */
public final class F7e {
    public static final 1G2 A02 = 1G3.A00(1G0.A06, "sim_number_consents/");
    public final 1Br A01 = 1BK.A0E();
    public final 1Br A00 = 1Bq.A00(16960);

    public final boolean A00(String str, String str2) {
        11T.A0F(str, 0);
        1G2 A00 = 1G3.A00(A02.A0D(0Pz.A0J(String.valueOf(str.hashCode()), '/')), str2);
        C00i c00i = this.A01.A00;
        TriState AZo = 1BK.A0S(c00i).AZo(A00);
        ((2Iq) 1Br.A0B(this.A00)).A00(7zO.A0w("%s.%s", new Object[]{"tnc_sim_api_enforcement_v3.consent_state", AZo}));
        if (str2.equals("UNKNOWN_PURPOSE") && AZo == TriState.UNSET) {
            return true;
        }
        return 1BK.A0S(c00i).AZn(A00, false);
    }
}
