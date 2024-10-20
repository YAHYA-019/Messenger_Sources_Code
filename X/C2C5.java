package X;

import com.facebook.zero.common.zerobalance.ZeroBalanceConfigs;
import java.io.IOException;

/* renamed from: X.2C5, reason: invalid class name */
/* loaded from: 2C5.class */
public final class C2C5 {
    public ZeroBalanceConfigs A00;
    public final C00i A02 = new 1BQ(33013);
    public final C00i A01 = new 1BQ(16511);

    public ZeroBalanceConfigs A00() {
        String BD0 = 1BK.A0R(this.A02).BD0((1G2) ((1Ky) 1Bn.A0A(98565)).A0a.getValue());
        if (BD0 == null) {
            0fH.A0n("ZeroBalanceConfigsRetriever", "no ZBD configs found in prefs!");
            return null;
        }
        try {
            ZeroBalanceConfigs zeroBalanceConfigs = (ZeroBalanceConfigs) AnonymousClass243.A00().A0V(BD0, ZeroBalanceConfigs.class);
            this.A00 = zeroBalanceConfigs;
            return zeroBalanceConfigs;
        } catch (IOException e) {
            1BK.A09(this.A01).softReport("ZeroBalanceConfigsRetriever", "Error while de-serializing zero balance configs", e);
            return null;
        }
    }
}
