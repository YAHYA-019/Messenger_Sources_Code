package com.facebook.traffic.ctm.api;

import X.AnonymousClass001;

/* loaded from: ClientTransportMonitorHolder.class */
public final class ClientTransportMonitorHolder {
    public static volatile IClientTransportMonitor ctm;

    public ClientTransportMonitorHolder() {
        throw AnonymousClass001.A0p();
    }

    public static IClientTransportMonitor get() {
        return ctm;
    }

    public static void set(IClientTransportMonitor iClientTransportMonitor) {
        ctm = iClientTransportMonitor;
    }
}
