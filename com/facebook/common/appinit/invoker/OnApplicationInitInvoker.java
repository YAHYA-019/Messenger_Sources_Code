package com.facebook.common.appinit.invoker;

import X.0ZJ;
import X.0ZO;
import X.0Zi;
import X.0fH;
import X.0tF;
import X.11T;
import X.C0t9;
import android.app.Application;
import android.os.ConditionVariable;
import com.facebook.acra.constants.ActionId;
import com.facebook.forker.Process;

/* loaded from: OnApplicationInitInvoker.class */
public final class OnApplicationInitInvoker implements 0ZJ {
    public final Application A00;
    public final ConditionVariable A01;

    public OnApplicationInitInvoker(Application application, ConditionVariable conditionVariable) {
        this.A00 = application;
        this.A01 = conditionVariable;
    }

    public static void schedule(Application application, 0tF r302, ConditionVariable conditionVariable) {
        String str;
        String str2;
        Object[] objArr;
        Object obj;
        OnApplicationInitInvoker onApplicationInitInvoker = new OnApplicationInitInvoker(application, conditionVariable);
        int A00 = 1 << 0ZO.A00();
        11T.A0F(application, 0);
        C0t9 A01 = 0Zi.A01(application);
        0Zi.A01(application);
        boolean z = A01.A8C;
        int i = A00 & 33;
        if (z) {
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "FbSharedPreferenceInitializer", (int[]) null, ActionId.ACTION_BAR_COMPLETE, true);
                r302.A01(onApplicationInitInvoker, "GatekeeperStoreInitializer", (int[]) null, ActionId.RTMP_CONNECTION_FAILED, true);
                r302.A01(onApplicationInitInvoker, "MobileConfigAdminIdInit", (int[]) null, 195, true);
                r302.A01(onApplicationInitInvoker, "MobileConfigInit", (int[]) null, 197, true);
                r302.A01(onApplicationInitInvoker, "MobileConfigSessionlessInit", (int[]) null, 200, true);
            }
            int i2 = A00 & 41;
            if (i2 != 0) {
                r302.A01(onApplicationInitInvoker, "InitExecutors", (int[]) null, ActionId.APP_FIRST_VIEW_CONTROLLER, true);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "StartupQPLInit", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 197, 200}, 259, true);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "StringResourcesDelegate", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.APP_FIRST_VIEW_CONTROLLER}, 264, true);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "E2EForceMobileConfigFetch", new int[]{197}, 91, true);
                r302.A01(onApplicationInitInvoker, "E2EForceMobileConfigSessionlessFetch", new int[]{200}, 92, true);
            }
            int i3 = A00 & 1;
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "FdidInitSync", new int[]{197}, ActionId.RTMP_PACKET_RECEIVED, true);
            }
            if ((A00 & 9) != 0) {
                r302.A01(onApplicationInitInvoker, "InitAppModuleFallbackLoader", (int[]) null, ActionId.MESSENGER_QUEUE_CREATION, true);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "RunPerfMarkers", new int[]{259}, 245, true);
                r302.A01(onApplicationInitInvoker, "InitPushLiteSdk", new int[]{245}, ActionId.NOTIFY_SUBSCRIBERS, true);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "LithoConfiguration", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.APP_FIRST_VIEW_CONTROLLER, 195, 197}, 173, true);
                r302.A01(onApplicationInitInvoker, "PrivacyUiiDetectionLogger", new int[]{197}, 229, true);
                r302.A01(onApplicationInitInvoker, "WaitForUIDependenciesInitializer", new int[]{91, 92, ActionId.RTMP_PACKET_RECEIVED, ActionId.RTMP_CONNECTION_FAILED, ActionId.MESSENGER_QUEUE_CREATION, ActionId.NOTIFY_SUBSCRIBERS, 173, 229, 264}, 276, true);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "DismissSplashScreens", new int[]{276}, 86, true);
                r302.A01(onApplicationInitInvoker, "StaticGraphServiceFactoryInitializer", new int[]{175}, 262, true);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "FbSharedPreferenceInitializerAsync", (int[]) null, ActionId.ABORTED, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "EarliestPossibleColdStartClassPreloadStarterOrca", (int[]) null, 97, false);
                r302.A01(onApplicationInitInvoker, "MessengerHighPriInitializer", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.RTMP_CONNECTION_FAILED}, 185, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "MessengerMCPPluginInitializer", (int[]) null, 189, false);
                r302.A01(onApplicationInitInvoker, "MobileConfigStableSpecifierInit", new int[]{197, 200}, 202, false);
                r302.A01(onApplicationInitInvoker, "MessengerMsysBootstrap", new int[]{189, 202}, 190, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "MessengerHighPriInitializerAfterMsysBootstrap", new int[]{190}, 186, false);
                r302.A01(onApplicationInitInvoker, "MessengerInboxCloseConnections", new int[]{185}, 187, false);
                r302.A01(onApplicationInitInvoker, "MessengerSecureContextHelper", new int[]{ActionId.ACTION_BAR_COMPLETE, 190}, 192, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "AddProcessNameToErrorReport", (int[]) null, 1, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "DgwEarlySyncInitializer", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 175, 195, 197, 200}, 84, false);
            }
            if ((A00 & 8) != 0) {
                r302.A01(onApplicationInitInvoker, "DismissSplashScreensForSecondaryMultiDexProcess", (int[]) null, 87, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "DownloadedFbResources", new int[]{197, 200}, 90, false);
                r302.A01(onApplicationInitInvoker, "ErrorReporterSecondaryInit", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.APP_FIRST_VIEW_CONTROLLER}, 98, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "FixieActivityManagerHook", (int[]) null, ActionId.RTMP_CONNECTION_RELEASE, false);
                r302.A01(onApplicationInitInvoker, "FixieLimitNativeStackSize", (int[]) null, ActionId.NEW_START_FOUND, false);
                r302.A01(onApplicationInitInvoker, "FixieNoSync", (int[]) null, ActionId.MISSED_EVENT, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "InitAppChoreographer", (int[]) null, 128, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "FixieScheduleIdleWork", new int[]{128, 276}, ActionId.TIMEOUT, false);
                r302.A01(onApplicationInitInvoker, "ForegroundServiceTracker", new int[]{ActionId.RTMP_CONNECTION_FAILED}, ActionId.VIDEO_PLAYING, false);
                r302.A01(onApplicationInitInvoker, "HandleAppComponentsForPreTosBuild", (int[]) null, ActionId.HEADER_DATA_LOADED, false);
                r302.A01(onApplicationInitInvoker, "INeedInitForBroadcastReceiverRegister", new int[]{259}, ActionId.VIEW_WILL_APPEAR_BEGIN, false);
                r302.A01(onApplicationInitInvoker, "INeedInitForEventBusRegister", (int[]) null, ActionId.VIEW_DID_LOAD_BEGIN, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "INeedInitForGatekeepersListenerRegister", (int[]) null, 125, false);
                r302.A01(onApplicationInitInvoker, "INeedInitForSharedPrefsListenerRegister", new int[]{195, 197, 200}, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES, false);
            }
            if (i2 != 0) {
                r302.A01(onApplicationInitInvoker, "InitAndroidX", new int[]{174}, 127, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "InitFury", new int[]{197}, ActionId.MESSENGER_THREAD_LIST_DISPLAYED, false);
                r302.A01(onApplicationInitInvoker, "InitImagePipeline", new int[]{197}, ActionId.ACTIVITY_START, false);
            }
            if (i2 != 0) {
                r302.A01(onApplicationInitInvoker, "InitLacrimaLaterInit", new int[]{ActionId.END_START_ACTIVITY}, ActionId.FILE_SYSTEM_FAIL, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "InitLogging", (int[]) null, ActionId.FORMAT_ERROR, false);
                r302.A01(onApplicationInitInvoker, "InitMemoryDumpHandler", new int[]{197}, 150, false);
                r302.A01(onApplicationInitInvoker, "InitMessengerLoggers", new int[]{ActionId.RTMP_CONNECTION_FAILED, 197}, ActionId.APPLY_OPTIMISTICS, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "InitPreWarmRsysEngine", new int[]{197}, ActionId.FUTURE_LISTENERS_COMPLETE, false);
                r302.A01(onApplicationInitInvoker, "InitPushabilityCheck", new int[]{ActionId.NOTIFY_SUBSCRIBERS}, ActionId.WAIT_FOR_BLOCKERS, false);
                r302.A01(onApplicationInitInvoker, "InitSystrace", (int[]) null, ActionId.VIEW_DID_APPEAR_BEGIN, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "LanguageSwitcherCommonExInit", new int[]{ActionId.ACTION_BAR_COMPLETE}, ActionId.VIDEO_REQUESTED_PLAYING, false);
                r302.A01(onApplicationInitInvoker, "LazyCustomErrorDataInitializer", (int[]) null, 172, false);
                r302.A01(onApplicationInitInvoker, "LocationRequestDetector", new int[]{197}, 178, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "LogController", new int[]{ActionId.ACTION_BAR_COMPLETE}, 179, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "MessageQueueDoctor", new int[]{197}, 183, false);
                r302.A01(onApplicationInitInvoker, "MessengerBindToFirebaseProcess", new int[]{ActionId.ACTION_BAR_COMPLETE}, 184, false);
                r302.A01(onApplicationInitInvoker, "MessengerInstacrashLoopBugReport", (int[]) null, 188, false);
                r302.A01(onApplicationInitInvoker, "MprotectCode", (int[]) null, 204, false);
                r302.A01(onApplicationInitInvoker, "MqttEarlySyncInitializerAfterAppCreate", new int[]{86, 189}, 206, false);
                r302.A01(onApplicationInitInvoker, "NotifyAppStateManagerOnCreateComplete", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 197}, 207, false);
                r302.A01(onApplicationInitInvoker, "ObjectCountJestE2EBridge", (int[]) null, 208, false);
                r302.A01(onApplicationInitInvoker, "OrcaFirstInstallInitializer", new int[]{ActionId.ACTION_BAR_COMPLETE}, 210, false);
                r302.A01(onApplicationInitInvoker, "ProfiloBridgeFactoryImpl", new int[]{182, 259}, 230, false);
                r302.A01(onApplicationInitInvoker, "RasFileInitializer", (int[]) null, 231, false);
                r302.A01(onApplicationInitInvoker, "RegisterFrameRateTraceListener", (int[]) null, 233, false);
                r302.A01(onApplicationInitInvoker, "RegisterMainLooperTracer", (int[]) null, 234, false);
                r302.A01(onApplicationInitInvoker, "RegisterMessengerBackgroundRestartedReceiver", (int[]) null, 235, false);
                r302.A01(onApplicationInitInvoker, "ReplayBroadcastReceivedDuringAppInit", new int[]{276}, 242, false);
                r302.A01(onApplicationInitInvoker, "ScheduleLowPriWork", new int[]{276}, 248, false);
                r302.A01(onApplicationInitInvoker, "SetupDynaBuilds", (int[]) null, 254, false);
                r302.A01(onApplicationInitInvoker, "TransientNetworkTraceEarlyInit", new int[]{259}, 266, false);
            }
            if ((A00 & 32) != 0) {
                r302.A01(onApplicationInitInvoker, "WaitForVRUIDependenciesInitializer", new int[]{ActionId.RTMP_CONNECTION_FAILED, 197, 200, 264}, 277, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "WarmFacebookEmojiFont", new int[]{ActionId.ACTION_BAR_COMPLETE, 197}, 279, false);
                r302.A01(onApplicationInitInvoker, "WarmUpColdStartReceiver", new int[]{276}, 280, false);
                r302.A01(onApplicationInitInvoker, "WhitehatOverlayInitializer", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.RTMP_CONNECTION_FAILED}, 281, false);
                r302.A01(onApplicationInitInvoker, "ZeroLibraryInitializer", new int[]{ActionId.ACTION_BAR_COMPLETE}, 283, false);
                r302.A01(onApplicationInitInvoker, "LongtailVoltronAppInit", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 197}, 181, false);
                r302.A01(onApplicationInitInvoker, "MessengerScheduleInitMallocHooks", new int[]{197}, 191, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "MobileConfigAdminIdLaterInit", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 195}, 196, false);
                r302.A01(onApplicationInitInvoker, "MobileConfigLaterInit", new int[]{91, ActionId.APP_FIRST_VIEW_CONTROLLER}, 198, false);
                r302.A01(onApplicationInitInvoker, "MobileConfigSessionlessLaterInit", new int[]{92, ActionId.APP_FIRST_VIEW_CONTROLLER}, 201, false);
            }
            if (i3 != 0) {
                r302.A01(onApplicationInitInvoker, "PreloadVideo", new int[]{ActionId.ACTION_BAR_COMPLETE, 259}, 226, false);
                r302.A01(onApplicationInitInvoker, "RuntimesPermissionsUtilLoader", (int[]) null, 247, false);
                r302.A01(onApplicationInitInvoker, "SetupBlockingBackgroundComponentReporting", new int[]{259}, Process.SD_BLACK_HOLE, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "StartupQPLReplayer", new int[]{259}, 260, false);
                r302.A01(onApplicationInitInvoker, "StartupQPLTransitToMatureStage", new int[]{260}, 261, false);
            }
            str = "OnApplicationInitInvoker";
            str2 = "Ignored missing AppInit dependency: %d:%s";
            0fH.A17(str, str2, new Object[]{3, "AnalyticsLoggerInit"});
            0fH.A17(str, str2, new Object[]{94, "EagerInitImagePipeline"});
            0fH.A17(str, str2, new Object[]{95, "EagerInitTigonLiger"});
            0fH.A17(str, str2, new Object[]{Integer.valueOf(ActionId.ON_VIEW_CREATED_END), "FbMCPPluginInitializer"});
            0fH.A17(str, str2, new Object[]{Integer.valueOf(ActionId.QUERY_READY), "FbSharedUIQREnvironment"});
            0fH.A17(str, str2, new Object[]{Integer.valueOf(ActionId.VIDEO_SET_RENDERER_CONTEXT), "GraphServiceEagerInit"});
            0fH.A17(str, str2, new Object[]{Integer.valueOf(ActionId.APP_DID_FINISH_LAUNCHING), "InitAuthentication"});
            0fH.A17(str, str2, new Object[]{217, "PreloadFeedFullCacheLoad"});
            0fH.A17(str, str2, new Object[]{227, "PreloadWordmark"});
            objArr = new Object[2];
            objArr[0] = 243;
            obj = "RunEarlyInitForActivity";
        } else {
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "FbSharedPreferenceInitializer", (int[]) null, ActionId.ACTION_BAR_COMPLETE, true);
                r302.A01(onApplicationInitInvoker, "GatekeeperStoreInitializer", (int[]) null, ActionId.RTMP_CONNECTION_FAILED, true);
                r302.A01(onApplicationInitInvoker, "MobileConfigAdminIdInit", (int[]) null, 195, true);
                r302.A01(onApplicationInitInvoker, "MobileConfigInit", (int[]) null, 197, true);
                r302.A01(onApplicationInitInvoker, "MobileConfigSessionlessInit", (int[]) null, 200, true);
            }
            int i4 = A00 & 41;
            if (i4 != 0) {
                r302.A01(onApplicationInitInvoker, "InitExecutors", (int[]) null, ActionId.APP_FIRST_VIEW_CONTROLLER, true);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "StartupQPLInit", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 197, 200}, 259, true);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "StringResourcesDelegate", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.APP_FIRST_VIEW_CONTROLLER}, 264, true);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "E2EForceMobileConfigFetch", new int[]{197}, 91, true);
                r302.A01(onApplicationInitInvoker, "E2EForceMobileConfigSessionlessFetch", new int[]{200}, 92, true);
            }
            int i5 = A00 & 1;
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "FdidInitSync", new int[]{197}, ActionId.RTMP_PACKET_RECEIVED, true);
            }
            if ((A00 & 9) != 0) {
                r302.A01(onApplicationInitInvoker, "InitAppModuleFallbackLoader", (int[]) null, ActionId.MESSENGER_QUEUE_CREATION, true);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "RunPerfMarkers", new int[]{259}, 245, true);
                r302.A01(onApplicationInitInvoker, "InitPushLiteSdk", new int[]{245}, ActionId.NOTIFY_SUBSCRIBERS, true);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "LithoConfiguration", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.APP_FIRST_VIEW_CONTROLLER, 195, 197}, 173, true);
                r302.A01(onApplicationInitInvoker, "PrivacyUiiDetectionLogger", new int[]{197}, 229, true);
                r302.A01(onApplicationInitInvoker, "WaitForUIDependenciesInitializer", new int[]{91, 92, ActionId.RTMP_PACKET_RECEIVED, ActionId.RTMP_CONNECTION_FAILED, ActionId.MESSENGER_QUEUE_CREATION, ActionId.NOTIFY_SUBSCRIBERS, 173, 229, 264}, 276, true);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "DismissSplashScreens", new int[]{276}, 86, true);
                r302.A01(onApplicationInitInvoker, "StaticGraphServiceFactoryInitializer", new int[]{175}, 262, true);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "FbSharedPreferenceInitializerAsync", (int[]) null, ActionId.ABORTED, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "EarliestPossibleColdStartClassPreloadStarterOrca", (int[]) null, 97, false);
                r302.A01(onApplicationInitInvoker, "MessengerHighPriInitializer", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.RTMP_CONNECTION_FAILED}, 185, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "MessengerMCPPluginInitializer", (int[]) null, 189, false);
                r302.A01(onApplicationInitInvoker, "MobileConfigStableSpecifierInit", new int[]{197, 200}, 202, false);
                r302.A01(onApplicationInitInvoker, "MessengerMsysBootstrap", new int[]{189, 202}, 190, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "MessengerHighPriInitializerAfterMsysBootstrap", new int[]{190}, 186, false);
                r302.A01(onApplicationInitInvoker, "MessengerInboxCloseConnections", new int[]{185}, 187, false);
                r302.A01(onApplicationInitInvoker, "MessengerSecureContextHelper", new int[]{ActionId.ACTION_BAR_COMPLETE, 190}, 192, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "AddProcessNameToErrorReport", (int[]) null, 1, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "DgwEarlySyncInitializer", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 175, 195, 197, 200}, 84, false);
            }
            if ((A00 & 8) != 0) {
                r302.A01(onApplicationInitInvoker, "DismissSplashScreensForSecondaryMultiDexProcess", (int[]) null, 87, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "DownloadedFbResources", new int[]{197, 200}, 90, false);
                r302.A01(onApplicationInitInvoker, "ErrorReporterSecondaryInit", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.APP_FIRST_VIEW_CONTROLLER}, 98, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "FixieActivityManagerHook", (int[]) null, ActionId.RTMP_CONNECTION_RELEASE, false);
                r302.A01(onApplicationInitInvoker, "FixieLimitNativeStackSize", (int[]) null, ActionId.NEW_START_FOUND, false);
                r302.A01(onApplicationInitInvoker, "FixieNoSync", (int[]) null, ActionId.MISSED_EVENT, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "InitAppChoreographer", (int[]) null, 128, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "FixieScheduleIdleWork", new int[]{128, 276}, ActionId.TIMEOUT, false);
                r302.A01(onApplicationInitInvoker, "ForegroundServiceTracker", new int[]{ActionId.RTMP_CONNECTION_FAILED}, ActionId.VIDEO_PLAYING, false);
                r302.A01(onApplicationInitInvoker, "HandleAppComponentsForPreTosBuild", (int[]) null, ActionId.HEADER_DATA_LOADED, false);
                r302.A01(onApplicationInitInvoker, "INeedInitForBroadcastReceiverRegister", new int[]{259}, ActionId.VIEW_WILL_APPEAR_BEGIN, false);
                r302.A01(onApplicationInitInvoker, "INeedInitForEventBusRegister", (int[]) null, ActionId.VIEW_DID_LOAD_BEGIN, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "INeedInitForGatekeepersListenerRegister", (int[]) null, 125, false);
                r302.A01(onApplicationInitInvoker, "INeedInitForSharedPrefsListenerRegister", new int[]{195, 197, 200}, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES, false);
            }
            if (i4 != 0) {
                r302.A01(onApplicationInitInvoker, "InitAndroidX", new int[]{174}, 127, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "InitFury", new int[]{197}, ActionId.MESSENGER_THREAD_LIST_DISPLAYED, false);
                r302.A01(onApplicationInitInvoker, "InitImagePipeline", new int[]{197}, ActionId.ACTIVITY_START, false);
            }
            if (i4 != 0) {
                r302.A01(onApplicationInitInvoker, "InitLacrimaLaterInit", new int[]{ActionId.END_START_ACTIVITY}, ActionId.FILE_SYSTEM_FAIL, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "InitLogging", (int[]) null, ActionId.FORMAT_ERROR, false);
                r302.A01(onApplicationInitInvoker, "InitMemoryDumpHandler", new int[]{197}, 150, false);
                r302.A01(onApplicationInitInvoker, "InitMessengerLoggers", new int[]{ActionId.RTMP_CONNECTION_FAILED, 197}, ActionId.APPLY_OPTIMISTICS, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "InitPreWarmRsysEngine", new int[]{197}, ActionId.FUTURE_LISTENERS_COMPLETE, false);
                r302.A01(onApplicationInitInvoker, "InitPushabilityCheck", new int[]{ActionId.NOTIFY_SUBSCRIBERS}, ActionId.WAIT_FOR_BLOCKERS, false);
                r302.A01(onApplicationInitInvoker, "InitSystrace", (int[]) null, ActionId.VIEW_DID_APPEAR_BEGIN, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "LanguageSwitcherCommonExInit", new int[]{ActionId.ACTION_BAR_COMPLETE}, ActionId.VIDEO_REQUESTED_PLAYING, false);
                r302.A01(onApplicationInitInvoker, "LazyCustomErrorDataInitializer", (int[]) null, 172, false);
                r302.A01(onApplicationInitInvoker, "LocationRequestDetector", new int[]{197}, 178, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "LogController", new int[]{ActionId.ACTION_BAR_COMPLETE}, 179, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "MessageQueueDoctor", new int[]{197}, 183, false);
                r302.A01(onApplicationInitInvoker, "MessengerBindToFirebaseProcess", new int[]{ActionId.ACTION_BAR_COMPLETE}, 184, false);
                r302.A01(onApplicationInitInvoker, "MessengerInstacrashLoopBugReport", (int[]) null, 188, false);
                r302.A01(onApplicationInitInvoker, "MprotectCode", (int[]) null, 204, false);
                r302.A01(onApplicationInitInvoker, "MqttEarlySyncInitializerAfterAppCreate", new int[]{86, 189}, 206, false);
                r302.A01(onApplicationInitInvoker, "NotifyAppStateManagerOnCreateComplete", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 197}, 207, false);
                r302.A01(onApplicationInitInvoker, "ObjectCountJestE2EBridge", (int[]) null, 208, false);
                r302.A01(onApplicationInitInvoker, "OrcaFirstInstallInitializer", new int[]{ActionId.ACTION_BAR_COMPLETE}, 210, false);
                r302.A01(onApplicationInitInvoker, "ProfiloBridgeFactoryImpl", new int[]{182, 259}, 230, false);
                r302.A01(onApplicationInitInvoker, "RasFileInitializer", (int[]) null, 231, false);
                r302.A01(onApplicationInitInvoker, "RegisterFrameRateTraceListener", (int[]) null, 233, false);
                r302.A01(onApplicationInitInvoker, "RegisterMainLooperTracer", (int[]) null, 234, false);
                r302.A01(onApplicationInitInvoker, "RegisterMessengerBackgroundRestartedReceiver", (int[]) null, 235, false);
                r302.A01(onApplicationInitInvoker, "ReplayBroadcastReceivedDuringAppInit", new int[]{276}, 242, false);
                r302.A01(onApplicationInitInvoker, "ScheduleLowPriWork", new int[]{276}, 248, false);
                r302.A01(onApplicationInitInvoker, "SetupDynaBuilds", (int[]) null, 254, false);
                r302.A01(onApplicationInitInvoker, "TransientNetworkTraceEarlyInit", new int[]{259}, 266, false);
            }
            if ((A00 & 32) != 0) {
                r302.A01(onApplicationInitInvoker, "WaitForVRUIDependenciesInitializer", new int[]{ActionId.RTMP_CONNECTION_FAILED, 197, 200, 264}, 277, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "WarmFacebookEmojiFont", new int[]{ActionId.ACTION_BAR_COMPLETE, 197}, 279, false);
                r302.A01(onApplicationInitInvoker, "WarmUpColdStartReceiver", new int[]{276}, 280, false);
                r302.A01(onApplicationInitInvoker, "WhitehatOverlayInitializer", new int[]{ActionId.ACTION_BAR_COMPLETE, ActionId.RTMP_CONNECTION_FAILED}, 281, false);
                r302.A01(onApplicationInitInvoker, "ZeroLibraryInitializer", new int[]{ActionId.ACTION_BAR_COMPLETE}, 283, false);
                r302.A01(onApplicationInitInvoker, "LongtailVoltronAppInit", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 197}, 181, false);
                r302.A01(onApplicationInitInvoker, "MessengerScheduleInitMallocHooks", new int[]{197}, 191, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "MobileConfigAdminIdLaterInit", new int[]{ActionId.APP_FIRST_VIEW_CONTROLLER, 195}, 196, false);
                r302.A01(onApplicationInitInvoker, "MobileConfigLaterInit", new int[]{91, ActionId.APP_FIRST_VIEW_CONTROLLER}, 198, false);
                r302.A01(onApplicationInitInvoker, "MobileConfigSessionlessLaterInit", new int[]{92, ActionId.APP_FIRST_VIEW_CONTROLLER}, 201, false);
            }
            if (i5 != 0) {
                r302.A01(onApplicationInitInvoker, "PreloadVideo", new int[]{ActionId.ACTION_BAR_COMPLETE, 259}, 226, false);
                r302.A01(onApplicationInitInvoker, "RuntimesPermissionsUtilLoader", (int[]) null, 247, false);
                r302.A01(onApplicationInitInvoker, "SetupBlockingBackgroundComponentReporting", new int[]{259}, Process.SD_BLACK_HOLE, false);
            }
            if (i != 0) {
                r302.A01(onApplicationInitInvoker, "StartupQPLReplayer", new int[]{259}, 260, false);
                r302.A01(onApplicationInitInvoker, "StartupQPLTransitToMatureStage", new int[]{260}, 261, false);
            }
            str = "OnApplicationInitInvoker";
            str2 = "Ignored missing AppInit dependency: %d:%s";
            0fH.A17(str, str2, new Object[]{3, "AnalyticsLoggerInit"});
            0fH.A17(str, str2, new Object[]{94, "EagerInitImagePipeline"});
            0fH.A17(str, str2, new Object[]{95, "EagerInitTigonLiger"});
            0fH.A17(str, str2, new Object[]{Integer.valueOf(ActionId.ON_VIEW_CREATED_END), "FbMCPPluginInitializer"});
            0fH.A17(str, str2, new Object[]{Integer.valueOf(ActionId.QUERY_READY), "FbSharedUIQREnvironment"});
            0fH.A17(str, str2, new Object[]{Integer.valueOf(ActionId.VIDEO_SET_RENDERER_CONTEXT), "GraphServiceEagerInit"});
            0fH.A17(str, str2, new Object[]{Integer.valueOf(ActionId.APP_DID_FINISH_LAUNCHING), "InitAuthentication"});
            objArr = new Object[2];
            objArr[0] = 227;
            obj = "PreloadWordmark";
        }
        objArr[1] = obj;
        0fH.A17(str, str2, objArr);
        0fH.A17(str, str2, new Object[]{282, "ZeroABTestStaticBootstrap"});
    }

    /* JADX WARN: Code restructure failed: missing block: B:1022:0x2d1e, code lost:
    
        if (new java.util.Random().nextInt(r0) != 0) goto L950;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0a8a, code lost:
    
        if (r312 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x244d, code lost:
    
        if (X.0GT.A00(com.facebook.inject.FbInjector.A00()).A2Z == false) goto L740;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0016. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0daa A[Catch: all -> 0x0dc4, TRY_ENTER, TryCatch #21 {all -> 0x0dc4, blocks: (B:329:0x0d3b, B:335:0x0daa, B:336:0x0db0, B:1273:0x0dbc, B:1275:0x0dc3, B:343:0x0d95, B:330:0x0d40, B:332:0x0d47, B:344:0x0d9a, B:346:0x0da1, B:1269:0x0db8), top: B:5:0x0016, inners: #9, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x1b97  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x1baf  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x1cea A[LOOP:5: B:678:0x1cdc->B:680:0x1cea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:684:0x1d25  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x1e66  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x1eb2  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x1f76  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x2005  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x2238  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x23e2  */
    /* JADX WARN: Type inference failed for: r0v1003, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v226, types: [java.lang.Object, X.0Xt] */
    /* JADX WARN: Type inference failed for: r0v2470, types: [com.facebook.fury.context.ReqContext] */
    /* JADX WARN: Type inference failed for: r0v2474, types: [com.facebook.fury.context.ReqContext] */
    /* JADX WARN: Type inference failed for: r0v2492, types: [com.facebook.fury.context.ReqContext] */
    /* JADX WARN: Type inference failed for: r0v999, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r302v0, types: [java.lang.Throwable, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BQ2(int r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 14509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.appinit.invoker.OnApplicationInitInvoker.BQ2(int, java.lang.String):void");
    }
}
