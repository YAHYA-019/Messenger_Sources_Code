package X;

import com.facebook.zero.common.zerobalance.ZeroBalanceUrlConfig;
import java.io.IOException;

/* loaded from: Kpp.class */
public final class Kpp {
    public final C00i A00 = AbH.A0S();
    public final C00i A01 = 1BQ.A00();
    public final C00i A02 = 1BQ.A01();

    public ZeroBalanceUrlConfig A00() {
        ZeroBalanceUrlConfig zeroBalanceUrlConfig = new ZeroBalanceUrlConfig();
        ZeroBalanceUrlConfig zeroBalanceUrlConfig2 = new ZeroBalanceUrlConfig();
        C00i c00i = this.A01;
        String BCy = 1BK.A0N(c00i).BCy(36874287104524599L);
        if (BCy != null) {
            zeroBalanceUrlConfig2.mRedirectedFreeUrl = BCy;
        }
        String BCy2 = 1BK.A0N(c00i).BCy(36874287105048890L);
        if (BCy2 != null) {
            zeroBalanceUrlConfig2.mTimeoutFreeUrl = BCy2;
        }
        String BCy3 = 1BK.A0N(c00i).BCy(36874287104590136L);
        if (BCy3 != null) {
            zeroBalanceUrlConfig2.mRedirectedPaidUrl = BCy3;
        }
        String BCy4 = 1BK.A0N(c00i).BCy(36874287105114427L);
        if (BCy4 != null) {
            zeroBalanceUrlConfig2.mTimeoutPaidUrl = BCy4;
        }
        String BCy5 = 1BK.A0N(c00i).BCy(36874287104983353L);
        if (BCy5 != null) {
            zeroBalanceUrlConfig2.mTimeoutExternalUrl = BCy5;
        }
        String BCy6 = 1BK.A0N(c00i).BCy(36874287104983353L);
        if (BCy6 != null) {
            zeroBalanceUrlConfig2.mRedirectedExternalUrl = BCy6;
        }
        zeroBalanceUrlConfig2.mPingTimeoutSeconds = 30;
        zeroBalanceUrlConfig2.mTimeoutTotalFreePingsRetries = 1;
        zeroBalanceUrlConfig2.mTimeoutTotalPaidPingsRetries = 3;
        zeroBalanceUrlConfig2.mTimeoutTotalExternalPingsRetries = 3;
        zeroBalanceUrlConfig2.mRedirectTotalPingRetries = 1;
        zeroBalanceUrlConfig2.mZbDisableInterval = 180;
        String A3a = 1BK.A0R(this.A00).A3a((1G2) DKG.A0w().A0e.getValue(), "");
        if (A3a.equals("")) {
            return zeroBalanceUrlConfig2;
        }
        try {
            ZeroBalanceUrlConfig zeroBalanceUrlConfig3 = (ZeroBalanceUrlConfig) AnonymousClass243.A00().A0V(A3a, ZeroBalanceUrlConfig.class);
            if (zeroBalanceUrlConfig3 != null && !zeroBalanceUrlConfig3.equals(zeroBalanceUrlConfig)) {
                return zeroBalanceUrlConfig3;
            }
            1BK.A09(this.A02).D0v("ZeroBalanceUrlConfigsRetriever", "Zero Balance Url Configs result is null");
            return zeroBalanceUrlConfig2;
        } catch (IOException e) {
            0fH.A0s("ZeroBalanceUrlConfigsRetriever", "Error while reading Json", e);
            1BK.A09(this.A02).D0v("ZeroBalanceUrlConfigsRetriever", "Error while reading Json");
            return zeroBalanceUrlConfig2;
        }
    }
}
