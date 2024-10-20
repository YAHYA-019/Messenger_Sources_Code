package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.nativepagereply.analytics.BusinessInboxMessagingUserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.2ie, reason: invalid class name */
/* loaded from: 2ie.class */
public final class C2ie {
    public final C00i A00 = new 1BQ(16627);
    public final C00i A02 = new 1BQ(17079);
    public final C00i A01 = new 1BQ(17080);
    public final C00i A03 = new 1BQ(33013);
    public final C00i A04 = new 1BV(68481);

    public void A00(FbUserSession fbUserSession, String str) {
        1PE r0 = (1PE) this.A00.get();
        if (r0.A00 != 0) {
            ((UserFlowLogger) r0.A03.get()).flowEndFail(r0.A00, "thread_list_load_failure", str);
            1PE.A01(r0, "inbox_load_failure");
            r0.A00 = 0L;
        }
        ((C3RE) this.A04.get()).A01(fbUserSession, 1BK.A0R(this.A03).A3a(C1f0.A02, ""), "thread_list_load_failure", str);
    }

    public void A01(FbUserSession fbUserSession, String str) {
        ((1PE) this.A00.get()).A02(str);
        BusinessInboxMessagingUserFlowLogger businessInboxMessagingUserFlowLogger = (BusinessInboxMessagingUserFlowLogger) this.A02.get();
        if (((Boolean) 1Bn.A0A(33058)).booleanValue() && !businessInboxMessagingUserFlowLogger.A02 && !businessInboxMessagingUserFlowLogger.A03 && businessInboxMessagingUserFlowLogger.A00 == 0) {
            BusinessInboxMessagingUserFlowLogger.A00(fbUserSession, businessInboxMessagingUserFlowLogger, "inbox_load", 531052693);
            businessInboxMessagingUserFlowLogger.A02 = true;
        }
        C2ig c2ig = (C2ig) this.A01.get();
        1UG A00 = 1UD.A00((04J) c2ig.A02.get(), 1ZG.A01, "messenger_business_app_redirect_messenger_inbox_loaded");
        if (c2ig.A00 != null && C2ig.A00(c2ig) && A00.isSampled()) {
            A00.A7R("entry_point", c2ig.A01);
            A00.A7R("page_id", c2ig.A00);
            A00.A6J("extra_data", (java.util.Map) null);
            A00.BZL();
        }
        c2ig.A00 = null;
        c2ig.A01 = null;
    }
}
