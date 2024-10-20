package com.facebook.messenger.plugins.entityenrichmentplugin;

import X.0S2;
import X.11T;
import X.1BL;
import X.1Bi;
import X.9Dc;
import X.9FN;
import X.AQm;
import X.AnonymousClass536;
import X.C01i;
import X.C03i;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.AccountSession;
import java.io.File;

/* loaded from: EntityEnrichmentPluginPostmailbox.class */
public final class EntityEnrichmentPluginPostmailbox extends Postmailbox {
    public static final 9Dc Companion = new Object();
    public static final String DB_FILE_EXTENSION = "db";
    public static final String DB_FILE_NAME = "magical_messenger_entity_lookup";
    public final C01i localDbFilePath$delegate;
    public final MessengerSessionedMCPContext sessionedAppContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityEnrichmentPluginPostmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(accountSession, messengerSessionedMCPContext);
        1BL.A1F(accountSession, messengerSessionedMCPContext);
        this.sessionedAppContext = messengerSessionedMCPContext;
        this.localDbFilePath$delegate = AQm.A01(this, C03i.A02, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateLocalDbFilePath() {
        File file = AnonymousClass536.A04(AnonymousClass536.A0E, (AnonymousClass536) 1Bi.A03(49473), 0S2.A00).A01;
        file.mkdirs();
        String path = new File(file, "magical_messenger_entity_lookup.db").getPath();
        11T.A0A(path);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
    
        if (r301.sessionedAppContext.getMobileConfig().AZk(36326210620052828L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean getEnableEntityEnrichment() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext r0 = r0.sessionedAppContext
            r302 = r0
            r0 = r302
            X.1CO r0 = r0.getMobileConfig()
            r303 = r0
            r0 = 36326210619987291(0x810e7f000a555b, double:3.036180097764813E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L3b
            r0 = r301
            com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext r0 = r0.sessionedAppContext
            X.1CO r0 = r0.getMobileConfig()
            r303 = r0
            r0 = 36326210620052828(0x810e7f000b555c, double:3.036180097806259E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
            r0 = r307
            if (r0 == 0) goto L3e
        L3b:
            r0 = 1
            r306 = r0
        L3e:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.plugins.entityenrichmentplugin.EntityEnrichmentPluginPostmailbox.getEnableEntityEnrichment():boolean");
    }

    private final String getLocalDbFilePath() {
        return (String) this.localDbFilePath$delegate.getValue();
    }

    @Override // com.facebook.messenger.plugins.entityenrichmentplugin.Postmailbox
    public String EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateDbFilePath() {
        if (getEnableEntityEnrichment()) {
            return getLocalDbFilePath();
        }
        return null;
    }

    @Override // com.facebook.messenger.plugins.entityenrichmentplugin.Postmailbox
    public String EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyCreateRemoteDbFilePath() {
        if (getEnableEntityEnrichment()) {
            return 9FN.A00.A00.A02;
        }
        return null;
    }

    @Override // com.facebook.messenger.plugins.entityenrichmentplugin.Postmailbox
    public void EntityEnrichmentAppProxyAndroidImpl_EntityEnrichmentAppProxyInitializeMantle() {
    }
}
