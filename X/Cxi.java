package X;

import com.facebook.memberrequests.mca.MailboxMemberRequestsJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Cxi.class */
public final class Cxi implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6qk A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ boolean A03;

    public Cxi(C6qk c6qk, MailboxFutureImpl mailboxFutureImpl, long j, boolean z) {
        this.A01 = c6qk;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(C6qk.A00, 0);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 7);
        this.A02.setNotification(A1D, A00);
        MailboxMemberRequestsJNI.dispatchVJOOZ(0, this.A00, mailbox, A00, this.A03);
    }
}
