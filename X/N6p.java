package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N6p.class */
public final class N6p implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ C5gc A01;
    public final /* synthetic */ boolean A02;

    public N6p(MailboxFutureImpl mailboxFutureImpl, C5gc c5gc, boolean z) {
        this.A01 = c5gc;
        this.A00 = mailboxFutureImpl;
        this.A02 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A00, false, 0, 1, "MCAMailboxPushNotifications", "OptimisticallyUpdateBackgroundAccountNotifEnabledV2", N85.A00(this, 77));
    }
}
