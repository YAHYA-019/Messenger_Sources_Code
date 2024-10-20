package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.facebook.inject.FbInjector;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;
import com.facebook.rsys.cowatchad.gen.CowatchAdMediaPlayerApi;
import com.facebook.rsys.cowatchad.gen.CowatchAdPlayerApi;
import com.facebook.rsys.crypto.gen.CryptoApi;
import com.facebook.rsys.efficiency.gen.EfficiencyLogApi;
import com.facebook.rsys.grid.gen.GridApi;
import com.facebook.rsys.legacyvideorenderer.gen.LegacyRenderTarget;
import com.facebook.rsys.legacyvideorenderer.gen.LegacyVideoRenderer;
import com.facebook.rsys.livevideo.gen.LiveVideoApi;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridApi;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficApi;
import com.facebook.rsys.raisehands.gen.RaiseHandsApi;
import com.facebook.rsys.reactions.gen.ReactionsApi;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.starrating.gen.StarRatingApi;
import com.facebook.rsys.state.gen.State;
import com.facebook.rsys.tslog.gen.TslogApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerApi;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderItem;
import com.facebook.rsys.videorender.gen.VideoRenderSurface;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsApi;
import com.facebook.webrtc.cameraviewcoordinator.RtcCameraViewCoordinator;
import com.facebook.webrtc.models.FbWebrtcDataMessage;
import com.google.common.base.Optional;
import java.util.ArrayList;

/* loaded from: Ia3.class */
public final class Ia3 implements JOr, JOK {
    public HbJ A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final IFG A04;
    public final JOK A05;
    public final java.util.Map A06;
    public final C01i A07;
    public final 1De A08;
    public final Gyh A09;
    public final ClientTransportMonitorProxy A0A;

