package X;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.facebook.common.networkmonitor.NetworkConnectionMonitor;
import org.webrtc.NetworkMonitor;

/* renamed from: X.1o4, reason: invalid class name */
/* loaded from: 1o4.class */
public final class C1o4 extends C1o5 {
    public final C1nV A00;
    public final C32o A01;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.32o] */
    public C1o4(C1nV c1nV) {
        11T.A0F(c1nV, 1);
        this.A00 = c1nV;
        final int i = 2;
        this.A01 = new ConnectivityManager.NetworkCallback(this, i) { // from class: X.32o
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = this;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                switch (this.A00) {
                    case 0:
                        ((NetworkConnectionMonitor) this.A01).A04 = 0S2.A01;
                        0fH.A0j("ConnectionMonitor", "Connection available");
                        return;
                    case 1:
                        11T.A0F(network, 0);
                        2Dv r0 = (2Dv) this.A01;
                        ConnectivityManager connectivityManager = r0.A01;
                        if (connectivityManager != null) {
                            2Dv.A00(connectivityManager.getLinkProperties(network), connectivityManager.getNetworkCapabilities(network), r0);
                            return;
                        }
                        return;
                    case 2:
                        11T.A0F(network, 0);
                        super.onAvailable(network);
                        final 1nU r02 = ((C1o4) this.A01).A00.A00;
                        r02.A03.A01(new Runnable() { // from class: X.1o6
                            public static final String __redex_internal_original_name = "NetworkAwareClientWrapper$networkCallback$1$networkAvailable$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                1nK r03 = r02.A00;
                                if (r03 != null) {
                                    r03.onNetworkAvailable();
                                }
                            }
                        });
                        return;
                    default:
                        super.onAvailable(network);
                        return;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v46 */
            /* JADX WARN: Type inference failed for: r0v48 */
            /* JADX WARN: Type inference failed for: r2v3, types: [int] */
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                switch (this.A00) {
                    case 0:
                        NetworkConnectionMonitor networkConnectionMonitor = (NetworkConnectionMonitor) this.A01;
                        networkConnectionMonitor.A03 = networkCapabilities;
                        networkConnectionMonitor.A04 = 0S2.A0C;
                        0fH.A0j("ConnectionMonitor", "CapabilitesChanged");
                        return;
                    case 1:
                        11T.A0F(networkCapabilities, 1);
                        2Dv.A00((LinkProperties) null, networkCapabilities, (2Dv) this.A01);
                        return;
                    case 2:
                        boolean A1X = 1BL.A1X(network, networkCapabilities);
                        try {
                            super.onCapabilitiesChanged(network, networkCapabilities);
                            boolean z = true;
                            boolean hasTransport = networkCapabilities.hasTransport(A1X ? 1 : 0);
                            boolean hasTransport2 = networkCapabilities.hasTransport(0);
                            boolean z2 = z;
                            if (!networkCapabilities.hasTransport(3)) {
                                z2 = z;
                                if (!networkCapabilities.hasTransport(2)) {
                                    z2 = z;
                                    if (!networkCapabilities.hasTransport(4)) {
                                        z2 = false;
                                    }
                                }
                            }
                            C1o4 c1o4 = (C1o4) this.A01;
                            if (hasTransport2) {
                                hasTransport = (hasTransport ? 1 : 0) | 2;
                            }
                            if (z2) {
                                hasTransport = (hasTransport ? 1 : 0) | 4;
                            }
                            final 1nU r0 = c1o4.A00.A00;
                            final ?? r2 = hasTransport;
                            r0.A03.A01(new Runnable() { // from class: X.1o7
                                public static final String __redex_internal_original_name = "NetworkAwareClientWrapper$networkCallback$1$networkInterfaceChanged$1";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1lu.A00 = 0S2.A0C;
                                    1nK r02 = r0.A00;
                                    if (r02 != null) {
                                        r02.onNetworkInterfaceChanged(r2);
                                    }
                                }
                            });
                            return;
                        } catch (SecurityException e) {
                            0fH.A0r(NetworkMonitor.TAG, "Error getting network information.", e);
                            return;
                        }
                    default:
                        super.onCapabilitiesChanged(network, networkCapabilities);
                        return;
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                switch (this.A00) {
                    case 0:
                        0fH.A0j("ConnectionMonitor", "Link Properties Changed");
                        return;
                    case 1:
                        11T.A0F(linkProperties, 1);
                        2Dv.A00(linkProperties, (NetworkCapabilities) null, (2Dv) this.A01);
                        return;
                    case 2:
                    default:
                        super.onLinkPropertiesChanged(network, linkProperties);
                        return;
                    case 3:
                        0fH.A0h(linkProperties.getHttpProxy(), "ProxyInfoConfigReader", "onLinkPropertiesChanged %s");
                        ((Runnable) this.A01).run();
                        return;
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                switch (this.A00) {
                    case 0:
                        ((NetworkConnectionMonitor) this.A01).A04 = 0S2.A0Y;
                        0fH.A0j("ConnectionMonitor", "Connection lost");
                        return;
                    case 2:
                        11T.A0F(network, 0);
                        super.onLost(network);
                        0fH.A0j(NetworkMonitor.TAG, AnonymousClass001.A0Z(network, "Network lost ", AnonymousClass001.A0k()));
                        final 1nU r0 = ((C1o4) this.A01).A00.A00;
                        r0.A03.A01(new Runnable() { // from class: X.3fj
                            public static final String __redex_internal_original_name = "NetworkAwareClientWrapper$networkCallback$1$networkUnavailable$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                1nU r02 = r0;
                                if (1mP.A00(r02.A02)) {
                                    return;
                                }
                                C1lu.A00 = 0S2.A01;
                                1nK r03 = r02.A00;
                                if (r03 != null) {
                                    r03.onNetworkUnavailable();
                                }
                            }
                        });
                        return;
                    default:
                        super.onLost(network);
                        return;
                }
            }
        };
    }
}
