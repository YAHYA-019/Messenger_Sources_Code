package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.reportingsdk.mca.MailboxReportingSDKJNI;

/* loaded from: Cyd.class */
public final class Cyd implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ BDY A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ java.util.Map A06;

    public Cyd(MailboxFutureImpl mailboxFutureImpl, BDY bdy, String str, String str2, java.util.Map map, int i, long j) {
        this.A03 = bdy;
        this.A02 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = map;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(BDY.A00, 11);
        NotificationScope CcE = mailbox.getSessionedNotificationCenterCallbackManager().CcE(new Czo(A1D, this, 15), A1D, 1);
        this.A02.setNotification(A1D, CcE);
        MailboxReportingSDKJNI.dispatchVIJOOOOOO(1, this.A00, this.A01, mailbox, null, this.A04, this.A05, this.A06, CcE);
    }
}
