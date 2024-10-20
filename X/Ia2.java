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
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import java.util.ArrayList;

/* loaded from: Ia2.class */
public final class Ia2 implements JOr {
    public HbJ A00;
    public final Hhh A01;
    public final String A02;
    public final C01s A03;

    public Ia2(C01s c01s, String str, boolean z) {
        this.A02 = str;
        this.A01 = new Hhh(z);
        this.A03 = c01s;
    }

    @Override // X.JOr
    public void A3i(boolean z, boolean z2) {
        throw AnonymousClass001.A0q("Cannot perform in pre-call object");
    }

    @Override // X.JOr
    public void A3m(ArrayList arrayList) {
    }

    @Override // X.JOr
    public void A3n(ArrayList arrayList) {
    }

    @Override // X.JOr
    public void A71(ArrayList arrayList) {
        throw AnonymousClass001.A0q("Cannot perform in pre-call object");
    }

    @Override // X.JOr
    public void A8m(JOr jOr) {
        11T.A0F(jOr, 0);
        Hhh hhh = this.A01;
        HF4 hf4 = hhh.A03;
        if (hf4.A01) {
            hf4.A01 = false;
            jOr.APQ(AnonymousClass001.A1V(hf4.A00));
        }
        HF4 hf42 = hhh.A04;
        if (hf42.A01) {
            hf42.A01 = false;
            jOr.APJ(AnonymousClass001.A1V(hf42.A00));
        }
        if (hhh.A02) {
            int i = hhh.A00;
            String str = hhh.A01;
            if (str == null) {
                throw 1BK.A0h();
            }
            jOr.AQ3(i, str);
            JOr.A00(jOr);
        }
    }

    @Override // X.JOr
    public void A99(Integer num, ArrayList arrayList) {
        throw AnonymousClass001.A0q("Cannot perform in pre-call object");
    }

    @Override // X.JOr
    public void APJ(boolean z) {
        HF4 hf4 = this.A01.A04;
        Boolean valueOf = Boolean.valueOf(z);
        if (Objects.equal(valueOf, hf4.A00)) {
            return;
        }
        hf4.A00 = valueOf;
        hf4.A01 = true;
    }

    @Override // X.JOr
    public void APQ(boolean z) {
        HF4 hf4 = this.A01.A03;
        Boolean valueOf = Boolean.valueOf(z);
        if (Objects.equal(valueOf, hf4.A00)) {
            return;
        }
        hf4.A00 = valueOf;
        hf4.A01 = true;
    }

    @Override // X.JOr
    public void AQ3(int i, String str) {
        11T.A0F(str, 1);
        Hhh hhh = this.A01;
        hhh.A02 = true;
        hhh.A00 = i;
        hhh.A01 = str;
        C9lt.A00(this.A02).A00.invoke(new C87v((9Dx) new 91C(i, str)));
    }

    @Override // X.JOr
    public void AT9() {
        this.A03.D11("OrcaRsysPreCall", "Unsupported operation:finishSetup in pre call ");
    }

    @Override // X.JOr
    public Gw0 AWo() {
        return null;
    }

    @Override // X.JOr
    public AppstateApi AXO() {
        return null;
    }

    @Override // X.JOr
    public AudioApi AXg() {
        return null;
    }

    @Override // X.JOr
    public CallApi Aao() {
        return null;
    }

    @Override // X.JOr
    public CowatchAdMediaPlayerApi Aeq() {
        return null;
    }

    @Override // X.JOr
    public CowatchAdPlayerApi Aer() {
        return null;
    }

    @Override // X.JOr
    public CowatchPlayerApi Aes() {
        return null;
    }

    @Override // X.JOr
    public Integer Afa() {
        return null;
    }

    @Override // X.JOr
    public EfficiencyLogApi Aj2() {
        return null;
    }

    @Override // X.JOr
    public GridApi AoE() {
        return null;
    }

    @Override // X.JOr
    public HbJ Au4() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.JOr
    public LiveVideoApi AuI() {
        return null;
    }

    @Override // X.JOr
    public String AuS() {
        return this.A02;
    }

    @Override // X.JOr
    public MediaStatsApi AwP() {
        return null;
    }

    @Override // X.JOr
    public MosaicGridApi AyM() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.JOr
    public NetworkTrafficApi Ayx() {
        return null;
    }

    @Override // X.JOr
    public RaiseHandsApi B5j() {
        return null;
    }

    @Override // X.JOr
    public ReactionsApi B63() {
        return null;
    }

    @Override // X.JOr
    public ScreenShareApi B98() {
        return null;
    }

    @Override // X.JOr
    public StarRatingApi BBu() {
        return null;
    }

    @Override // X.JOr
    public TslogApi BHF() {
        return null;
    }

    @Override // X.JOr
    public VideoEffectCommunicationApi BJM() {
        return null;
    }

    @Override // X.JOr
    public VideoQualityPickerApi BJZ() {
        return null;
    }

    public void BLq(RSVideoFrame rSVideoFrame) {
    }

    @Override // X.JOr
    public boolean BTK() {
        return false;
    }

    @Override // X.JOr
    public void Cex(ArrayList arrayList) {
        throw AnonymousClass001.A0q("Cannot perform in pre-call object");
    }

    @Override // X.JOr
    public void CkW(FbWebrtcDataMessage fbWebrtcDataMessage) {
    }

    @Override // X.JOr
    public void CkY(FbWebrtcDataMessage fbWebrtcDataMessage) {
    }

    @Override // X.JOr
    public void Cmd(RtcCameraViewCoordinator rtcCameraViewCoordinator) {
    }

    @Override // X.JOr
    public void CoI(boolean z) {
    }

    @Override // X.JOr
    public void Cqd(HbJ hbJ) {
        this.A00 = hbJ;
    }

    @Override // X.JOr
    public void Cts(View view, String str, int i) {
        C01s c01s = this.A03;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("setRenderTarget called on pre-call object for user: ");
        A0k.append(str);
        A0k.append(" with streamType: ");
        A0k.append(i);
        A0k.append(" with localCallId: ");
        c01s.D0v("OrcaRsysPreCall", AnonymousClass001.A0d(this.A02, A0k));
    }

    @Override // X.JOr
    public void Cwu() {
        throw AnonymousClass001.A0q("Cannot perform in pre-call object");
    }

    @Override // X.JOr
    public void Cwv(java.util.Map map) {
        this.A03.D11("OrcaRsysPreCall", "Unsupported operation:setupInitialStateSyncMessages in pre call ");
    }

    @Override // X.JOr
    public void D6H(String str) {
    }

    @Override // X.JOr
    public void D84(Optional optional, String str, boolean z) {
    }

    @Override // X.JOr
    public void D88(VideoSubscriptions videoSubscriptions) {
        this.A03.D0v("OrcaRsysPreCall", 0Pz.A0W("updateSubscriptions called on pre-call object with localCallId: ", this.A02));
    }
}
