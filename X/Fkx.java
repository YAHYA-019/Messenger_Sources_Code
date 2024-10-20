package X;

import android.content.Intent;
import com.facebook.payments.auth.dynamicdescriptor.DDExternalIntentActivity;

/* loaded from: Fkx.class */
public final class Fkx implements GI5 {
    public final /* synthetic */ CfG A00;
    public final /* synthetic */ DDExternalIntentActivity A01;

    public Fkx(CfG cfG, DDExternalIntentActivity dDExternalIntentActivity) {
        this.A01 = dDExternalIntentActivity;
        this.A00 = cfG;
    }

    @Override // X.GI5
    public void CHD(DkY dkY, Integer num, String str) {
        this.A00.D2v();
        if (dkY != null && num == 0S2.A01) {
            String A0u = dkY.A0u();
            if ("IN_PROGRESS".equals(A0u) || "REQUIRED".equals(A0u) || "RETRIES_EXCEEDED".equals(A0u)) {
                DDExternalIntentActivity dDExternalIntentActivity = this.A01;
                Intent A00 = F54.A00(dDExternalIntentActivity, (F54) 4YU.A0p(dDExternalIntentActivity.A01), A0u, dDExternalIntentActivity.A03);
                if (A00 != null) {
                    0LS.A0A(dDExternalIntentActivity, A00);
                }
            }
        }
        this.A01.finish();
    }

    @Override // X.GI5
    public void CHE(DkY dkY) {
        this.A00.D2v();
        if (dkY != null) {
            String A0u = dkY.A0u();
            if ("IN_PROGRESS".equals(A0u) || "REQUIRED".equals(A0u) || "RETRIES_EXCEEDED".equals(A0u)) {
                DDExternalIntentActivity dDExternalIntentActivity = this.A01;
                Intent A00 = F54.A00(dDExternalIntentActivity, (F54) 4YU.A0p(dDExternalIntentActivity.A01), A0u, dDExternalIntentActivity.A03);
                if (A00 != null) {
                    0LS.A0A(dDExternalIntentActivity, A00);
                }
            }
        }
        this.A01.finish();
    }
}
