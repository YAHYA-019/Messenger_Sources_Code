package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioEncodedPacket;
import com.facebook.rsys.audio.gen.AudioFrame;
import com.facebook.rsys.audio.gen.AudioFrameDetails;
import com.facebook.rsys.audio.gen.AudioFrameMetadata;
import com.facebook.rsys.audio.gen.AudioStreamSource;
import com.facebook.rsys.breakout.gen.BreakoutStore;
import com.facebook.rsys.breakout.gen.BreakoutStoreHandler;
import com.facebook.rsys.callinfo.gen.CallInfoObserver;
import com.facebook.rsys.callinfo.gen.UserProfilesReadCallback;
import com.facebook.rsys.callintent.gen.CallMetadata;
import com.facebook.rsys.callintent.gen.IncomingCallInfo;
import com.facebook.rsys.callmanager.gen.CallManagerConfig;
import com.facebook.rsys.callmanager.gen.CodecInfo;
import com.facebook.rsys.calltransfer.gen.CallTransferApi;
import com.facebook.rsys.calltransfer.gen.CallTransferStore;
import com.facebook.rsys.calltransfer.gen.CallTransferStoreHandler;
import com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy;
import com.facebook.rsys.clienttransportmonitor.gen.RetinaStats;
import com.facebook.rsys.clienttransportmonitor.gen.RsysCallStatus;
import com.facebook.rsys.clienttransportmonitor.gen.SocketStateStats;
import com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi;
import com.facebook.rsys.cowatch.gen.CowatchComponentCollectionModel;
import com.facebook.rsys.cowatch.gen.CowatchLiveClockProxy;
import com.facebook.rsys.cowatch.gen.CowatchLoggingApi;
import com.facebook.rsys.cowatch.gen.CowatchMediaTabModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerIosModel;
import com.facebook.rsys.cowatchad.gen.CowatchAdStore;
import com.facebook.rsys.cowatchad.gen.CowatchAdStoreAdBreakCompletion;
import com.facebook.rsys.cowatchad.gen.CowatchAdStoreAdInsertionPointsCompletion;
import com.facebook.rsys.devxagent.gen.DevXAgentAppProxy;
import com.facebook.rsys.ended.gen.VideoQuality;
import com.facebook.rsys.ended.gen.VideoStats;
import com.facebook.rsys.huddle.gen.HuddleApi;
import com.facebook.rsys.huddle.gen.HuddleModel;
import com.facebook.rsys.livewith.gen.LiveWithApi;
import com.facebook.rsys.mediaprocessing.gen.MediaProcessingApi;
import com.facebook.rsys.mediastats.gen.AudioLevelsCallback;
import com.facebook.rsys.mediastats.gen.ScreenShareStats;
import com.facebook.rsys.metaaivoicestate.gen.CreatorBotClientReadyMessage;
import com.facebook.rsys.metaaivoicestate.gen.GenAiMediaStats;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiCaption;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiUserContent;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;
import com.facebook.rsys.moderator.gen.ModeratorApi;
import com.facebook.rsys.moderator.gen.ModeratorClientModel;
import com.facebook.rsys.perf.holders.gen.PerfListener;
import com.facebook.rsys.perf.holders.gen.PerfListenerFactory;
import com.facebook.rsys.realtimesession.gen.RealtimeSessionManagerApi;
import com.facebook.rsys.snapshot.gen.SnapshotApi;
import com.facebook.rsys.snapshot.gen.SnapshotBuffer;
import com.facebook.rsys.snapshot.gen.SnapshotCompleteModel;
import com.facebook.rsys.snapshot.gen.SnapshotDeleteCommand;
import com.facebook.rsys.snapshot.gen.SnapshotDismissCommand;
import com.facebook.rsys.snapshot.gen.SnapshotProxyDiscardCallback;
import com.facebook.rsys.snapshot.gen.SnapshotProxySaveCallback;
import com.facebook.rsys.snapshot.gen.SnapshotProxySendCallback;
import com.facebook.rsys.snapshot.gen.SnapshotProxyStitchCallback;
import com.facebook.rsys.snapshot.gen.SnapshotRecaptureCommand;
import com.facebook.rsys.snapshot.gen.SnapshotSendCommand;
import com.facebook.rsys.starrating.gen.StarRatingModel;
import com.facebook.rsys.stream.gen.StreamApi;
import com.facebook.rsys.stream.gen.VideoCapturePropertiesListener;
import com.facebook.rsys.stream.gen.VideoStreamController;
import com.facebook.rsys.stream.gen.VideoStreamSendParams;
import com.facebook.rsys.turnallocation.gen.TurnAllocationCallback;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.facebook.rsys.video.gen.MediaProcessor;
import com.facebook.rsys.video.gen.ProcessedFrameCallbacks;
import com.facebook.rsys.videoeffect.gen.PendingFetchEffectModel;
import com.facebook.rsys.videoeffect.gen.VideoEffect;
import com.facebook.rsys.videoeffect.gen.VideoEffectApi;
import com.facebook.rsys.videoeffect.gen.VideoEffectAttribution;
import com.facebook.rsys.videoeffect.gen.VideoEffectInstruction;
import com.facebook.rsys.videoeffect.gen.VideoEffectLicense;
import com.facebook.rsys.videoeffect.gen.VideoEffectModel;
import com.facebook.rsys.videoeffect.gen.VideoEffectPeerEffectModel;
import com.facebook.rsys.videoeffect.gen.VideoEffectPrivacyModel;
import com.facebook.rsys.videoeffect.gen.VideoEffectRandomPickerModel;
import com.facebook.rsys.videoeffect.gen.VideoEffectSaveInfo;
import com.facebook.rsys.videoeffect.gen.VideoEffectVariantConfiguration;
import com.facebook.rsys.videoeffect.gen.VideoEffectVariantModel;
import com.facebook.rsys.videoeffectcommunication.gen.GetGroupEffectConfirmationCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.GroupEffectConfirmationPromptCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.UnapprovedEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationAdditionalEffectInfo;
import com.facebook.rsys.videoqualitypicker.gen.GetVideoQualityPreferenceSettingCallback;
import com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerModel;
import com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerProxy;
import com.facebook.rsys.videorender.gen.VideoRenderFrameCallback;
import com.facebook.rsys.videorender.gen.VideoRenderItem;

