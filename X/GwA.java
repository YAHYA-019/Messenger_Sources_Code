package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.inject.FbInjector;
import com.facebook.msys.mca.Mailbox;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.audio.gen.EnableAudioParameters;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;
import com.facebook.rsys.cowatch.gen.CowatchPlayerProxy;
import com.facebook.rsys.cowatchad.gen.CowatchAdMediaPlayerApi;
import com.facebook.rsys.cowatchad.gen.CowatchAdMediaPlayerProxy;
import com.facebook.rsys.cowatchad.gen.CowatchAdPlayerApi;
import com.facebook.rsys.cowatchad.gen.CowatchAdPlayerProxy;
import com.facebook.rsys.crypto.gen.CryptoApi;
import com.facebook.rsys.crypto.gen.CryptoProxy;
import com.facebook.rsys.devicestats.gen.BatteryStatsReader;
import com.facebook.rsys.devicestats.gen.DeviceStatsApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig;
import com.facebook.rsys.efficiency.gen.EfficiencyLogApi;
import com.facebook.rsys.extensions.gen.CallClientContextConverter;
import com.facebook.rsys.grid.gen.GridApi;
import com.facebook.rsys.grid.gen.GridProxy;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.groupexpansion.msys.gen.GroupExpansionMsysProxy;
import com.facebook.rsys.legacyvideorenderer.gen.LegacyVideoRenderer;
import com.facebook.rsys.livevideo.gen.LiveVideoApi;
import com.facebook.rsys.livevideo.gen.LiveVideoProxy;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridApi;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficApi;
import com.facebook.rsys.raisehands.gen.RaiseHandsApi;
import com.facebook.rsys.reactions.gen.ReactionsApi;
import com.facebook.rsys.roomtypecalling.gen.CallingAppContextUtils;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;
import com.facebook.rsys.starrating.gen.StarRatingApi;
import com.facebook.rsys.state.gen.State;
import com.facebook.rsys.tslog.gen.TslogApi;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerApi;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videoscore.gen.VideoScoreProxy;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsApi;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy;
import com.facebook.webrtc.cameraviewcoordinator.RtcCameraViewCoordinator;
import com.facebook.webrtc.models.FbWebrtcDataMessage;
import com.google.common.base.Optional;
import java.util.ArrayList;

/* loaded from: GwA.class */
public final class GwA extends CallClient implements JOr, 2QP {
    public CallApi A00;
    public HXT A01;
    public long A02;
    public HbJ A03;
    public Huo A04;
    public Call A05;
    public final Handler A06;
    public final 1De A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final GxJ A0L;
    public final IFG A0M;
    public final String A0N;
    public final java.util.Map A0O;
    public final C01i A0P;
    public final C01i A0Q;
    public final FbUserSession A0R;
    public final Mailbox A0S;
    public final AudioProxy A0T;
    public final CallContext A0U;
    public final Gxj A0V;
    public final GyJ A0W;
    public final Gyf A0X;

