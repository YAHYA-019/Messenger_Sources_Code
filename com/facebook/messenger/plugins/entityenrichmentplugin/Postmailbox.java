package com.facebook.messenger.plugins.entityenrichmentplugin;

import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.AccountSession;

/* loaded from: Postmailbox.class */
public abstract class Postmailbox {
    public MessengerSessionedMCPContext mAppContext;
    public AccountSession mPluginContext;

    public Postmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this.mPluginContext = accountSession;
        this.mAppContext = messengerSessionedMCPContext;
    }

    private String EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateDbFilePathJNI() {
        String EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateDbFilePath = EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateDbFilePath();
        if (EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateDbFilePath == null) {
            EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateDbFilePath = null;
        }
        return EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateDbFilePath;
    }

    private String EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateRemoteDbFilePathJNI() {
        String EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateRemoteDbFilePath = EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateRemoteDbFilePath();
        if (EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateRemoteDbFilePath == null) {
            EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateRemoteDbFilePath = null;
        }
        return EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateRemoteDbFilePath;
    }

    private void EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyInitializeMantleJNI() {
    }

    public abstract String EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateDbFilePath();

    public abstract String EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateRemoteDbFilePath();

    public abstract void EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyInitializeMantle();

    public void EntityEnrichmentPluginExtensionsDestroy() {
        this.mPluginContext = null;
    }
}
