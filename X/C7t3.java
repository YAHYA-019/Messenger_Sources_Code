package X;

import android.net.ConnectivityManager;
import com.facebook.inject.FbInjector;

/* renamed from: X.7t3, reason: invalid class name */
/* loaded from: 7t3.class */
public final class C7t3 {
    public static final long A00() {
        Object systemService = FbInjector.A00().getSystemService("connectivity");
        11T.A0I(systemService, 1BJ.A00(8));
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) != null) {
            return r0.getLinkDownstreamBandwidthKbps();
        }
        return 0L;
    }
}
