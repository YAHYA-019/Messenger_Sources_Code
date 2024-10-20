package X;

import android.net.NetworkInfo;
import com.facebook.common.network.FbNetworkManager;
import java.util.concurrent.ExecutorService;

/* loaded from: Lke.class */
public final class Lke implements Runnable {
    public static final String __redex_internal_original_name = "FbNetworkManager$ActivityLifecycleListener$1";
    public final /* synthetic */ FbNetworkManager.ActivityLifecycleListener A00;

    public Lke(FbNetworkManager.ActivityLifecycleListener activityLifecycleListener) {
        this.A00 = activityLifecycleListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        FbNetworkManager fbNetworkManager = FbNetworkManager.this;
        synchronized (fbNetworkManager.A0M) {
            NetworkInfo networkInfo = fbNetworkManager.A01;
            if (networkInfo != null && networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                ((ExecutorService) fbNetworkManager.A0E.get()).execute(new Lkd(this));
            }
        }
    }
}
