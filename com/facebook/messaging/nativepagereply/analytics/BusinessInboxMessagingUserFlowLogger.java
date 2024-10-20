package com.facebook.messaging.nativepagereply.analytics;

import X.1BQ;
import X.1Bn;
import X.1G1;
import X.C00i;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: BusinessInboxMessagingUserFlowLogger.class */
public final class BusinessInboxMessagingUserFlowLogger {
    public final C00i A04 = new 1BQ(16705);
    public long A00 = 0;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A01 = false;

    public static void A00(FbUserSession fbUserSession, BusinessInboxMessagingUserFlowLogger businessInboxMessagingUserFlowLogger, String str, int i) {
        String str2;
        C00i c00i = businessInboxMessagingUserFlowLogger.A04;
        businessInboxMessagingUserFlowLogger.A00 = ((UserFlowLogger) c00i.get()).generateNewFlowId(i);
        String str3 = null;
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, false);
        userFlowConfig.mTtlMs = 600000L;
        ((UserFlowLogger) c00i.get()).flowStart(businessInboxMessagingUserFlowLogger.A00, userFlowConfig);
        ViewerContext viewerContext = (ViewerContext) 1Bn.A0A(33059);
        if (viewerContext != null && (str2 = viewerContext.mUserId) != null) {
            ((UserFlowLogger) c00i.get()).flowAnnotate(businessInboxMessagingUserFlowLogger.A00, "admin_id", str2);
        }
        1G1 r0 = (1G1) fbUserSession;
        if (!r0.A07) {
            str3 = r0.A02;
        }
        if (!((Boolean) 1Bn.A0A(33058)).booleanValue() || str3 == null) {
            return;
        }
        ((UserFlowLogger) c00i.get()).flowAnnotate(businessInboxMessagingUserFlowLogger.A00, "page_id", str3);
    }
}
