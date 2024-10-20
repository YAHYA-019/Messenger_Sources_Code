package com.facebook.msys.mca;

import X.02W;
import X.1Uj;
import X.1Vt;
import X.1W5;
import X.5QF;
import X.AYU;
import X.C1qL;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;

/* loaded from: MailboxFeature.class */
public abstract class MailboxFeature {
    public static final MailboxFeature $redex_init_class = null;
    public final AYU mMailboxApiHandleMetaProvider;

    /* loaded from: MailboxFeature$DbConnectionResolutionCallback.class */
    public interface DbConnectionResolutionCallback {
        Object run(Mailbox mailbox, SqliteHolder sqliteHolder);
    }

    static {
        1Vt.A00();
    }

    public MailboxFeature(AYU ayu) {
        this.mMailboxApiHandleMetaProvider = ayu;
    }

    public static final Object getNonNullNotificationValue(C1qL c1qL, Map map, String str, int i) {
        Object A00 = c1qL.A00(i);
        Object obj = map.get(A00);
        02W.A01(obj, "Failed to find required key '%s' in payload for notification '%s'. Make sure that your header annotations (MAILBOX_NOTIFICATION_CONTAINS_KEY or MAILBOX_NOTIFICATION_MAY_CONTAIN_KEY) match the behavior of your Mailbox API function.", new Object[]{A00, str});
        return obj;
    }

    public static final NotificationScope listenForTaskCompletion(C1qL c1qL, MailboxFutureImpl mailboxFutureImpl, 1W5 r303) {
        NotificationScope CcE = r303.getSessionedNotificationCenterCallbackManager().CcE(new 5QF(mailboxFutureImpl), "MCATaskCompletionNotification", 1);
        mailboxFutureImpl.setNotification("MCATaskCompletionNotification", CcE);
        return CcE;
    }

    public static final native void safeDispatchToDbConnectionAndResolve(Mailbox mailbox, MailboxFutureImpl mailboxFutureImpl, Object obj, int i, int i2, NotificationScope notificationScope, PrivacyContext privacyContext, String str, String str2, DbConnectionResolutionCallback dbConnectionResolutionCallback);

    public static final void safeDispatchToDbConnectionAndResolve(Mailbox mailbox, MailboxFutureImpl mailboxFutureImpl, Object obj, int i, int i2, String str, String str2, DbConnectionResolutionCallback dbConnectionResolutionCallback) {
        safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj, i, i2, null, null, str, str2, dbConnectionResolutionCallback);
    }

    public final 1Uj getMailboxProvider() {
        1Uj r0 = this.mMailboxApiHandleMetaProvider;
        if (r0 instanceof 1Uj) {
            return r0;
        }
        return null;
    }
}
