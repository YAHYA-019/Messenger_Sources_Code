package com.facebook.traffic.rsys;

import X.0S2;
import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1EZ;
import X.1Fw;
import X.1Lo;
import X.2Qa;
import X.2yD;
import X.4zI;
import X.C00i;
import X.C0dr;
import X.FAb;
import X.HgN;
import X.I4A;
import X.IDo;
import X.IRF;
import X.N14;
import com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy;
import com.facebook.rsys.clienttransportmonitor.gen.RetinaStats;
import com.facebook.rsys.clienttransportmonitor.gen.SocketStateStats;
import com.facebook.traffic.ctm.api.ClientTransportMonitorHolder;
import com.facebook.traffic.ctm.api.IClientTransportMonitor;
import com.facebook.traffic.ctm.api.RsysCallStatus;
import com.facebook.traffic.ctm.api.RsysThrottlingOptions;
import com.facebook.traffic.rsys.MC;

/* loaded from: ClientTransportMonitorProxyImpl.class */
public class ClientTransportMonitorProxyImpl extends ClientTransportMonitorProxy {
    public static final String TAG = "ClientTransportMonitorProxyImpl";
    public 1BY _UL_mInjectionContext;
    public RsysThrottlingOptions mLastRsysThrottlingOption;
    public Long mStartCallTs;
    public final C00i mMobileConfig = new 1BQ(16385);
    public final C00i mMonoClock = new 1BQ(84488);
    public final RsysThrottlingOptions.Builder mRsysThrottlingOptionsBuilder = new RsysThrottlingOptions.Builder();
    public final RsysCallStatus.Builder mRsysCallStatusBuilder = new RsysCallStatus.Builder();

    /* renamed from: com.facebook.traffic.rsys.ClientTransportMonitorProxyImpl$1, reason: invalid class name */
    /* loaded from: ClientTransportMonitorProxyImpl$1.class */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$rsys$clienttransportmonitor$commoncalluistate$CallUIStates;

        static {
            int[] iArr = new int[0S2.A00(9).length];
            $SwitchMap$com$facebook$rsys$clienttransportmonitor$commoncalluistate$CallUIStates = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[8] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ClientTransportMonitorProxyImpl(1BO r302) {
        this._UL_mInjectionContext = new 1BY(r302);
    }

    public static final ClientTransportMonitorProxyImpl _UL__ULSEP_com_facebook_traffic_rsys_ClientTransportMonitorProxyImpl_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new ClientTransportMonitorProxyImpl(r302);
    }

    private void logThrottlingOptionOnUpdate(RsysThrottlingOptions rsysThrottlingOptions, RsysThrottlingOptions rsysThrottlingOptions2) {
        if (rsysThrottlingOptions == null || !rsysThrottlingOptions.equals(rsysThrottlingOptions2)) {
            4zI.A00(TAG, "throttling change - uplink: [%d], downlink: [%d]", new Object[]{Long.valueOf(rsysThrottlingOptions2.maxUplinkBitsPerSecond), Long.valueOf(rsysThrottlingOptions2.maxDownlinkBitsPerSecond)});
        }
    }

    @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
    public long getCumulativeBytesReceived() {
        IClientTransportMonitor iClientTransportMonitor = ClientTransportMonitorHolder.ctm;
        return iClientTransportMonitor == null ? -1 : iClientTransportMonitor.getCumulativeConnectionStats().cumulativeBytesReceived;
    }

    @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
    public long getCumulativeBytesSent() {
        IClientTransportMonitor iClientTransportMonitor = ClientTransportMonitorHolder.ctm;
        return iClientTransportMonitor == null ? -1 : iClientTransportMonitor.getCumulativeConnectionStats().cumulativeBytesSent;
    }

    @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
    public SocketStateStats getSocketStateStats() {
        IClientTransportMonitor iClientTransportMonitor = ClientTransportMonitorHolder.ctm;
        if (iClientTransportMonitor == null) {
            long j = -1;
            return new SocketStateStats(j, j, j);
        }
        com.facebook.traffic.ctm.api.SocketStateStats socketStateStats = iClientTransportMonitor.getCumulativeConnectionStats().socketStateStats;
        return new SocketStateStats(socketStateStats.open, socketStateStats.downlinkThrottlingEnabled, socketStateStats.uplinkThrottlingEnabled);
    }

