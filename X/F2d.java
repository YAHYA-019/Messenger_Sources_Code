package X;

import android.content.Context;
import com.facebook.account.login.helper.credentialmanager.CredentialManagerFetchHelper;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: F2d.class */
public abstract class F2d {
    public static final void A00(C2k6 c2k6, F76 f76, F99 f99, String str, C00m c00m, C00m c00m2) {
        7zT.A1S(c2k6, f99, c00m);
        C3o5.A0k(c00m2, 3, f76);
        Context context = c2k6.AeS().A0D;
        GBu gBu = new GBu(c2k6, f76, f99, str, c00m, c00m2);
        C01i c01i = FGU.A00;
        11T.A0F(context, 0);
        ((CredentialManagerFetchHelper) 1Hv.A02(context, 100106)).initCredentialManagerFetch(new Fa4(gBu));
    }

    public static final void A01(String str) {
        QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) 7T1.A00.get();
        11T.A0A(quickPerformanceLogger);
        quickPerformanceLogger.markerAnnotate(896612552, "landing_page", str);
        quickPerformanceLogger.markerPoint(896612552, "launching_native_login_screen_end");
        quickPerformanceLogger.markerPoint(896612552, "launching_native_login_form_end");
        quickPerformanceLogger.markerEnd(896612552, (short) 2);
    }
}
