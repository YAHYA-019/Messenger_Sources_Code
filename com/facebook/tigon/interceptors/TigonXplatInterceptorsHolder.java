package com.facebook.tigon.interceptors;

import X.0BY;
import X.0Pz;
import X.0SY;
import X.11T;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.2BY;
import X.AnonymousClass001;
import X.C06w;
import X.C06z;
import X.C0Bx;
import X.C0il;
import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import com.facebook.jni.HybridData;
import com.facebook.tigon.internal.TigonStartupLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: TigonXplatInterceptorsHolder.class */
public final class TigonXplatInterceptorsHolder {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(TigonXplatInterceptorsHolder.class, "tigonStartupLogger", "getTigonStartupLogger()Lcom/facebook/tigon/internal/TigonStartupLogger;", 0)};
    public static final 2BY Companion = new Object();
    public final HybridData mHybridData;
    public final 1Br tigonStartupLogger$delegate;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.2BY] */
    static {
        C0il.A0B("tigoninterceptors");
    }

    public TigonXplatInterceptorsHolder() {
        1Br A00 = 1Bq.A00(66771);
        this.tigonStartupLogger$delegate = A00;
        ((TigonStartupLogger) A00.A00.get()).A00();
        ((TigonStartupLogger) this.tigonStartupLogger$delegate.A00.get()).A01("tigon_xplat_interceptors_holder_start");
        Set<RequestInterceptor> A06 = 1Bi.A06(ActionId.VIDEO_REQUESTED_PLAYING);
        11T.A0A(A06);
        Set A062 = 1Bi.A06(16401);
        11T.A0A(A062);
        try {
            this.mHybridData = initHybrid();
            long uptimeMillis = SystemClock.uptimeMillis();
            for (RequestInterceptor requestInterceptor : A06) {
                if (requestInterceptor != null && !requestInterceptor.disabled) {
                    registerRequestInterceptor(requestInterceptor);
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    Class<?> cls = requestInterceptor.getClass();
                    Map map = 0BY.A03;
                    11T.A0F(cls, 1);
                    String A01 = C0Bx.A01(cls);
                    TigonStartupLogger tigonStartupLogger = (TigonStartupLogger) this.tigonStartupLogger$delegate.A00.get();
                    String A0W = 0Pz.A0W(A01, "_start");
                    11T.A0F(A0W, 0);
                    0SY r0 = tigonStartupLogger.A01;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    r0.markerPoint(17971040, A0W, uptimeMillis, timeUnit);
                    TigonStartupLogger tigonStartupLogger2 = (TigonStartupLogger) this.tigonStartupLogger$delegate.A00.get();
                    String A0W2 = 0Pz.A0W(A01, "_end");
                    11T.A0F(A0W2, 0);
                    tigonStartupLogger2.A01.markerPoint(17971040, A0W2, uptimeMillis2, timeUnit);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            Iterator it = A062.iterator();
            if (!it.hasNext()) {
                ((TigonStartupLogger) this.tigonStartupLogger$delegate.A00.get()).A01("tigon_xplat_interceptors_holder_end");
                return;
            }
            it.next();
            registerResponseInterceptor(null);
            SystemClock.uptimeMillis();
            throw AnonymousClass001.A0Q("getClass");
        } catch (Throwable th) {
            ((TigonStartupLogger) 1Br.A0B(this.tigonStartupLogger$delegate)).A01("tigon_xplat_interceptors_holder_end");
            throw th;
        }
    }

    public static final native HybridData initHybrid();

    private final native void registerRequestInterceptor(RequestInterceptor requestInterceptor);

    private final native void registerResponseInterceptor(ResponseInterceptor responseInterceptor);
}