    public GwA(Handler handler, FbUserSession fbUserSession, 1De r304, Mailbox mailbox, AudioModule audioModule, CallContext callContext, DevXAgentCallConfig devXAgentCallConfig, String str) {
        AudioProxy audioProxy;
        this.A07 = r304;
        this.A0N = str;
        this.A0U = callContext;
        this.A0R = fbUserSession;
        1BY r0 = r304.A00;
        1Br A03 = 1Bu.A03(r0, 1137);
        this.A0B = A03;
        AbR A0J = AbJ.A0J(A03);
        Context A0I = 7zQ.A0I(r0);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0J);
        try {
            IFG ifg = new IFG(A0I, handler, this);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0M = ifg;
            this.A0I = 1Bu.A03(r0, 115758);
            this.A0F = 1Bu.A03(r0, 115694);
            this.A0E = 1Bq.A00(115700);
            this.A0G = 1Bu.A03(r0, 115751);
            this.A08 = 1Bu.A03(r0, 115486);
            this.A09 = 1Bq.A00(49426);
            this.A0H = 1Bu.A03(r0, 115757);
            this.A0A = 1Bu.A03(r0, 1136);
            this.A0K = 1Bq.A00(115627);
            this.A0X = new Gyf();
            this.A0V = new Gxj();
            this.A0W = new GyJ();
            this.A0O = AnonymousClass001.A0u();
            this.A06 = AnonymousClass001.A07();
            this.A0J = 1Bu.A03(r0, 114918);
            Gvz gvz = null;
            if (devXAgentCallConfig != null && (audioProxy = devXAgentCallConfig.audioProxy) != null) {
                gvz = new Gvz(audioProxy);
            }
            this.A0T = gvz;
            this.A0D = 1Bq.A00(115690);
            this.A0C = 7zM.A0d();
            this.A0Q = C01g.A01(new AKW(devXAgentCallConfig, this, 13));
            this.A02 = -1;
            this.A0P = J9t.A01(this, 48);
            GOq.A1G(this.A09, this);
            this.A0S = mailbox;
            1Bn.A0E((Context) null, r0, 147806);
            AbR A0J2 = AbJ.A0J(this.A0A);
            ScreenShareProxy screenShareProxy = (ScreenShareProxy) 1Br.A0B(this.A0J);
            VideoScoreProxy videoScoreProxy = 1Br.A07(((I8i) 1Br.A0B(this.A0I)).A01).AZk(36322276429284618L) ? (VideoScoreProxy) 1Bn.A0A(115764) : null;
            boolean isMetaAiCall = CallingAppContextUtils.CProxy.getIsMetaAiCall(callContext);
            A01 = FbInjector.A01();
            AbL.A0y(A0J2);
            GxJ gxJ = new GxJ(fbUserSession, 7zQ.A0S(A0J2), mailbox, audioModule, screenShareProxy, videoScoreProxy, isMetaAiCall);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0L = gxJ;
            this.A04 = ((C06274gb) 1Br.A0B(this.A0E)).A00();
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    private final VideoRenderApi A00() {
        Huo huo;
        HWQ A00;
        1Br.A0C(this.A0E);
        if (AbstractC06294ge.A00(7zM.A0A()) && (huo = this.A04) != null && huo.A06() && (A00 = huo.A00()) != null) {
            VideoRenderApi videoRenderApi = ((GyZ) A00.A00).A00;
            02W.A03("VideoRenderProxy setApi must be called", videoRenderApi);
            if (videoRenderApi != null) {
                return videoRenderApi;
            }
        }
        return ((LegacyVideoRenderer) 1Br.A0B(this.A0G)).getApi();
    }

    @Override // X.JOr
    public void A3i(boolean z, boolean z2) {
        CallApi callApi = this.A00;
        if (callApi == null) {
            throw AnonymousClass001.A0N("Used before CallClient is ready");
        }
        callApi.accept(z, z, z2);
    }

    @Override // X.JOr
    public void A3m(ArrayList arrayList) {
        CryptoApi cryptoApi = ((Gx0) 1Br.A0B(this.A0H)).A00;
        if (cryptoApi == null) {
            11T.A0L("cryptoApi");
            throw 0Q8.createAndThrow();
        }
        cryptoApi.ackNewDeviceNotifications(arrayList);
    }

    @Override // X.JOr
    public void A3n(ArrayList arrayList) {
        CryptoApi cryptoApi = ((Gx0) 1Br.A0B(this.A0H)).A00;
        if (cryptoApi == null) {
            11T.A0L("cryptoApi");
            throw 0Q8.createAndThrow();
        }
        cryptoApi.ackUiDisplayedParticipantIds(arrayList);
    }

    @Override // X.JOr
    public void A71(ArrayList arrayList) {
        CallApi callApi = this.A00;
        if (callApi == null) {
            throw AnonymousClass001.A0N("Used before CallClient is ready");
        }
        callApi.addUsers(arrayList, null);
    }

    @Override // X.JOr
    public void A8m(JOr jOr) {
        throw AnonymousClass001.A0q("Cannot apply actual call to another call.");
    }

    @Override // X.JOr
    public void A99(Integer num, ArrayList arrayList) {
        11T.A0F(num, 1);
        CallApi callApi = this.A00;
        if (callApi == null) {
            throw AnonymousClass001.A0N("Used before CallClient is ready");
        }
        callApi.respondToApprovalRequests(arrayList, num.intValue());
    }

    @Override // X.JOr
    public void APJ(boolean z) {
        CameraApi cameraApi = ((GwS) this.A0Q.getValue()).A00;
        if (cameraApi == null) {
            throw AnonymousClass001.A0N("Api used before proxy is ready");
        }
        cameraApi.enableCamera(z);
        I5D.A00(this.A0D).markerPoint(887568194, "camera_api_enable_camera");
    }

    @Override // X.JOr
    public void APQ(boolean z) {
        AXg().enableAudio(1BK.A17(11T.A03(new EnableAudioParameters(null, 1, z))));
        QuickPerformanceLogger A00 = I5D.A00(this.A0D);
        A00.markerPoint(887558797, "audio_api_enable_audio");
        A00.markerEnd(887558797, (short) 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r302 == 20) goto L8;
     */
    @Override // X.JOr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AQ3(int r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = 1
            r304 = r0
            r0 = r303
            r1 = r304
            X.11T.A0F(r0, r1)
            r0 = r301
            com.facebook.rsys.callmanager.gen.CallApi r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L42
            r0 = 4
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L25
            r0 = 20
            r306 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L27
        L25:
            r0 = 0
            r304 = r0
        L27:
            r0 = r305
            r1 = r302
            r2 = r303
            r3 = r304
            r0.end(r1, r2, r3)
            r0 = r301
            X.1Br r0 = r0.A0D
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.I5D.A00(r0)
            r1 = 887560851(0x34e71a93, float:4.3046438E-7)
            java.lang.String r2 = "call_api_end_call"
            r0.markerPoint(r1, r2)
            return
        L42:
            java.lang.String r0 = "Used before CallClient is ready"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GwA.AQ3(int, java.lang.String):void");
    }

    @Override // X.JOr
    public void AT9() {
        IFG ifg = this.A0M;
        Context A00 = FbInjector.A00();
        MosaicGridApi AyM = ifg.A06.AyM();
        if (AyM != null) {
            11T.A0D(A00);
            AyM.sendCurrentVideoSize(HJ7.A00(A00));
        }
        CallApi callApi = this.A00;
        if (callApi == null) {
            throw AnonymousClass001.A0N("Used before CallClient is ready");
        }
        callApi.finishSetup();
    }

    @Override // X.JOr
    public Gw0 AWo() {
        if (I29.A00(this.A0K)) {
            return (Gw0) this.A0P.getValue();
        }
        return null;
    }

    @Override // X.JOr
    public AppstateApi AXO() {
        HXT hxt = this.A01;
        if (hxt == null) {
            return null;
        }
        return (AppstateApi) hxt.A00.A01(AppstateApi.CONVERTER);
    }

    @Override // X.JOr
    public AudioApi AXg() {
        AudioApi audioApi;
        AudioProxy audioProxy = this.A0T;
        if (audioProxy != null) {
            audioApi = ((Gvz) audioProxy).A00;
            if (audioApi == null) {
                throw 1BK.A0h();
            }
        } else if (I29.A00(this.A0K)) {
            audioApi = ((Gw0) this.A0P.getValue()).A00;
            if (audioApi == null) {
                throw AnonymousClass001.A0N("setApi must be called");
            }
        } else {
            audioApi = ((Gvx) 1Br.A0B(this.A0F)).A00;
            if (audioApi == null) {
                throw AnonymousClass001.A0N("Api is used before proxy is ready");
            }
        }
        return audioApi;
    }

    @Override // X.JOr
    public CallApi Aao() {
        return this.A00;
    }

    @Override // X.JOr
    public CowatchAdMediaPlayerApi Aeq() {
        CowatchAdMediaPlayerApi cowatchAdMediaPlayerApi;
        CowatchAdMediaPlayerProxy cowatchAdMediaPlayerProxy = this.A0L.getCowatchAdMediaPlayerProxy();
        if (cowatchAdMediaPlayerProxy != null) {
            cowatchAdMediaPlayerApi = ((Gwv) cowatchAdMediaPlayerProxy).A00;
            if (cowatchAdMediaPlayerApi == null) {
                11T.A0L("cowatchAdMediaPlayerApi");
                throw 0Q8.createAndThrow();
            }
        } else {
            cowatchAdMediaPlayerApi = null;
        }
        return cowatchAdMediaPlayerApi;
    }

    @Override // X.JOr
    public CowatchAdPlayerApi Aer() {
        CowatchAdPlayerApi cowatchAdPlayerApi;
        CowatchAdPlayerProxy cowatchAdPlayerProxy = this.A0L.getCowatchAdPlayerProxy();
        if (cowatchAdPlayerProxy != null) {
            cowatchAdPlayerApi = ((Gwx) cowatchAdPlayerProxy).A00;
            if (cowatchAdPlayerApi == null) {
                11T.A0L("cowatchAdPlayerApi");
                throw 0Q8.createAndThrow();
            }
        } else {
            cowatchAdPlayerApi = null;
        }
        return cowatchAdPlayerApi;
    }

    @Override // X.JOr
    public CowatchPlayerApi Aes() {
        CowatchPlayerProxy cowatchPlayerProxy = this.A0L.getCowatchPlayerProxy();
        if (cowatchPlayerProxy != null) {
            return cowatchPlayerProxy.getApi();
        }
        return null;
    }

    @Override // X.JOr
    public Integer Afa() {
        8LW A0v;
        2JS r0;
        State A0m;
        5Vt r02 = GxJ.A00(this.A0L).A01;
        if (r02 == null || (A0v = GOn.A0v(r02)) == null || (r0 = A0v.A00) == null || (A0m = GOq.A0m(r0)) == null) {
            return null;
        }
        return Integer.valueOf(A0m.callState);
    }

    @Override // X.JOr
    public EfficiencyLogApi Aj2() {
        HXT hxt = this.A01;
        if (hxt == null) {
            return null;
        }
        return (EfficiencyLogApi) hxt.A00.A01(EfficiencyLogApi.CONVERTER);
    }

    @Override // X.JOr
    public GridApi AoE() {
        GridProxy gridProxy = this.A0L.getGridProxy();
        if (gridProxy != null) {
            return ((GxP) gridProxy).A00;
        }
        return null;
    }

    @Override // X.JOr
    public HbJ Au4() {
        return this.A03;
    }

    @Override // X.JOr
    public LiveVideoApi AuI() {
        LiveVideoProxy liveVideoProxy = this.A0L.getLiveVideoProxy();
        if (liveVideoProxy != null) {
            return ((Gxc) liveVideoProxy).A00;
        }
        return null;
    }

    @Override // X.JOr
    public String AuS() {
        return this.A0N;
    }

    @Override // X.JOr
    public MediaStatsApi AwP() {
        MediaStatsApi mediaStatsApi = this.A0V.A00;
        02W.A03("Used before proxy is ready", mediaStatsApi);
        11T.A0A(mediaStatsApi);
        return mediaStatsApi;
    }

    @Override // X.JOr
    public MosaicGridApi AyM() {
        return null;
    }

    @Override // X.JOr
    public NetworkTrafficApi Ayx() {
        HXT hxt = this.A01;
        if (hxt == null) {
            return null;
        }
        return (NetworkTrafficApi) hxt.A00.A01(NetworkTrafficApi.CONVERTER);
    }

    @Override // X.JOr
    public RaiseHandsApi B5j() {
        HXT hxt = this.A01;
        if (hxt == null) {
            return null;
        }
        return (RaiseHandsApi) hxt.A00.A01(RaiseHandsApi.CONVERTER);
    }

    @Override // X.JOr
    public ReactionsApi B63() {
        HXT hxt = this.A01;
        if (hxt == null) {
            return null;
        }
        return (ReactionsApi) hxt.A00.A01(ReactionsApi.CONVERTER);
    }

    @Override // X.JOr
    public ScreenShareApi B98() {
        ScreenShareApi screenShareApi;
        ScreenShareProxy screenShareProxy = this.A0L.A0M;
        if (screenShareProxy != null) {
            screenShareApi = ((Gy4) screenShareProxy).A02;
            if (screenShareApi == null) {
                11T.A0L("api");
                throw 0Q8.createAndThrow();
            }
        } else {
            screenShareApi = null;
        }
        return screenShareApi;
    }

    @Override // X.JOr
    public StarRatingApi BBu() {
        HXT hxt = this.A01;
        if (hxt == null) {
            return null;
        }
        return (StarRatingApi) hxt.A00.A01(StarRatingApi.CONVERTER);
    }

    @Override // X.JOr
    public TslogApi BHF() {
        HXT hxt = this.A01;
        if (hxt == null) {
            return null;
        }
        return (TslogApi) hxt.A00.A01(TslogApi.CONVERTER);
    }

    @Override // X.JOr
    public VideoEffectCommunicationApi BJM() {
        GyQ videoEffectCommunicationProxy = this.A0L.getVideoEffectCommunicationProxy();
        if (videoEffectCommunicationProxy != null) {
            return videoEffectCommunicationProxy.A00;
        }
        return null;
    }

    @Override // X.JOr
    public VideoQualityPickerApi BJZ() {
        return null;
    }

    public void BLq(RSVideoFrame rSVideoFrame) {
        this.A02 = 1Br.A00(this.A0C);
        IFG ifg = this.A0M;
        CameraApi cameraApi = ((GwS) this.A0Q.getValue()).A00;
        if (cameraApi == null) {
            throw AnonymousClass001.A0N("Api used before proxy is ready");
        }
        ifg.A0A(cameraApi, rSVideoFrame);
    }

    @Override // X.JOr
    public boolean BTK() {
        Integer Afa = Afa();
        if (Afa == null) {
            return false;
        }
        int intValue = Afa.intValue();
        return intValue == 0 || intValue == 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r302 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map CYl() {
        /*
            r301 = this;
            r0 = r301
            X.GxJ r0 = r0.A0L
            X.Gyh r0 = X.GxJ.A00(r0)
            X.5Vt r0 = r0.A01
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L2b
            r0 = r302
            X.8LW r0 = X.GOn.A0v(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2b
            r0 = r302
            X.2JS r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2b
            X.2JQ r0 = com.facebook.rsys.call.gen.CallModel.CONVERTER
            r1 = r302
            java.lang.Object r0 = X.GOo.A0p(r0, r1)
            r303 = r0
        L2b:
            java.util.HashMap r0 = X.AnonymousClass001.A0u()
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L3c
            r0 = r303
            java.lang.String r0 = r0.toString()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L40
        L3c:
            java.lang.String r0 = ""
            r302 = r0
        L40:
            r0 = r304
            java.lang.String r1 = "CallModel"
            r2 = r302
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r301
            long r0 = r0.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r302 = r0
            r0 = r304
            java.lang.String r1 = "last_sent_to_rsys_frame_timestamp"
            r2 = r302
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GwA.CYl():java.util.Map");
    }

    @Override // X.JOr
    public void Cex(ArrayList arrayList) {
        CallApi callApi = this.A00;
        if (callApi == null) {
            throw AnonymousClass001.A0N("Used before CallClient is ready");
        }
        callApi.removeUsers(arrayList);
    }

    @Override // X.JOr
    public void CkW(FbWebrtcDataMessage fbWebrtcDataMessage) {
        IFG ifg = this.A0M;
        ifg.A08.getValue();
        IFG.A01(ifg, fbWebrtcDataMessage, false);
    }

    @Override // X.JOr
    public void CkY(FbWebrtcDataMessage fbWebrtcDataMessage) {
        IFG ifg = this.A0M;
        if (7zQ.A1a(ifg.A08)) {
            ifg.A00.post(new IxD(ifg, fbWebrtcDataMessage));
        } else {
            IFG.A01(ifg, fbWebrtcDataMessage, true);
        }
    }

    @Override // X.JOr
    public void Cmd(RtcCameraViewCoordinator rtcCameraViewCoordinator) {
        ((GwS) this.A0Q.getValue()).A01 = rtcCameraViewCoordinator;
        if (rtcCameraViewCoordinator != null) {
            rtcCameraViewCoordinator.Clz(null);
        }
    }

    @Override // X.JOr
    public void CoI(boolean z) {
        CryptoApi cryptoApi = ((Gx0) 1Br.A0B(this.A0H)).A00;
        if (cryptoApi == null) {
            11T.A0L("cryptoApi");
            throw 0Q8.createAndThrow();
        }
        cryptoApi.setE2eeMode(AbJ.A00(z ? 1 : 0));
    }

    @Override // X.JOr
    public void Cqd(HbJ hbJ) {
        2JS r0;
        this.A03 = hbJ;
        if (hbJ == null) {
            this.A0M.A08();
            GxJ gxJ = this.A0L;
            GxJ.A00(gxJ).A00 = null;
            GxJ.A00(gxJ).A0D = false;
            return;
        }
        GxJ gxJ2 = this.A0L;
        Gyh A00 = GxJ.A00(gxJ2);
        Ia6 ia6 = new Ia6(hbJ);
        A00.A00 = ia6;
        2JS r02 = A00.A0B;
        if (r02 != null) {
            ia6.C8s(r02);
        }
        Gyh A002 = GxJ.A00(gxJ2);
        A002.A0D = true;
        java.util.Map map = A002.A0C;
        if (map != null && (r0 = A002.A0B) != null) {
            Gyh.A00(A002, r0, map);
        }
        this.A0M.A09(this.A0R);
    }

    @Override // X.JOr
    public void Cts(View view, String str, int i) {
        String A0M = 0Pz.A0M(str, '_', i);
        java.util.Map map = this.A0O;
        View view2 = (View) map.get(A0M);
        if (view2 != view) {
            if (view2 != null) {
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.A0M.A07.remove(0Pz.A0M(str, '_', i));
                if (onLayoutChangeListener != null) {
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                map.remove(0Pz.A0M(str, '_', i));
                VideoRenderApi A00 = A00();
                if (A00 == null) {
                    throw 1BK.A0h();
                }
                int i2 = 2;
                if (i == 1) {
                    i2 = 1;
                }
                A00.removeRenderTarget(str, view2, new StreamInfo(i2, null));
            }
            if (view != null) {
                map.put(A0M, view);
                VideoRenderApi A002 = A00();
                if (A002 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                int i3 = 2;
                if (i == 1) {
                    i3 = 1;
                }
                A002.setDisplayResolution(str, i3, view.getWidth(), view.getHeight());
                IFG ifg = this.A0M;
                VideoRenderApi A003 = A00();
                if (A003 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                IKM ikm = new IKM(A003, str, i);
                view.addOnLayoutChangeListener(ikm);
                ifg.A07.put(0Pz.A0M(str, '_', i), ikm);
                VideoRenderApi A004 = A00();
                if (A004 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                A004.setRenderTarget(str, view, new StreamInfo(i3, null));
            }
        }
    }

    @Override // X.JOr
    public void Cwu() {
        IFG ifg = this.A0M;
        if (7zQ.A1a(ifg.A08)) {
            ifg.A00.post(new IsD(ifg));
        } else {
            IFG.A00(ifg);
        }
    }

    @Override // X.JOr
    public void Cwv(java.util.Map map) {
        this.A0M.A0B(map);
    }

    @Override // X.JOr
    public void D6H(String str) {
        IFG ifg = this.A0M;
        if (7zQ.A1a(ifg.A08)) {
            ifg.A00.post(new IxE(ifg, str));
        } else {
            IFG.A03(ifg, str);
        }
    }

    @Override // X.JOr
    public void D84(Optional optional, String str, boolean z) {
        IFG ifg = this.A0M;
        if (7zQ.A1a(ifg.A08)) {
            ifg.A00.post(new J0s(ifg, optional, str));
        } else {
            IFG.A02(ifg, optional, str);
        }
    }

    @Override // X.JOr
    public void D88(VideoSubscriptions videoSubscriptions) {
        VideoSubscriptionsApi videoSubscriptionsApi = this.A0X.A00;
        if (videoSubscriptionsApi == null) {
            throw AnonymousClass001.A0N("Used before proxy is ready");
        }
        videoSubscriptionsApi.updateSubscriptions(videoSubscriptions);
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public McfReference getAppCallClient() {
        McfReference convertToMcfReference = CallClientContextConverter.CProxy.convertToMcfReference(this.A0L);
        11T.A0A(convertToMcfReference);
        return convertToMcfReference;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public AudioProxy getAudio() {
        AudioProxy audioProxy = this.A0T;
        if (audioProxy == null) {
            audioProxy = (AudioProxy) (I29.A00(this.A0K) ? this.A0P.getValue() : 1Br.A0B(this.A0F));
        }
        return audioProxy;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public /* bridge */ /* synthetic */ CameraProxy getCamera() {
        return (CameraProxy) this.A0Q.getValue();
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public /* bridge */ /* synthetic */ CryptoProxy getCrypto() {
        return (CryptoProxy) 1Br.A0B(this.A0H);
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public GroupExpansionProxy getGroupExpansion() {
        Mailbox mailbox = this.A0S;
        if (mailbox == null) {
            return null;
        }
        GroupExpansionProxy create = GroupExpansionMsysProxy.CProxy.create(mailbox);
        11T.A0A(create);
        return new GxR(create);
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public MediaStatsProxy getMediaStats() {
        return this.A0V;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public TslogProxy getTslog() {
        return this.A0W;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public VideoRenderProxy getVideoRenderer() {
        Huo huo;
        HWQ A00;
        1Br.A0C(this.A0E);
        if (AbstractC06294ge.A00(7zM.A0A()) && (huo = this.A04) != null && huo.A06() && (A00 = huo.A00()) != null) {
            return A00.A00;
        }
        VideoRenderProxy videoRenderProxy = ((LegacyVideoRenderer) 1Br.A0B(this.A0G)).getVideoRenderProxy();
        11T.A0A(videoRenderProxy);
        return videoRenderProxy;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public VideoSubscriptionsProxy getVideoSubscriptions() {
        return this.A0X;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public void onCallEnded(java.util.Map map, CallEndedApi callEndedApi) {
        this.A06.post(new IsE(this));
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public void setApi(CallApi callApi) {
        11T.A0F(callApi, 0);
        this.A00 = callApi;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public void setCall(Call call) {
        11T.A0F(call, 0);
        this.A05 = call;
        HXT hxt = new HXT(call.getApis().getApis());
        BatteryStatsReader batteryStatsReader = (BatteryStatsReader) 1Br.A0B(this.A08);
        11T.A0F(batteryStatsReader, 1);
        DeviceStatsApi deviceStatsApi = (DeviceStatsApi) hxt.A00.A01(DeviceStatsApi.CONVERTER);
        if (deviceStatsApi != null) {
            deviceStatsApi.setBatteryStatsReader(batteryStatsReader);
        }
        this.A01 = hxt;
    }
}
