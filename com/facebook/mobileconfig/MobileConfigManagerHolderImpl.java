package com.facebook.mobileconfig;

import X.0S2;
import X.1CK;
import X.1EQ;
import X.3Dc;
import X.C00o;
import X.C05924fb;
import X.C0gh;
import X.C5Cf;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: MobileConfigManagerHolderImpl.class */
public class MobileConfigManagerHolderImpl extends 1CK {
    public boolean mHasSessionId;
    public final HybridData mHybridData;
    public String mDataDirPath = "";
    public volatile MobileConfigUpdateOverridesTableCallback mOverridesTableCallback = null;
    public ScheduledExecutorService mScheduledExecutor = null;
    public C5Cf mFamilyDeviceIdProvider = null;
    public final CountDownLatch SET_NETWORK_SERVICE_SIGNAL = new CountDownLatch(1);

    static {
        C0gh.A02("mobileconfig-jni");
    }

    public MobileConfigManagerHolderImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native boolean updateConfigsInternal(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback, int[] iArr);

    private native boolean usePartialAndFullSyncFetch();

    public native void clearChangeListeners();

    public native void clearCurrentUserData();

    public native void clearOverrides();

    public native boolean containsParamsHashForPackage(String str, String str2, int i);

    public native String copyManagerDirToNextTempDir();

    public native boolean deleteManagerDirs();

    public native void deleteOldUserData(int i);

    public native void deleteTableFromStorage(String str);

    public native void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback);

    public native boolean finalizeCreation();

    public native String getAllPackageParamsMapHashInfo();

    public native String getBufferPathPostFix();

    public native String getConsistencyLoggingFlagsJSON();

    public String getDataDirPath() {
        return this.mDataDirPath;
    }

    public native String getDirectoryPathForSession();

    public native String getFamilyDeviceId();

    public native String getFrameworkStatus();

    public native long getLastErrorCode();

    public native long getLastNormalUpdateTimestamp();

    public 1EQ getLatestHandle() {
        1EQ latestHandleHolder = getLatestHandleHolder();
        if (latestHandleHolder == null) {
            latestHandleHolder = null;
        }
        return latestHandleHolder;
    }

    public native MobileConfigMmapHandleHolder getLatestHandleHolder();

    public native long getLatestTotalParamsCount();

    public native String getNextBufferPathPostfix();

    public C00o getOrCreateOverridesTable() {
        MobileConfigOverridesTableHolder orCreateOverridesTableHolder = getOrCreateOverridesTableHolder();
        if (this.mOverridesTableCallback != null) {
            orCreateOverridesTableHolder.setOverridesFileUpdatedCallback(this.mOverridesTableCallback);
        }
        return orCreateOverridesTableHolder;
    }

    public native MobileConfigOverridesTableHolder getOrCreateOverridesTableHolder();

    public native String getPackageParamsMapAndHashParsingOrder();

    public native String getParamsHashForPackage(String str);

    public native String getQueryHashString();

    public native String getSchemaHash();

    public native String getSchemaString();

    public native boolean isConsistencyLoggingNeeded(int i);

    public boolean isConsistencyLoggingNeeded(3Dc r302) {
        return isConsistencyLoggingNeeded(r302.mValue);
    }

    public native boolean isFetchNeeded();

    public native boolean isNetworkServiceSet();

    public native boolean isValid();

    public native void logAccessWithoutExposure(String str, String str2);

    public native void logConfigs(String str, int i, Map map);

    public void logConfigs(String str, 3Dc r303, Map map) {
        logConfigs(str, r303.mValue, map);
    }

    public native void logExposure(String str, long j, String str2, String str3);

    public native void logStorageConsistency();

    public native boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener);

    public native String saveCurrentParamsMapToDisk();

    public native boolean setEpHandler(MobileConfigEmergencyPushChangeListener mobileConfigEmergencyPushChangeListener);

    public native void setFamilyDeviceId(String str);

    public native boolean setSandboxURL(String str);

    public native boolean shouldRefetchFdidAndUpdateConfigs();

    public native String syncFetchReason();

    public boolean tryUpdateConfigsSynchronously(int i) {
        C05924fb c05924fb = new C05924fb();
        c05924fb.A00 = i;
        c05924fb.A02 = usePartialAndFullSyncFetch() ? 0S2.A0Y : 0S2.A0C;
        c05924fb.A06 = true;
        c05924fb.A04 = true;
        return updateConfigs(c05924fb);
    }

    public boolean updateConfigs(final C05924fb c05924fb) {
        int i;
        switch (c05924fb.A02.intValue()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return updateConfigsInternal(i, c05924fb.A00, c05924fb.A03, c05924fb.A05, c05924fb.A06, c05924fb.A04, new MobileConfigUpdateConfigsCallback() { // from class: X.4fr
            @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
            public void onNetworkComplete(boolean z) {
                ScheduledExecutorService scheduledExecutorService;
                C5Cf c5Cf;
                MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = c05924fb.A01;
                if (mobileConfigUpdateConfigsCallback != null) {
                    mobileConfigUpdateConfigsCallback.onNetworkComplete(z);
                }
                MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = MobileConfigManagerHolderImpl.this;
                if (!mobileConfigManagerHolderImpl.shouldRefetchFdidAndUpdateConfigs() || (scheduledExecutorService = mobileConfigManagerHolderImpl.mScheduledExecutor) == null || (c5Cf = mobileConfigManagerHolderImpl.mFamilyDeviceIdProvider) == null) {
                    return;
                }
                scheduledExecutorService.schedule(new C3iH(c5Cf, mobileConfigManagerHolderImpl, scheduledExecutorService, 30), 0L, TimeUnit.MILLISECONDS);
            }
        }, null);
    }

    public native MobileConfigManagerHolderImpl updateConfigsWithParamsListAndMayCreateManager(int i);

    public native boolean updateEmergencyPushConfigs();

    public native boolean updateEmergencyPushConfigsSynchronously(int i);
}
