package com.facebook.messenger.plugins.mediareceiverfetchplugin;

import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.messenger.plugins.mediareceiverfetchplugin.OrcaMediaReceiverFetchPluginCallbacks;

/* loaded from: Premailbox.class */
public abstract class Premailbox {
    public MessengerSessionedMCPContext mAppContext;

    public Premailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this.mAppContext = messengerSessionedMCPContext;
    }

    private void OrcaMediaReceiverFetchPlugin_MediaReceiverFetchExecuteJNI(String str, OrcaMediaReceiverFetchPluginCallbacks.MediaReceiverFetchExecutionCallback mediaReceiverFetchExecutionCallback) {
        OrcaMediaReceiverFetchPlugin_MediaReceiverFetchExecute(str, mediaReceiverFetchExecutionCallback);
    }

    public abstract void OrcaMediaReceiverFetchPluginPremailboxExtensionsDestroy();

    public abstract void OrcaMediaReceiverFetchPlugin_MediaReceiverFetchExecute(String str, OrcaMediaReceiverFetchPluginCallbacks.MediaReceiverFetchExecutionCallback mediaReceiverFetchExecutionCallback);
}