/* loaded from: N6e.class */
public final class N6e implements 2JQ {
    public final int A00;

    public N6e(int i) {
        this.A00 = i;
    }

    public static N6e A00(int i) {
        return new N6e(i);
    }

    public /* bridge */ /* synthetic */ Object AI2(McfReference mcfReference) {
        BreakoutStoreHandler createFromMcfType;
        switch (this.A00) {
            case 0:
                createFromMcfType = AudioEncodedPacket.createFromMcfType(mcfReference);
                break;
            case 1:
                createFromMcfType = AudioFrame.CProxy.createFromMcfType(mcfReference);
                break;
            case 2:
                createFromMcfType = AudioFrameDetails.createFromMcfType(mcfReference);
                break;
            case 3:
                createFromMcfType = AudioFrameMetadata.createFromMcfType(mcfReference);
                break;
            case 4:
                createFromMcfType = AudioStreamSource.CProxy.createFromMcfType(mcfReference);
                break;
            case 5:
                createFromMcfType = BreakoutStore.CProxy.createFromMcfType(mcfReference);
                break;
            case 6:
                createFromMcfType = BreakoutStoreHandler.CProxy.createFromMcfType(mcfReference);
                break;
            case 7:
                createFromMcfType = CallInfoObserver.CProxy.createFromMcfType(mcfReference);
                break;
            case 8:
                createFromMcfType = UserProfilesReadCallback.CProxy.createFromMcfType(mcfReference);
                break;
            case 9:
                createFromMcfType = CallMetadata.createFromMcfType(mcfReference);
                break;
            case 10:
                createFromMcfType = IncomingCallInfo.createFromMcfType(mcfReference);
                break;
            case 11:
                HMo.A00();
                createFromMcfType = CallManagerConfig.createFromMcfType(mcfReference);
                break;
            case 12:
                createFromMcfType = CodecInfo.createFromMcfType(mcfReference);
                break;
            case 13:
                createFromMcfType = CallTransferApi.CProxy.createFromMcfType(mcfReference);
                break;
            case 14:
                createFromMcfType = CallTransferStore.CProxy.createFromMcfType(mcfReference);
                break;
            case 15:
                createFromMcfType = CallTransferStoreHandler.CProxy.createFromMcfType(mcfReference);
                break;
            case 16:
                createFromMcfType = ClientTransportMonitorProxy.CProxy.createFromMcfType(mcfReference);
                break;
            case 17:
                N0B.A00();
                createFromMcfType = RetinaStats.createFromMcfType(mcfReference);
                break;
            case 18:
                N0B.A00();
                createFromMcfType = RsysCallStatus.createFromMcfType(mcfReference);
                break;
            case 19:
                N0B.A00();
                createFromMcfType = SocketStateStats.createFromMcfType(mcfReference);
                break;
            case 20:
                createFromMcfType = CowatchBrowseSurfaceApi.CProxy.createFromMcfType(mcfReference);
                break;
            case 21:
                HMt.A00();
                createFromMcfType = CowatchComponentCollectionModel.createFromMcfType(mcfReference);
                break;
            case 22:
                createFromMcfType = CowatchLiveClockProxy.CProxy.createFromMcfType(mcfReference);
                break;
            case 23:
                createFromMcfType = CowatchLoggingApi.CProxy.createFromMcfType(mcfReference);
                break;
            case 24:
                HMt.A00();
                createFromMcfType = CowatchMediaTabModel.createFromMcfType(mcfReference);
                break;
            case 25:
                HMt.A00();
                createFromMcfType = CowatchPlayerIosModel.createFromMcfType(mcfReference);
                break;
            case 26:
                createFromMcfType = CowatchAdStore.CProxy.createFromMcfType(mcfReference);
                break;
            case 27:
                createFromMcfType = CowatchAdStoreAdBreakCompletion.CProxy.createFromMcfType(mcfReference);
                break;
            case 28:
                createFromMcfType = CowatchAdStoreAdInsertionPointsCompletion.CProxy.createFromMcfType(mcfReference);
                break;
            case 29:
                createFromMcfType = DevXAgentAppProxy.CProxy.createFromMcfType(mcfReference);
                break;
            case 30:
                HMy.A00();
                createFromMcfType = VideoQuality.createFromMcfType(mcfReference);
                break;
            case 31:
                HMy.A00();
                createFromMcfType = VideoStats.createFromMcfType(mcfReference);
                break;
            case 32:
                createFromMcfType = HuddleApi.CProxy.createFromMcfType(mcfReference);
                break;
            case 33:
                createFromMcfType = HuddleModel.createFromMcfType(mcfReference);
                break;
            case 34:
                createFromMcfType = LiveWithApi.CProxy.createFromMcfType(mcfReference);
                break;
            case 35:
                createFromMcfType = MediaProcessingApi.CProxy.createFromMcfType(mcfReference);
                break;
            case 36:
                createFromMcfType = AudioLevelsCallback.CProxy.createFromMcfType(mcfReference);
                break;
            case 37:
                HN7.A00();
                createFromMcfType = ScreenShareStats.createFromMcfType(mcfReference);
                break;
            case 38:
                N0C.A00();
                createFromMcfType = CreatorBotClientReadyMessage.createFromMcfType(mcfReference);
                break;
            case 39:
                N0C.A00();
                createFromMcfType = GenAiMediaStats.createFromMcfType(mcfReference);
                break;
            case 40:
                N0C.A00();
                createFromMcfType = MetaAiCaption.createFromMcfType(mcfReference);
                break;
            case 41:
                createFromMcfType = MetaAiMediaStatsProxy.CProxy.createFromMcfType(mcfReference);
                break;
            case 42:
                N0C.A00();
                createFromMcfType = MetaAiUserContent.createFromMcfType(mcfReference);
                break;
            case 43:
                createFromMcfType = MetaAiVoiceStateProxy.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                createFromMcfType = ModeratorApi.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                HN9.A00();
                createFromMcfType = ModeratorClientModel.createFromMcfType(mcfReference);
                break;
            case 46:
                createFromMcfType = PerfListener.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.ON_START_END /* 47 */:
                createFromMcfType = PerfListenerFactory.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.QUEUED /* 48 */:
                createFromMcfType = RealtimeSessionManagerApi.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                createFromMcfType = SnapshotApi.CProxy.createFromMcfType(mcfReference);
                break;
            case 50:
                createFromMcfType = SnapshotBuffer.createFromMcfType(mcfReference);
                break;
            case ActionId.UNKNOWN /* 51 */:
                createFromMcfType = SnapshotCompleteModel.createFromMcfType(mcfReference);
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                N0D.A00();
                createFromMcfType = SnapshotDeleteCommand.createFromMcfType(mcfReference);
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                N0D.A00();
                createFromMcfType = SnapshotDismissCommand.createFromMcfType(mcfReference);
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                createFromMcfType = SnapshotProxyDiscardCallback.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                createFromMcfType = SnapshotProxySaveCallback.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                createFromMcfType = SnapshotProxySendCallback.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                createFromMcfType = SnapshotProxyStitchCallback.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                N0D.A00();
                createFromMcfType = SnapshotRecaptureCommand.createFromMcfType(mcfReference);
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                N0D.A00();
                createFromMcfType = SnapshotSendCommand.createFromMcfType(mcfReference);
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                createFromMcfType = StarRatingModel.createFromMcfType(mcfReference);
                break;
            case ActionId.COUNTER /* 61 */:
                createFromMcfType = StreamApi.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                createFromMcfType = VideoCapturePropertiesListener.CProxy.createFromMcfType(mcfReference);
                break;
            case 63:
                createFromMcfType = VideoStreamController.CProxy.createFromMcfType(mcfReference);
                break;
            case 64:
                N0E.A00();
                createFromMcfType = VideoStreamSendParams.createFromMcfType(mcfReference);
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                createFromMcfType = TurnAllocationCallback.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                createFromMcfType = TurnAllocationProxy.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                createFromMcfType = MediaProcessor.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                createFromMcfType = ProcessedFrameCallbacks.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                createFromMcfType = PendingFetchEffectModel.createFromMcfType(mcfReference);
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                createFromMcfType = VideoEffect.createFromMcfType(mcfReference);
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                createFromMcfType = VideoEffectApi.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                createFromMcfType = VideoEffectAttribution.createFromMcfType(mcfReference);
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                createFromMcfType = VideoEffectInstruction.createFromMcfType(mcfReference);
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                createFromMcfType = VideoEffectLicense.createFromMcfType(mcfReference);
                break;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                createFromMcfType = VideoEffectModel.createFromMcfType(mcfReference);
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                createFromMcfType = VideoEffectPeerEffectModel.createFromMcfType(mcfReference);
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                createFromMcfType = VideoEffectPrivacyModel.createFromMcfType(mcfReference);
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                createFromMcfType = VideoEffectRandomPickerModel.createFromMcfType(mcfReference);
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                createFromMcfType = VideoEffectSaveInfo.createFromMcfType(mcfReference);
                break;
            case 80:
                createFromMcfType = VideoEffectVariantConfiguration.createFromMcfType(mcfReference);
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                createFromMcfType = VideoEffectVariantModel.createFromMcfType(mcfReference);
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                createFromMcfType = GetGroupEffectConfirmationCompletion.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                createFromMcfType = GroupEffectConfirmationPromptCompletion.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                createFromMcfType = UnapprovedEffectAlertCompletion.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                N0G.A00();
                createFromMcfType = VideoEffectCommunicationAdditionalEffectInfo.createFromMcfType(mcfReference);
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                createFromMcfType = GetVideoQualityPreferenceSettingCallback.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.ERROR /* 87 */:
                N0H.A00();
                createFromMcfType = VideoQualityPickerModel.createFromMcfType(mcfReference);
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                createFromMcfType = VideoQualityPickerProxy.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.FINALLY /* 89 */:
                createFromMcfType = VideoRenderFrameCallback.CProxy.createFromMcfType(mcfReference);
                break;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                HNL.A00();
                createFromMcfType = VideoRenderItem.createFromMcfType(mcfReference);
                break;
            default:
                createFromMcfType = null;
                break;
        }
        return createFromMcfType;
    }

