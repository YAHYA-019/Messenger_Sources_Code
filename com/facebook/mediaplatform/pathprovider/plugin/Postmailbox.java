package com.facebook.mediaplatform.pathprovider.plugin;

import com.facebook.msys.mci.AccountSession;

/* loaded from: Postmailbox.class */
public abstract class Postmailbox {
    public AccountSession mPluginContext;

    public Postmailbox(AccountSession accountSession) {
        this.mPluginContext = accountSession;
    }

    private String ACTAttachmentPathProviderImpl_ACTAttachmentPathCreateFromSeedJNI(String str) {
        return ACTAttachmentPathProviderImpl_ACTAttachmentPathCreateFromSeed(str);
    }

    public abstract String ACTAttachmentPathProviderImpl_ACTAttachmentPathCreateFromSeed(String str);

    public abstract void AttachmentPathPluginExtensionsDestroy();
}
