package com.facebook.tigon.tigonliger;

import X.0Pz;
import X.0Zi;
import X.0fH;
import X.0lP;
import X.0tF;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1KU;
import X.2Au;
import X.2F5;
import X.2F6;
import X.2F8;
import X.2F9;
import X.2FA;
import X.2FB;
import X.3K4;
import X.AnonymousClass001;
import X.AnonymousClass220;
import X.AnonymousClass412;
import X.AnonymousClass413;
import X.C00i;
import X.C0es;
import X.C0il;
import X.C0k4;
import X.C21t;
import X.C21v;
import X.C21x;
import X.C21z;
import X.C29s;
import X.C3Pl;
import X.C3ix;
import android.content.Context;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.common.jniexecutorsmodule.NormalJniExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.proxygen.ClientTransportMonitor;
import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.HTTPClient;
import com.facebook.proxygen.NetworkStatusMonitor;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.interceptors.TigonXplatInterceptorsHolder;
import com.facebook.tigon.internal.TigonCrashReporter;
import com.facebook.tigon.internal.TigonStartupLogger;
import com.facebook.tigon.observers.TigonXplatObserversHolder;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: TigonLigerService.class */
public class TigonLigerService extends TigonXplatService implements C21t {
    public static final Class TAG = TigonLigerService.class;
    public static boolean sBackgroundListenerRegistered;
    public final C00i mClientSideRankingProvider;
    public AndroidAsyncExecutorFactory mDefaultExecutorFactory;
    public final C00i mEndpointProvider;
    public C21x mLigerClientProvider;

