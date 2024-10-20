package X;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.1e6, reason: invalid class name */
/* loaded from: 1e6.class */
public final class C1e6 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ConnectivityManager A02;
    public final /* synthetic */ C1e2 A03;
    public volatile long A01 = 0;
    public int A00 = 0;

    public C1e6(ConnectivityManager connectivityManager, C1e2 c1e2) {
        this.A03 = c1e2;
        this.A02 = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        this.A01 = network.getNetworkHandle();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(final Network network, NetworkCapabilities networkCapabilities) {
        int i;
        if (this.A01 == network.getNetworkHandle()) {
            if (networkCapabilities == null) {
                i = 0;
            } else {
                i = 1;
                if (!networkCapabilities.hasTransport(1)) {
                    i = 4;
                    if (networkCapabilities.hasTransport(0)) {
                        i = 2;
                    }
                }
            }
            if (i != this.A00) {
                this.A00 = i;
                final int i2 = i;
                this.A03.A02.execute(new Runnable() { // from class: X.1er
                    public static final String __redex_internal_original_name = "DGWNetworkInterfaceMonitor$1$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3;
                        C1e6 c1e6 = this;
                        Network network2 = network;
                        int i4 = i2;
                        if (c1e6.A01 == network2.getNetworkHandle() && (i3 = c1e6.A00) == i4) {
                            try {
                                C00j.A07("DGWNewInterface%d", Integer.valueOf(i3), 962539568);
                                c1e6.A03.A01.notifyNewInterface(c1e6.A01, c1e6.A00);
                                C00j.A01(951794432);
                            } catch (Throwable th) {
                                C00j.A01(-83109105);
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        if (this.A01 == network.getNetworkHandle()) {
            this.A01 = 0L;
            this.A00 = 0;
            this.A03.A02.execute(new Runnable() { // from class: X.3er
                public static final String __redex_internal_original_name = "DGWNetworkInterfaceMonitor$1$$ExternalSyntheticLambda2";

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
                
                    if (r309 == false) goto L16;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r301 = this;
                        r0 = r301
                        X.1e6 r0 = X.C1e6.this
                        r302 = r0
                        java.lang.String r0 = "DGWNetworkLost"
                        r303 = r0
                        r0 = -186715185(0xfffffffff4def3cf, float:-1.4131286E32)
                        r304 = r0
                        r0 = r303
                        r1 = r304
                        X.C00j.A05(r0, r1)     // Catch: java.lang.Throwable -> L66
                        r0 = r302
                        long r0 = r0.A01     // Catch: java.lang.Throwable -> L66
                        r305 = r0
                        r0 = 0
                        r307 = r0
                        r0 = r305
                        r1 = r307
                        int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                        r304 = r0
                        r0 = r304
                        if (r0 != 0) goto L60
                        r0 = 0
                        r309 = r0
                        r0 = 0
                        r303 = r0
                        r0 = r302
                        android.net.ConnectivityManager r0 = r0.A02     // Catch: java.lang.Throwable -> L66 java.lang.RuntimeException -> L6e
                        r310 = r0
                        r0 = r310
                        android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L66 java.lang.RuntimeException -> L6e
                        r310 = r0
                        r0 = r310
                        if (r0 == 0) goto L46
                        r0 = r310
                        boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L66 java.lang.RuntimeException -> L6e
                        r309 = r0
                    L41:
                        r0 = r309
                        if (r0 != 0) goto L60
                    L46:
                        r0 = r302
                        X.1e2 r0 = r0.A03     // Catch: java.lang.Throwable -> L66
                        r310 = r0
                        r0 = 0
                        r309 = r0
                        r0 = 0
                        r303 = r0
                        r0 = r310
                        com.facebook.realtime.common.appstate.AppStateSyncer r0 = r0.A01     // Catch: java.lang.Throwable -> L66
                        r310 = r0
                        r0 = r310
                        r1 = r307
                        r2 = 0
                        r0.notifyNewInterface(r1, r2)     // Catch: java.lang.Throwable -> L66
                    L60:
                        r0 = -1597337730(0xffffffffa0ca8f7e, float:-3.4315086E-19)
                        X.C00j.A01(r0)
                        return
                    L66:
                        r303 = move-exception
                        r0 = 355679174(0x15333bc6, float:3.6195915E-26)
                        X.C00j.A01(r0)
                        r0 = r303
                        throw r0
                    L6e:
                        goto L41
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C3er.run():void");
                }
            });
        }
    }
}
