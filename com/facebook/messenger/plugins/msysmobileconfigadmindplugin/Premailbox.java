package com.facebook.messenger.plugins.msysmobileconfigadmindplugin;

import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;

/* loaded from: Premailbox.class */
public abstract class Premailbox {
    public MessengerSessionedMCPContext mAppContext;

    public Premailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this.mAppContext = messengerSessionedMCPContext;
    }

    private boolean MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetBooleanJNI(long j, boolean z) {
        return MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetBoolean(j, z);
    }

    private double MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetDoubleJNI(long j, boolean z) {
        return MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetDouble(j, z);
    }

    private int MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetInt32JNI(long j, boolean z) {
        return MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetInt32(j, z);
    }

    private long MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetInt64JNI(long j, boolean z) {
        return MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetInt64(j, z);
    }

    private String MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetStringJNI(long j, boolean z) {
        String MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetString = MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetString(j, z);
        if (MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetString == null) {
            MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetString = null;
        }
        return MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetString;
    }

    public abstract boolean MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetBoolean(long j, boolean z);

    public abstract double MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetDouble(long j, boolean z);

    public abstract int MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetInt32(long j, boolean z);

    public abstract long MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetInt64(long j, boolean z);

    public abstract String MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetString(long j, boolean z);

    public abstract void MsysMobileConfigAdminIdPluginPremailboxExtensionsDestroy();
}
