package com.facebook.messenger.plugins.mcisurfacettrcloggerplugin;

import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    public MessengerSessionlessMCPContext mSessionlessAppContext;

    public Sessionless(MessengerSessionlessMCPContext messengerSessionlessMCPContext) {
        this.mSessionlessAppContext = messengerSessionlessMCPContext;
    }

    private void MCISurfaceTTRCLoggerPluginImpl_MCISurfaceTTRCLoggerThreadListObserverLoadCallbackEndJNI(String str, long j, boolean z) {
        if (str == null) {
            str = null;
        }
        MCISurfaceTTRCLoggerPluginImpl_MCISurfaceTTRCLoggerThreadListObserverLoadCallbackEnd(str, j, z);
    }

    private void MCISurfaceTTRCLoggerPluginImpl_MCISurfaceTTRCLoggerThreadListObserverLoadCallbackStartJNI(String str, long j) {
        if (str == null) {
            str = null;
        }
        MCISurfaceTTRCLoggerPluginImpl_MCISurfaceTTRCLoggerThreadListObserverLoadCallbackStart(str, j);
    }

    public abstract void MCISurfaceTTRCLoggerPluginImpl_MCISurfaceTTRCLoggerThreadListObserverLoadCallbackEnd(String str, long j, boolean z);

    public abstract void MCISurfaceTTRCLoggerPluginImpl_MCISurfaceTTRCLoggerThreadListObserverLoadCallbackStart(String str, long j);
}
