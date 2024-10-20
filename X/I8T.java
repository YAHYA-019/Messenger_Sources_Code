package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: I8T.class */
public final class I8T {
    public static final C3RM A0A = new Object();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;

    public I8T() {
        this("");
    }

    public I8T(String str) {
        11T.A0F(str, 1);
        this.A00 = str;
        this.A08 = AbG.A0M();
        this.A07 = 1Bq.A00(67199);
        this.A09 = 1Bq.A00(66793);
    }

    public void A00(String str, String str2) {
        11T.A0F(str, 0);
        if (this.A06) {
            return;
        }
        JSONObject jSONObject = null;
        if (str2 != null) {
            try {
                jSONObject = DKC.A1F(str2);
            } catch (JSONException e) {
                if (e.getMessage() != null) {
                    1Br.A04(this.A08).D0v("AREngineServices::CameraARAnalyticsLogger::onLoggedRawEvent", e.getMessage());
                }
            }
        }
        1Rf A01 = 1RX.A01((1RX) 1Br.A0B(this.A07), 0S2.A00, (String) null, str, false);
        11T.A0A(A01);
        if (A01.A0D()) {
            A01.A08("camera_product_name", this.A00);
            A01.A08("product_session_id", this.A05);
            A01.A08("effect_id", this.A02);
            A01.A08("effect_instance_id", this.A03);
            A01.A08("delivery_operation_id", this.A01);
            A01.A08("effect_session_id", this.A04);
            if (jSONObject != null) {
                try {
                    07S A09 = A01.A09();
                    11T.A0A(A09);
                    C3RM.A00(A0A, A09, jSONObject);
                } catch (JSONException e2) {
                    if (e2.getMessage() != null) {
                        1Br.A04(this.A08).D0v("AREngineServices::CameraARAnalyticsLogger::logWithEventBuilder", e2.getMessage());
                    }
                }
            }
            A01.A0B();
        }
    }
}