    public TigonLigerService() {
        super(initHybrid((C21v) 1Bn.A0H(C21v.class, (Class) null), 1Bi.A02(C21x.class, (Class) null), (TigonLigerConfig) 1Bi.A05(TigonLigerConfig.class, (Class) null), 1Bi.A02(TigonXplatInterceptorsHolder.class, (Class) null), 1Bi.A02(TigonXplatObserversHolder.class, (Class) null), (AndroidAsyncExecutorFactory) 1Bi.A05(AndroidAsyncExecutorFactory.class, NormalJniExecutorFactory.class), (TigonCrashReporter) 1Bn.A0H(TigonCrashReporter.class, (Class) null), 1Bn.A09(C0es.class, (Class) null)), ((TigonCrashReporter) 1Bn.A0H(TigonCrashReporter.class, (Class) null)).mErrorReporter, (1KU) 1Bn.A0H(1KU.class, (Class) null));
        this.mEndpointProvider = 1Bi.A02(2F5.class, (Class) null);
        this.mClientSideRankingProvider = 1Bi.A02(2F6.class, (Class) null);
        this.mDefaultExecutorFactory = (AndroidAsyncExecutorFactory) 1Bi.A05(AndroidAsyncExecutorFactory.class, NormalJniExecutorFactory.class);
        registerListeners();
        try {
            try {
                this.mLigerClientProvider = (C21x) 1Bi.A02(C21x.class, (Class) null).get();
            } catch (Exception e) {
                0fH.A0K(TAG, "Can't initialize tigon", e);
            }
            TigonStartupLogger tigonStartupLogger = (TigonStartupLogger) 1Bi.A05(TigonStartupLogger.class, (Class) null);
            tigonStartupLogger.A01("tigon_liger_service_end");
            tigonStartupLogger.A01.markerEnd(17971040, (short) 2);
        } catch (Throwable th) {
            TigonStartupLogger tigonStartupLogger2 = (TigonStartupLogger) 1Bi.A05(TigonStartupLogger.class, (Class) null);
            tigonStartupLogger2.A01("tigon_liger_service_end");
            tigonStartupLogger2.A01.markerEnd(17971040, (short) 2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v66, types: [com.facebook.jni.HybridData] */
    public static HybridData initHybrid(C21v c21v, C00i c00i, TigonLigerConfig tigonLigerConfig, C00i c00i2, C00i c00i3, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, TigonCrashReporter tigonCrashReporter, C00i c00i4) {
        HybridData hybridData;
        Class cls;
        String str;
        TigonStartupLogger tigonStartupLogger = (TigonStartupLogger) 1Bi.A05(TigonStartupLogger.class, (Class) null);
        tigonStartupLogger.A00();
        tigonStartupLogger.A01("tigon_liger_service_start");
        tigonStartupLogger.A01("block_for_liger_start");
        C3ix c3ix = new C3ix(c00i, 6);
        0tF r0 = 0tF.A0O;
        if (r0 != null) {
            r0.A03("InjectHttpClient", c3ix);
        }
        tigonStartupLogger.A01("block_for_liger_end");
        try {
            C0il.A0B("tigonliger");
            if (c21v.D5K()) {
                2Au r02 = ((C29s) ((C21x) c00i.get())).A00;
                ClientTransportMonitor clientTransportMonitor = ((C29s) ((C21x) c00i.get())).A01;
                boolean A04 = BackgroundStartupDetector.A0D.A04();
                tigonStartupLogger.A01.markerAnnotate(17971040, "app_start_in_background", A04);
                tigonStartupLogger.A01("block_for_interceptors_start");
                TigonXplatInterceptorsHolder tigonXplatInterceptorsHolder = (TigonXplatInterceptorsHolder) c00i2.get();
                tigonStartupLogger.A01("block_for_interceptors_end");
                TigonXplatObserversHolder tigonXplatObserversHolder = (TigonXplatObserversHolder) c00i3.get();
                ?? AXB = ((C0es) c00i4.get()).AXB();
                try {
                    HTTPClient hTTPClient = (HTTPClient) c3ix.call();
                    C0k4.A00(hTTPClient);
                    AXB = initHybrid(hTTPClient.mEventBase, (HTTPClient) c3ix.call(), r02, clientTransportMonitor, tigonLigerConfig, tigonXplatInterceptorsHolder, tigonXplatObserversHolder, androidAsyncExecutorFactory, tigonCrashReporter, A04, AXB);
                    hybridData = AXB;
                    if (hybridData == null) {
                        cls = TAG;
                        str = "Can't load liger pointers";
                    }
                    return hybridData;
                } catch (Exception unused) {
                    throw AnonymousClass001.A0U(AXB);
                }
            }
            cls = TAG;
            str = "Can't load liger";
            0fH.A0E(cls, str);
            hybridData = new HybridData();
            return hybridData;
        } catch (Throwable th) {
            tigonCrashReporter.crashReport("failed to load native tigonliger lib", th);
            throw th;
        }
    }

    public static native HybridData initHybrid(EventBase eventBase, HTTPClient hTTPClient, NetworkStatusMonitor networkStatusMonitor, ClientTransportMonitor clientTransportMonitor, TigonLigerConfig tigonLigerConfig, TigonXplatInterceptorsHolder tigonXplatInterceptorsHolder, TigonXplatObserversHolder tigonXplatObserversHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, TigonCrashReporter tigonCrashReporter, boolean z, String str);

    private native void onContentVisibilityChanged(String str, int i);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onEndpointChangedNative, reason: merged with bridge method [inline-methods] */
    public native void m10083x5598a1a7(String str);

    private void registerListeners() {
        2F5 r303 = (2F5) this.mEndpointProvider.get();
        2F8 r0 = new 2F8(this);
        synchronized (r303) {
            try {
                r303.A00.add(r0);
                r0.A00.m10083x5598a1a7(r303.A01);
            } catch (Throwable th) {
                throw th;
            }
        }
        2F6 r02 = (2F6) this.mClientSideRankingProvider.get();
        ((Executor) r02.A00.get()).execute(new 2FA(new 2F9(this), r02));
        synchronized (TigonLigerService.class) {
            if (!sBackgroundListenerRegistered) {
                2FB r03 = new 2FB(this);
                0lP r04 = BackgroundStartupDetector.A0D;
                if (BackgroundStartupDetector.A09 != null) {
                    throw AnonymousClass001.A0q("Only one listener is supported at this time.");
                }
                BackgroundStartupDetector.A09 = r03;
                r03.C2P(r04.A04());
                sBackgroundListenerRegistered = true;
            }
        }
        AnonymousClass220 anonymousClass220 = (AnonymousClass220) 1Bi.A05(AnonymousClass220.class, (Class) null);
        if (anonymousClass220 instanceof C21z) {
            Context context = (Context) ((C21z) anonymousClass220).A00.get();
            11T.A0F(context, 0);
            if (0Zi.A01(context).A45) {
                3K4 r05 = new 3K4(this);
                r303 = C3Pl.class;
                synchronized (r303) {
                    synchronized (C3Pl.A01) {
                        C3Pl.A00 = r05;
                    }
                }
            }
        }
    }

    public native void cancelAllRequests();

    public ClientTransportMonitor getClientTransportMonitor() {
        return ((C29s) this.mLigerClientProvider).A01;
    }

    public AndroidAsyncExecutorFactory getDefaultExecutorFactory() {
        return this.mDefaultExecutorFactory;
    }

    public EventBase getEventBase() {
        return ((C29s) this.mLigerClientProvider).A08.mEventBase;
    }

    public void init() {
    }

    /* renamed from: lambda$registerListeners$2$com-facebook-tigon-tigonliger-TigonLigerService, reason: not valid java name */
    public /* synthetic */ void m10084x55223ba8(String str, int i) {
        0fH.A0V(str, TAG, "onContentVisibilityChanged contentId=%s, distanceToViewport=%d", Integer.valueOf(i));
        onContentVisibilityChanged(str, i);
    }

    /* renamed from: onAppStateChange, reason: merged with bridge method [inline-methods] */
    public native void m10085x54abd5a9(boolean z);

    @Override // com.facebook.tigon.TigonXplatService
    public void onPreRequest(TigonRequest tigonRequest) {
        String str;
        this.mLigerClientProvider.D7B();
        AnonymousClass412 anonymousClass412 = (AnonymousClass412) tigonRequest.getLayerInformation(AnonymousClass413.A05);
        if (anonymousClass412 != null) {
            str = "TigonLigerService";
            Map map = anonymousClass412.A00;
            String str2 = (String) map.get("platform_path");
            if (str2 == null) {
                str2 = "";
            }
            map.put("platform_path", str2.length() != 0 ? 0Pz.A0j(str2, "::", str) : "TigonLigerService");
        }
    }

    public native void pauseRtcQueue();

    public native void resumeRtcQueue();
}
