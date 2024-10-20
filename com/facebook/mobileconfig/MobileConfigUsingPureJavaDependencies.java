package com.facebook.mobileconfig;

import X.C0gh;
import android.content.res.AssetManager;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.common.FBMobileConfigGlobalContextHolder;
import java.util.Map;

/* loaded from: MobileConfigUsingPureJavaDependencies.class */
public abstract class MobileConfigUsingPureJavaDependencies {
    public final HybridData mHybridData;

    static {
        C0gh.A02("mobileconfig-jni");
    }

    private native MobileConfigManagerHolderImpl createManagerInternal(String str, String str2, String str3, String str4, int i, String str5, AssetManager assetManager, boolean z, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, Map map, MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder);

    public static native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, MobileConfigFetcher mobileConfigFetcher, boolean z, MobileConfigCxxLogger mobileConfigCxxLogger, MobileConfigCxxPerfLogger mobileConfigCxxPerfLogger);

    public static native void setNetworkService(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, MobileConfigFetcher mobileConfigFetcher, boolean z);
}