    public Ia3(Handler handler, 1De r303, Gyh gyh, ClientTransportMonitorProxy clientTransportMonitorProxy, JOK jok) {
        1BK.A1K(gyh, 3, clientTransportMonitorProxy);
        this.A08 = r303;
        this.A05 = jok;
        this.A09 = gyh;
        1BY r0 = r303.A00;
        this.A03 = 1Bu.A03(r0, 16428);
        1Br A03 = 1Bu.A03(r0, 1137);
        this.A01 = A03;
        AbR A0J = AbJ.A0J(A03);
        Context A0I = 7zQ.A0I(r0);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0J);
        try {
            IFG ifg = new IFG(A0I, handler, this);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A04 = ifg;
            this.A02 = 1Bu.A03(r0, 115751);
            this.A07 = C01g.A01(new AQV(this, 7));
            this.A06 = AnonymousClass001.A0u();
            this.A0A = clientTransportMonitorProxy;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // X.JOr
    public void A3i(boolean z, boolean z2) {
        this.A05.AWz().accept(z, z, z2);
    }

    @Override // X.JOr
    public void A3m(ArrayList arrayList) {
        JOK jok = this.A05;
        2JQ r0 = CryptoApi.CONVERTER;
        11T.A0B(r0);
        ((CryptoApi) jok.ChI(r0)).ackNewDeviceNotifications(arrayList);
    }

    @Override // X.JOr
    public void A3n(ArrayList arrayList) {
        JOK jok = this.A05;
        2JQ r0 = CryptoApi.CONVERTER;
        11T.A0B(r0);
        ((CryptoApi) jok.ChI(r0)).ackUiDisplayedParticipantIds(arrayList);
    }

    public void A66(JIr jIr) {
        this.A05.A66(jIr);
    }

    @Override // X.JOr
    public void A71(ArrayList arrayList) {
        this.A05.AWz().addUsers(arrayList, null);
    }

    @Override // X.JOr
    public void A8m(JOr jOr) {
        throw AnonymousClass001.A0q("Cannot apply actual call to another call.");
    }

    @Override // X.JOr
    public void A99(Integer num, ArrayList arrayList) {
        11T.A0F(num, 1);
        this.A05.AWz().respondToApprovalRequests(arrayList, num.intValue());
    }

    @Override // X.JOr
    public void APJ(boolean z) {
        JOK jok = this.A05;
        2JQ r0 = CameraApi.CONVERTER;
        11T.A0B(r0);
        ((CameraApi) jok.ChI(r0)).enableCamera(z);
    }

    @Override // X.JOr
    public void APQ(boolean z) {
        AbstractC2327GOs.A0u(AXg(), 1, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r302 == 20) goto L6;
     */
    @Override // X.JOr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AQ3(int r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r303
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r301
            X.JOK r0 = r0.A05
            r304 = r0
            r0 = r304
            com.facebook.rsys.callmanager.gen.CallApi r0 = r0.AWz()
            r305 = r0
            r0 = 4
            r306 = r0
            r0 = r302
            r1 = r306
            if (r0 == r1) goto L28
            r0 = 20
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r302
            r1 = r307
            if (r0 != r1) goto L2d
        L28:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L2d:
            r0 = r305
            r1 = r302
            r2 = r303
            r3 = r306
            r0.end(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ia3.AQ3(int, java.lang.String):void");
    }

    @Override // X.JOr
    public void AT9() {
        IFG ifg = this.A04;
        Context A00 = FbInjector.A00();
        MosaicGridApi AyM = ifg.A06.AyM();
        if (AyM != null) {
            11T.A0D(A00);
            AyM.sendCurrentVideoSize(HJ7.A00(A00));
        }
        this.A05.AWz().finishSetup();
    }

    @Override // X.JOr
    public Gw0 AWo() {
        Gw1 AXr = this.A05.AXr();
        if (AXr instanceof Gw0) {
            return (Gw0) AXr;
        }
        return null;
    }

    public CallApi AWz() {
        return this.A05.AWz();
    }

    public Object AX0(2JQ r302) {
        return this.A05.AX0(r302);
    }

    public 2JS AXC() {
        return this.A05.AXC();
    }

    @Override // X.JOr
    public AppstateApi AXO() {
        return (AppstateApi) JOK.A00(AppstateApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public AudioApi AXg() {
        JOK jok = this.A05;
        2JQ r0 = AudioApi.CONVERTER;
        11T.A0B(r0);
        Object ChI = jok.ChI(r0);
        11T.A0A(ChI);
        return (AudioApi) ChI;
    }

    public Gw1 AXr() {
        return this.A05.AXr();
    }

    @Override // X.JOr
    public CallApi Aao() {
        return this.A05.AWz();
    }

    public GwV AbF() {
        return this.A05.AbF();
    }

    @Override // X.JOr
    public CowatchAdMediaPlayerApi Aeq() {
        return (CowatchAdMediaPlayerApi) JOK.A00(CowatchAdMediaPlayerApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public CowatchAdPlayerApi Aer() {
        return (CowatchAdPlayerApi) JOK.A00(CowatchAdPlayerApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public CowatchPlayerApi Aes() {
        return (CowatchPlayerApi) JOK.A00(CowatchPlayerApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public Integer Afa() {
        8LW A0v;
        2JS r0;
        State A0m;
        5Vt r02 = this.A09.A01;
        if (r02 == null || (A0v = GOn.A0v(r02)) == null || (r0 = A0v.A00) == null || (A0m = GOq.A0m(r0)) == null) {
            return null;
        }
        return Integer.valueOf(A0m.callState);
    }

    @Override // X.JOr
    public EfficiencyLogApi Aj2() {
        return (EfficiencyLogApi) JOK.A00(EfficiencyLogApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public GridApi AoE() {
        return (GridApi) JOK.A00(GridApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public HbJ Au4() {
        return this.A00;
    }

    @Override // X.JOr
    public LiveVideoApi AuI() {
        return (LiveVideoApi) JOK.A00(LiveVideoApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public String AuS() {
        return this.A05.AuS();
    }

    @Override // X.JOr
    public MediaStatsApi AwP() {
        return (MediaStatsApi) JOK.A00(MediaStatsApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public MosaicGridApi AyM() {
        return (MosaicGridApi) JOK.A00(MosaicGridApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public NetworkTrafficApi Ayx() {
        return (NetworkTrafficApi) JOK.A00(NetworkTrafficApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public RaiseHandsApi B5j() {
        return (RaiseHandsApi) JOK.A00(RaiseHandsApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public ReactionsApi B63() {
        return (ReactionsApi) JOK.A00(ReactionsApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public ScreenShareApi B98() {
        return (ScreenShareApi) JOK.A00(ScreenShareApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public StarRatingApi BBu() {
        return (StarRatingApi) JOK.A00(StarRatingApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public TslogApi BHF() {
        return (TslogApi) JOK.A00(TslogApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public VideoEffectCommunicationApi BJM() {
        return (VideoEffectCommunicationApi) JOK.A00(VideoEffectCommunicationApi.CONVERTER, this.A05);
    }

    @Override // X.JOr
    public VideoQualityPickerApi BJZ() {
        return (VideoQualityPickerApi) JOK.A00(VideoQualityPickerApi.CONVERTER, this.A05);
    }

    public void BLq(RSVideoFrame rSVideoFrame) {
        IFG ifg = this.A04;
        JOK jok = this.A05;
        2JQ r0 = CameraApi.CONVERTER;
        11T.A0B(r0);
        Object ChI = jok.ChI(r0);
        11T.A0A(ChI);
        ifg.A0A((CameraApi) ChI, rSVideoFrame);
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

    @Override // X.JOr
    public void Cex(ArrayList arrayList) {
        this.A05.AWz().removeUsers(arrayList);
    }

    public Object ChI(2JQ r302) {
        return this.A05.ChI(r302);
    }

    @Override // X.JOr
    public void CkW(FbWebrtcDataMessage fbWebrtcDataMessage) {
        IFG ifg = this.A04;
        ifg.A08.getValue();
        IFG.A01(ifg, fbWebrtcDataMessage, false);
    }

    @Override // X.JOr
    public void CkY(FbWebrtcDataMessage fbWebrtcDataMessage) {
        IFG ifg = this.A04;
        if (7zQ.A1a(ifg.A08)) {
            ifg.A00.post(new IxD(ifg, fbWebrtcDataMessage));
        } else {
            IFG.A01(ifg, fbWebrtcDataMessage, true);
        }
    }

    @Override // X.JOr
    public void Cmd(RtcCameraViewCoordinator rtcCameraViewCoordinator) {
        GwS AbF = this.A05.AbF();
        11T.A0I(AbF, "null cannot be cast to non-null type com.facebook.expression.camera.legacycameraproxy.LegacyCameraProxy");
        AbF.A01 = rtcCameraViewCoordinator;
        if (rtcCameraViewCoordinator != null) {
            rtcCameraViewCoordinator.Clz(null);
        }
    }

    @Override // X.JOr
    public void CoI(boolean z) {
        JOK jok = this.A05;
        2JQ r0 = CryptoApi.CONVERTER;
        11T.A0B(r0);
        ((CryptoApi) jok.ChI(r0)).setE2eeMode(AbJ.A00(z ? 1 : 0));
    }

    @Override // X.JOr
    public void Cqd(HbJ hbJ) {
        2JS r0;
        this.A00 = hbJ;
        if (hbJ == null) {
            this.A04.A08();
            Gyh gyh = this.A09;
            gyh.A00 = null;
            gyh.A0D = false;
            return;
        }
        Gyh gyh2 = this.A09;
        Ia7 ia7 = new Ia7(this);
        gyh2.A00 = ia7;
        2JS r02 = gyh2.A0B;
        if (r02 != null) {
            ia7.C8s(r02);
        }
        gyh2.A0D = true;
        java.util.Map map = gyh2.A0C;
        if (map != null && (r0 = gyh2.A0B) != null) {
            Gyh.A00(gyh2, r0, map);
        }
        this.A04.A09(1Br.A03(this.A03));
    }

    @Override // X.JOr
    public void Cts(View view, String str, int i) {
        java.util.Map map = this.A06;
        Integer valueOf = Integer.valueOf(i);
        View view2 = (View) map.get(1BK.A1G(str, valueOf));
        if (view2 != view) {
            if (view2 != null) {
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.A04.A07.remove(AbstractC2326GOr.A0e(i, str));
                if (onLayoutChangeListener != null) {
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                if (map.remove(1BK.A1G(str, valueOf)) != null) {
                    VideoRenderSurface videoRenderSurface = (VideoRenderSurface) this.A07.getValue();
                    int i2 = 2;
                    if (i == 1) {
                        i2 = 1;
                    }
                    videoRenderSurface.removeRenderItem(str, new StreamInfo(i2, null));
                }
            }
            if (view != null) {
                map.put(1BK.A1G(str, valueOf), view);
                JOK jok = this.A05;
                2JQ r0 = VideoRenderApi.CONVERTER;
                11T.A0B(r0);
                VideoRenderApi videoRenderApi = (VideoRenderApi) jok.ChI(r0);
                int i3 = 2;
                if (i == 1) {
                    i3 = 1;
                }
                videoRenderApi.setDisplayResolution(str, i3, view.getWidth(), view.getHeight());
                IFG ifg = this.A04;
                IKM ikm = new IKM(videoRenderApi, str, i);
                view.addOnLayoutChangeListener(ikm);
                ifg.A07.put(AbstractC2326GOr.A0e(i, str), ikm);
                LegacyRenderTarget createRenderTarget = ((LegacyVideoRenderer) 1Br.A0B(this.A02)).createRenderTarget(view);
                11T.A0A(createRenderTarget);
                ((VideoRenderSurface) this.A07.getValue()).addRenderItem(new VideoRenderItem(new StreamInfo(i3, null), new GyX(createRenderTarget), str, 0));
            }
        }
    }

    @Override // X.JOr
    public void Cwu() {
        IFG ifg = this.A04;
        if (7zQ.A1a(ifg.A08)) {
            ifg.A00.post(new IsD(ifg));
        } else {
            IFG.A00(ifg);
        }
    }

    @Override // X.JOr
    public void Cwv(java.util.Map map) {
        this.A04.A0B(map);
    }

    @Override // X.JOr
    public void D6H(String str) {
        IFG ifg = this.A04;
        if (7zQ.A1a(ifg.A08)) {
            ifg.A00.post(new IxE(ifg, str));
        } else {
            IFG.A03(ifg, str);
        }
    }

    @Override // X.JOr
    public void D84(Optional optional, String str, boolean z) {
        IFG ifg = this.A04;
        if (7zQ.A1a(ifg.A08)) {
            ifg.A00.post(new J0s(ifg, optional, str));
        } else {
            IFG.A02(ifg, optional, str);
        }
    }

    @Override // X.JOr
    public void D88(VideoSubscriptions videoSubscriptions) {
        JOK jok = this.A05;
        2JQ r0 = VideoSubscriptionsApi.CONVERTER;
        11T.A0B(r0);
        ((VideoSubscriptionsApi) jok.ChI(r0)).updateSubscriptions(videoSubscriptions);
    }
}
