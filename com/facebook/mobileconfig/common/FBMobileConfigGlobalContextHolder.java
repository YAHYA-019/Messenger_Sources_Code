package com.facebook.mobileconfig.common;

import X.C0gh;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: FBMobileConfigGlobalContextHolder.class */
public class FBMobileConfigGlobalContextHolder {
    public final HybridData mHybridData = initHybrid();

    static {
        C0gh.A02("mobileconfig-jni");
    }

    public static native HybridData initHybrid();

    private native void setContextTracker(MobileConfigContextTracker mobileConfigContextTracker);

    public native Map getContextData(int i, String str, long j);

    public native long getFirstAppInstallTime();

    public native String getFirstFullFetchCompleteTime(int i, String str);

    public native String getFirstFullFetchExtraInfo(int i, String str);

    public native String getFirstPartFetchCompleteTime(int i, String str);

    public native String getFirstPartFetchExtraInfo(int i, String str);

    public native String getFirstUserEnterSession();

    public native int getIsFirstUserEnterSession(String str);

    public native int getIsFullFetchComplete(int i, String str);

    public native int getIsPartFetchComplete(int i, String str);

    public native String getLastFullFetchCompVersion(int i, String str);

    public native String getLastPartFetchCompVersion(int i, String str);

    public native void onEnterSession(String str, int i);

    public native void onExitSession(String str);

    public native void onFirstAppInstall();

    public native void setCurrentVersion(String str);

    public native void setLastSavedVersion(String str);
}
