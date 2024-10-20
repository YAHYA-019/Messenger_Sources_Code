package X;

import com.facebook.common.network.FbNetworkManager;

/* loaded from: Lkd.class */
public final class Lkd implements Runnable {
    public static final String __redex_internal_original_name = "FbNetworkManager$ActivityLifecycleListener$1$1";
    public final /* synthetic */ Lke A00;

    public Lkd(Lke lke) {
        this.A00 = lke;
    }

    @Override // java.lang.Runnable
    public void run() {
        FbNetworkManager.A02(FbNetworkManager.this, true);
    }
}
