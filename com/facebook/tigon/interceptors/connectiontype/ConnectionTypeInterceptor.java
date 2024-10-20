package com.facebook.tigon.interceptors.connectiontype;

import X.1Bq;
import X.1Br;
import X.2Cw;
import X.2D0;
import X.2D2;
import X.2D7;
import X.C06w;
import X.C06z;
import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.RequestInterceptor;

/* loaded from: ConnectionTypeInterceptor.class */
public final class ConnectionTypeInterceptor extends RequestInterceptor {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(ConnectionTypeInterceptor.class, "connectionTypeMonitor", "getConnectionTypeMonitor()Lcom/facebook/common/connectiontype/ConnectionTypeMonitor;", 0)};
    public static final 2Cw Companion = new Object();
    public final 1Br connectionTypeMonitor$delegate = 1Bq.A00(115735);

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.2Cw] */
    static {
        C0il.A0B("connectiontypeinterceptor-jni");
    }

    public ConnectionTypeInterceptor() {
        this.mHybridData = initHybrid();
        2D0 connectionTypeMonitor = getConnectionTypeMonitor();
        2D7 r0 = new 2D7(this);
        2D0 r02 = connectionTypeMonitor;
        r02.A01.add(r0);
        r0.Bqw(r02.A02);
    }

    private final 2D2 getConnectionTypeMonitor() {
        return (2D2) this.connectionTypeMonitor$delegate.A00.get();
    }

    public static final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void updateConnectionType(String str);
}
