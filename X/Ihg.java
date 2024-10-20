package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Ihg.class */
public final class Ihg implements C4YM {
    public final /* synthetic */ Hjy A00;
    public final /* synthetic */ Set A01;

    public Ihg(Hjy hjy, Set set) {
        this.A00 = hjy;
        this.A01 = set;
    }

    /* JADX WARN: Type inference failed for: r0v95, types: [X.QxV, java.lang.Object] */
    @Override // X.C4YM
    public void BMG(String str, byte[] bArr, long j) {
        if ("/video_rt_pipe_res".equals(str)) {
            try {
                Hjy hjy = this.A00;
                24X A0J = ((AnonymousClass244) 1Br.A0B(hjy.A05)).A0J(bArr);
                24X A0D = A0J.A0D(K93.__redex_internal_original_name);
                if (A0D == null || !A0D.A0S()) {
                    return;
                }
                Hf6 hf6 = (Hf6) hjy.A06.remove(Integer.valueOf(A0D.A03()));
                if (hf6 != null) {
                    24X A0D2 = A0J.A0D(K92.__redex_internal_original_name);
                    RQJ rqj = hf6.A02;
                    long j2 = j - hf6.A01;
                    String A0H = A0D2 != null ? A0D2.A0H() : null;
                    H0s h0s = rqj.A00;
                    H0r h0r = (H0r) h0s;
                    C00i c00i = h0r.A01;
                    if (((Hmv) c00i.get()).A00()) {
                        1UG A08 = 1BK.A08(1Br.A02(h0r.A05), "cvc_v3_mqtt_event");
                        if (A08.isSampled()) {
                            A08.A7R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mqtt_response_received");
                            A08.A6H("duration_ms", Long.valueOf(j2));
                            A08.BZL();
                        }
                    }
                    try {
                        AnonymousClass243 A00 = AnonymousClass243.A00();
                        if (A0H == null) {
                            throw 1BK.A0h();
                        }
                        24X A0I = A00.A0I(A0H);
                        11T.A0A(A0I);
                        ?? obj = new Object();
                        24X A0D3 = A0I.A0D("vd");
                        if (A0D3 != null && A0D3.A0R()) {
                            ArrayList A0t = AnonymousClass001.A0t(A0D3.A05());
                            Iterator it = A0D3.iterator();
                            11T.A0A(it);
                            while (it.hasNext()) {
                                A0t.add(new RNt((24X) it.next()));
                            }
                            ((QxV) obj).A00 = A0t;
                        }
                        4YV.A11(h0r.A03).execute(new SC2(h0s, (Object) obj));
                    } catch (IOException e) {
                        0fH.A0r("CVCSubscriptionManagerWithResponse", "Error parsing json payload", e);
                        if (((Hmv) c00i.get()).A00()) {
                            1UG A082 = 1BK.A08(1Br.A02(h0r.A05), "cvc_v3_mqtt_event");
                            if (A082.isSampled()) {
                                A082.A7R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mqtt_response_bad");
                                A082.A6H("duration_ms", Long.valueOf(j2));
                                A082.A7R("error_msg", "Error parsing json payload");
                                A082.BZL();
                            }
                        }
                    }
                }
            } catch (IOException unused) {
            }
        }
    }
}
