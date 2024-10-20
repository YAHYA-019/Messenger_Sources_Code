package X;

import android.view.View;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;
import com.facebook.rsys.cowatchad.gen.CowatchAdMediaPlayerApi;
import com.facebook.rsys.cowatchad.gen.CowatchAdPlayerApi;
import com.facebook.rsys.efficiency.gen.EfficiencyLogApi;
import com.facebook.rsys.grid.gen.GridApi;
import com.facebook.rsys.livevideo.gen.LiveVideoApi;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridApi;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficApi;
import com.facebook.rsys.raisehands.gen.RaiseHandsApi;
import com.facebook.rsys.reactions.gen.ReactionsApi;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.starrating.gen.StarRatingApi;
import com.facebook.rsys.tslog.gen.TslogApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerApi;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions;
import com.facebook.webrtc.cameraviewcoordinator.RtcCameraViewCoordinator;
import com.facebook.webrtc.models.FbWebrtcDataMessage;
import com.google.common.base.Optional;
import java.util.ArrayList;

/* loaded from: Ia1.class */
public final class Ia1 implements JOr {
    public HbJ A00;
    public RtcCameraViewCoordinator A01;
    public volatile JOr A02;

    public static String A00(Ia1 ia1) {
        return ia1.A02.AuS();
    }

    @Override // X.JOr
    public void A3i(boolean z, boolean z2) {
        this.A02.A3i(z, z2);
    }

    @Override // X.JOr
    public void A3m(ArrayList arrayList) {
        this.A02.A3m(arrayList);
    }

    @Override // X.JOr
    public void A3n(ArrayList arrayList) {
        this.A02.A3n(arrayList);
    }

    @Override // X.JOr
    public void A71(ArrayList arrayList) {
        this.A02.A71(arrayList);
    }

    @Override // X.JOr
    public void A8m(JOr jOr) {
        11T.A0F(jOr, 0);
        this.A02.A8m(jOr);
    }

    @Override // X.JOr
    public void A99(Integer num, ArrayList arrayList) {
        11T.A0F(num, 1);
        this.A02.A99(num, arrayList);
    }

    @Override // X.JOr
    public void APJ(boolean z) {
        this.A02.APJ(z);
    }

    @Override // X.JOr
    public void APQ(boolean z) {
        this.A02.APQ(z);
    }

    @Override // X.JOr
    public void AQ3(int i, String str) {
        11T.A0F(str, 1);
        this.A02.AQ3(i, str);
    }

    @Override // X.JOr
    public void AT9() {
        this.A02.AT9();
    }

    @Override // X.JOr
    public Gw0 AWo() {
        return this.A02.AWo();
    }

    @Override // X.JOr
    public AppstateApi AXO() {
        return this.A02.AXO();
    }

    @Override // X.JOr
    public AudioApi AXg() {
        return this.A02.AXg();
    }

    @Override // X.JOr
    public CallApi Aao() {
        return this.A02.Aao();
    }

    @Override // X.JOr
    public CowatchAdMediaPlayerApi Aeq() {
        return this.A02.Aeq();
    }

    @Override // X.JOr
    public CowatchAdPlayerApi Aer() {
        return this.A02.Aer();
    }

    @Override // X.JOr
    public CowatchPlayerApi Aes() {
        return this.A02.Aes();
    }

    @Override // X.JOr
    public Integer Afa() {
        return this.A02.Afa();
    }

    @Override // X.JOr
    public EfficiencyLogApi Aj2() {
        return this.A02.Aj2();
    }

    @Override // X.JOr
    public GridApi AoE() {
        return this.A02.AoE();
    }

    @Override // X.JOr
    public HbJ Au4() {
        return this.A00;
    }

    @Override // X.JOr
    public LiveVideoApi AuI() {
        return this.A02.AuI();
    }

    @Override // X.JOr
    public String AuS() {
        return A00(this);
    }

    @Override // X.JOr
    public MediaStatsApi AwP() {
        return this.A02.AwP();
    }

    @Override // X.JOr
    public MosaicGridApi AyM() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.JOr
    public NetworkTrafficApi Ayx() {
        return this.A02.Ayx();
    }

    @Override // X.JOr
    public RaiseHandsApi B5j() {
        return this.A02.B5j();
    }

    @Override // X.JOr
    public ReactionsApi B63() {
        return this.A02.B63();
    }

    @Override // X.JOr
    public ScreenShareApi B98() {
        return this.A02.B98();
    }

    @Override // X.JOr
    public StarRatingApi BBu() {
        return this.A02.BBu();
    }

    @Override // X.JOr
    public TslogApi BHF() {
        return this.A02.BHF();
    }

    @Override // X.JOr
    public VideoEffectCommunicationApi BJM() {
        return this.A02.BJM();
    }

    @Override // X.JOr
    public VideoQualityPickerApi BJZ() {
        return this.A02.BJZ();
    }

    public void BLq(RSVideoFrame rSVideoFrame) {
        this.A02.BLq(rSVideoFrame);
    }

    @Override // X.JOr
    public boolean BTK() {
        return this.A02.BTK();
    }

    @Override // X.JOr
    public void Cex(ArrayList arrayList) {
        this.A02.Cex(arrayList);
    }

    @Override // X.JOr
    public void CkW(FbWebrtcDataMessage fbWebrtcDataMessage) {
        this.A02.CkW(fbWebrtcDataMessage);
    }

    @Override // X.JOr
    public void CkY(FbWebrtcDataMessage fbWebrtcDataMessage) {
        this.A02.CkY(fbWebrtcDataMessage);
    }

    @Override // X.JOr
    public void Cmd(RtcCameraViewCoordinator rtcCameraViewCoordinator) {
        this.A01 = rtcCameraViewCoordinator;
        this.A02.Cmd(rtcCameraViewCoordinator);
    }

    @Override // X.JOr
    public void CoI(boolean z) {
        this.A02.CoI(z);
    }

    @Override // X.JOr
    public void Cqd(HbJ hbJ) {
        this.A00 = hbJ;
        this.A02.Cqd(this.A00);
    }

    @Override // X.JOr
    public void Cts(View view, String str, int i) {
        this.A02.Cts(view, str, i);
    }

    @Override // X.JOr
    public void Cwu() {
        this.A02.Cwu();
    }

    @Override // X.JOr
    public void Cwv(java.util.Map map) {
        this.A02.Cwv(map);
    }

    @Override // X.JOr
    public void D6H(String str) {
        this.A02.D6H(str);
    }

    @Override // X.JOr
    public void D84(Optional optional, String str, boolean z) {
        this.A02.D84(optional, str, 7zP.A1X(optional));
    }

    @Override // X.JOr
    public void D88(VideoSubscriptions videoSubscriptions) {
        this.A02.D88(videoSubscriptions);
    }
}
