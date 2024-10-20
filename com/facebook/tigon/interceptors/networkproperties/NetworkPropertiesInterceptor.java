package com.facebook.tigon.interceptors.networkproperties;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1CO;
import X.2Dr;
import X.2Dv;
import X.2Em;
import X.C06w;
import X.C06z;
import X.C0il;
import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.RequestInterceptor;

/* loaded from: NetworkPropertiesInterceptor.class */
public final class NetworkPropertiesInterceptor extends RequestInterceptor {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(NetworkPropertiesInterceptor.class, "mobileConfig", "getMobileConfig()Lcom/facebook/mobileconfig/factory/MobileConfig;", 0)};
    public static final 2Dr Companion = new Object();
    public final Context context;
    public final 1Br mobileConfig$delegate;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2Dr, java.lang.Object] */
    static {
        C0il.A0B("networkpropertiesinterceptor-jni");
    }

    public NetworkPropertiesInterceptor() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.context = A00;
        this.mobileConfig$delegate = 1Bq.A00(16385);
        this.mHybridData = initHybrid();
        if (getMobileConfig().AZk(36325798302471155L)) {
            2Dv A002 = 2Dv.A06.A00(A00);
            2Em r0 = new 2Em(this);
            A002.A02.add(r0);
            r0.C8o(A002.A04);
        }
    }

    private final 1CO getMobileConfig() {
        return (1CO) this.mobileConfig$delegate.A00.get();
    }

    public static final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void updateHeader(String str);
}
