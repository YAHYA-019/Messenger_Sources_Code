package com.facebook.msys.mcp.applicationinfoplugin;

import X.C0di;
import com.mapbox.mapboxsdk.BuildConfig;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    private String MsysApplicationInfoImpl_MsysApplicationInfoCreateAppVersionJNI() {
        return BuildConfig.VERSION_NAME;
    }

    private String MsysApplicationInfoImpl_MsysApplicationInfoCreateDeviceIdJNI() {
        return null;
    }

    private String MsysApplicationInfoImpl_MsysApplicationInfoCreateProcessNameJNI() {
        String str = C0di.A00().A00;
        if (str == null) {
            str = null;
        }
        return str;
    }

    public abstract String MsysApplicationInfoImpl_MsysApplicationInfoCreateAppVersion();

    public abstract String MsysApplicationInfoImpl_MsysApplicationInfoCreateDeviceId();

    public abstract String MsysApplicationInfoImpl_MsysApplicationInfoCreateProcessName();
}
