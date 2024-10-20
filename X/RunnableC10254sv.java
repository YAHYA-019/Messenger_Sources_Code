package X;

import com.facebook.common.connectionstatus.FbDataConnectionManager;
import com.facebook.common.network.FbNetworkManager;

/* renamed from: X.4sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4sv.class */
public final class RunnableC10254sv implements Runnable {
    public static final String __redex_internal_original_name = "FbDataConnectionManager$NetworkConnectivityChangeRunnable";
    public boolean A00;
    public final /* synthetic */ FbDataConnectionManager A01;

    public RunnableC10254sv(FbDataConnectionManager fbDataConnectionManager, boolean z) {
        this.A01 = fbDataConnectionManager;
        this.A00 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        FbDataConnectionManager fbDataConnectionManager = this.A01;
        if (((FbNetworkManager) fbDataConnectionManager.A07.get()).A0M() == this.A00) {
            FbDataConnectionManager.A00(fbDataConnectionManager);
        }
    }
}
