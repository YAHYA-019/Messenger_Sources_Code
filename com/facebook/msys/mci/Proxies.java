package com.facebook.msys.mci;

import X.1Ne;
import X.1SL;
import X.C99r;

/* loaded from: Proxies.class */
public class Proxies {
    public static boolean sConfigured;

    static {
        1SL.A00();
    }

    public static void configure(ProxyProvider proxyProvider) {
        synchronized (Proxies.class) {
            if (sConfigured) {
                throw new IllegalStateException();
            }
            sConfigured = true;
            if (1Ne.A00(20)) {
                C99r.A00 = proxyProvider.getMediaTranscoder();
            }
            configureInternal(proxyProvider);
        }
    }

    public static native void configureInternal(ProxyProvider proxyProvider);

    public static boolean isMCPEnabledForProxies(int i) {
        return 1Ne.A00(i);
    }
}