    @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
    public void onCallCompleted(RetinaStats retinaStats) {
        IClientTransportMonitor iClientTransportMonitor = ClientTransportMonitorHolder.ctm;
        if (iClientTransportMonitor != null) {
            iClientTransportMonitor.onRsysCallCompleted(new com.facebook.traffic.ctm.api.RetinaStats(retinaStats.configEngineEnabled, retinaStats.wasCallConnected, retinaStats.edgerayIps, retinaStats.relayIp, retinaStats.uuid));
        }
    }

    @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
    public void updateCallStatus(com.facebook.rsys.clienttransportmonitor.gen.RsysCallStatus rsysCallStatus, long j) {
        IClientTransportMonitor iClientTransportMonitor;
        RsysThrottlingOptions.Builder builder;
        long j2;
        long Auy;
        2yD r0 = (2yD) this.mMobileConfig.get();
        if (!r0.AZk(MC.rp_ctm_network_throttling.rate_limiter_enabled) || (iClientTransportMonitor = ClientTransportMonitorHolder.ctm) == null) {
            return;
        }
        RsysCallStatus.Builder builder2 = this.mRsysCallStatusBuilder;
        builder2.heartbeatMs = j;
        if (rsysCallStatus.state == 1) {
            this.mStartCallTs = null;
            builder2.state = RsysCallStatus.State.ENDED;
            RsysThrottlingOptions.Builder builder3 = this.mRsysThrottlingOptionsBuilder;
            long j3 = -1;
            builder3.maxUplinkBitsPerSecond = j3;
            builder3.maxDownlinkBitsPerSecond = j3;
            RsysThrottlingOptions rsysThrottlingOptions = new RsysThrottlingOptions(builder3);
            iClientTransportMonitor.updateRsysCallStatus(new RsysCallStatus(builder2), rsysThrottlingOptions);
            logThrottlingOptionOnUpdate(this.mLastRsysThrottlingOption, rsysThrottlingOptions);
            this.mLastRsysThrottlingOption = null;
            return;
        }
        builder2.state = RsysCallStatus.State.ONGOING;
        if (this.mStartCallTs == null) {
            this.mStartCallTs = Long.valueOf(((C0dr) this.mMonoClock.get()).now());
        }
        if (((C0dr) this.mMonoClock.get()).now() - this.mStartCallTs.longValue() <= r0.Auy(MC.rp_ctm_network_throttling.initial_throttle_delay_ms)) {
            builder = this.mRsysThrottlingOptionsBuilder;
            Auy = -1;
            builder.maxUplinkBitsPerSecond = Auy;
        } else {
            N14 n14 = (N14) 1Lo.A09(1Fw.A04((1EZ) 1Bn.A0G(this._UL_mInjectionContext, 16428)), this._UL_mInjectionContext, 82193);
            switch ((((2Qa) 1Br.A0B(n14.A05)).A05() ? 0S2.A01 : (((IDo) 1Br.A0B(n14.A01)).A06 || ((I4A) 1Br.A0B(n14.A04)).A00 || ((HgN) 1Br.A0B(n14.A03)).A00) ? 0S2.A0C : ((FAb) 1Br.A0B(n14.A02)).A08 ? 0S2.A0Y : !((IRF) 1Br.A0B(n14.A00)).A0z() ? 0S2.A0j : 0S2.A00).intValue()) {
                case 0:
                    this.mRsysThrottlingOptionsBuilder.maxUplinkBitsPerSecond = r0.Auy(MC.rp_ctm_network_throttling.not_in_pip_max_uplink_bps);
                    builder = this.mRsysThrottlingOptionsBuilder;
                    j2 = MC.rp_ctm_network_throttling.not_in_pip_max_downlink_bps;
                    break;
                case 1:
                case 2:
                case 3:
                case 5:
                    this.mRsysThrottlingOptionsBuilder.maxUplinkBitsPerSecond = r0.Auy(MC.rp_ctm_network_throttling.in_pip_max_uplink_bps);
                    builder = this.mRsysThrottlingOptionsBuilder;
                    j2 = MC.rp_ctm_network_throttling.in_pip_max_downlink_bps;
                    break;
            }
            Auy = r0.Auy(j2);
        }
        builder.maxDownlinkBitsPerSecond = Auy;
        RsysThrottlingOptions rsysThrottlingOptions2 = new RsysThrottlingOptions(this.mRsysThrottlingOptionsBuilder);
        logThrottlingOptionOnUpdate(this.mLastRsysThrottlingOption, rsysThrottlingOptions2);
        this.mLastRsysThrottlingOption = rsysThrottlingOptions2;
        iClientTransportMonitor.updateRsysCallStatus(new RsysCallStatus(this.mRsysCallStatusBuilder), rsysThrottlingOptions2);
    }
}
