package X;

import com.facebook.privacy.e2ee.backuprestore.IVestaServerRestoreProvider;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.UUID;

/* loaded from: Kpy.class */
public final class Kpy {
    public Integer A00;
    public Integer A01;
    public final IVestaServerRestoreProvider A02;
    public final Integer A03;

    public Kpy(IVestaServerRestoreProvider iVestaServerRestoreProvider, Integer num) {
        this.A02 = iVestaServerRestoreProvider;
        this.A03 = num;
    }

    public final void A00(L5J l5j, MID mid, String str, String str2) {
        UUID A00 = C04I.A00();
        11T.A0A(A00);
        String A02 = 11T.A02(A00);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = l5j.A02;
        int i = l5j.A00;
        int i2 = l5j.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "request_uuid", A02);
        lightweightQuickPerformanceLogger.markerPoint(i, i2, "init_login_network_start");
        this.A02.initLogin(KVX.A00(this.A03), str2, new LXp(l5j, mid, this, str, str2, A02), A02);
    }
}
