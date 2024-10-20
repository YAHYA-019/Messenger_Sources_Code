package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.login.ui.AuthFragmentLogoViewGroup;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1w0, reason: invalid class name */
/* loaded from: 1w0.class */
public final class C1w0 {
    public static final C1w1 A06 = new Object();
    public static final java.util.Map A07;
    public final 1Br A00;
    public final AtomicInteger A01;
    public final boolean A02;
    public final C1vy A03;
    public final C1vh A04;
    public final ConcurrentLinkedQueue A05;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1w1, java.lang.Object] */
    static {
        03Y r0 = new 03Y("application_init", new C1w2[]{C1w2.A0I});
        C1w2 c1w2 = C1w2.A0J;
        C1w2 c1w22 = C1w2.A0N;
        03Y r02 = new 03Y("native_newsfeed_enter", new C1w2[]{c1w2, c1w22});
        C1w2 c1w23 = C1w2.A0O;
        03Y r03 = new 03Y("native_newsfeed_exit", new C1w2[]{c1w2, c1w23});
        C1w2 c1w24 = C1w2.A0H;
        A07 = 04R.A09(new 03Y[]{r0, r02, r03, new 03Y("app_foregrounded", new C1w2[]{c1w24, c1w22}), new 03Y(ErrorReportingConstants.APP_BACKGROUNDED, new C1w2[]{c1w24, c1w23})});
    }

    public C1w0(C1vy c1vy, C1vh c1vh, boolean z) {
        11T.A0F(c1vh, 1);
        11T.A0F(c1vy, 3);
        this.A04 = c1vh;
        this.A02 = z;
        this.A03 = c1vy;
        this.A01 = new AtomicInteger();
        this.A00 = 1Bq.A00(16859);
        this.A05 = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0851. Please report as an issue. */
    private final void A00() {
        String str;
        C1w2[] c1w2Arr;
        C1w2 c1w2;
        C1w2 c1w22;
        C1w2 c1w23;
        C1w2 c1w24;
        Object peek = this.A05.peek();
        1wB r0 = (1wB) peek;
        if (r0 == null) {
            if (0fH.A01.BTv(2)) {
                0fH.A0m(this.A02 ? "AppJobsSchedulerTriggersQueue_RunImmediately" : "AppJobsSchedulerTriggersQueue", "runNextTrigger(): no more triggers to run");
                return;
            }
            return;
        }
        C1w7 c1w7 = r0.A01;
        ArrayList arrayList = new ArrayList();
        1wD r02 = new 1wD(r0, this);
        int[] iArr = r0.A03;
        int length = iArr.length;
        synchronized (peek) {
            r0.A00 = new HashSet(length);
        }
        for (int i : iArr) {
            HashSet hashSet = r0.A00;
            if (hashSet == null) {
                throw 1BK.A0h();
            }
            hashSet.add(Integer.valueOf(i));
            String str2 = r0.A02;
            this.A00.A00.get();
            boolean z = c1w7.A00;
            1wJ r03 = new 1wJ();
            switch (i) {
                case 0:
                    str = "com.facebook.abtest.qe.cache.QuickExperimentMemoryCacheObserverManager#init";
                    break;
                case 1:
                    str = "com.facebook.accessibility.logging.TouchExplorationStateChangeDetector#onForegroundAppJob";
                    break;
                case 2:
                    str = "com.facebook.accessibility.logging.TouchExplorationStateChangeDetector#onBackgroundAppJob";
                    break;
                case 3:
                    str = "com.facebook.account.switcher.storage.DeviceBasedLoginSessionPersister#getValidLocalAuthData";
                    break;
                case 4:
                    str = "com.facebook.acradi.criticaldata.setter.AcraCriticalDataController#init";
                    break;
                case 5:
                    str = "com.facebook.analytics.ClientPeriodicEventReporterManager#init";
                    break;
                case 6:
                    str = "com.facebook.analytics.NavigationLoggerChatHeadCoreController#foregroundedImmediate";
                    break;
                case 7:
                    str = "com.facebook.analytics.NavigationLoggerChatHeadCoreController#backgroundedImmediate";
                    break;
                case 8:
                    str = "com.facebook.analytics.counterlogger.CommunicationScheduler#onForegroundAppJob";
                    break;
                case 9:
                    str = "com.facebook.analytics.counterlogger.CommunicationScheduler#onBackgroundAppJob";
                    break;
                case 10:
                    str = "com.facebook.analytics.NetworkDataCategorizer#init";
                    break;
                case 11:
                    str = "com.facebook.analytics.analyticsmodule.DeviceInfoHelper#init";
                    break;
                case 12:
                    str = "com.facebook.analytics.mobileconfigreliability.MobileConfigSampledAccessListenerImpl#sendAllDeferredLogsAppJob";
                    break;
                case 13:
                    str = "com.facebook.apk_testing.ApkTestingExposureLogger#init";
                    break;
                case 14:
                    str = "com.facebook.appperf.messagequeue.apps.M4aMessageQueueDoctorInitializer#init";
                    break;
                case 15:
                    str = "com.facebook.appperf.timeout.apps.M4aTimeoutConfigInitializer#firstAppForeground";
                    break;
                case 16:
                    str = "com.facebook.appperf.timeout.apps.M4aTimeoutConfigInitializer#appInit";
                    break;
                case 17:
                    str = "com.facebook.appperf.ttrc.TTRCTraceAppJob#backgroundedImmediate";
                    break;
                case 18:
                    str = "com.facebook.art.dexlogger.DexEventReporter#logBackgrounded";
                    break;
                case 19:
                    str = "com.facebook.attribution.LatStatusJob#onForegroundLatStatusJob";
                    break;
                case 20:
                    str = "com.facebook.battery.animatorleakdetector.fbimpl.FbAnimatorLeakDetector#init";
                    break;
                case 21:
                    str = "com.facebook.battery.animatorleakdetector.fbimpl.FbAnimatorLeakDetector#onBackgroundAppJob";
                    break;
                case 22:
                    str = "com.facebook.battery.cpuspin.di.FbCpuSpinScheduler#onAppInit";
                    break;
                case 23:
                    str = "com.facebook.battery.cpuspin.di.FbCpuSpinScheduler#onAppForeground";
                    break;
                case 24:
                    str = "com.facebook.battery.cpuspin.di.FbCpuSpinScheduler#onAppBackground";
                    break;
                case 25:
                    str = "com.facebook.battery.instrumentation.BatteryMetricsController#onAppForeground";
                    break;
                case 26:
                    str = "com.facebook.battery.instrumentation.BatteryMetricsController#onApplicationInit";
                    break;
                case 27:
                    str = "com.facebook.battery.instrumentation.BatteryMetricsReporter#onForegroundAppJob";
                    break;
                case 28:
                    str = "com.facebook.battery.instrumentation.BatteryMetricsReporter#onBackgroundAppJob";
                    break;
                case 29:
                    str = "com.facebook.battery.pie.RestrictedModeLogger#onAppInitialized";
                    break;
                case 30:
                    str = "com.facebook.battery.pie.RestrictedModeLogger#onAppForegrounded";
                    break;
                case 31:
                    str = "com.facebook.battery.samsunglegacy.SamsungWarningNotificationLogger#init";
                    break;
                case 32:
                    str = "com.facebook.battery.samsunglegacy.SamsungWarningNotificationLogger#onTransition";
                    break;
                case 33:
                    str = "com.facebook.breakpad.BreakpadFlagsController#init";
                    break;
                case 34:
                    str = "com.facebook.browser.lite.extensions.autofill.facebook.appjob.FBAutofillPrefetchAppJob#doPrefetch";
                    break;
                case 35:
                    str = "com.facebook.camerarollprocessor.CameraRollMediaProcessorAppJob#cleanUpSubscribersOnAppBackgroundedTrigger";
                    break;
                case 36:
                    str = "com.facebook.cloudseeder.TransientNetworkTraceLateInit#onForegroundAppJob";
                    break;
                case 37:
                    str = "com.facebook.cloudseeder.TransientNetworkTraceLateInit#onBackgroundAppJob";
                    break;
                case 38:
                    str = "com.facebook.common.activitycleaner.ActivityStackManager#onAppForeground";
                    break;
                case 39:
                    str = "com.facebook.common.activitycleaner.ActivityStackManager#onAppBackground";
                    break;
                case 40:
                    str = "com.facebook.common.activitycleaner.ActivityStackResetter#onForegroundAppJob";
                    break;
                case 41:
                    str = "com.facebook.common.activitycleaner.ActivityStackResetter#onBackgroundAppJob";
                    break;
                case 42:
                    str = "com.facebook.common.appchoreographer.USLTaskInstrumentation#init";
                    break;
                case 43:
                    str = "com.facebook.common.appjobs.ondemand.AppJobsPeriodicJobScheduler#scheduleAllPeriodic";
                    break;
                case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                    str = "com.facebook.common.coldstartexperiments.writer.FbColdStartExperimentsWriter#init";
                    break;
                case ActionId.ON_CREATE_VIEW_END /* 45 */:
                    str = "com.facebook.common.combinedthreadpool.asyncinit.CombinedThreadPoolAsyncInit#init";
                    break;
                case 46:
                    str = "com.facebook.common.combinedthreadpool.asyncinit.CombinedThreadPoolLoggerAppStateListener#onForegroundAppJob";
                    break;
                case ActionId.ON_START_END /* 47 */:
                    str = "com.facebook.common.combinedthreadpool.asyncinit.CombinedThreadPoolLoggerAppStateListener#onBackgroundAppJob";
                    break;
                case ActionId.QUEUED /* 48 */:
                    str = "com.facebook.common.connectionstatus.FbDataConnectionManager#onBackgroundAppJob";
                    break;
                case ActionId.IN_PROGRESS /* 49 */:
                    str = "com.facebook.common.connectionstatus.FbDataConnectionManager#init";
                    break;
                case 50:
                    str = "com.facebook.common.dextricksdi.ColdstartExperimentsController#init";
                    break;
                case ActionId.UNKNOWN /* 51 */:
                    str = "com.facebook.common.dextricksdi.DexOptimizationKickoffThing#init";
                    break;
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                    str = "com.facebook.common.dextricksdi.MDCLANFailedStartCleaner#init";
                    break;
                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                    str = "com.facebook.common.foregroundservice.di.ForegroundEligibilityStatusAppJob#onForeground";
                    break;
                case ActionId.QUEUEING_BEGIN /* 54 */:
                    str = "com.facebook.common.foregroundservice.di.ForegroundEligibilityStatusAppJob#onBackground";
                    break;
                case ActionId.QUEUEING_SUCCESS /* 55 */:
                    str = "com.facebook.common.i18n.zawgyi.ZawgyiFontDetectorIntegration#onUserEnteredApp";
                    break;
                case ActionId.QUEUEING_FAIL /* 56 */:
                    str = "com.facebook.common.i18n.zawgyi.ZawgyiFontDetectorIntegration#onUserLeftApp";
                    break;
                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                    str = "com.facebook.common.init.impl.FbSharedPreferenceInitializer#syncStartupCacheForNextColdStart";
                    break;
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                    str = "com.facebook.common.lsplugins.accountchangecachecleaner.AccountChangeCacheCleaner#onLoginQueriesComplete";
                    break;
                case ActionId.PHOTO_CAPTURED /* 59 */:
                    str = "com.facebook.common.lyradi.LyraFlagsController#init";
                    break;
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                    str = "com.facebook.common.memory.frameworkoemleakfix.di.FrameworkOemLeakFixHelper#init";
                    break;
                case ActionId.COUNTER /* 61 */:
                    str = "com.facebook.common.netchecker.NetChecker#init";
                    break;
                case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                    str = "com.facebook.common.netchecker.NetChecker#onForegroundAppJob";
                    break;
                case 63:
                    str = "com.facebook.common.network.FbNetworkManager#init";
                    break;
                case 64:
                    str = "com.facebook.common.networkmonitor.NetworkConnectionMonitor#init";
                    break;
                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                    str = "com.facebook.common.startupconfig.init.StartupConfigsIniter#init";
                    break;
                case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                    str = "com.facebook.common.userinteraction.UserInteractionHistory#saveLastUsedTimeAppJob";
                    break;
                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                    str = "com.facebook.composer.media.picker.sfvToReel.SfvToReelsRetrieveOptInStateAppJob#onFirstAppForegroundeded";
                    break;
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    str = "com.facebook.composer.media.picker.sfvToReel.SfvToReelsRetrieveOptInStateAppJob#onLoginComplete";
                    break;
                case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                    str = "com.facebook.composer.publish.PendingStoryRestoreCoordinator#onAppInit";
                    break;
                case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                    str = "com.facebook.composer.publish.PendingStoryRestoreCoordinator#onAppBackgrounded";
                    break;
                case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                    str = "com.facebook.composer.publish.PendingStoryRestoreCoordinator#onAppForegrounded";
                    break;
                case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                    str = "com.facebook.composer.publish.StoriesTrayVisibilityChangeLogger#onFirstAppForegrounded";
                    break;
                case ActionId.INTENT_MAPPED /* 73 */:
                    str = "com.facebook.composer.publish.StoriesTrayVisibilityChangeLogger#onLoginComplete";
                    break;
                case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                    str = "com.facebook.composer.publish.cache.pendingstory.voltron.PendingStoryStoreAppJobForMessenger#init";
                    break;
                case ActionId.ACTIVITY_PAUSED /* 75 */:
                    str = "com.facebook.conditionalworker.ConditionalWorkerJobScheduler#init";
                    break;
                case ActionId.ACTIVITY_STARTED /* 76 */:
                    str = "com.facebook.conditionalworker.ConditionalWorkerManager#init";
                    break;
                case ActionId.ACTIVITY_RESUMED /* 77 */:
                    str = "com.facebook.conditionalworker.ConditionalWorkerManager#onForegroundAppJob";
                    break;
                case ActionId.FRAGMENT_CREATED /* 78 */:
                    str = "com.facebook.conditionalworker.ConditionalWorkerManager#onBackgroundAppJob";
                    break;
                case ActionId.FRAGMENT_RESUMED /* 79 */:
                    str = "com.facebook.config.background.impl.ConfigurationConditionalWorker#init";
                    break;
                case 80:
                    str = "com.facebook.config.background.impl.ConfigurationConditionalWorkerInfo#updateUserLeftApp";
                    break;
                case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                    str = "com.facebook.connectivity.simcarrier.SimCarrierInfoLoggerAppJob#onAppForegroundedTrigger";
                    break;
                case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                    str = "com.facebook.connectivity.simcarrier.SimCarrierInfoLoggerAppJob#onAppBackgroundedTrigger";
                    break;
                case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                    str = "com.facebook.contacts.properties.CollationChangedTracker#init";
                    break;
                case ActionId.MARKER_SWAPPED /* 84 */:
                    str = "com.facebook.crossappvalue.FBMMessengerExposures#init";
                    break;
                case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                    str = "com.facebook.crossposting.configManager.FBUnifiedXpostingConfigsInit#firstAppForegroundedInit";
                    break;
                case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                    str = "com.facebook.darts.DartsLoggerAppJob#onAppBackgroundedTrigger";
                    break;
                case ActionId.ERROR /* 87 */:
                    str = "com.facebook.darts.FileDartsLoggerAppJob#onAppForegroundedImmediateTrigger";
                    break;
                case ActionId.METHOD_INVOKE /* 88 */:
                    str = "com.facebook.darts.FileDartsLoggerAppJob#onAppBackgroundedTrigger";
                    break;
                case ActionId.FINALLY /* 89 */:
                    str = "com.facebook.darts.MLDWDartsLoggerAppJob#onAppForegroundedImmediateTrigger";
                    break;
                case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                    str = "com.facebook.database.olddbcleaner.OldDatabasesCleaner#init";
                    break;
                case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                    str = "com.facebook.deadcode.DeadCodeConfigSync#init";
                    break;
                case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                    str = "com.facebook.debug.perfoverlay.PerfOverlayAppJob#onJobEnter";
                    break;
                case ActionId.ANIMATION_END /* 93 */:
                    str = "com.facebook.debug.perfoverlay.PerfOverlayAppJob#onJobExit";
                    break;
                case ActionId.UDP_REQUEST_SEND /* 94 */:
                    str = "com.facebook.debug.saddataoverlay.SadDataOverlayAppJob#onJobEnter";
                    break;
                case ActionId.MAIN_COMPLETE /* 95 */:
                    str = "com.facebook.debug.saddataoverlay.SadDataOverlayAppJob#onJobExit";
                    break;
                case ActionId.INTERRUPTED /* 96 */:
                    str = "com.facebook.delayedworker.DelayedWorkerExecutionTimeManager#maybeCleanUpOldPrefs";
                    break;
                case ActionId.NETWORK_FAILED /* 97 */:
                    str = "com.facebook.device.DeviceConditionHelper#init";
                    break;
                case ActionId.NETWORK_RESPONSE /* 98 */:
                    str = "com.facebook.device.resourcemonitor.ResourceManager#onTransitionAppJob";
                    break;
                case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                    str = "com.facebook.device.resourcemonitor.ResourceMonitor#onForegroundAppJob";
                    break;
                case 100:
                    str = "com.facebook.device.resourcemonitor.ResourceMonitor#onBackgroundAppJob";
                    break;
                case ActionId.ON_VIEW_CREATED_END /* 101 */:
                    str = "com.facebook.device_id.UniqueFamilyDeviceIdBroadcastSender#onAppBackgrounded";
                    break;
                case ActionId.DATA_LOAD_START /* 102 */:
                    str = "com.facebook.dialtone.ZeroToggleStickyModeManager#init";
                    break;
                case ActionId.LEGACY_MARKER /* 103 */:
                    str = "com.facebook.dialtone.carrierinsights.CarrierInsightsDialog#onAppForeground";
                    break;
                case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                    str = "com.facebook.distribgw.client.di.AppStateSyncerProvider#onAppForegrounded";
                    break;
                case ActionId.ABORTED /* 105 */:
                    str = "com.facebook.distribgw.client.di.AppStateSyncerProvider#onAppForegroundedIdle";
                    break;
                case ActionId.QUERY_READY /* 106 */:
                    str = "com.facebook.distribgw.client.di.AppStateSyncerProvider#onAppBackgrounded";
                    break;
                case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                    str = "com.facebook.distribgw.client.di.AppStateSyncerProvider#onNetworkConnectivityChanged";
                    break;
                case 108:
                    str = "com.facebook.entitypresence.EntityPresenceManager#onForegroundAppJob";
                    break;
                case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                    str = "com.facebook.entitypresence.EntityPresenceManager#onBackgroundAppJob";
                    break;
                case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                    str = "com.facebook.errorreporting.lacrima.sender.resumable.uploader.LacrimaReportUploader#init";
                    break;
                case ActionId.NEW_START_FOUND /* 111 */:
                    str = "com.facebook.fbpay.platforms.messenger.config.FBPayMessengerConfig#onUserLogin";
                    break;
                case ActionId.MISSED_EVENT /* 112 */:
                    str = "com.facebook.fbpay.platforms.messenger.config.FBPayMessengerConfig#initialize";
                    break;
                case ActionId.TIMEOUT /* 113 */:
                    str = "com.facebook.fbshorts.analytics.FbShortsInterruptionStateManager#onLeaveApp";
                    break;
                case ActionId.CONTROLLER_INITIATED /* 114 */:
                    str = "com.facebook.fbui.fonts.prefetch.FontPrefetcher#init";
                    break;
                case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                    str = "com.facebook.fbui.uitracker.logger.UITrackerLoggingInitializer#onForeground";
                    break;
                case ActionId.VIDEO_PLAYING /* 116 */:
                    str = "com.facebook.fbui.uitracker.logger.UITrackerLoggingInitializer#onBackground";
                    break;
                case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                    str = "com.facebook.fds.errorstate.FDSFailedLoadingStatePreloadImagesAppJob#onSimpleJobEnter";
                    break;
                case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                    str = "com.facebook.feed.logging.waterfall.VpvWaterfallLogger#onAppBackground";
                    break;
                case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                    str = "com.facebook.feed.video.inline.sound.api.BackgroundAudioStateManager#onUserEnteredApp";
                    break;
                case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                    str = "com.facebook.feed.video.inline.sound.api.BackgroundAudioStateManager#onUserLeftApp";
                    break;
                case ActionId.HEADER_DATA_LOADED /* 121 */:
                    str = "com.facebook.fixie.apps.messenger.MessengerFixieOps#init";
                    break;
                case ActionId.CARD_DATA_LOADED /* 122 */:
                    str = "com.facebook.fxssocache.startup.FXFBAccessLibrarySSOAndRegFlagAppJob#coldAndWarmStartAppJob";
                    break;
                case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                    str = "com.facebook.graphql.executor.OfflineMutationsManager#init";
                    break;
                case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                    str = "com.facebook.graphql.executor.OfflineMutationsManager#onConnectivityChange";
                    break;
                case 125:
                    str = "com.facebook.growth.sem.SemColdStartLogger#OnUserEnteredApp";
                    break;
                case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                    str = "com.facebook.http.config.proxies.ProxyDetector#init";
                    break;
                case 127:
                    str = "com.facebook.http.networkstatelogger.NetworkStateLogger#initialize";
                    break;
                case 128:
                    str = "com.facebook.http.networkstatelogger.NetworkStateLogger#onSessionStart";
                    break;
                case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
                    str = "com.facebook.http.networkstatelogger.NetworkStateLogger#onSessionEnd";
                    break;
                case ActionId.APP_DID_FINISH_LAUNCHING /* 130 */:
                    str = "com.facebook.imagepipeline.internal.CacheEmergencyDeleter#init";
                    break;
                case ActionId.APP_DID_BECOME_ACTIVE /* 131 */:
                    str = "com.facebook.inspiration.composer.sprouts.framework.ranking.InspirationSproutSurfaceDiskStorage#onLoginComplete";
                    break;
                case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                    str = "com.facebook.inspiration.composer.sprouts.framework.ranking.InspirationSproutSurfaceDiskStorage#onFirstAppForeground";
                    break;
                case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
                    str = "com.facebook.inspiration.messenger.editor.appjob.MessengerInspirationAppJob#init";
                    break;
                case ActionId.APP_MAIN /* 134 */:
                    str = "com.facebook.inspiration.messenger.prefetch.InspirationMessengerAppJob#prefetchInspirationMessenger";
                    break;
                case ActionId.MQTT_CONNECTING /* 135 */:
                    str = "com.facebook.keyframes.fb.FbKeyframesAppStateManager#onForegroundAppJob";
                    break;
                case ActionId.MQTT_CONNECTED /* 136 */:
                    str = "com.facebook.keyframes.fb.FbKeyframesAppStateManager#onBackgroundAppJob";
                    break;
                case ActionId.MQTT_DISCONNECTED /* 137 */:
                    str = "com.facebook.location.foreground.ForegroundLocationFrameworkController#onUserEnteredApp";
                    break;
                case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
                    str = "com.facebook.location.foreground.ForegroundLocationFrameworkController#onUserLeftApp";
                    break;
                case ActionId.APP_FIRST_VIEW_CONTROLLER /* 139 */:
                    str = "com.facebook.location.foreground.ForegroundLocationRWISignalCollectorAppJob#onSimpleJobEnterTrigger";
                    break;
                case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                    str = "com.facebook.location.foreground.ForegroundLocationRWISignalCollectorAppJob#onSimpleJobExitTrigger";
                    break;
                case ActionId.MESSENGER_THREAD_LIST_DISPLAYED /* 141 */:
                    str = "com.facebook.location.providers.FbLocationStatusMonitor#init";
                    break;
                case ActionId.PREV_ACTIVITY_PAUSE /* 142 */:
                    str = "com.facebook.media.upload.photo.MultiStepResumeJob#onResumePersistedUploads";
                    break;
                case ActionId.ACTIVITY_RESUME /* 143 */:
                    str = "com.facebook.memory.fbmemorymanager.FBMemoryManager#init";
                    break;
                case ActionId.ACTIVITY_START /* 144 */:
                    str = "com.facebook.memory.fbmemorymanager.FBMemoryManagerHooks#onForegroundAppJob";
                    break;
                case ActionId.BEGIN_START_ACTIVITY /* 145 */:
                    str = "com.facebook.memory.fbmemorymanager.FBMemoryManagerHooks#onBackgroundAppJob";
                    break;
                case ActionId.END_START_ACTIVITY /* 146 */:
                    str = "com.facebook.memory.surfacemetrics.enabler.m4a.M4aMemoryProgramInitializer#onAppInit";
                    break;
                case ActionId.FILE_SYSTEM_FAIL /* 147 */:
                    str = "com.facebook.memorytimeline.di.enabler.MemoryTimelineEnabler#startTrackingMemory";
                    break;
                case ActionId.FORMAT_ERROR /* 148 */:
                    str = "com.facebook.messaging.accountswitch.accountprovider.FetchSOAPAccountsAppJob#fetchSOAPAccounts";
                    break;
                case ActionId.PRIVACY_VIOLATION /* 149 */:
                    str = "com.facebook.messaging.accountswitch.appjobs.AccountSwitchAppJob#onAccountsStoredInAccountSwitcher";
                    break;
                case 150:
                    str = "com.facebook.messaging.accountswitch.appjobs.SwitchAccountUnseenFetchJob#init";
                    break;
                case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                    str = "com.facebook.messaging.additionalprofiles.drawer.gating.appjob.AccountAwareDrawerGatingSharedPrefsWriter#onAppInit";
                    break;
                case ActionId.APPLY_OPTIMISTICS /* 152 */:
                    str = "com.facebook.messaging.analytics.perf.MessagingInteractionStateManager#cancelAllMarkersWhenUserLeavesApp";
                    break;
                case ActionId.APPLY_FINISHED_LIST /* 153 */:
                    str = "com.facebook.messaging.analytics.perf.MessagingPerformanceLogger#waMsysConnected";
                    break;
                case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                    str = "com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger#onAppInitialized";
                    break;
                case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                    str = "com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger#onEnterForeground";
                    break;
                case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
                    str = "com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger#onEnterBackground";
                    break;
                case ActionId.WAIT_FOR_BLOCKERS /* 157 */:
                    str = "com.facebook.messaging.analytics.perf.efficiency.connection.MessagingConnectionBlackoutLogger#onEnterForeground";
                    break;
                case ActionId.NOTIFY_SUBSCRIBERS /* 158 */:
                    str = "com.facebook.messaging.analytics.perf.efficiency.connectiontimeline.MessagingConnectionTimelineLogger#onEnterForeground";
                    break;
                case ActionId.FAIL_FILE_TOO_LARGE /* 159 */:
                    str = "com.facebook.messaging.analytics.perf.efficiency.connectiontimeline.MessagingConnectionTimelineLogger#onEnterBackground";
                    break;
                case ActionId.OFFLINE /* 160 */:
                    str = "com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger#init";
                    break;
                case ActionId.ASNYC_FAILED /* 161 */:
                    str = "com.facebook.messaging.analytics.reliability.orca.OneTraceIdAppStateManager#onAppForeGround";
                    break;
                case ActionId.ASYNC_FAIL /* 162 */:
                    str = "com.facebook.messaging.analytics.reliability.orca.OneTraceIdAppStateManager#onAppBackground";
                    break;
                case ActionId.ON_ATTACH_FRAGMENT /* 163 */:
                    str = "com.facebook.messaging.app.init.OrcaCrashLoopDrill#init";
                    break;
                case ActionId.VIEW_DID_APPEAR_BEGIN /* 164 */:
                    str = "com.facebook.messaging.archivedchats.subscription.ArchivedFolderStartupSubscriber#subscribeArchivedFolder";
                    break;
                case ActionId.DISPLAYED /* 165 */:
                    str = "com.facebook.messaging.bubbles.settings.BubblesSettingsManager#onApplicationInit";
                    break;
                case ActionId.DISPLAYED_ON_SCREEN /* 166 */:
                    str = "com.facebook.messaging.bugreporter.search.MessagingSearchDebugDataTrackerAppJob#initTrigger";
                    break;
                case ActionId.ASYNC_ACTION_SUCCESS /* 167 */:
                    str = "com.facebook.messaging.business.bizrtc.appjobs.BiiMActorIdFetchJob#init";
                    break;
                case ActionId.ASYNC_ACTION_FAIL /* 168 */:
                    str = "com.facebook.messaging.business.plugins.adcreation.data.MessagingAdsWarmUpAppJob#warmupBloksLWI";
                    break;
                case ActionId.CONNECTIVITY_CHANGED /* 169 */:
                    str = "com.facebook.messaging.business.plugins.suggestedreply.control.UserSuggestedReplyPrefetchAppJob#init";
                    break;
                case ActionId.VIDEO_DISPLAYED /* 170 */:
                    str = "com.facebook.messaging.captiveportal.CaptivePortalNotificationManager#init";
                    break;
                case ActionId.VIDEO_REQUESTED_PLAYING /* 171 */:
                    str = "com.facebook.messaging.communitymessaging.bumpedthreads.initializer.CommunityMessagingBumpedThreadsInitializerAppJob#maybeBumpCommunityChatToInboxTrigger";
                    break;
                case 172:
                    str = "com.facebook.messaging.communitymessaging.ephemeralstatusbadging.data.CommunityMessagingBadgesMetaDataInitializer#maybeBumpCommunityChatToInbox";
                    break;
                case 173:
                    str = "com.facebook.messaging.communitymessaging.mobileconfig.observer.GroupMCSubscriptionJob#onAppForeground";
                    break;
                case 174:
                    str = "com.facebook.messaging.communitymessaging.mobileconfig.observer.GroupMCSubscriptionJob#onAppBackground";
                    break;
                case 175:
                    str = "com.facebook.messaging.connectivity.ConnectionStatusMonitorInitializer#init";
                    break;
                case 176:
                    str = "com.facebook.messaging.contacts.cache.ContactsServiceListener#init";
                    break;
                case 177:
                    str = "com.facebook.messaging.contacts.loader.nonwork.ContactObserversRegistrationHandler#registerWhenUserEntersApp";
                    break;
                case 178:
                    str = "com.facebook.messaging.contacts.loader.nonwork.ContactObserversRegistrationHandler#unregisterWhenUserLeavesApp";
                    break;
                case 179:
                    str = "com.facebook.messaging.contactstab.FriendsTabInventoryLogger#scheduleInventoryLogger";
                    break;
                case 180:
                    str = "com.facebook.messaging.database.analytics.DatabaseDeltaLogger#logDatabaseDelta";
                    break;
                case 181:
                    str = "com.facebook.messaging.database.analytics.DatabaseStatsLogger#init";
                    break;
                case 182:
                    str = "com.facebook.messaging.encryptedbackups.appjob.EncryptedBackupNuxFlagResetJob#onForeground";
                    break;
                case 183:
                    str = "com.facebook.messaging.encryptedbackups.appjob.EncryptedBackupOmnistoreRegisterJob#onForeground";
                    break;
                case 184:
                    str = "com.facebook.messaging.encryptedbackups.appjob.EncryptedBackupsAutoRestoreStartupJob#onForeground";
                    break;
                case 185:
                    str = "com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob#onForeground";
                    break;
                case 186:
                    str = "com.facebook.messaging.familycenter.dailytimelimit.appjob.DailyTimeLimitManagerAppJob#onAppForegroundedTrigger";
                    break;
                case 187:
                    str = "com.facebook.messaging.familycenter.dailytimelimit.appjob.DailyTimeLimitManagerAppJob#onLoginCompleteTrigger";
                    break;
                case 188:
                    str = "com.facebook.messaging.familycenter.dailytimelimit.appjob.DailyTimeLimitManagerAppJob#onAppBackgroundedTrigger";
                    break;
                case 189:
                    str = "com.facebook.messaging.familycenter.screentime.tracker.MessengerSupervisionScreenTimeTracker#onLoginComplete";
                    break;
                case 190:
                    str = "com.facebook.messaging.familycenter.screentime.tracker.MessengerSupervisionScreenTimeTracker#onAppForegrounded";
                    break;
                case 191:
                    str = "com.facebook.messaging.familycenter.screentime.tracker.MessengerSupervisionScreenTimeTracker#onAppBackgrounded";
                    break;
                case 192:
                    str = "com.facebook.messaging.filelogger.MessagingFileLogger#maybeClearExpiredLogsWhenIdle";
                    break;
                case 193:
                    str = "com.facebook.messaging.followup.sessiontracker.InboxFollowupAppStateTrackerAppJob#onForeground";
                    break;
                case 194:
                    str = "com.facebook.messaging.growth.logging.MsgrGrowthChatHeadsEnabledLogger#onLoginComplete";
                    break;
                case 195:
                    str = "com.facebook.messaging.growth.logging.MsgrGrowthChatHeadsEnabledLogger#onFirstAppForegrounded";
                    break;
                case 196:
                    str = "com.facebook.messaging.highlightstab.loader.HighlightsTabFeedPrefetcher#startLoader";
                    break;
                case 197:
                    str = "com.facebook.messaging.highlightstab.logging.HTSessionManager#listenToAppBackgrounds";
                    break;
                case 198:
                    str = "com.facebook.messaging.inbox.tab.badging.InboxBadgeController#init";
                    break;
                case 199:
                    str = "com.facebook.messaging.inbox.unread.calculator.UnreadInboxItemsCalculatorAppJob#initTrigger";
                    break;
                case 200:
                    str = "com.facebook.messaging.inboxfolder.sync.InboxFolderShortcutSyncHandler#syncParentThreadReadState";
                    break;
                case 201:
                    str = "com.facebook.messaging.ipc.MessengerUserUtilsCacheInvalidator#onAppInit";
                    break;
                case 202:
                    str = "com.facebook.messaging.litho.memory.MessengerLithoMemoryTrimmer#init";
                    break;
                case 203:
                    str = "com.facebook.messaging.livelocation.bindings.MessengerLiveLocationInitializer#initImpl";
                    break;
                case 204:
                    str = "com.facebook.messaging.lockchat.auth.AuthLockChatState#onBackgroundApp";
                    break;
                case 205:
                    str = "com.facebook.messaging.login.RemoteLogoutBroadcastReceiver#init";
                    break;
                case 206:
                    str = "com.facebook.messaging.marketplace.unread.badgecontroller.MarketplaceBadgeController#init";
                    break;
                case 207:
                    str = "com.facebook.messaging.media.upload.MediaUploadManagerAppJob#initTrigger";
                    break;
                case 208:
                    str = "com.facebook.messaging.messengerprefs.notif.NotifSettingsUpdateHandler#onLoginComplete";
                    break;
                case 209:
                    str = "com.facebook.messaging.messengerprefs.sync.NotificationPreferenceLoginSync#onLoginComplete";
                    break;
                case 210:
                    str = "com.facebook.messaging.montage.gating.MontageTabGatingUtil#onLoginQueriesComplete";
                    break;
                case 211:
                    str = "com.facebook.messaging.montage.init.MontageMessageExpirationCoordinator#init";
                    break;
                case 212:
                    str = "com.facebook.messaging.montage.msys.MontageMsysThreadListBroadcastListener#initialWarmUp";
                    break;
                case 213:
                    str = "com.facebook.messaging.montage.viewer.logging.MontageViewerActivityListener#onAppBackgrounded";
                    break;
                case 214:
                    str = "com.facebook.messaging.msys.appstatecache.AppStateTracker#onEnterForeground";
                    break;
                case 215:
                    str = "com.facebook.messaging.msys.appstatecache.AppStateTracker#onEnterBackground";
                    break;
                case 216:
                    str = "com.facebook.messaging.msys.core.MsysThreadListObserverAppStateManager#onAppForeground";
                    break;
                case 217:
                    str = "com.facebook.messaging.msys.core.MsysThreadListObserverAppStateManager#onAppBackground";
                    break;
                case 218:
                    str = "com.facebook.messaging.msys.errornotifications.MsysErrorNotificationHandlerAppJob#onEnterBackgroundTrigger";
                    break;
                case 219:
                    str = "com.facebook.messaging.msys.notificationengine.jobs.NotificationEngineOpenPathPushNotificationCleaner#cleanUpOldPushNotifications";
                    break;
                case 220:
                    str = "com.facebook.messaging.msys.pushnotifications.MsysPushNotificationHandlerAppJob#onEnterBackground";
                    break;
                case 221:
                    str = "com.facebook.messaging.msys.thread.aibot.prefetcher.MetaAiBotInit#prefetchMetaAiTabData";
                    break;
                case 222:
                    str = "com.facebook.messaging.nativepagereply.analytics.BusinessInboxMessagingUserFlowLogger#onLogout";
                    break;
                case 223:
                    str = "com.facebook.messaging.nativepagereply.auth.cache.BusinessInboxUserStorageKeyPrefetcher#init";
                    break;
                case 224:
                    str = "com.facebook.messaging.nativepagereply.badgeupdate.init.BusinessInboxBadgingInitializer#init";
                    break;
                case 225:
                    str = "com.facebook.messaging.nativepagereply.badgeupdate.logging.ProfileBadgeImpressionLogger#reportBadgeImpressionOnAppForegrounded";
                    break;
                case 226:
                    str = "com.facebook.messaging.nativepagereply.faq.data.prefetcher.BusinessInboxFAQPrefetchAppJob#fetchFAQDetails";
                    break;
                case 227:
                    str = "com.facebook.messaging.nativepagereply.filters.appjob.BusinessInboxFiltersResetAppJob#resetFilterSelection";
                    break;
                case 228:
                    str = "com.facebook.messaging.nativepagereply.shortcuts.updatereciever.CurrentAccountInboxBadgeUpdateReceiver#init";
                    break;
                case 229:
                    str = "com.facebook.messaging.navigation.home.tabs.logging.M4TabLoggerAppJob#clearContentOnBackgroundTrigger";
                    break;
                case 230:
                    str = "com.facebook.messaging.neue.nux.messenger.ndx.M4ANDXEligibilityFetcher#fetchNDXFlow";
                    break;
                case 231:
                    str = "com.facebook.messaging.notify.activenotificationstracker.ActiveNotificationsTrackerAppJobListener#onUserLeftApp";
                    break;
                case 232:
                    str = "com.facebook.messaging.notify.backgroundaccount.manager.AccountStatusHandler#onLoginComplete";
                    break;
                case 233:
                    str = "com.facebook.messaging.notify.channel.MessengerNotificationChannelInitializer#init";
                    break;
                case 234:
                    str = "com.facebook.messaging.notify.fbm.FbmExposureInitializer#init";
                    break;
                case 235:
                    str = "com.facebook.messaging.notify.logging.conditionalworkerimpl.PushSettingsReporter#handleUserEnteredApp";
                    break;
                case 236:
                    str = "com.facebook.messaging.pagereply.init.PageReplyInitializer#init";
                    break;
                case 237:
                    str = "com.facebook.messaging.phonebookintegration.contactschangeobserver.ContactChangeObserverRegistrationHandler#maybeSyncPhonebookContacts";
                    break;
                case 238:
                    str = "com.facebook.messaging.phonebookintegration.contactschangeobserver.ContactChangeObserverRegistrationHandler#unregisterWhenUserLeavesApp";
                    break;
                case 239:
                    str = "com.facebook.messaging.professionalmode.businesstools.statemanager.ProModeMessagingToolsStatePrefetcher#init";
                    break;
                case 240:
                    str = "com.facebook.messaging.push.dedup.appjob.MuteStatusUpdateAppJob#updateStatus";
                    break;
                case 241:
                    str = "com.facebook.messaging.push.dedup.appjob.cleanup.MuteStatusCleanUpAppJob#clearMuteStatusIfUserNotLoggedIn";
                    break;
                case 242:
                    str = "com.facebook.messaging.push.dedup.appjob.cleanup.MuteStatusCleanUpAppJob#cleanUpMuteStatusRows";
                    break;
                case 243:
                    str = "com.facebook.messaging.read.ReadThreadInitializer#init";
                    break;
                case 244:
                    str = "com.facebook.messaging.responsiveness.touch.loom.MessengerTouchResponsivenessLoomTracer#onUserLeftApp";
                    break;
                case 245:
                    str = "com.facebook.messaging.rtc.incall.impl.screenshotnotifications.detector.CallScreenshotDetector#onForegroundAppJob";
                    break;
                case 246:
                    str = "com.facebook.messaging.rtc.incall.impl.screenshotnotifications.detector.CallScreenshotDetector#onBackgroundAppJob";
                    break;
                case 247:
                    str = "com.facebook.messaging.rtc.logging.connectfunnel.appjob.xplat.OrcaConnectFunnelXplatAppJob#runAppJob";
                    break;
                case 248:
                    str = "com.facebook.messaging.screenshotdetection.ThreadScreenshotDetector#onForegroundAppJob";
                    break;
                case 249:
                    str = "com.facebook.messaging.screenshotdetection.ThreadScreenshotDetector#onBackgroundAppJob";
                    break;
                case 250:
                    str = "com.facebook.messaging.screentime.M4AScreenTimeSyncAppJob#onLoginCompleteTrigger";
                    break;
                case Process.SD_STDOUT /* 251 */:
                    str = "com.facebook.messaging.screentime.M4AScreenTimeSyncAppJob#onAppForegroundedImmediateTrigger";
                    break;
                case Process.SD_PIPE /* 252 */:
                    str = "com.facebook.messaging.screentime.M4AScreenTimeSyncAppJob#onAppForeground";
                    break;
                case Process.SD_BLACK_HOLE /* 253 */:
                    str = "com.facebook.messaging.screentime.M4AScreenTimeSyncAppJob#onAppBackgroundedTrigger";
                    break;
                case 254:
                    str = "com.facebook.messaging.screentime.M4AScreenTimeSyncAppJob#onLogoutCompleteTrigger";
                    break;
                case 255:
                    str = "com.facebook.messaging.search.listcreator.debugger.ListCreatorDebuggerAppJob#initTrigger";
                    break;
                case 256:
                    str = "com.facebook.messaging.search.nullstate.prefetch.SearchNullStateMediaTabPrefetcher#prefetch";
                    break;
                case 257:
                    str = "com.facebook.messaging.search.nullstate.prefetch.ServerSectionOrderingPrefetcher#prefetch";
                    break;
                case 258:
                    str = "com.facebook.messaging.send.client.SendFailureNotificationsCleaner#init";
                    break;
                case 259:
                    str = "com.facebook.messaging.send.client.StartupRetryInitializer#init";
                    break;
                case 260:
                    str = "com.facebook.messaging.singleowneradditionalprofile.loader.FetchSOAPAccountsAppJob#fetchSOAPAccounts";
                    break;
                case 261:
                    str = "com.facebook.messaging.sms.SmsBlockThreadManager#init";
                    break;
                case 262:
                    str = "com.facebook.messaging.sms.broadcast.SmsTakeoverStateChecker#checkSmsStateChangeOnForeground";
                    break;
                case 263:
                    str = "com.facebook.messaging.sounds.accessibility.MessengerAccessibilityChatSoundsDownloader#init";
                    break;
                case 264:
                    str = "com.facebook.messaging.sounds.audiosystemstream.MessengerStreamVolCacheJob#onForeground";
                    break;
                case 265:
                    str = "com.facebook.messaging.sounds.notification.NotificationSoundInitializer#ensureNotificationSoundsAreSavedToSystem";
                    break;
                case 266:
                    str = "com.facebook.messaging.stella.contacts.StellaContactBroadcastReceiver.AppJobHelper#init";
                    break;
                case 267:
                    str = "com.facebook.messaging.sup.appjob.SUPVideoCallingAppJob#onAppInit";
                    break;
                case 268:
                    str = "com.facebook.messaging.sup.appjob.SUPVideoCallingAppJob#onAppForegrounded";
                    break;
                case 269:
                    str = "com.facebook.messaging.sync.MessagesSyncLogger#onEnterForeground";
                    break;
                case 270:
                    str = "com.facebook.messaging.sync.MessagesSyncLogger#onEnterBackground";
                    break;
                case 271:
                    str = "com.facebook.messaging.sync.connection.MessagesSyncLoggedInUserFetcher#init";
                    break;
                case 272:
                    str = "com.facebook.messaging.tincan.tincanoverwamsys.backgroundsync.impl.MsgrBackgroundSyncAppJob#sendForegroundUserChangedBroadcast";
                    break;
                case 273:
                    str = "com.facebook.messaging.wearable.plugins.appjob.HeraHostAppJob#onAppForegrounded";
                    break;
                case 274:
                    str = "com.facebook.messaging.wearable.plugins.appjob.HeraHostAppJob#onLogoutComplete";
                    break;
                case 275:
                    str = "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.actions.inboxfolderrollback.MessageRequestFolderInboxRollbackHandler#rollbackMessageRequestFolderExperiment";
                    break;
                case 276:
                    str = "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.badge.msys.PendingFolderStartupSubscriber#subscribePendingFolder";
                    break;
                case 277:
                    str = "com.facebook.messaginginblue.logging.MibLoggingExperimentExposure#init";
                    break;
                case 278:
                    str = "com.facebook.messenger.app.OrcaLibPhoneNumberInitializer#init";
                    break;
                case 279:
                    str = "com.facebook.messenger.warmup.EarliestPossibleColdStartClassPreloadStarterOrca.ExperimentUpdater#init";
                    break;
                case 280:
                    str = "com.facebook.messenger.app.lacrima.LacrimaConfigController#triggerNoncriticalInit";
                    break;
                case 281:
                    str = "com.facebook.messenger.app.update.InAppUpdater#checkUpdateAvailability";
                    break;
                case 282:
                    str = "com.facebook.messenger.app.CriticalAuthDataSetter#init";
                    break;
                case 283:
                    str = "com.facebook.messenger.crashloop.CrashLoopDetectorConfigController#init";
                    break;
                case 284:
                    str = "com.facebook.messenger.msys.appstate.MsysAppStateHandler#onEnterForeground";
                    break;
                case 285:
                    str = "com.facebook.messenger.msys.appstate.MsysAppStateHandler#onEnterBackground";
                    break;
                case 286:
                    str = "com.facebook.messenger.msys.logging.MessengerMsysBackgroundLoggerAppJob#onBackgroundAppJobTrigger";
                    break;
                case 287:
                    str = "com.facebook.messenger.msys.logging.MessengerMsysBackgroundLoggerAppJob#onForegroundAppJobTrigger";
                    break;
                case 288:
                    str = "com.facebook.mobileboost.apps.extra.BoostAppJob#initAppJob";
                    break;
                case 289:
                    str = "com.facebook.mobileboost.apps.messenger.appjob.PeriodThreadBoosterAppJob#onForeground";
                    break;
                case 290:
                    str = "com.facebook.mobileconfig.init.MobileConfigApi2LoggerImpl#sendAllDeferredLogsAppJob";
                    break;
                case 291:
                    str = "com.facebook.mqttbypass.implementation.di.MqttBypassAppJobDi#permitConnectionCreation";
                    break;
                case 292:
                    str = "com.facebook.mqttbypass.implementation.di.MqttBypassAppJobDi#blockConnectionCreation";
                    break;
                case 293:
                    str = "com.facebook.multiusermqtt.utils.ClientSubscriptionCollector#init";
                    break;
                case 294:
                    str = "com.facebook.nativetemplates.fb.state.NTStateJSVM#init";
                    break;
                case 295:
                    str = "com.facebook.notifications.channels.NotificationChannelsManager#init";
                    break;
                case 296:
                    str = "com.facebook.odinusecases.metaai.intentclassifier.m4a.M4AIntentClassifierMLAppJob#init";
                    break;
                case 297:
                    str = "com.facebook.offlineexperimentbase.fdid.fb.FdidOfflineExperimentAATester#onAppBackgrounded";
                    break;
                case 298:
                    str = "com.facebook.onsitesignals.autofillstore.AutofillStoreInit#init";
                    break;
                case 299:
                    str = "com.facebook.orca.notify.MessagesNotificationManager#init";
                    break;
                case 300:
                    str = "com.facebook.orca.notify.MessengerLauncherBadgesControllerAppJob#initTrigger";
                    break;
                case 301:
                    str = "com.facebook.papaya.fb.messenger.MessengerPapayaBackgroundJob#onAppBackgrounded";
                    break;
                case 302:
                    str = "com.facebook.papaya.fb.messenger.MessengerPapayaBatchEngineBackgroundJob#onAppBackgrounded";
                    break;
                case 303:
                    str = "com.facebook.papaya.fb.messenger.MessengerPapayaFADoubleLoggingBackgroundJob#onAppBackgrounded";
                    break;
                case 304:
                    str = "com.facebook.papaya.fb.messenger.MessengerPapayaLightweightEngineBackgroundJob#onAppBackgrounded";
                    break;
                case 305:
                    str = "com.facebook.papaya.fb.messenger.MessengerPapayaSyntheticLoggingBackgroundJob#onAppBackgrounded";
                    break;
                case 306:
                    str = "com.facebook.payments.dcp.DcpColdStartSynchronization#init";
                    break;
                case 307:
                    str = "com.facebook.perf.startupstatemachine.StartupStateMachine#appJobClearStartupWhenUserLeavesApp";
                    break;
                case 308:
                    str = "com.facebook.photos.base.debug.DebugImageTracker#onAppBackgrounded";
                    break;
                case 309:
                    str = "com.facebook.photos.upload.manager.UploadCrashMonitorImpl#doInit";
                    break;
                case 310:
                    str = "com.facebook.photos.upload.manager.UploadManagerImpl#onForegroundAppJob";
                    break;
                case 311:
                    str = "com.facebook.photos.upload.manager.UploadManagerImpl#onBackgroundAppJob";
                    break;
                case 312:
                    str = "com.facebook.photos.upload.videolite.FbUploadManager#init";
                    break;
                case 313:
                    str = "com.facebook.platformlogger.PlatformLoggerInit#init";
                    break;
                case 314:
                    str = "com.facebook.powermanagement.RadioPowerManagerInstaller#init";
                    break;
                case 315:
                    str = "com.facebook.ppml.usecases.ondeviceinstallreferrer.ODIRPurgeJob#purgeODIRStorage";
                    break;
                case 316:
                    str = "com.facebook.prefs.shared.heavy.HeavyNodeInstrumentation#reportHeaviestPreferenceNodes";
                    break;
                case 317:
                    str = "com.facebook.prefs.shared.impl.AdjustExternalValueStorageAppJob#adjustExternalValues";
                    break;
                case 318:
                    str = "com.facebook.prefs.shared.impl.FbSharedPreferencesWriteLatch#init";
                    break;
                case 319:
                    str = "com.facebook.preloader.ExperimentalPreloadManagerAppJob#onAppForegroundTrigger";
                    break;
                case 320:
                    str = "com.facebook.preloader.ExperimentalPreloadManagerAppJob#onAppBackgroundTrigger";
                    break;
                case 321:
                    str = "com.facebook.preloader.PreloadManagerAppJob#onAppForegroundTrigger";
                    break;
                case 322:
                    str = "com.facebook.preloader.PreloadManagerAppJob#onLoginCompleteTrigger";
                    break;
                case 323:
                    str = "com.facebook.preloader.PreloadManagerAppJob#onNewsFeedEnterTrigger";
                    break;
                case 324:
                    str = "com.facebook.preloader.PreloadManagerAppJob#moveToForegroundImmediateTrigger";
                    break;
                case 325:
                    str = "com.facebook.preloader.PreloadManagerAppJob#onAppBackgroundTrigger";
                    break;
                case 326:
                    str = "com.facebook.presence.DefaultPresenceManager#onAppJobLoginComplete";
                    break;
                case 327:
                    str = "com.facebook.presence.PresenceAfterUILoadedInitializer#init";
                    break;
                case 328:
                    str = "com.facebook.presence.status.cachepopulator.StatusCachePopulator#onLogin";
                    break;
                case 329:
                    str = "com.facebook.presence.status.cachepopulator.StatusCachePopulator#onForeground";
                    break;
                case 330:
                    str = "com.facebook.presence.status.cachepopulator.StatusCachePopulator#onBackground";
                    break;
                case 331:
                    str = "com.facebook.privacy.uiidetection.appjob.UiiDetectorInitAppJob#init";
                    break;
                case 332:
                    str = "com.facebook.privacyflowtrigger.PrivacyFlowTriggerAppJob#onNewLoggedInSession";
                    break;
                case 333:
                    str = "com.facebook.privacyflowtrigger.PrivacyFlowTriggerAppJob#onAppForegrounded";
                    break;
                case 334:
                    str = "com.facebook.privacypermissionsnapshots.fb.PrivacyPermissionSnapshotsLoggerController#logPermissionsSnapshots";
                    break;
                case 335:
                    str = "com.facebook.publisher.init.PublisherInitializer#init";
                    break;
                case 336:
                    str = "com.facebook.push.init.PushInitializer#init";
                    break;
                case 337:
                    str = "com.facebook.push.mqtt.service.ClientSubscriptionAutoSubscriber#init";
                    break;
                case 338:
                    str = "com.facebook.quicklog.dataproviders.IoStatsProvider#onBackgroundAppJob";
                    break;
                case 339:
                    str = "com.facebook.quicklog.module.QPLOnAppBackgroundedJob#onAppBackgrounded";
                    break;
                case 340:
                    str = "com.facebook.quicklog.module.QPLOnApplicationInit#onApplicationInit";
                    break;
                case 341:
                    str = "com.facebook.quicklog.reliability.InitUserFlowJSI#onFirstAppForegrounded";
                    break;
                case 342:
                    str = "com.facebook.quickpromotion.event.QuickPromotionEventManager#init";
                    break;
                case 343:
                    str = "com.facebook.quicksilver.screenshot.QuicksilverScreenshotDetector#onForegroundAppJob";
                    break;
                case 344:
                    str = "com.facebook.quicksilver.screenshot.QuicksilverScreenshotDetector#onBackgroundAppJob";
                    break;
                case 345:
                    str = "com.facebook.realtime.pulsar.PulsarAppJob#onPulsarAppJobEnter";
                    break;
                case 346:
                    str = "com.facebook.realtime.pulsar.PulsarAppJob#onPulsarAppJobExit";
                    break;
                case 347:
                    str = "com.facebook.redex.dynamicanalysis.support.DynamicAnalysisConfigSync#init";
                    break;
                case 348:
                    str = "com.facebook.resources.impl.StringResourcesFetcher#refreshUserGender";
                    break;
                case 349:
                    str = "com.facebook.resources.impl.loading.downloader.voltron.VoltronResourcePreloader#init";
                    break;
                case 350:
                    str = "com.facebook.resources.impl.logger.DrawableCounterLogger#onUserLeftApp";
                    break;
                case 351:
                    str = "com.facebook.resources.impl.qt.loading.QTLanguagePackPreloader#init";
                    break;
                case 352:
                    str = "com.facebook.rtc.expression.RtcVideoExpressionInitializer#init";
                    break;
                case 353:
                    str = "com.facebook.rtc.fbwebrtc.pytorchmodelloader.PytorchModelLoadManager#initDownload";
                    break;
                case 354:
                    str = "com.facebook.rtc.helpers.rtcinitializer.RtcInitializerAppJob#onForeground";
                    break;
                case 355:
                    str = "com.facebook.rtc.logging.persistence.impl.LogPersistenceAppJob#init";
                    break;
                case 356:
                    str = "com.facebook.rti.orca.FbnsLiteInitializer#init";
                    break;
                case 357:
                    str = "com.facebook.screenshot.ScreenshotContentObserver#onForegroundAppJob";
                    break;
                case 358:
                    str = "com.facebook.screenshot.ScreenshotContentObserver#onBackgroundAppJob";
                    break;
                case 359:
                    str = "com.facebook.secure.files.TempFilesCleanerJob#purgeTempFiles";
                    break;
                case HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH /* 360 */:
                    str = "com.facebook.secure.intentlogger.BumpUpLogEndpointMobileConfigListener#init";
                    break;
                case 361:
                    str = "com.facebook.secure.intentlogger.IntentLoggerMobileConfigListener#init";
                    break;
                case 362:
                    str = "com.facebook.secure.intentswitchoff.IntentSwitchOffMobileConfigDI#init";
                    break;
                case 363:
                    str = "com.facebook.security.hooks.m4a.HookController#init_hooks";
                    break;
                case 364:
                    str = "com.facebook.storage.analytics.FBFileMonitorScheduler#init";
                    break;
                case 365:
                    str = "com.facebook.storage.bigfoot.apps.fbapps.FBAppsAvailableSpaceMonitor#onAppForeground";
                    break;
                case 366:
                    str = "com.facebook.storage.cask.fbapps.FBCask#requestCleanup";
                    break;
                case 367:
                    str = "com.facebook.storage.cask.fbapps.adhoc.FBAppAdHocCaskRegisters#registerAdhocPaths";
                    break;
                case 368:
                    str = "com.facebook.storage.diskio.ProcIOStatsOverallReporting#onForeground";
                    break;
                case 369:
                    str = "com.facebook.storage.diskio.ProcIOStatsOverallReporting#onBackground";
                    break;
                case 370:
                    str = "com.facebook.storage.external.fbapps.ExternalStoragePathDebugConnection#onForeground";
                    break;
                case 371:
                    str = "com.facebook.storage.ionic.fbapps.IonicFBAppConnection#onAppForeground";
                    break;
                case 372:
                    str = "com.facebook.storage.ionic.fbapps.IonicFBAppConnection#onAppBackground";
                    break;
                case 373:
                    str = "com.facebook.storage.keystats.fbapps.KeyStatsConditionalWorker#reportEverythingPending";
                    break;
                case 374:
                    str = "com.facebook.storage.monitor.fbapps.FBAppsStorageResourceMonitor#onAppForeground";
                    break;
                case AuthFragmentLogoViewGroup.LOGIN_GROUP_ANIM_DELAY_MS /* 375 */:
                    str = "com.facebook.storage.monitor.fbapps.FBAppsStorageResourceMonitor#onAppBackground";
                    break;
                case 376:
                    str = "com.facebook.storage.trash.fbapps.FbTrashManager#onAppBackground";
                    break;
                case 377:
                    str = "com.facebook.surfaces.fb.PrewarmingJobsQueue#moveToForegroundImmediate";
                    break;
                case 378:
                    str = "com.facebook.surfaces.fb.PrewarmingJobsQueue#moveToForeground";
                    break;
                case 379:
                    str = "com.facebook.surfaces.fb.PrewarmingJobsQueue#moveToBackground";
                    break;
                case 380:
                    str = "com.facebook.sync.SyncInitializer#init";
                    break;
                case 381:
                    str = "com.facebook.sync.SyncInitializer#onForegroundAppJobImmediate";
                    break;
                case 382:
                    str = "com.facebook.tigon.analyticslog.AppNetSessionIdLogger#onInit";
                    break;
                case 383:
                    str = "com.facebook.tigon.internal.TigonStartupLogger#onInit";
                    break;
                case 384:
                    str = "com.facebook.tigon.nativeservice.common.NativePlatformContextHolder#onForegroundAppJob";
                    break;
                case 385:
                    str = "com.facebook.tigon.nativeservice.common.NativePlatformContextHolder#onBackgroundAppJob";
                    break;
                case 386:
                    str = "com.facebook.tigon.reliablemedia.ReliableMediaMonitor#initialize";
                    break;
                case 387:
                    str = "com.facebook.tigon.reliablemedia.ReliableMediaMonitor#foreground";
                    break;
                case 388:
                    str = "com.facebook.tigon.reliablemedia.ReliableMediaMonitor#background";
                    break;
                case 389:
                    str = "com.facebook.ui.browser.clickidconfig.ClickIDHelper#refreshClickIds";
                    break;
                case 390:
                    str = "com.facebook.ui.browser.clickidconfig.ClickIDHelper#refreshEpdStatus";
                    break;
                case 391:
                    str = "com.facebook.ui.legacynavbar.abtest.WhiteChromeActivityStack#onSimpleJobEnter";
                    break;
                case 392:
                    str = "com.facebook.ui.media.cache.FileCacheDelayedWorkerScheduler#init";
                    break;
                case 393:
                    str = "com.facebook.video.bgaudio.BgAudioPlayerService#onAppForegrounded";
                    break;
                case 394:
                    str = "com.facebook.video.exoserviceclient.FbVpsController#onForegroundAppJob";
                    break;
                case 395:
                    str = "com.facebook.video.exoserviceclient.FbVpsController#onBackgroundAppJob";
                    break;
                case 396:
                    str = "com.facebook.video.exoserviceclient.HeroServiceInitializerAppJobForeground#init";
                    break;
                case 397:
                    str = "com.facebook.video.exoserviceclient.HeroServiceInitializerAppJobForeground#appForegrounded";
                    break;
                case 398:
                    str = "com.facebook.video.exoserviceclient.HeroServiceInitializerAppJobInit#onApplicationInit";
                    break;
                case 399:
                    str = "com.facebook.video.fbgrootplayer.VideoAudioVolumeObserversManager#onRegisterWhenUserEnterApp";
                    break;
                case 400:
                    str = "com.facebook.video.fbgrootplayer.VideoAudioVolumeObserversManager#onUnregisterWhenUserLeaveApp";
                    break;
                case 401:
                    str = "com.facebook.video.plugins.AutoplayIntentSignalMonitor#onForegroundAppJob";
                    break;
                case 402:
                    str = "com.facebook.voltron.fbdownloader.FbAppJobScheduledPrefetcher#prefetch";
                    break;
                case 403:
                    str = "com.facebook.voltron.fbdownloader.LanguagePackCleanJob#clean";
                    break;
                case 404:
                    str = "com.facebook.voltron.longtail.uploader.UploadLongtailClassLoadsAppJob#uploadLongtailClassLoads";
                    break;
                case 405:
                    str = "com.facebook.voltron.runtimemodule.VoltronInitHandler#init";
                    break;
                case 406:
                    str = "com.facebook.workchat.tagbots.loader.TagBotsLoader#onAppForegrounded";
                    break;
                case 407:
                    str = "com.facebook.workchat.tagbots.loader.TagBotsLoader#onUserLoggedOut";
                    break;
                case 408:
                    str = "com.facebook.xanalytics.provider.NativeXAnalyticsLowPriorityInit#init";
                    break;
                case 409:
                    str = "com.facebook.xanalytics.provider.NativeXAnalyticsProvider#onForegroundAppJob";
                    break;
                case 410:
                    str = "com.facebook.xanalytics.provider.NativeXAnalyticsProvider#onBackgroundAppJob";
                    break;
                case 411:
                    str = "com.facebook.zero.LocalZeroTokenManagerReceiverRegistration#onForegroundAppJob";
                    break;
                case 412:
                    str = "com.facebook.zero.service.ZeroInterstitialEligibilityManager#onForegroundAppJob";
                    break;
                case 413:
                    str = "com.facebook.zero.service.ZeroInterstitialEligibilityManager#onLoginQueryCompleteAppJob";
                    break;
                case 414:
                    str = "com.facebook.zero.service.ZeroInterstitialEligibilityManager#onLoginQueryCompleteImmediateAppJob";
                    break;
                case 415:
                    str = "com.facebook.zero.cms.ZeroCmsUtil#init";
                    break;
                case 416:
                    str = "com.facebook.zero.easydogfooding.ZeroEasyDogfoodController#appForegrounded";
                    break;
                case 417:
                    str = "com.facebook.zero.easydogfooding.ZeroEasyDogfoodController#onLoginQueriesCompleteAppJob";
                    break;
                case 418:
                    str = "com.facebook.zero.easydogfooding.ZeroEasyDogfoodController#onLoginCompleteAppJob";
                    break;
                case 419:
                    str = "com.facebook.zero.internal.DogfoodingSettingsFetcher#init";
                    break;
                case 420:
                    str = "com.facebook.zero.messenger.semi.ZeroMessengerNuxManager#init";
                    break;
                case 421:
                    str = "com.facebook.zero.messenger.zerobalance.ZeroBalanceMessengerInit#initZeroBalanceForMessenger";
                    break;
                case 422:
                    str = "com.facebook.zero.sdk.fb4a.AppStateListener#onForegroundAppJob";
                    break;
                case 423:
                    str = "com.facebook.zero.sdk.fb4a.AppStateListener#onBackgroundedAppJob";
                    break;
                case 424:
                    str = "com.facebook.zero.sdk.fb4a.AppStateListener#onNetworkConnectivityChanged";
                    break;
                case 425:
                    str = "com.facebook.zero.sdk.fb4a.AppStateListener#onUserLogin";
                    break;
                case 426:
                    str = "com.facebook.zero.sdk.fb4a.AppStateListener#onUserLogout";
                    break;
                case 427:
                    str = "com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider#maybeInitFullStore";
                    break;
                case 428:
                    str = "com.facebook.zero.statechange.ZeroStateChangeReporter#initImmediately";
                    break;
                case 429:
                    str = "com.facebook.zero.trigger.ZeroBalanceForegroundTrigger#onForegroundAppJob";
                    break;
                case 430:
                    str = "com.facebook.zero.trigger.ZeroBalanceForegroundTrigger#onLoginQueriesCompleteAppJob";
                    break;
                case 431:
                    str = "com.facebook.zero.trigger.ZeroBalanceForegroundTrigger#onLoginCompleteAppJob";
                    break;
                case 432:
                    str = "com.facebook.zero.trigger.ZeroBalanceForegroundTrigger#onNewsFeedEnterAppJob";
                    break;
                case 433:
                    str = "com.facebook.zero.zerobalance.ZeroBalanceResultForPreFetchRecommendationsController#onForegroundAppJob";
                    break;
                case 434:
                    str = "com.facebook.zero.zerobalance.ping.ZeroBalancePingController#onNetworkConnectivityChanged";
                    break;
                case 435:
                    str = "com.facebook.zero.zerobalance.ping.ZeroPaidPingManager#onNetworkConnectivityChanged";
                    break;
                case 436:
                    str = "com.meta.analytics.dsp.correlation.fb.impl.FbDspCorrelationManagerImpl#onAppForeground";
                    break;
                case 437:
                    str = "com.facebook.profilo.blackbox.breakpad.BreakpadDumpProcessJob#processDumpsOnAppStartup";
                    break;
                case 438:
                    str = "com.facebook.profilo.blackbox.manager.BlackBoxAppStateAwareManager#onAppForegrounded";
                    break;
                case 439:
                    str = "com.facebook.profilo.blackbox.manager.BlackBoxAppStateAwareManager#onAppBackgrounded";
                    break;
                case 440:
                    str = "com.facebook.profilo.mmapbuf.MmapBufferProcessJob#cleanupMmapBuffersOnAppStartup";
                    break;
                case 441:
                    str = "com.facebook.profilo.module.AfterColdStartInitializer#init";
                    break;
                case 442:
                    str = "com.facebook.profilo.module.AfterColdStartInitializer#initAfterLoginQueriesComplete";
                    break;
                case 443:
                    str = "com.facebook.profilo.module.AfterColdStartInitializer#initAfterLogin";
                    break;
                case 444:
                    str = "com.facebook.profilo.module.NotificationControls#init";
                    break;
                case 445:
                    str = "com.facebook.katana.activity.paneldefinition.panelnux.SlidingPanelEntryPointNuxAppJob#maybeShowSlidingPanelNux";
                    break;
                case 446:
                    str = "com.facebook.messaging.messageexpiration.appjob.FBMMessageExpirationNUXToggleStateSync#onAppStartup";
                    break;
                case 447:
                    str = "com.facebook.messaging.messageexpiration.appjob.MessageExpirationHandler#onAppStartup";
                    break;
                case 448:
                    str = "com.facebook.messaging.messageexpiration.appjob.MessageExpirationHandler#onForegroundAppJob";
                    break;
                case 449:
                    str = "com.facebook.messenger.app.accountcustomdata.MessengerAccountCustomDataListener#onAppInit";
                    break;
                case 450:
                    str = "com.facebook.rp.platform.metaai.rsys.pregeneratesdp.appjob.PregenerateSdpAppJob#initOnAppStartIfLoggedIn";
                    break;
                case 451:
                    str = "com.facebook.rp.platform.metaai.rsys.pregeneratesdp.appjob.PregenerateSdpAppJob#initOnLogin";
                    break;
                default:
                    str = "";
                    break;
            }
            r03.A03 = StringFormatUtil.formatStrLocaleSafe(str, new Object[0]);
            ((1wH) r03).A00 = new 1wK(c1w7, i);
            r03.A01 = c1w7.A03;
            r03.A02 = Integer.valueOf(i);
            switch (i) {
                case 3:
                case 11:
                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                case ActionId.INTERRUPTED /* 96 */:
                case 236:
                case 258:
                case 271:
                case 277:
                case 316:
                case 317:
                case 318:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0b;
                    c1w2Arr[0] = c1w2;
                    break;
                case 4:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0b;
                    c1w2Arr[1] = C1w2.A05;
                    c1w23 = C1w2.A0R;
                    c1w2Arr[2] = c1w23;
                    break;
                case 14:
                case 15:
                case 16:
                case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                case 280:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A05;
                    c1w2Arr[0] = c1w2;
                    break;
                case 18:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A03;
                    c1w2Arr[0] = c1w2;
                    break;
                case 19:
                case 36:
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                case ActionId.MARKER_SWAPPED /* 84 */:
                case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                case ActionId.ERROR /* 87 */:
                case ActionId.METHOD_INVOKE /* 88 */:
                case ActionId.FINALLY /* 89 */:
                case ActionId.LEGACY_MARKER /* 103 */:
                case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                case ActionId.CARD_DATA_LOADED /* 122 */:
                case ActionId.MQTT_DISCONNECTED /* 137 */:
                case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
                case ActionId.APP_FIRST_VIEW_CONTROLLER /* 139 */:
                case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                case ActionId.APPLY_FINISHED_LIST /* 153 */:
                case ActionId.VIEW_DID_APPEAR_BEGIN /* 164 */:
                case 179:
                case 196:
                case 197:
                case 199:
                case 200:
                case 204:
                case 208:
                case 210:
                case 213:
                case 221:
                case 225:
                case 227:
                case 230:
                case 234:
                case 240:
                case 244:
                case 250:
                case 262:
                case 266:
                case 267:
                case 272:
                case 273:
                case 275:
                case 276:
                case 295:
                case 296:
                case 302:
                case 303:
                case 304:
                case 305:
                case 312:
                case 321:
                case 322:
                case 327:
                case 328:
                case 329:
                case 330:
                case 343:
                case 344:
                case 348:
                case 354:
                case 359:
                case 389:
                case 390:
                case 393:
                case 397:
                case 416:
                case 417:
                case 418:
                case 421:
                case 429:
                case 430:
                case 431:
                case 432:
                case 433:
                case 434:
                case 435:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0S;
                    c1w2Arr[0] = c1w2;
                    break;
                case 25:
                case 26:
                case 27:
                case 28:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0C;
                    c1w2Arr[0] = c1w2;
                    break;
                case 33:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A05;
                    c1w22 = C1w2.A0X;
                    c1w2Arr[1] = c1w22;
                    break;
                case 34:
                    c1w2Arr = new C1w2[4];
                    c1w2Arr[0] = C1w2.A0S;
                    c1w2Arr[1] = C1w2.A0Y;
                    c1w2Arr[2] = C1w2.A0b;
                    c1w24 = C1w2.A08;
                    c1w2Arr[3] = c1w24;
                    break;
                case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                case ActionId.ON_ATTACH_FRAGMENT /* 163 */:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0X;
                    c1w22 = C1w2.A05;
                    c1w2Arr[1] = c1w22;
                    break;
                case 50:
                case ActionId.PHOTO_CAPTURED /* 59 */:
                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                case 279:
                case 283:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0X;
                    c1w22 = C1w2.A07;
                    c1w2Arr[1] = c1w22;
                    break;
                case ActionId.UNKNOWN /* 51 */:
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                case ActionId.ACTIVITY_RESUME /* 143 */:
                case 173:
                case 174:
                case 181:
                case 190:
                case 193:
                case 218:
                case 219:
                case 220:
                case 261:
                case 299:
                case 373:
                case 405:
                case 442:
                case 443:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0X;
                    c1w2Arr[0] = c1w2;
                    break;
                case 64:
                case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                case ActionId.QUERY_READY /* 106 */:
                case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                case 254:
                case 264:
                case 291:
                case 292:
                case 404:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0R;
                    c1w2Arr[0] = c1w2;
                    break;
                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                case 298:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A08;
                    c1w2Arr[0] = c1w2;
                    break;
                case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                case 180:
                case 212:
                case 247:
                case 355:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0X;
                    c1w22 = C1w2.A0S;
                    c1w2Arr[1] = c1w22;
                    break;
                case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A08;
                    c1w22 = C1w2.A0S;
                    c1w2Arr[1] = c1w22;
                    break;
                case ActionId.ABORTED /* 105 */:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0R;
                    c1w22 = C1w2.A0Y;
                    c1w2Arr[1] = c1w22;
                    break;
                case ActionId.CONTROLLER_INITIATED /* 114 */:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0X;
                    c1w22 = C1w2.A0E;
                    c1w2Arr[1] = c1w22;
                    break;
                case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                case 223:
                case 233:
                case 349:
                case 408:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0Y;
                    c1w2Arr[0] = c1w2;
                    break;
                case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0X;
                    c1w22 = C1w2.A08;
                    c1w2Arr[1] = c1w22;
                    break;
                case ActionId.PREV_ACTIVITY_PAUSE /* 142 */:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0Y;
                    c1w2Arr[1] = C1w2.A0b;
                    c1w23 = C1w2.A03;
                    c1w2Arr[2] = c1w23;
                    break;
                case ActionId.FORMAT_ERROR /* 148 */:
                case 260:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0S;
                    c1w2Arr[1] = C1w2.A0X;
                    c1w23 = C1w2.A0b;
                    c1w2Arr[2] = c1w23;
                    break;
                case ActionId.PRIVACY_VIOLATION /* 149 */:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0P;
                    c1w2Arr[0] = c1w2;
                    break;
                case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                    c1w2Arr = new C1w2[4];
                    c1w2Arr[0] = C1w2.A0X;
                    c1w2Arr[1] = C1w2.A0S;
                    c1w2Arr[2] = C1w2.A0b;
                    c1w24 = C1w2.A05;
                    c1w2Arr[3] = c1w24;
                    break;
                case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
                case 215:
                case 259:
                case 285:
                case 301:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0X;
                    c1w22 = C1w2.A0Y;
                    c1w2Arr[1] = c1w22;
                    break;
                case ActionId.WAIT_FOR_BLOCKERS /* 157 */:
                case ActionId.NOTIFY_SUBSCRIBERS /* 158 */:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0H;
                    c1w2Arr[0] = c1w2;
                    break;
                case ActionId.DISPLAYED /* 165 */:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0b;
                    c1w22 = C1w2.A0S;
                    c1w2Arr[1] = c1w22;
                    break;
                case ActionId.ASYNC_ACTION_SUCCESS /* 167 */:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A08;
                    c1w2Arr[1] = C1w2.A0E;
                    c1w23 = C1w2.A0b;
                    c1w2Arr[2] = c1w23;
                    break;
                case ActionId.ASYNC_ACTION_FAIL /* 168 */:
                case 353:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0E;
                    c1w2Arr[0] = c1w2;
                    break;
                case ActionId.CONNECTIVITY_CHANGED /* 169 */:
                case 226:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A08;
                    c1w22 = C1w2.A0E;
                    c1w2Arr[1] = c1w22;
                    break;
                case 182:
                case 232:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0S;
                    c1w22 = C1w2.A0b;
                    c1w2Arr[1] = c1w22;
                    break;
                case 183:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0S;
                    c1w2Arr[1] = C1w2.A0Y;
                    c1w23 = C1w2.A0b;
                    c1w2Arr[2] = c1w23;
                    break;
                case 184:
                case 185:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0S;
                    c1w2Arr[1] = C1w2.A0b;
                    c1w23 = C1w2.A0Y;
                    c1w2Arr[2] = c1w23;
                    break;
                case 186:
                case 187:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0b;
                    c1w2Arr[1] = C1w2.A0S;
                    c1w23 = C1w2.A08;
                    c1w2Arr[2] = c1w23;
                    break;
                case 189:
                case 265:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0S;
                    c1w22 = C1w2.A0X;
                    c1w2Arr[1] = c1w22;
                    break;
                case 191:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0O;
                    c1w22 = C1w2.A0X;
                    c1w2Arr[1] = c1w22;
                    break;
                case 209:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A08;
                    c1w22 = C1w2.A0b;
                    c1w2Arr[1] = c1w22;
                    break;
                case 222:
                case 367:
                case 403:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A04;
                    c1w2Arr[0] = c1w2;
                    break;
                case 241:
                case 242:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0T;
                    c1w2Arr[0] = c1w2;
                    break;
                case 281:
                case 306:
                case 351:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0S;
                    c1w22 = C1w2.A0Y;
                    c1w2Arr[1] = c1w22;
                    break;
                case 284:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0B;
                    c1w2Arr[0] = c1w2;
                    break;
                case 297:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A07;
                    c1w2Arr[0] = c1w2;
                    break;
                case 315:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0I;
                    c1w22 = C1w2.A04;
                    c1w2Arr[1] = c1w22;
                    break;
                case 332:
                case 333:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0H;
                    c1w2Arr[1] = C1w2.A08;
                    c1w23 = C1w2.A0S;
                    c1w2Arr[2] = c1w23;
                    break;
                case 340:
                case 363:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0I;
                    c1w2Arr[0] = c1w2;
                    break;
                case 365:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0H;
                    c1w2Arr[1] = C1w2.A0b;
                    c1w23 = C1w2.A0R;
                    c1w2Arr[2] = c1w23;
                    break;
                case 406:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0Y;
                    c1w2Arr[1] = C1w2.A08;
                    c1w23 = C1w2.A0S;
                    c1w2Arr[2] = c1w23;
                    break;
                case 407:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A04;
                    c1w22 = C1w2.A0T;
                    c1w2Arr[1] = c1w22;
                    break;
                case 428:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0R;
                    c1w22 = C1w2.A0b;
                    c1w2Arr[1] = c1w22;
                    break;
                case 441:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0Y;
                    c1w22 = C1w2.A0X;
                    c1w2Arr[1] = c1w22;
                    break;
                case 445:
                case 449:
                case 451:
                    c1w2Arr = new C1w2[1];
                    c1w2 = C1w2.A0G;
                    c1w2Arr[0] = c1w2;
                    break;
                case 446:
                case 447:
                case 448:
                    c1w2Arr = new C1w2[3];
                    c1w2Arr[0] = C1w2.A0b;
                    c1w2Arr[1] = C1w2.A0S;
                    c1w23 = C1w2.A0G;
                    c1w2Arr[2] = c1w23;
                    break;
                case 450:
                    c1w2Arr = new C1w2[2];
                    c1w2Arr[0] = C1w2.A0S;
                    c1w22 = C1w2.A0G;
                    c1w2Arr[1] = c1w22;
                    break;
                default:
                    c1w2Arr = new C1w2[0];
                    break;
            }
            if (!z) {
                C1w2 c1w25 = C1w2.A0B;
                if (02L.A0C(c1w25, c1w2Arr)) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (C1w2 c1w26 : c1w2Arr) {
                        if (c1w26 != c1w25) {
                            A0s.add(c1w26);
                        }
                    }
                    c1w2Arr = (C1w2[]) A0s.toArray(new C1w2[0]);
                }
            }
            r03.A00((C1w2[]) Arrays.copyOf(c1w2Arr, c1w2Arr.length));
            C1w2[] c1w2Arr2 = (C1w2[]) A07.get(str2);
            if (c1w2Arr2 == null) {
                c1w2Arr2 = new C1w2[0];
            }
            r03.A00((C1w2[]) Arrays.copyOf(c1w2Arr2, c1w2Arr2.length));
            r03.A05 = !z;
            r03.A00 = r02;
            arrayList.add(r03.A01());
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((1wN) next).A04.contains(C1w2.A0C)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((1wN) next2).A04.contains(C1w2.A0C)) {
                    arrayList3.add(next2);
                }
            }
            C1vh c1vh = this.A04;
            ArrayList A0O = 0QD.A0O(arrayList3, arrayList2);
            if (!A0O.isEmpty()) {
                0fH.A0g(Integer.valueOf(A0O.size()), "JobOrchestrator", "addJobs adding [%s] jobs");
                Iterator it3 = A0O.iterator();
                boolean z2 = false;
                boolean z3 = false;
                while (it3.hasNext()) {
                    1wM r04 = (1wM) it3.next();
                    EnumSet enumSet = ((1wN) r04).A04;
                    if (enumSet == null || !enumSet.contains(C1w2.A0B)) {
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                    C1vh.A00(c1vh, r04, false);
                }
                if (z2) {
                    c1vh.A02.A01();
                }
                if (z3) {
                    c1vh.A01.A01();
                }
            }
        }
        if (0fH.A01.BTv(2)) {
            0fH.A0f(r0.A02, Integer.valueOf(length), this.A02 ? "AppJobsSchedulerTriggersQueue_RunImmediately" : "AppJobsSchedulerTriggersQueue", "runNextTrigger(): Trigger %s, Jobs count: %d");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0e9b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(X.C1w5 r302, java.lang.String r303, int r304, long r305) {
        /*
            Method dump skipped, instructions count: 3836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1w0.A01(X.1w5, java.lang.String, int, long):void");
    }

    public void A02(String str, int i) {
        IllegalStateException A0h;
        Integer valueOf;
        int size;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A05;
        1wB r0 = (1wB) concurrentLinkedQueue.peek();
        if (r0 != null) {
            String str2 = r0.A02;
            if (11T.A0O(str2, str)) {
                synchronized (r0) {
                    HashSet hashSet = r0.A00;
                    if (hashSet != null) {
                        valueOf = Integer.valueOf(i);
                        hashSet.remove(valueOf);
                        HashSet hashSet2 = r0.A00;
                        if (hashSet2 != null) {
                            size = hashSet2.size();
                        } else {
                            A0h = 1BK.A0h();
                        }
                    } else {
                        A0h = 1BK.A0h();
                    }
                    throw A0h;
                }
                if (0fH.A01.BTv(2)) {
                    0fH.A0c(valueOf, str2, Integer.valueOf(size), this.A02 ? "AppJobsSchedulerTriggersQueue_RunImmediately" : "AppJobsSchedulerTriggersQueue", "onJobCompleted : job Id %s, Trigger %s, Jobs left %d");
                }
                if (size == 0) {
                    C1vy c1vy = this.A03;
                    boolean z = this.A02;
                    0fH.A0g(str, "AppJobLogger", "Trigger Completed: %s ");
                    if (!z) {
                        if (str.equals("application_init")) {
                            ((1FP) 1Bi.A03(67765)).D3D(3Ds.A04, 0S2.A01, new 5Lh(c1vy), "AppJobLogger");
                        } else if (str.equals("first_app_foregrounded")) {
                            ((QuickPerformanceLogger) c1vy.A03.A00.get()).markerEnd(3997701, (short) 2);
                            0fH.A0j("AppJobLogger", "Ending marker Init.NON_CRITICAL_AFTER_UI_LOADED");
                        }
                    }
                    concurrentLinkedQueue.poll();
                    A00();
                    if (z) {
                        return;
                    }
                    if ("app_foregrounded".equals(str2) || ErrorReportingConstants.APP_BACKGROUNDED.equals(str2)) {
                        this.A01.decrementAndGet();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (0fH.A01.BTv(2)) {
            0fH.A0f(Integer.valueOf(i), str, this.A02 ? "AppJobsSchedulerTriggersQueue_RunImmediately" : "AppJobsSchedulerTriggersQueue", "onJobCompleted : finished job %s that belongs to trigger `%s` but AppJobs already moved to the next trigger (most probably because this job depends on other jobs)");
        }
    }
}
