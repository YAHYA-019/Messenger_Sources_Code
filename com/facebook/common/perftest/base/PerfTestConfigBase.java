package com.facebook.common.perftest.base;

import X.3HU;

/* loaded from: PerfTestConfigBase.class */
public class PerfTestConfigBase {
    public static String A00;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;

    public static PerfTestConfigBase getInstance() {
        return 3HU.A00;
    }

    public void setAllowMainTabActivityKillingOnBackPressHandler(boolean z) {
    }

    public void setAlwaysLogComponentsMemory(boolean z) {
    }

    public void setAlwaysLogComponentsPerf(boolean z) {
        A01 = z;
    }

    public void setAlwaysLogDraweePerf(boolean z) {
    }

    public void setAlwaysLogImagePipelinePerf(boolean z) {
    }

    public void setDisableAnalyticsLogging(boolean z) {
        A02 = z;
    }

    public void setDisableNewsFeedAutoRefresh(boolean z) {
    }

    public void setDisablePrefetchControllerMemoryCacheFastpath(boolean z) {
    }

    public void setFeedImagePreloaderDisabled(boolean z) {
    }

    public void setForceRefreshNewsFeedOnResume(boolean z) {
    }

    public void setPerfTestInfo(String str) {
        A00 = str;
    }

    public void setPlacePickerFlowsEnabled(boolean z) {
    }

    public void setPlacePickerForceMockedLocation(boolean z) {
        A03 = z;
    }

    public void setPlacePickerSuppressLocationSourceDialog(boolean z) {
        A04 = z;
    }

    public void setPlacePickerTimeoutMs(long j) {
    }
}
