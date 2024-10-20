package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import com.facebook.conditionalworker.ConditionalWorkerManager;
import com.facebook.inject.FbInjector;

/* renamed from: X.4A5, reason: invalid class name */
/* loaded from: 4A5.class */
public final class C4A5 {
    public 1PA A00;
    public final Context A01;
    public final Handler A02;
    public final 1I7 A03;
    public final 1CO A04;
    public final C4A6 A05;
    public volatile ConditionalWorkerManager A06;
    public volatile C4Ay A07;

    public C4A5() {
        Context A00 = FbInjector.A00();
        1I7 r0 = (1I7) 1Hv.A02(FbInjector.A00(), 65730);
        C4A6 c4a6 = (C4A6) 1Bi.A03(100199);
        1CO r02 = (1CO) 1Bi.A03(16385);
        Handler handler = (Handler) 1Bn.A0A(16453);
        this.A01 = A00;
        this.A03 = r0;
        this.A05 = c4a6;
        this.A04 = r02;
        this.A02 = handler;
    }

    public static C4Ay A00(C4A5 c4a5) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Context context = c4a5.A01;
        C4Ay c4Ay = null;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && (activeNetworkInfo = (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            if (!connectivityManager.isActiveNetworkMetered()) {
                return C4Ay.CONNECTED_UNMETERED;
            }
            c4Ay = C4Ay.CONNECTED_METERED;
        }
        return c4Ay;
    }
}
