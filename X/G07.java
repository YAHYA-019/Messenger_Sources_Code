package X;

import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.informationidentify.activity.PIIActivity;

/* loaded from: G07.class */
public final class G07 implements Runnable {
    public static final String __redex_internal_original_name = "PIIHttpsDataCommunicationHandler$3";
    public final /* synthetic */ F8W A00;

    public G07(F8W f8w) {
        this.A00 = f8w;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        Edb edb = this.A00.A01;
        if (edb != null) {
            PIIActivity pIIActivity = edb.A00;
            EnU enU = (EnU) pIIActivity.A0b.get();
            FbUserSession fbUserSession = pIIActivity.A07;
            fbUserSession.getClass();
            String str2 = pIIActivity.A0H;
            F8W f8w = pIIActivity.A0F;
            int i = f8w.A00;
            String str3 = f8w.A04;
            07S A0J = 4YU.A0J(GraphQlCallInput.A02, str2, "form_id");
            07S.A00(A0J, Integer.valueOf(i), "code");
            07S.A00(A0J, str3, "status");
            Q6j q6j = new Q6j();
            4YV.A1A(A0J, ((2Jf) q6j).A00, "input");
            F8L.A00(enU.A02, q6j).A01("pii_form_status_mutation_start", null);
            DKF.A0h(enU.A03).A04(C2083Db8.A00(enU, 3), AbK.A0z(1VX.A07(enU.A01, fbUserSession), new 5Dh(q6j), 628899357744450L), "form_status_mutation");
            LithoView lithoView = pIIActivity.A0A;
            1Iw r0 = lithoView.A09;
            boolean z = true;
            if (pIIActivity.A01 < pIIActivity.A02 - 1) {
                z = false;
            }
            lithoView.A0x(pIIActivity.A3B(r0, z));
            C00i c00i = pIIActivity.A0Z;
            DKF.A0R(c00i).A01("pii_business_response_received", null);
            F8W f8w2 = pIIActivity.A0F;
            pIIActivity.A0O = f8w2.A06;
            pIIActivity.A0P = f8w2.A07;
            Integer num = f8w2.A02;
            if (num == 0S2.A00) {
                pIIActivity.finish();
            } else if (num == 0S2.A0C) {
                pIIActivity.A3E(null, pIIActivity.getResources().getString(2131953181), null);
            } else if (num == 0S2.A0N) {
                pIIActivity.A3E(pIIActivity.A0V, TextUtils.isEmpty(f8w2.A03) ? pIIActivity.getResources().getString(2131956980) : pIIActivity.A0F.A03, pIIActivity.getResources().getString(2131955906));
            } else {
                if (num == 0S2.A0Y) {
                    str = "Your response schema is wrong. Please check developers guide.";
                } else if (num == 0S2.A0j) {
                    str = "Your response content does not match your original PII form request.";
                } else if (num == 0S2.A01) {
                    DKF.A0R(c00i).A01("pii_business_error_fields_impression", null);
                    boolean z2 = false;
                    pIIActivity.A01 = 0;
                    int i2 = 0;
                    while (i2 <= pIIActivity.A02 - 1 && !1BL.A1Z(pIIActivity.A0P, i2)) {
                        i2 = pIIActivity.A01 + 1;
                        pIIActivity.A01 = i2;
                    }
                    pIIActivity.A0D = pIIActivity.A06.A0b(String.valueOf(pIIActivity.A01));
                    C06c A0G = 7zL.A0G(pIIActivity.A06);
                    A0G.A0H(pIIActivity.A0C);
                    A0G.A0K(pIIActivity.A0D);
                    A0G.A04();
                    DYx dYx = pIIActivity.A0D;
                    pIIActivity.A0C = dYx;
                    if (dYx != null) {
                        dYx.A1X(pIIActivity.A0O);
                        DKF.A1Y(pIIActivity.A0P, pIIActivity.A01);
                        LithoView lithoView2 = pIIActivity.A0A;
                        1Iw r02 = lithoView2.A09;
                        if (pIIActivity.A01 >= pIIActivity.A02 - 1) {
                            z2 = true;
                        }
                        lithoView2.A0x(pIIActivity.A3B(r02, z2));
                    }
                } else {
                    pIIActivity.A3E(null, pIIActivity.getResources().getString(2131953181), null);
                    PIIActivity.A15(pIIActivity);
                }
                FHb.A02 = str;
                pIIActivity.A3E(null, pIIActivity.getResources().getString(2131953181), null);
                PIIActivity.A15(pIIActivity);
            }
            pIIActivity.A0G.setVisibility(8);
        }
    }
}
