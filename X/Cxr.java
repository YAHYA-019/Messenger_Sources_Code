package X;

import com.facebook.memberrequests.mca.MailboxMemberRequestsJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: Cxr.class */
public final class Cxr implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6qk A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public Cxr(C6qk c6qk, MailboxFutureImpl mailboxFutureImpl, List list, long j, boolean z) {
        this.A01 = c6qk;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = list;
        this.A04 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(C6qk.A00, 2);
        NotificationScope CcE = mailbox.getSessionedNotificationCenterCallbackManager().CcE(new Czo(A1D, this, 8), A1D, 1);
        this.A02.setNotification(A1D, CcE);
        MailboxMemberRequestsJNI.dispatchVJOOOZ(1, this.A00, mailbox, this.A03, CcE, this.A04);
    }
}
