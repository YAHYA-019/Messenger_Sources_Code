package com.facebook.msys.mci;

import X.11T;
import X.1SL;
import X.1Uk;
import X.1YW;
import X.AnonymousClass001;
import X.C1m1;
import com.facebook.common.network.FbNetworkManager;

/* loaded from: Connectivity.class */
public class Connectivity {
    public static 1YW sConnectivityHandler;
    public static boolean sInitialized;

    static {
        1SL.A00();
    }

    public static void ensureInitialized() {
        synchronized (Connectivity.class) {
            if (sConnectivityHandler == null) {
                throw AnonymousClass001.A0N("Connectivity is not initialized");
            }
        }
    }

    public static int getDgwState(String str) {
        int A00;
        synchronized (Connectivity.class) {
            ensureInitialized();
            1YW r0 = sConnectivityHandler;
            11T.A0F(str, 0);
            A00 = ((1Uk) r0.A01.A00.get()).A00(str);
        }
        return A00;
    }

    public static int getMqttState() {
        int i;
        synchronized (Connectivity.class) {
            ensureInitialized();
            i = 2;
            if (((C1m1) sConnectivityHandler.A00.A00.get()).A03()) {
                i = 1;
            }
        }
        return i;
    }

    public static int getNetworkState() {
        int i;
        synchronized (Connectivity.class) {
            ensureInitialized();
            i = 2;
            if (((FbNetworkManager) sConnectivityHandler.A02.A00.get()).A0M()) {
                i = 1;
            }
        }
        return i;
    }

    public static native void nativeInitialize();
}
