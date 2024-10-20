package com.facebook.messenger.plugins.msysmobileconfigsessionedplugin;

import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;

/* loaded from: Premailbox.class */
public abstract class Premailbox {
    public MessengerSessionedMCPContext mAppContext;

    public Premailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this.mAppContext = messengerSessionedMCPContext;
    }

    private boolean MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetBooleanJNI(long j, boolean z) {
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetBoolean(j, z);
    }

    private double MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetDoubleJNI(long j, boolean z) {
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetDouble(j, z);
    }

    private int MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt32JNI(long j, boolean z) {
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt32(j, z);
    }

    private long MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt64JNI(long j, boolean z) {
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt64(j, z);
    }

    private String MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetStringJNI(long j, boolean z) {
        String MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString = MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString(j, z);
        if (MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString == null) {
            MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString = null;
        }
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString;
    }

    public abstract boolean MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetBoolean(long j, boolean z);

    public abstract double MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetDouble(long j, boolean z);

    public abstract int MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt32(long j, boolean z);

    public abstract long MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt64(long j, boolean z);

    public abstract String MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString(long j, boolean z);

    public abstract void MsysMobileConfigSessionedPluginPremailboxExtensionsDestroy();
}
