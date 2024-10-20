package com.facebook.rsys.extensions.gen;

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
import com.facebook.rsys.grid.gen.GridOrderingParameters;
import com.facebook.rsys.grid.gen.GridProxy;
import com.facebook.rsys.livevideo.gen.LiveVideoProxy;
import com.facebook.rsys.livevideo.gen.LiveVideoStore;
import com.facebook.rsys.lowbandwidthoptimizer.gen.FbAnalyticsProxy;
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

/* loaded from: CallClientContext.class */
public abstract class CallClientContext {
    public abstract ArrayList createFeatureHolders();

    public abstract AudioModule getAudioModule();

    public abstract CallInfoStore getCallInfoStore();

    public abstract ClientTransportMonitorProxy getClientTransportMonitorProxy();

    public abstract ConnectFunnelProxy getConnectFunnelProxy();

    public abstract CoplayProxy getCoplayProxy();

    public abstract CountdownTimerProxy getCountdownTimerProxy();

    public abstract CowatchAdMediaPlayerProxy getCowatchAdMediaPlayerProxy();

    public abstract CowatchAdPlayerProxy getCowatchAdPlayerProxy();

    public abstract CowatchAudioProxy getCowatchAudioProxy();

    public abstract CowatchAutoplayStore getCowatchAutoplayStore();

    public abstract CowatchLiveClockProxy getCowatchLiveClockProxy();

    public abstract CowatchLoggingProxy getCowatchLoggingProxy();

    public abstract CowatchMediaInfoStore getCowatchMediaInfoStore();

    public abstract CowatchPlayerProxy getCowatchPlayerProxy();

    public abstract CowatchSuggestedContentQueueStore getCowatchSuggestedContentQueueStore();

    public abstract FbAnalyticsProxy getFbAnalyticsProxy();

    public abstract GridOrderingParameters getGridOrderingParameters();

    public abstract GridProxy getGridProxy();

    public abstract LiveVideoProxy getLiveVideoProxy();

    public abstract LiveVideoStore getLiveVideoStore();

    public abstract Mailbox getMailbox();

    public abstract MosaicGridParams getMosaicGridParams();

    public abstract MosaicGridProxy getMosaicGridProxy();

    public abstract NetworkInfoProxy getNetworkInfoProxy();

    public abstract NetworkTrafficProxy getNetworkTrafficProxy();

    public abstract RaiseHandsProxy getRaiseHandsProxy();

    public abstract ReactionsProxy getReactionsProxy();

    public abstract ScreenShareProxy getScreenShareProxy();

    public abstract StarRatingProxy getStarRatingProxy();

    public abstract SyncedClockProxy getSyncedClockProxy();

    public abstract VideoEffectCommunicationProxy getVideoEffectCommunicationProxy();

    public abstract VideoQualityPickerProxy getVideoQualityPickerProxy();

    public abstract VideoScoreProxy getVideoScoreProxy();

    public abstract ViewProxy getViewProxy();
}
