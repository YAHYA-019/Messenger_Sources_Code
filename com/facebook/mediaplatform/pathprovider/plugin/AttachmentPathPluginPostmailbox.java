package com.facebook.mediaplatform.pathprovider.plugin;

import X.0Pz;
import X.0fH;
import X.11T;
import X.C7uM;
import X.HHi;
import com.facebook.msys.mci.AccountSession;

/* loaded from: AttachmentPathPluginPostmailbox.class */
public final class AttachmentPathPluginPostmailbox extends Postmailbox {
    public static final HHi Companion = new Object();
    public static final String TAG = "[MP] AttachmentPathPluginPostmailbox";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentPathPluginPostmailbox(AccountSession accountSession) {
        super(accountSession);
        11T.A0F(accountSession, 1);
    }

    @Override // com.facebook.mediaplatform.pathprovider.plugin.Postmailbox
    public String ACTAttachmentPathProviderImpl_ACTAttachmentPathCreateFromSeed(String str) {
        11T.A0F(str, 0);
        String A01 = C7uM.A01(str);
        0fH.A0j(TAG, 0Pz.A0v("ACTAttachmentPathCreateFromSeed path: ", A01, ", seed: ", str));
        return A01;
    }

    @Override // com.facebook.mediaplatform.pathprovider.plugin.Postmailbox
    public void AttachmentPathPluginExtensionsDestroy() {
    }
}
