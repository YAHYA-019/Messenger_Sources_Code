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

/* loaded from: JOr.class */
public interface JOr extends JEZ {
    static void A00(JOr jOr) {
        CallApi Aao = jOr.Aao();
        if (Aao != null) {
            Aao.removeWhenEnded();
        }
    }

    void A3i(boolean z, boolean z2);

    void A3m(ArrayList arrayList);

    void A3n(ArrayList arrayList);

    void A71(ArrayList arrayList);

    void A8m(JOr jOr);

    void A99(Integer num, ArrayList arrayList);

    void APJ(boolean z);

    void APQ(boolean z);

    void AQ3(int i, String str);

    void AT9();

    Gw0 AWo();

    AppstateApi AXO();

    AudioApi AXg();

    CallApi Aao();

    CowatchAdMediaPlayerApi Aeq();

    CowatchAdPlayerApi Aer();

    CowatchPlayerApi Aes();

    Integer Afa();

    EfficiencyLogApi Aj2();

    GridApi AoE();

    HbJ Au4();

    LiveVideoApi AuI();

    String AuS();

    MediaStatsApi AwP();

    MosaicGridApi AyM();

    NetworkTrafficApi Ayx();

    RaiseHandsApi B5j();

    ReactionsApi B63();

    ScreenShareApi B98();

    StarRatingApi BBu();

    TslogApi BHF();

    VideoEffectCommunicationApi BJM();

    VideoQualityPickerApi BJZ();

    boolean BTK();

    void Cex(ArrayList arrayList);

    void CkW(FbWebrtcDataMessage fbWebrtcDataMessage);

    void CkY(FbWebrtcDataMessage fbWebrtcDataMessage);

    void Cmd(RtcCameraViewCoordinator rtcCameraViewCoordinator);

    void CoI(boolean z);

    void Cqd(HbJ hbJ);

    void Cts(View view, String str, int i);

    void Cwu();

    void Cwv(java.util.Map map);

    void D6H(String str);

    void D84(Optional optional, String str, boolean z);

    void D88(VideoSubscriptions videoSubscriptions);
}
