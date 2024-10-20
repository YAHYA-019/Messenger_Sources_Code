package com.facebook.mobileconfig;

import X.C0gh;
import android.content.res.AssetManager;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.Map;

/* loaded from: MobileConfigDependenciesInFBApps.class */
public class MobileConfigDependenciesInFBApps {
    public static final MobileConfigDependenciesInFBApps $redex_init_class = null;
    public final HybridData mHybridData;

    static {
        C0gh.A02("mobileconfig-jni");
    }

    public MobileConfigDependenciesInFBApps(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, TigonServiceHolder tigonServiceHolder, boolean z, XAnalyticsHolder xAnalyticsHolder) {
        this.mHybridData = initHybrid(null, tigonServiceHolder, z, xAnalyticsHolder);
    }

    private native MobileConfigManagerHolderImpl createManagerInternal(String str, String str2, String str3, String str4, int i, String str5, AssetManager assetManager, boolean z, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, Map map, MobileConfigCxxPerfLogger mobileConfigCxxPerfLogger);

    public static native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, TigonServiceHolder tigonServiceHolder, boolean z, XAnalyticsHolder xAnalyticsHolder);

    public static native boolean setNetworkServiceInternal(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, TigonServiceHolder tigonServiceHolder, boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        if (r305.isEmpty() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.mobileconfig.MobileConfigManagerHolderImpl createManager(java.io.File r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, int r306, java.lang.String r307, android.content.res.AssetManager r308, boolean r309, com.facebook.mobileconfig.MobileConfigManagerParamsHolder r310, java.util.Map r311, com.facebook.mobileconfig.MobileConfigCxxPerfLogger r312) {
        /*
            r301 = this;
            java.lang.String r0 = ""
            r313 = r0
            r0 = r302
            java.lang.String r0 = r0.getPath()
            r314 = r0
            r0 = r301
            r315 = r0
            r0 = r301
            r1 = r314
            java.lang.String r2 = "481.0.0.0.68"
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r313
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            com.facebook.mobileconfig.MobileConfigManagerHolderImpl r0 = r0.createManagerInternal(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r316 = r0
            r0 = r316
            if (r0 == 0) goto L67
            r0 = r316
            boolean r0 = r0.isValid()
            r317 = r0
            r0 = r317
            if (r0 == 0) goto L67
            r0 = r302
            java.lang.String r0 = r0.getAbsolutePath()
            r315 = r0
            r0 = r316
            r1 = r315
            r0.mDataDirPath = r1
            r0 = r305
            if (r0 == 0) goto L5a
            r0 = r305
            boolean r0 = r0.isEmpty()
            r318 = r0
            r0 = 1
            r317 = r0
            r0 = r318
            if (r0 == 0) goto L60
        L5a:
            r0 = 0
            r317 = r0
            r0 = 0
            r315 = r0
        L60:
            r0 = r316
            r1 = r317
            r0.mHasSessionId = r1
        L67:
            r0 = r316
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mobileconfig.MobileConfigDependenciesInFBApps.createManager(java.io.File, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, android.content.res.AssetManager, boolean, com.facebook.mobileconfig.MobileConfigManagerParamsHolder, java.util.Map, com.facebook.mobileconfig.MobileConfigCxxPerfLogger):com.facebook.mobileconfig.MobileConfigManagerHolderImpl");
    }
}
