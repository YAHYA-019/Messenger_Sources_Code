package com.facebook.messenger.plugins.mediauploadfailurenotifier;

import X.11T;
import X.1BL;
import X.1Bi;
import X.22B;
import X.2FP;
import X.C3e7;
import X.GOo;
import X.In7;
import com.facebook.inject.FbInjector;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import java.util.concurrent.Executor;

/* loaded from: OrcaMediaUploadFailureNotifierPluginPostmailbox.class */
public final class OrcaMediaUploadFailureNotifierPluginPostmailbox extends Postmailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrcaMediaUploadFailureNotifierPluginPostmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(accountSession, messengerSessionedMCPContext);
        1BL.A1F(accountSession, messengerSessionedMCPContext);
    }

    @Override // com.facebook.messenger.plugins.mediauploadfailurenotifier.Postmailbox
    public void OrcaMediaUploadFailurePushNotificationIssuer_MsysMediaUploadFailureNotifierNotify(String str) {
        11T.A0F(str, 0);
        Executor executor = (Executor) 1Bi.A03(16449);
        MailboxFutureImpl A03 = ((22B) GOo.A0n(FbInjector.A03, this.mAppContext.fbUserSession, 84153)).A03((Number) null, str);
        11T.A0F(A03, 0);
        2FP.A00(new In7(str, this, 1), new C3e7(A03), executor);
    }
}
