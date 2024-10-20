package com.facebook.mobileconfig;

import X.C0gh;
import android.content.res.AssetManager;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.Map;

/* loaded from: MobileConfigDependenciesInWearables.class */
public abstract class MobileConfigDependenciesInWearables {
    public final HybridData mHybridData;

    static {
        C0gh.A02("mobileconfig-jni");
    }

    private native MobileConfigManagerHolderImpl createManagerInternal(String str, String str2, String str3, String str4, String str5, AssetManager assetManager, boolean z, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, Map map);

    public static native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, TigonServiceHolder tigonServiceHolder, boolean z, MobileConfigCxxLogger mobileConfigCxxLogger);
}
