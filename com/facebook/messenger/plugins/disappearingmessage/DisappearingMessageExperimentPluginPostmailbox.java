package com.facebook.messenger.plugins.disappearingmessage;

import X.0fH;
import X.1BL;
import X.1CO;
import X.1GD;
import X.AnonymousClass001;
import X.HJJ;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.AccountSession;

/* loaded from: DisappearingMessageExperimentPluginPostmailbox.class */
public final class DisappearingMessageExperimentPluginPostmailbox extends Postmailbox {
    public static final HJJ Companion = new Object();
    public static final long EPHEMERALITY_TYPE_SEND_BASED = 1;
    public static final String TAG = "DisappearingMessageExperimentPluginPostmailbox";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisappearingMessageExperimentPluginPostmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(accountSession, messengerSessionedMCPContext);
        1BL.A1F(accountSession, messengerSessionedMCPContext);
    }

    @Override // com.facebook.messenger.plugins.disappearingmessage.Postmailbox
    public boolean TamDisappearingMessageExperimentConfigProviderPostmailboxImpl_TamIsDisappearingMessageOccamSupportEnabled(boolean z, boolean z2) {
        1CO mobileConfig = this.mAppContext.getMobileConfig();
        0fH.A0j(TAG, "[Occam][DM] querying app-layer mc for IsOccamSupportEnabled");
        return mobileConfig.AZr(z2 ? 1GD.A06 : 1GD.A07, 36322310789088637L);
    }

    @Override // com.facebook.messenger.plugins.disappearingmessage.Postmailbox
    public boolean TamDisappearingMessageExperimentConfigProviderPostmailboxImpl_TamIsSendBasedDisappearingMessageEnabled(boolean z, boolean z2) {
        1CO mobileConfig = this.mAppContext.getMobileConfig();
        0fH.A0j(TAG, "[DM] querying app-layer mc for IsSendBasedEnabled");
        return AnonymousClass001.A1O((mobileConfig.Av9(z2 ? 1GD.A06 : 1GD.A07, 36596986834259278L) > 1L ? 1 : (mobileConfig.Av9(z2 ? 1GD.A06 : 1GD.A07, 36596986834259278L) == 1L ? 0 : -1)));
    }
}
