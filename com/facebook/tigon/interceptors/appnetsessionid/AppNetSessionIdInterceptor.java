package com.facebook.tigon.interceptors.appnetsessionid;

import X.0Zi;
import X.11T;
import X.1BQ;
import X.C00i;
import X.C0il;
import X.C0t9;
import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.jni.HybridData;
import com.facebook.tigon.appnetsessionid.SessionIdGenerator;
import com.facebook.tigon.interceptors.RequestInterceptor;

/* loaded from: AppNetSessionIdInterceptor.class */
public class AppNetSessionIdInterceptor extends RequestInterceptor {
    public final C00i mSessionIdGenerator;

    static {
        C0il.A0B("appnetsessionidinterceptor");
    }

    public AppNetSessionIdInterceptor() {
        1BQ r0 = new 1BQ(66767);
        this.mSessionIdGenerator = r0;
        Context A00 = FbInjector.A00();
        11T.A0F(A00, 0);
        C0t9 A01 = 0Zi.A01(A00);
        this.mHybridData = initHybrid((SessionIdGenerator) r0.get(), A01.A3h, A01.A3g, A01.A3y);
    }

    public static native HybridData initHybrid(SessionIdGenerator sessionIdGenerator, boolean z, boolean z2, boolean z3);
}
