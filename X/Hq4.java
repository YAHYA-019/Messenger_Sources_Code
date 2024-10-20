package X;

import android.content.Context;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.http.historical.NetworkInfoMap;
import com.facebook.inject.FbInjector;

/* loaded from: Hq4.class */
public final class Hq4 {
    public Context A00;
    public 1PA A01;
    public NetworkInfoMap A02;
    public Context A03;
    public final 1I7 A04;
    public final FbNetworkManager A05;
    public final C00i A06;

    public Hq4() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A04 = DKD.A0H(A00);
        this.A05 = (FbNetworkManager) 1Bi.A03(16687);
        this.A06 = 1BQ.A02(84488);
        Context A002 = FbInjector.A00();
        this.A03 = A002;
        NetworkInfoMap networkInfoMap = NetworkInfoMap.A08;
        this.A02 = networkInfoMap;
        networkInfoMap.A04(A002.getFilesDir().toString(), "orca_network_map");
        1PA A01 = 1P9.A01(new 1P9(this.A04), new IgR(this, 5), 1BJ.A00(363));
        this.A01 = A01;
        A01.A00();
    }

    public void finalize() {
        int A03 = 0FI.A03(719755103);
        try {
            1PA r0 = this.A01;
            if (r0 != null) {
                r0.A01();
            }
            0FI.A09(-1171740017, A03);
        } catch (Throwable th) {
            0FI.A09(116035195, A03);
            throw th;
        }
    }
}
