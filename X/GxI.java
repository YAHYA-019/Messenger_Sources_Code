package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callinfo.gen.CallInfoStore;
import com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy;
import com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy;
import com.facebook.rsys.coplay.gen.CoplayProxy;
import com.facebook.rsys.countdowntimer.gen.CountdownTimerProxy;
import com.facebook.rsys.cowatch.gen.CowatchAudioProxy;
import com.facebook.rsys.cowatch.gen.CowatchAutoplayStore;
import com.facebook.rsys.cowatch.gen.CowatchLiveClockProxy;
import com.facebook.rsys.cowatch.gen.CowatchLoggingProxy;
import com.facebook.rsys.cowatch.gen.CowatchMediaInfoStore;
import com.facebook.rsys.cowatch.gen.CowatchPlayerProxy;
import com.facebook.rsys.cowatch.gen.CowatchSuggestedContentQueueStore;
import com.facebook.rsys.cowatchad.gen.CowatchAdMediaPlayerProxy;
import com.facebook.rsys.cowatchad.gen.CowatchAdPlayerProxy;
import com.facebook.rsys.extensions.gen.CallClientContext;
import com.facebook.rsys.grid.gen.GridOrderingParameters;
import com.facebook.rsys.grid.gen.GridProxy;
import com.facebook.rsys.livevideo.gen.LiveVideoProxy;
import com.facebook.rsys.livevideo.gen.LiveVideoStore;
import com.facebook.rsys.lowbandwidthoptimizer.gen.FbAnalyticsProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridParams;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridProxy;
import com.facebook.rsys.networkinfo.gen.NetworkInfoProxy;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy;
import com.facebook.rsys.raisehands.gen.RaiseHandsProxy;
import com.facebook.rsys.reactions.gen.ReactionsProxy;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;
import com.facebook.rsys.starrating.gen.StarRatingProxy;
import com.facebook.rsys.syncedclock.gen.SyncedClockProxy;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy;
import com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerProxy;
import com.facebook.rsys.videoscore.gen.VideoScoreProxy;
import com.facebook.rsys.view.gen.ViewProxy;
import java.util.ArrayList;

/* loaded from: GxI.class */
public final class GxI extends CallClientContext {
    public final FbUserSession A00;
    public final AudioModule A01;
    public final MetaAiVoiceStateProxy A02;

    public GxI(FbUserSession fbUserSession, AudioModule audioModule, MetaAiVoiceStateProxy metaAiVoiceStateProxy) {
        11T.A0F(metaAiVoiceStateProxy, 2);
        this.A01 = audioModule;
        this.A02 = metaAiVoiceStateProxy;
        this.A00 = fbUserSession;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public ArrayList createFeatureHolders() {
        return HJz.A00(this.A00, this.A01, this.A02);
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public AudioModule getAudioModule() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CallInfoStore getCallInfoStore() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public ClientTransportMonitorProxy getClientTransportMonitorProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public ConnectFunnelProxy getConnectFunnelProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CoplayProxy getCoplayProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CountdownTimerProxy getCountdownTimerProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CowatchAdMediaPlayerProxy getCowatchAdMediaPlayerProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CowatchAdPlayerProxy getCowatchAdPlayerProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CowatchAudioProxy getCowatchAudioProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CowatchAutoplayStore getCowatchAutoplayStore() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CowatchLiveClockProxy getCowatchLiveClockProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CowatchLoggingProxy getCowatchLoggingProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CowatchMediaInfoStore getCowatchMediaInfoStore() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CowatchPlayerProxy getCowatchPlayerProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public CowatchSuggestedContentQueueStore getCowatchSuggestedContentQueueStore() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public FbAnalyticsProxy getFbAnalyticsProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public GridOrderingParameters getGridOrderingParameters() {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public GridProxy getGridProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public LiveVideoProxy getLiveVideoProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public LiveVideoStore getLiveVideoStore() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public Mailbox getMailbox() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public MosaicGridParams getMosaicGridParams() {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public MosaicGridProxy getMosaicGridProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public NetworkInfoProxy getNetworkInfoProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public NetworkTrafficProxy getNetworkTrafficProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public RaiseHandsProxy getRaiseHandsProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public ReactionsProxy getReactionsProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public ScreenShareProxy getScreenShareProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public StarRatingProxy getStarRatingProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public SyncedClockProxy getSyncedClockProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public VideoEffectCommunicationProxy getVideoEffectCommunicationProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public VideoQualityPickerProxy getVideoQualityPickerProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public VideoScoreProxy getVideoScoreProxy() {
        return null;
    }

    @Override // com.facebook.rsys.extensions.gen.CallClientContext
    public ViewProxy getViewProxy() {
        throw AnonymousClass001.A0p();
    }
}
