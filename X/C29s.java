package X;

import android.content.Context;
import android.os.Process;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.facebook.proxygen.ClientTransportMonitor;
import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.HTTPClient;
import com.facebook.proxygen.HTTPThread;
import com.facebook.proxygen.ProxygenRadioMeter;
import com.facebook.proxygen.utils.CircularEventLog;
import com.facebook.traffic.ctm.api.ClientTransportMonitorHolder;
import com.facebook.traffic.retina.config.RetinaConfig;
import com.facebook.traffic.ttrc.MC;
import java.util.concurrent.Executor;

/* renamed from: X.29s, reason: invalid class name */
/* loaded from: 29s.class */
public final class C29s implements C21x {
    public 2Au A00;
    public ClientTransportMonitor A01;
    public final C29t A02;
    public final C00i A03;
    public final C00i A06;
    public final C00i A07;
    public final HTTPClient A08;
    public final HTTPThread A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C15h A0G = new 3jD(this, 5);
    public final C00i A04 = new 1BQ(16385);
    public final C00i A05 = new 1BQ(84630);

    /* JADX WARN: Type inference failed for: r0v251, types: [com.facebook.proxygen.ClientTransportMonitor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.29t] */
    public C29s() {
        1BQ r0 = new 1BQ(66204);
        this.A0F = r0;
        this.A0A = FbInjector.A00;
        1BQ r02 = new 1BQ(16687);
        this.A0E = r02;
        1BQ r03 = new 1BQ(16917);
        this.A0C = r03;
        1BQ r04 = new 1BQ(16918);
        this.A0D = r04;
        1BQ r05 = new 1BQ(16616);
        this.A0B = r05;
        1BQ r06 = new 1BQ(65797);
        this.A07 = r06;
        ?? obj = new Object();
        this.A02 = obj;
        this.A01 = null;
        C00y c00y = new C00y(new C3j6(5));
        this.A06 = c00y;
        C00y c00y2 = new C00y(new C3j6(6));
        this.A03 = c00y2;
        C00j.A05("LigerRequestExecutor", 1190622337);
        try {
            1Bn.A0A(16900);
            C0il.A0B("fb");
            C0il.A0B("liger");
            final int intValue = ((Integer) 1Bn.A0A(99937)).intValue();
            final HTTPThread hTTPThread = new HTTPThread();
            Thread thread = new Thread(new Runnable(hTTPThread, intValue) { // from class: X.29x
                public static final String __redex_internal_original_name = "HTTPThreadFactory$ThreadPriorityRunnable";
                public int A00;
                public final Runnable A01;

                {
                    this.A01 = hTTPThread;
                    this.A00 = intValue;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(this.A00);
                    this.A01.run();
                }
            }, "Liger-EventBase");
            thread.setPriority(7);
            thread.start();
            hTTPThread.waitForInitialization();
            this.A09 = hTTPThread;
            HTTPClient.Builder builder = (HTTPClient.Builder) 1Bn.A0A(67743);
            builder.mEventBase = hTTPThread.getEventBase();
            2Ab r07 = (2Ab) 1Bi.A03(66398);
            r07.A00 = new CircularEventLog(hTTPThread.getEventBase(), 100);
            2Ac r08 = (2Ac) 1Bi.A03(16914);
            2Ac.A01 = r07.A00;
            ((2Ae) 1Bi.A03(16915)).A00 = builder.mPersistentDNSCacheSettings;
            r0.get();
            1I7 r09 = (1I7) 1Hv.A02(FbInjector.A03, 65728);
            Context context = FbInjector.A03;
            EventBase eventBase = hTTPThread.getEventBase();
            int BKq = ((2Ag) r0.get()).BKq();
            int AaX = ((2Ag) r0.get()).AaX();
            2Ao r010 = (2Ao) r03.get();
            FbNetworkManager fbNetworkManager = (FbNetworkManager) r02.get();
            2Au r011 = new 2Au(context, r09, (1Od) r05.get(), r010, (2Ar) r04.get(), fbNetworkManager, eventBase, (ProxygenRadioMeter) r06.get(), BKq, AaX);
            this.A00 = r011;
            3cG r012 = new 3cG(r011, 4);
            1P9 r013 = new 1P9(r011.A02);
            r013.A05(r012, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
            r013.A02().A00();
            ((2Ag) r0.get()).Co3(this.A00);
            C00i c00i = this.A04;
            boolean AZk = ((2yD) c00i.get()).AZk(36310684330427320L);
            boolean AZk2 = ((2yD) c00i.get()).AZk(MC.android_traffic_qoe.enable_inband_telemetry_bwe_updates);
            2yD r014 = (2yD) c00i.get();
            1GD r015 = 1GD.A07;
            boolean AZr = r014.AZr(r015, MC.android_traffic_qoe.rsys_background_conn_throttling_enabled);
            boolean AZr2 = ((2yD) c00i.get()).AZr(r015, MC.android_traffic_qoe.rsys_background_conn_throttling_timeout_enabled);
            long Av9 = ((2yD) c00i.get()).Av9(r015, MC.android_traffic_qoe.rsys_max_pacing_rate_knob_param_id);
            String BDB = ((2yD) c00i.get()).BDB(r015, MC.android_traffic_qoe.rsys_background_conn_throttling_host_prefix_filter_type);
            String BDB2 = ((2yD) c00i.get()).BDB(r015, MC.android_traffic_qoe.rsys_background_conn_throttling_host_prefix_filter_list);
            boolean AZk3 = ((2yD) c00i.get()).AZk(36320193370143898L);
            ?? obj2 = new Object();
            this.A01 = obj2;
            obj2.enable(AZk);
            this.A01.enableInbandTelemetryProcessing(AZk2);
            this.A01.enableRsysBackgroundConnThrottling(AZr);
            this.A01.enableRsysBackgroundConnThrottlingTimeout(AZr2);
            this.A01.setRsysMaxPacingRateKnobParamId(Av9);
            this.A01.setRsysThrottlingHostPrefixFilterType(BDB);
            this.A01.setRsysThrottlingHostPrefixFilterList(BDB2);
            this.A01.setEventBase(this.A09.getEventBase());
            this.A01.enableRetina(AZk3);
            long Auy = ((2yD) c00i.get()).Auy(36601668346910218L);
            String BCy = ((2yD) c00i.get()).BCy(36883143323813223L);
            long Auy2 = ((2yD) c00i.get()).Auy(36601668347172363L);
            long Auy3 = ((2yD) c00i.get()).Auy(36601668347434509L);
            long Auy4 = ((2yD) c00i.get()).Auy(36601668347368972L);
            String BCy2 = ((2yD) c00i.get()).BCy(36883143324009832L);
            boolean AZk4 = ((2yD) c00i.get()).AZk(36320193370537115L);
            String BCy3 = ((2yD) c00i.get()).BCy(36883143324271977L);
            boolean AZk5 = ((2yD) c00i.get()).AZk(36320193370930332L);
            boolean AZk6 = ((2yD) c00i.get()).AZk(36320193370995869L);
            this.A01.setRetinaConfig(new RetinaConfig(BCy2, ((2yD) c00i.get()).BCy(36883143324599658L), BCy3, BCy, Auy, Auy2, Auy3, Auy4, ((2yD) c00i.get()).AZk(36320193371061406L), AZk6, AZk5, AZk4));
            ClientTransportMonitorHolder.ctm = this.A01;
            builder.mPersistentCachesExecutor = (Executor) c00y.get();
            builder.mDNSResolverExecutor = (Executor) c00y2.get();
            builder.mBidirectionalStreamingEnabled = true;
            this.A02.A00(((2A1) this.A05.get()).A01());
            builder.mProxyFallbackEnabled = true;
            builder.mEnableTransportCallbacks = true;
            HTTPClient build = builder.build();
            this.A08 = build;
            build.mNetworkStatusMonitor = this.A00;
            obj.A01(build, build.mIsSandbox);
            build.callNativeInit(false, false);
            build.mEventBase.runInThread(new 2BT(r08));
            C00j.A01(-808775549);
        } finally {
        }
    }

    @Override // X.C21x
    public boolean D7B() {
        boolean A01;
        HTTPClient hTTPClient = this.A08;
        synchronized (hTTPClient) {
            C00i c00i = this.A05;
            boolean z = ((2A1) c00i.get()).A00;
            C29t c29t = this.A02;
            c29t.A00(((2A1) c00i.get()).A01());
            A01 = c29t.A01(hTTPClient, z);
        }
        return A01;
    }
}
