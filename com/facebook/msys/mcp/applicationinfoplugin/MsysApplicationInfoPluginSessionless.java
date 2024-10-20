package com.facebook.msys.mcp.applicationinfoplugin;

import X.C0di;
import com.mapbox.mapboxsdk.BuildConfig;

/* loaded from: MsysApplicationInfoPluginSessionless.class */
public class MsysApplicationInfoPluginSessionless extends Sessionless {
    @Override // com.facebook.msys.mcp.applicationinfoplugin.Sessionless
    public String MsysApplicationInfoImpl_MsysApplicationInfoCreateAppVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.facebook.msys.mcp.applicationinfoplugin.Sessionless
    public String MsysApplicationInfoImpl_MsysApplicationInfoCreateDeviceId() {
        return null;
    }

    @Override // com.facebook.msys.mcp.applicationinfoplugin.Sessionless
    public String MsysApplicationInfoImpl_MsysApplicationInfoCreateProcessName() {
        return C0di.A00().A00;
    }
}
