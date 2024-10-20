package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: F94.class */
public final class F94 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final QuickPerformanceLogger A04;

    public F94() {
        this.A00 = 1BK.A0C();
        this.A01 = 1Bq.A00(16964);
        this.A03 = 1Bq.A00(98453);
        this.A02 = 1Bq.A00(98448);
        this.A04 = DKE.A0d();
    }

    public F94(int i) {
    }

    public void A00(Context context, 67O r303, Object obj, String str) {
        String str2;
        String str3;
        11T.A0F(context, 0);
        boolean A1Z = 7zP.A1Z(r303);
        if (02L.A0C(str, new String[]{1BJ.A00(ActionId.CONTROLLER_INITIATED), 1BJ.A00(23)})) {
            QuickPerformanceLogger quickPerformanceLogger = this.A04;
            quickPerformanceLogger.markerStart(238949909);
            quickPerformanceLogger.markerAnnotate(238949909, "interstitial_type", str);
        }
        if (!1Br.A07(this.A00).AZk(36316443863689439L)) {
            ((FIP) 1Br.A0B(this.A03)).A07(context, r303, obj, str);
            return;
        }
        FbUserSession A0E = 4YV.A0E(context);
        Eqj eqj = (Eqj) 1Br.A0B(this.A02);
        11T.A0F(A0E, 0);
        boolean A1Z2 = DKE.A1Z(1Br.A09(eqj.A04), ((1Ky) 1Bn.A0A(98565)).A0D);
        C00i c00i = eqj.A0A.A00;
        ETV A08 = ((C01663sh) c00i.get()).A08(A0E, "upsell_dialog_flow");
        if ((A08 == null || (str3 = A08.A02) == null || str3.length() == 0) && !A1Z2) {
            r303.BqY(obj);
            return;
        }
        eqj.A00 = r303;
        eqj.A02 = obj;
        EAW eaw = new EAW(context, 1Br.A04(eqj.A03), r303, obj);
        eqj.A01 = eaw;
        eaw.show();
        1Iw A0W = 7zL.A0W(context);
        ETV A082 = ((C01663sh) c00i.get()).A08(A0E, "upsell_dialog_flow");
        if (A082 != null) {
            str2 = A082.A02;
            11T.A0A(str2);
        } else {
            str2 = "";
        }
        GraphQlQueryParamSet A0M = 7zL.A0M();
        DKF.A1R(A0M, eqj.A06);
        A0M.A05("feature_key", str);
        A0M.A05("device_id_string", ((1H2) 1Br.A0B(eqj.A08)).A02());
        A0M.A05("encrypted_subno", str2);
        A0M.A05(TraceFieldType.NetworkType, ((3sT) 1Br.A0B(eqj.A09)).A01());
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "ZeroMessengerUpsellsEmbedBloksQuery", (String) null, "fbandroid", 1567073466, 0, 942510813L, 942510813L, false, A1Z);
        DKF.A1Q(A0M, r0);
        1Br.A0D(eqj.A07, FwJ.A00(eqj, A0W, 44), 7zT.A09(eqj.A05).A09(C3sa.A00(r0)));
    }

    public void A01(Context context, 67O r303, String str) {
        7zT.A1S(context, str, r303);
        if (((2BQ) 1Br.A0B(this.A01)).A05(str)) {
            A00(context, r303, null, str);
        } else {
            r303.BqY((Object) null);
        }
    }
}
