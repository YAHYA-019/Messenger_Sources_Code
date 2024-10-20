package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: Iz6.class */
public final class Iz6 implements Runnable {
    public static final String __redex_internal_original_name = "VideoRealtimeMsgPipe$setupHandler$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Hjy A01;

    public Iz6(Hjy hjy, int i) {
        this.A01 = hjy;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hjy hjy = this.A01;
        Hf6 hf6 = (Hf6) hjy.A06.remove(Integer.valueOf(this.A00));
        if (hf6 != null) {
            RQJ rqj = hf6.A02;
            long A01 = 1Br.A01(hjy.A04) - hf6.A00;
            H0r h0r = (H0r) rqj.A00;
            if (((Hmv) h0r.A01.get()).A00()) {
                1UG A08 = 1BK.A08(1Br.A02(h0r.A05), "cvc_v3_mqtt_event");
                if (A08.isSampled()) {
                    A08.A7R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mqtt_response_timeout");
                    A08.A6H("duration_ms", Long.valueOf(A01));
                    A08.BZL();
                }
            }
        }
    }
}
