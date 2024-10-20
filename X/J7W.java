package X;

import com.facebook.rsys.networkinfo.gen.NetworkInfoCallback;
import java.util.TimerTask;

/* loaded from: J7W.class */
public final class J7W extends TimerTask {
    public static final String __redex_internal_original_name = "OrcaNetworkInfoProxyImpl$start$lambda$1$$inlined$timerTask$1";
    public final /* synthetic */ Gxs A00;

    public J7W(Gxs gxs) {
        this.A00 = gxs;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        Gxs gxs = this.A00;
        synchronized (gxs) {
            if (0CV.A0b(gxs.A05, "WIFI", false)) {
                NetworkInfoCallback networkInfoCallback = gxs.A03;
                if (networkInfoCallback != null) {
                    Gxs.A00(gxs, networkInfoCallback);
                }
            }
        }
    }
}
