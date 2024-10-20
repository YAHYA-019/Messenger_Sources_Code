package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;
import java.util.List;

/* loaded from: Cyq.class */
public final class Cyq implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ 5Xd A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public Cyq(MailboxFutureImpl mailboxFutureImpl, 5Xd r303, Number number, Number number2, Number number3, String str, List list, boolean z, boolean z2) {
        this.A01 = r303;
        this.A00 = mailboxFutureImpl;
        this.A03 = number;
        this.A04 = number2;
        this.A02 = number3;
        this.A06 = list;
        this.A05 = str;
        this.A07 = z;
        this.A08 = z2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(5Xd.A00, 8);
        NotificationScope A00 = Czn.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 10);
        this.A00.setNotification(A1D, A00);
        MailboxSecureMessageJNI.dispatchVOOOOOOOZZ(12, mailbox, this.A03, this.A04, this.A02, this.A06, this.A05, A00, this.A07, this.A08);
    }
}