    public Class Ay5() {
        Class cls;
        switch (this.A00) {
            case 0:
                cls = AudioEncodedPacket.class;
                break;
            case 1:
                cls = AudioFrame.class;
                break;
            case 2:
                cls = AudioFrameDetails.class;
                break;
            case 3:
                cls = AudioFrameMetadata.class;
                break;
            case 4:
                cls = AudioStreamSource.class;
                break;
            case 5:
                cls = BreakoutStore.class;
                break;
            case 6:
                cls = BreakoutStoreHandler.class;
                break;
            case 7:
                cls = CallInfoObserver.class;
                break;
            case 8:
                cls = UserProfilesReadCallback.class;
                break;
            case 9:
                cls = CallMetadata.class;
                break;
            case 10:
                cls = IncomingCallInfo.class;
                break;
            case 11:
                cls = CallManagerConfig.class;
                break;
            case 12:
                cls = CodecInfo.class;
                break;
            case 13:
                cls = CallTransferApi.class;
                break;
            case 14:
                cls = CallTransferStore.class;
                break;
            case 15:
                cls = CallTransferStoreHandler.class;
                break;
            case 16:
                cls = ClientTransportMonitorProxy.class;
                break;
            case 17:
                cls = RetinaStats.class;
                break;
            case 18:
                cls = RsysCallStatus.class;
                break;
            case 19:
                cls = SocketStateStats.class;
                break;
            case 20:
                cls = CowatchBrowseSurfaceApi.class;
                break;
            case 21:
                cls = CowatchComponentCollectionModel.class;
                break;
            case 22:
                cls = CowatchLiveClockProxy.class;
                break;
            case 23:
                cls = CowatchLoggingApi.class;
                break;
            case 24:
                cls = CowatchMediaTabModel.class;
                break;
            case 25:
                cls = CowatchPlayerIosModel.class;
                break;
            case 26:
                cls = CowatchAdStore.class;
                break;
            case 27:
                cls = CowatchAdStoreAdBreakCompletion.class;
                break;
            case 28:
                cls = CowatchAdStoreAdInsertionPointsCompletion.class;
                break;
            case 29:
                cls = DevXAgentAppProxy.class;
                break;
            case 30:
                cls = VideoQuality.class;
                break;
            case 31:
                cls = VideoStats.class;
                break;
            case 32:
                cls = HuddleApi.class;
                break;
            case 33:
                cls = HuddleModel.class;
                break;
            case 34:
                cls = LiveWithApi.class;
                break;
            case 35:
                cls = MediaProcessingApi.class;
                break;
            case 36:
                cls = AudioLevelsCallback.class;
                break;
            case 37:
                cls = ScreenShareStats.class;
                break;
            case 38:
                cls = CreatorBotClientReadyMessage.class;
                break;
            case 39:
                cls = GenAiMediaStats.class;
                break;
            case 40:
                cls = MetaAiCaption.class;
                break;
            case 41:
                cls = MetaAiMediaStatsProxy.class;
                break;
            case 42:
                cls = MetaAiUserContent.class;
                break;
            case 43:
                cls = MetaAiVoiceStateProxy.class;
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                cls = ModeratorApi.class;
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                cls = ModeratorClientModel.class;
                break;
            case 46:
                cls = PerfListener.class;
                break;
            case ActionId.ON_START_END /* 47 */:
                cls = PerfListenerFactory.class;
                break;
            case ActionId.QUEUED /* 48 */:
                cls = RealtimeSessionManagerApi.class;
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                cls = SnapshotApi.class;
                break;
            case 50:
                cls = SnapshotBuffer.class;
                break;
            case ActionId.UNKNOWN /* 51 */:
                cls = SnapshotCompleteModel.class;
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                cls = SnapshotDeleteCommand.class;
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                cls = SnapshotDismissCommand.class;
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                cls = SnapshotProxyDiscardCallback.class;
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                cls = SnapshotProxySaveCallback.class;
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                cls = SnapshotProxySendCallback.class;
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                cls = SnapshotProxyStitchCallback.class;
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                cls = SnapshotRecaptureCommand.class;
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                cls = SnapshotSendCommand.class;
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                cls = StarRatingModel.class;
                break;
            case ActionId.COUNTER /* 61 */:
                cls = StreamApi.class;
                break;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                cls = VideoCapturePropertiesListener.class;
                break;
            case 63:
                cls = VideoStreamController.class;
                break;
            case 64:
                cls = VideoStreamSendParams.class;
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                cls = TurnAllocationCallback.class;
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                cls = TurnAllocationProxy.class;
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                cls = MediaProcessor.class;
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                cls = ProcessedFrameCallbacks.class;
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                cls = PendingFetchEffectModel.class;
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                cls = VideoEffect.class;
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                cls = VideoEffectApi.class;
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                cls = VideoEffectAttribution.class;
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                cls = VideoEffectInstruction.class;
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                cls = VideoEffectLicense.class;
                break;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                cls = VideoEffectModel.class;
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                cls = VideoEffectPeerEffectModel.class;
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                cls = VideoEffectPrivacyModel.class;
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                cls = VideoEffectRandomPickerModel.class;
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                cls = VideoEffectSaveInfo.class;
                break;
            case 80:
                cls = VideoEffectVariantConfiguration.class;
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                cls = VideoEffectVariantModel.class;
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                cls = GetGroupEffectConfirmationCompletion.class;
                break;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                cls = GroupEffectConfirmationPromptCompletion.class;
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                cls = UnapprovedEffectAlertCompletion.class;
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                cls = VideoEffectCommunicationAdditionalEffectInfo.class;
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                cls = GetVideoQualityPreferenceSettingCallback.class;
                break;
            case ActionId.ERROR /* 87 */:
                cls = VideoQualityPickerModel.class;
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                cls = VideoQualityPickerProxy.class;
                break;
            case ActionId.FINALLY /* 89 */:
                cls = VideoRenderFrameCallback.class;
                break;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                cls = VideoRenderItem.class;
                break;
            default:
                cls = null;
                break;
        }
        return cls;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public long BHg() {
        long j;
        switch (this.A00) {
            case 0:
                j = AudioEncodedPacket.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId = AudioEncodedPacket.nativeGetMcfTypeId();
                    AudioEncodedPacket.sMcfTypeId = nativeGetMcfTypeId;
                    return nativeGetMcfTypeId;
                }
                return j;
            case 1:
                j = AudioFrame.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId2 = AudioFrame.CProxy.nativeGetMcfTypeId();
                    AudioFrame.CProxy.sMcfTypeId = nativeGetMcfTypeId2;
                    return nativeGetMcfTypeId2;
                }
                return j;
            case 2:
                j = AudioFrameDetails.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId3 = AudioFrameDetails.nativeGetMcfTypeId();
                    AudioFrameDetails.sMcfTypeId = nativeGetMcfTypeId3;
                    return nativeGetMcfTypeId3;
                }
                return j;
            case 3:
                j = AudioFrameMetadata.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId4 = AudioFrameMetadata.nativeGetMcfTypeId();
                    AudioFrameMetadata.sMcfTypeId = nativeGetMcfTypeId4;
                    return nativeGetMcfTypeId4;
                }
                return j;
            case 4:
                j = AudioStreamSource.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId5 = AudioStreamSource.CProxy.nativeGetMcfTypeId();
                    AudioStreamSource.CProxy.sMcfTypeId = nativeGetMcfTypeId5;
                    return nativeGetMcfTypeId5;
                }
                return j;
            case 5:
                j = BreakoutStore.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId6 = BreakoutStore.CProxy.nativeGetMcfTypeId();
                    BreakoutStore.CProxy.sMcfTypeId = nativeGetMcfTypeId6;
                    return nativeGetMcfTypeId6;
                }
                return j;
            case 6:
                j = BreakoutStoreHandler.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId7 = BreakoutStoreHandler.CProxy.nativeGetMcfTypeId();
                    BreakoutStoreHandler.CProxy.sMcfTypeId = nativeGetMcfTypeId7;
                    return nativeGetMcfTypeId7;
                }
                return j;
            case 7:
                j = CallInfoObserver.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId8 = CallInfoObserver.CProxy.nativeGetMcfTypeId();
                    CallInfoObserver.CProxy.sMcfTypeId = nativeGetMcfTypeId8;
                    return nativeGetMcfTypeId8;
                }
                return j;
            case 8:
                j = UserProfilesReadCallback.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId9 = UserProfilesReadCallback.CProxy.nativeGetMcfTypeId();
                    UserProfilesReadCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId9;
                    return nativeGetMcfTypeId9;
                }
                return j;
            case 9:
                j = CallMetadata.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId10 = CallMetadata.nativeGetMcfTypeId();
                    CallMetadata.sMcfTypeId = nativeGetMcfTypeId10;
                    return nativeGetMcfTypeId10;
                }
                return j;
            case 10:
                j = IncomingCallInfo.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId11 = IncomingCallInfo.nativeGetMcfTypeId();
                    IncomingCallInfo.sMcfTypeId = nativeGetMcfTypeId11;
                    return nativeGetMcfTypeId11;
                }
                return j;
            case 11:
                HMo.A00();
                j = CallManagerConfig.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId12 = CallManagerConfig.nativeGetMcfTypeId();
                    CallManagerConfig.sMcfTypeId = nativeGetMcfTypeId12;
                    return nativeGetMcfTypeId12;
                }
                return j;
            case 12:
                j = CodecInfo.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId13 = CodecInfo.nativeGetMcfTypeId();
                    CodecInfo.sMcfTypeId = nativeGetMcfTypeId13;
                    return nativeGetMcfTypeId13;
                }
                return j;
            case 13:
                j = CallTransferApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId14 = CallTransferApi.CProxy.nativeGetMcfTypeId();
                    CallTransferApi.CProxy.sMcfTypeId = nativeGetMcfTypeId14;
                    return nativeGetMcfTypeId14;
                }
                return j;
            case 14:
                j = CallTransferStore.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId15 = CallTransferStore.CProxy.nativeGetMcfTypeId();
                    CallTransferStore.CProxy.sMcfTypeId = nativeGetMcfTypeId15;
                    return nativeGetMcfTypeId15;
                }
                return j;
            case 15:
                j = CallTransferStoreHandler.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId16 = CallTransferStoreHandler.CProxy.nativeGetMcfTypeId();
                    CallTransferStoreHandler.CProxy.sMcfTypeId = nativeGetMcfTypeId16;
                    return nativeGetMcfTypeId16;
                }
                return j;
            case 16:
                j = ClientTransportMonitorProxy.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId17 = ClientTransportMonitorProxy.CProxy.nativeGetMcfTypeId();
                    ClientTransportMonitorProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId17;
                    return nativeGetMcfTypeId17;
                }
                return j;
            case 17:
                N0B.A00();
                j = RetinaStats.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId18 = RetinaStats.nativeGetMcfTypeId();
                    RetinaStats.sMcfTypeId = nativeGetMcfTypeId18;
                    return nativeGetMcfTypeId18;
                }
                return j;
            case 18:
                N0B.A00();
                j = RsysCallStatus.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId19 = RsysCallStatus.nativeGetMcfTypeId();
                    RsysCallStatus.sMcfTypeId = nativeGetMcfTypeId19;
                    return nativeGetMcfTypeId19;
                }
                return j;
            case 19:
                N0B.A00();
                j = SocketStateStats.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId20 = SocketStateStats.nativeGetMcfTypeId();
                    SocketStateStats.sMcfTypeId = nativeGetMcfTypeId20;
                    return nativeGetMcfTypeId20;
                }
                return j;
            case 20:
                j = CowatchBrowseSurfaceApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId21 = CowatchBrowseSurfaceApi.CProxy.nativeGetMcfTypeId();
                    CowatchBrowseSurfaceApi.CProxy.sMcfTypeId = nativeGetMcfTypeId21;
                    return nativeGetMcfTypeId21;
                }
                return j;
            case 21:
                HMt.A00();
                j = CowatchComponentCollectionModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId22 = CowatchComponentCollectionModel.nativeGetMcfTypeId();
                    CowatchComponentCollectionModel.sMcfTypeId = nativeGetMcfTypeId22;
                    return nativeGetMcfTypeId22;
                }
                return j;
            case 22:
                j = CowatchLiveClockProxy.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId23 = CowatchLiveClockProxy.CProxy.nativeGetMcfTypeId();
                    CowatchLiveClockProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId23;
                    return nativeGetMcfTypeId23;
                }
                return j;
            case 23:
                j = CowatchLoggingApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId24 = CowatchLoggingApi.CProxy.nativeGetMcfTypeId();
                    CowatchLoggingApi.CProxy.sMcfTypeId = nativeGetMcfTypeId24;
                    return nativeGetMcfTypeId24;
                }
                return j;
            case 24:
                HMt.A00();
                j = CowatchMediaTabModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId25 = CowatchMediaTabModel.nativeGetMcfTypeId();
                    CowatchMediaTabModel.sMcfTypeId = nativeGetMcfTypeId25;
                    return nativeGetMcfTypeId25;
                }
                return j;
            case 25:
                HMt.A00();
                j = CowatchPlayerIosModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId26 = CowatchPlayerIosModel.nativeGetMcfTypeId();
                    CowatchPlayerIosModel.sMcfTypeId = nativeGetMcfTypeId26;
                    return nativeGetMcfTypeId26;
                }
                return j;
            case 26:
                j = CowatchAdStore.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId27 = CowatchAdStore.CProxy.nativeGetMcfTypeId();
                    CowatchAdStore.CProxy.sMcfTypeId = nativeGetMcfTypeId27;
                    return nativeGetMcfTypeId27;
                }
                return j;
            case 27:
                j = CowatchAdStoreAdBreakCompletion.CProxy.A00;
                if (j == 0) {
                    long nativeGetMcfTypeId28 = CowatchAdStoreAdBreakCompletion.CProxy.nativeGetMcfTypeId();
                    CowatchAdStoreAdBreakCompletion.CProxy.A00 = nativeGetMcfTypeId28;
                    return nativeGetMcfTypeId28;
                }
                return j;
            case 28:
                j = CowatchAdStoreAdInsertionPointsCompletion.CProxy.A00;
                if (j == 0) {
                    long nativeGetMcfTypeId29 = CowatchAdStoreAdInsertionPointsCompletion.CProxy.nativeGetMcfTypeId();
                    CowatchAdStoreAdInsertionPointsCompletion.CProxy.A00 = nativeGetMcfTypeId29;
                    return nativeGetMcfTypeId29;
                }
                return j;
            case 29:
                j = DevXAgentAppProxy.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId30 = DevXAgentAppProxy.CProxy.nativeGetMcfTypeId();
                    DevXAgentAppProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId30;
                    return nativeGetMcfTypeId30;
                }
                return j;
            case 30:
                HMy.A00();
                j = VideoQuality.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId31 = VideoQuality.nativeGetMcfTypeId();
                    VideoQuality.sMcfTypeId = nativeGetMcfTypeId31;
                    return nativeGetMcfTypeId31;
                }
                return j;
            case 31:
                HMy.A00();
                j = VideoStats.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId32 = VideoStats.nativeGetMcfTypeId();
                    VideoStats.sMcfTypeId = nativeGetMcfTypeId32;
                    return nativeGetMcfTypeId32;
                }
                return j;
            case 32:
                j = HuddleApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId33 = HuddleApi.CProxy.nativeGetMcfTypeId();
                    HuddleApi.CProxy.sMcfTypeId = nativeGetMcfTypeId33;
                    return nativeGetMcfTypeId33;
                }
                return j;
            case 33:
                j = HuddleModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId34 = HuddleModel.nativeGetMcfTypeId();
                    HuddleModel.sMcfTypeId = nativeGetMcfTypeId34;
                    return nativeGetMcfTypeId34;
                }
                return j;
            case 34:
                j = LiveWithApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId35 = LiveWithApi.CProxy.nativeGetMcfTypeId();
                    LiveWithApi.CProxy.sMcfTypeId = nativeGetMcfTypeId35;
                    return nativeGetMcfTypeId35;
                }
                return j;
            case 35:
                j = MediaProcessingApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId36 = MediaProcessingApi.CProxy.nativeGetMcfTypeId();
                    MediaProcessingApi.CProxy.sMcfTypeId = nativeGetMcfTypeId36;
                    return nativeGetMcfTypeId36;
                }
                return j;
            case 36:
                j = AudioLevelsCallback.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId37 = AudioLevelsCallback.CProxy.nativeGetMcfTypeId();
                    AudioLevelsCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId37;
                    return nativeGetMcfTypeId37;
                }
                return j;
            case 37:
                HN7.A00();
                j = ScreenShareStats.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId38 = ScreenShareStats.nativeGetMcfTypeId();
                    ScreenShareStats.sMcfTypeId = nativeGetMcfTypeId38;
                    return nativeGetMcfTypeId38;
                }
                return j;
            case 38:
                N0C.A00();
                j = CreatorBotClientReadyMessage.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId39 = CreatorBotClientReadyMessage.nativeGetMcfTypeId();
                    CreatorBotClientReadyMessage.sMcfTypeId = nativeGetMcfTypeId39;
                    return nativeGetMcfTypeId39;
                }
                return j;
            case 39:
                N0C.A00();
                j = GenAiMediaStats.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId40 = GenAiMediaStats.nativeGetMcfTypeId();
                    GenAiMediaStats.sMcfTypeId = nativeGetMcfTypeId40;
                    return nativeGetMcfTypeId40;
                }
                return j;
            case 40:
                N0C.A00();
                j = MetaAiCaption.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId41 = MetaAiCaption.nativeGetMcfTypeId();
                    MetaAiCaption.sMcfTypeId = nativeGetMcfTypeId41;
                    return nativeGetMcfTypeId41;
                }
                return j;
            case 41:
                j = MetaAiMediaStatsProxy.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId42 = MetaAiMediaStatsProxy.CProxy.nativeGetMcfTypeId();
                    MetaAiMediaStatsProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId42;
                    return nativeGetMcfTypeId42;
                }
                return j;
            case 42:
                N0C.A00();
                j = MetaAiUserContent.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId43 = MetaAiUserContent.nativeGetMcfTypeId();
                    MetaAiUserContent.sMcfTypeId = nativeGetMcfTypeId43;
                    return nativeGetMcfTypeId43;
                }
                return j;
            case 43:
                j = MetaAiVoiceStateProxy.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId44 = MetaAiVoiceStateProxy.CProxy.nativeGetMcfTypeId();
                    MetaAiVoiceStateProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId44;
                    return nativeGetMcfTypeId44;
                }
                return j;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                j = ModeratorApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId45 = ModeratorApi.CProxy.nativeGetMcfTypeId();
                    ModeratorApi.CProxy.sMcfTypeId = nativeGetMcfTypeId45;
                    return nativeGetMcfTypeId45;
                }
                return j;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                HN9.A00();
                j = ModeratorClientModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId46 = ModeratorClientModel.nativeGetMcfTypeId();
                    ModeratorClientModel.sMcfTypeId = nativeGetMcfTypeId46;
                    return nativeGetMcfTypeId46;
                }
                return j;
            case 46:
                j = PerfListener.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId47 = PerfListener.CProxy.nativeGetMcfTypeId();
                    PerfListener.CProxy.sMcfTypeId = nativeGetMcfTypeId47;
                    return nativeGetMcfTypeId47;
                }
                return j;
            case ActionId.ON_START_END /* 47 */:
                j = PerfListenerFactory.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId48 = PerfListenerFactory.CProxy.nativeGetMcfTypeId();
                    PerfListenerFactory.CProxy.sMcfTypeId = nativeGetMcfTypeId48;
                    return nativeGetMcfTypeId48;
                }
                return j;
            case ActionId.QUEUED /* 48 */:
                j = RealtimeSessionManagerApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId49 = RealtimeSessionManagerApi.CProxy.nativeGetMcfTypeId();
                    RealtimeSessionManagerApi.CProxy.sMcfTypeId = nativeGetMcfTypeId49;
                    return nativeGetMcfTypeId49;
                }
                return j;
            case ActionId.IN_PROGRESS /* 49 */:
                j = SnapshotApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId50 = SnapshotApi.CProxy.nativeGetMcfTypeId();
                    SnapshotApi.CProxy.sMcfTypeId = nativeGetMcfTypeId50;
                    return nativeGetMcfTypeId50;
                }
                return j;
            case 50:
                j = SnapshotBuffer.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId51 = SnapshotBuffer.nativeGetMcfTypeId();
                    SnapshotBuffer.sMcfTypeId = nativeGetMcfTypeId51;
                    return nativeGetMcfTypeId51;
                }
                return j;
            case ActionId.UNKNOWN /* 51 */:
                j = SnapshotCompleteModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId52 = SnapshotCompleteModel.nativeGetMcfTypeId();
                    SnapshotCompleteModel.sMcfTypeId = nativeGetMcfTypeId52;
                    return nativeGetMcfTypeId52;
                }
                return j;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                N0D.A00();
                j = SnapshotDeleteCommand.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId53 = SnapshotDeleteCommand.nativeGetMcfTypeId();
                    SnapshotDeleteCommand.sMcfTypeId = nativeGetMcfTypeId53;
                    return nativeGetMcfTypeId53;
                }
                return j;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                N0D.A00();
                j = SnapshotDismissCommand.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId54 = SnapshotDismissCommand.nativeGetMcfTypeId();
                    SnapshotDismissCommand.sMcfTypeId = nativeGetMcfTypeId54;
                    return nativeGetMcfTypeId54;
                }
                return j;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                j = SnapshotProxyDiscardCallback.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId55 = SnapshotProxyDiscardCallback.CProxy.nativeGetMcfTypeId();
                    SnapshotProxyDiscardCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId55;
                    return nativeGetMcfTypeId55;
                }
                return j;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                j = SnapshotProxySaveCallback.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId56 = SnapshotProxySaveCallback.CProxy.nativeGetMcfTypeId();
                    SnapshotProxySaveCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId56;
                    return nativeGetMcfTypeId56;
                }
                return j;
            case ActionId.QUEUEING_FAIL /* 56 */:
                j = SnapshotProxySendCallback.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId57 = SnapshotProxySendCallback.CProxy.nativeGetMcfTypeId();
                    SnapshotProxySendCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId57;
                    return nativeGetMcfTypeId57;
                }
                return j;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                j = SnapshotProxyStitchCallback.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId58 = SnapshotProxyStitchCallback.CProxy.nativeGetMcfTypeId();
                    SnapshotProxyStitchCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId58;
                    return nativeGetMcfTypeId58;
                }
                return j;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                N0D.A00();
                j = SnapshotRecaptureCommand.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId59 = SnapshotRecaptureCommand.nativeGetMcfTypeId();
                    SnapshotRecaptureCommand.sMcfTypeId = nativeGetMcfTypeId59;
                    return nativeGetMcfTypeId59;
                }
                return j;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                N0D.A00();
                j = SnapshotSendCommand.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId60 = SnapshotSendCommand.nativeGetMcfTypeId();
                    SnapshotSendCommand.sMcfTypeId = nativeGetMcfTypeId60;
                    return nativeGetMcfTypeId60;
                }
                return j;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                j = StarRatingModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId61 = StarRatingModel.nativeGetMcfTypeId();
                    StarRatingModel.sMcfTypeId = nativeGetMcfTypeId61;
                    return nativeGetMcfTypeId61;
                }
                return j;
            case ActionId.COUNTER /* 61 */:
                j = StreamApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId62 = StreamApi.CProxy.nativeGetMcfTypeId();
                    StreamApi.CProxy.sMcfTypeId = nativeGetMcfTypeId62;
                    return nativeGetMcfTypeId62;
                }
                return j;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                j = VideoCapturePropertiesListener.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId63 = VideoCapturePropertiesListener.CProxy.nativeGetMcfTypeId();
                    VideoCapturePropertiesListener.CProxy.sMcfTypeId = nativeGetMcfTypeId63;
                    return nativeGetMcfTypeId63;
                }
                return j;
            case 63:
                j = VideoStreamController.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId64 = VideoStreamController.CProxy.nativeGetMcfTypeId();
                    VideoStreamController.CProxy.sMcfTypeId = nativeGetMcfTypeId64;
                    return nativeGetMcfTypeId64;
                }
                return j;
            case 64:
                N0E.A00();
                j = VideoStreamSendParams.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId65 = VideoStreamSendParams.nativeGetMcfTypeId();
                    VideoStreamSendParams.sMcfTypeId = nativeGetMcfTypeId65;
                    return nativeGetMcfTypeId65;
                }
                return j;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                j = TurnAllocationCallback.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId66 = TurnAllocationCallback.CProxy.nativeGetMcfTypeId();
                    TurnAllocationCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId66;
                    return nativeGetMcfTypeId66;
                }
                return j;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                j = TurnAllocationProxy.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId67 = TurnAllocationProxy.CProxy.nativeGetMcfTypeId();
                    TurnAllocationProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId67;
                    return nativeGetMcfTypeId67;
                }
                return j;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                j = MediaProcessor.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId68 = MediaProcessor.CProxy.nativeGetMcfTypeId();
                    MediaProcessor.CProxy.sMcfTypeId = nativeGetMcfTypeId68;
                    return nativeGetMcfTypeId68;
                }
                return j;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                j = ProcessedFrameCallbacks.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId69 = ProcessedFrameCallbacks.CProxy.nativeGetMcfTypeId();
                    ProcessedFrameCallbacks.CProxy.sMcfTypeId = nativeGetMcfTypeId69;
                    return nativeGetMcfTypeId69;
                }
                return j;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                j = PendingFetchEffectModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId70 = PendingFetchEffectModel.nativeGetMcfTypeId();
                    PendingFetchEffectModel.sMcfTypeId = nativeGetMcfTypeId70;
                    return nativeGetMcfTypeId70;
                }
                return j;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                j = VideoEffect.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId71 = VideoEffect.nativeGetMcfTypeId();
                    VideoEffect.sMcfTypeId = nativeGetMcfTypeId71;
                    return nativeGetMcfTypeId71;
                }
                return j;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                j = VideoEffectApi.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId72 = VideoEffectApi.CProxy.nativeGetMcfTypeId();
                    VideoEffectApi.CProxy.sMcfTypeId = nativeGetMcfTypeId72;
                    return nativeGetMcfTypeId72;
                }
                return j;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                j = VideoEffectAttribution.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId73 = VideoEffectAttribution.nativeGetMcfTypeId();
                    VideoEffectAttribution.sMcfTypeId = nativeGetMcfTypeId73;
                    return nativeGetMcfTypeId73;
                }
                return j;
            case ActionId.INTENT_MAPPED /* 73 */:
                j = VideoEffectInstruction.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId74 = VideoEffectInstruction.nativeGetMcfTypeId();
                    VideoEffectInstruction.sMcfTypeId = nativeGetMcfTypeId74;
                    return nativeGetMcfTypeId74;
                }
                return j;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                j = VideoEffectLicense.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId75 = VideoEffectLicense.nativeGetMcfTypeId();
                    VideoEffectLicense.sMcfTypeId = nativeGetMcfTypeId75;
                    return nativeGetMcfTypeId75;
                }
                return j;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                j = VideoEffectModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId76 = VideoEffectModel.nativeGetMcfTypeId();
                    VideoEffectModel.sMcfTypeId = nativeGetMcfTypeId76;
                    return nativeGetMcfTypeId76;
                }
                return j;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                j = VideoEffectPeerEffectModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId77 = VideoEffectPeerEffectModel.nativeGetMcfTypeId();
                    VideoEffectPeerEffectModel.sMcfTypeId = nativeGetMcfTypeId77;
                    return nativeGetMcfTypeId77;
                }
                return j;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                j = VideoEffectPrivacyModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId78 = VideoEffectPrivacyModel.nativeGetMcfTypeId();
                    VideoEffectPrivacyModel.sMcfTypeId = nativeGetMcfTypeId78;
                    return nativeGetMcfTypeId78;
                }
                return j;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                j = VideoEffectRandomPickerModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId79 = VideoEffectRandomPickerModel.nativeGetMcfTypeId();
                    VideoEffectRandomPickerModel.sMcfTypeId = nativeGetMcfTypeId79;
                    return nativeGetMcfTypeId79;
                }
                return j;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                j = VideoEffectSaveInfo.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId80 = VideoEffectSaveInfo.nativeGetMcfTypeId();
                    VideoEffectSaveInfo.sMcfTypeId = nativeGetMcfTypeId80;
                    return nativeGetMcfTypeId80;
                }
                return j;
            case 80:
                j = VideoEffectVariantConfiguration.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId81 = VideoEffectVariantConfiguration.nativeGetMcfTypeId();
                    VideoEffectVariantConfiguration.sMcfTypeId = nativeGetMcfTypeId81;
                    return nativeGetMcfTypeId81;
                }
                return j;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                j = VideoEffectVariantModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId82 = VideoEffectVariantModel.nativeGetMcfTypeId();
                    VideoEffectVariantModel.sMcfTypeId = nativeGetMcfTypeId82;
                    return nativeGetMcfTypeId82;
                }
                return j;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                j = GetGroupEffectConfirmationCompletion.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId83 = GetGroupEffectConfirmationCompletion.CProxy.nativeGetMcfTypeId();
                    GetGroupEffectConfirmationCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId83;
                    return nativeGetMcfTypeId83;
                }
                return j;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                j = GroupEffectConfirmationPromptCompletion.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId84 = GroupEffectConfirmationPromptCompletion.CProxy.nativeGetMcfTypeId();
                    GroupEffectConfirmationPromptCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId84;
                    return nativeGetMcfTypeId84;
                }
                return j;
            case ActionId.MARKER_SWAPPED /* 84 */:
                j = UnapprovedEffectAlertCompletion.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId85 = UnapprovedEffectAlertCompletion.CProxy.nativeGetMcfTypeId();
                    UnapprovedEffectAlertCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId85;
                    return nativeGetMcfTypeId85;
                }
                return j;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                N0G.A00();
                j = VideoEffectCommunicationAdditionalEffectInfo.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId86 = VideoEffectCommunicationAdditionalEffectInfo.nativeGetMcfTypeId();
                    VideoEffectCommunicationAdditionalEffectInfo.sMcfTypeId = nativeGetMcfTypeId86;
                    return nativeGetMcfTypeId86;
                }
                return j;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                j = GetVideoQualityPreferenceSettingCallback.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId87 = GetVideoQualityPreferenceSettingCallback.CProxy.nativeGetMcfTypeId();
                    GetVideoQualityPreferenceSettingCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId87;
                    return nativeGetMcfTypeId87;
                }
                return j;
            case ActionId.ERROR /* 87 */:
                N0H.A00();
                j = VideoQualityPickerModel.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId88 = VideoQualityPickerModel.nativeGetMcfTypeId();
                    VideoQualityPickerModel.sMcfTypeId = nativeGetMcfTypeId88;
                    return nativeGetMcfTypeId88;
                }
                return j;
            case ActionId.METHOD_INVOKE /* 88 */:
                j = VideoQualityPickerProxy.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId89 = VideoQualityPickerProxy.CProxy.nativeGetMcfTypeId();
                    VideoQualityPickerProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId89;
                    return nativeGetMcfTypeId89;
                }
                return j;
            case ActionId.FINALLY /* 89 */:
                j = VideoRenderFrameCallback.CProxy.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId90 = VideoRenderFrameCallback.CProxy.nativeGetMcfTypeId();
                    VideoRenderFrameCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId90;
                    return nativeGetMcfTypeId90;
                }
                return j;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                HNL.A00();
                j = VideoRenderItem.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId91 = VideoRenderItem.nativeGetMcfTypeId();
                    VideoRenderItem.sMcfTypeId = nativeGetMcfTypeId91;
                    return nativeGetMcfTypeId91;
                }
                return j;
            default:
                j = 0;
                return j;
        }
    }
}
