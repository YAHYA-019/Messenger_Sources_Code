package X;

import android.os.Bundle;
import com.facebook.fbservice.service.ServiceException;

/* loaded from: GL5.class */
public interface GL5 {
    static String A00(GL5 gl5) {
        Bundle AX2 = gl5.AX2();
        return AX2 != null ? AX2.getString("payment_type", "PAYMENT_SETTINGS") : "PAYMENT_SETTINGS";
    }

    void AGC(int i, String str);

    void AGY(int i, String str);

    Bundle AX2();

    String B25();

    long B2w();

    String BCk(String str);

    EO0 BIa();

    void BMd(ServiceException serviceException, GKX gkx, boolean z);

    void Bbj();

    void BfQ();

    void BzT();

    void CBp();

    void CLm();

    void CsG(int i);

    void D36(String str, String str2);

    void D4Z(int i);
}
