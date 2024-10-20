package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Cyf.class */
public final class Cyf implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1xC A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public Cyf(1xC r302, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, String str, String str2, int i) {
        this.A01 = r302;
        this.A02 = mailboxFutureImpl;
        this.A00 = i;
        this.A04 = number;
        this.A07 = str;
        this.A06 = str2;
        this.A03 = number2;
        this.A05 = number3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(1xC.A00, 57);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 0);
        this.A02.setNotification(A1D, A00);
        MailboxCoreJNI.dispatchVIOOOOOOO(26, this.A00, mailbox, this.A04, this.A07, this.A06, this.A03, this.A05, A00);
    }
}
