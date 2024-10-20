package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;

/* loaded from: N7j.class */
public final class N7j implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ 5Xd A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    public N7j(MailboxFutureImpl mailboxFutureImpl, 5Xd r303, Boolean bool, Number number, Number number2, Number number3, Number number4, Number number5, String str, String str2, String str3, String str4) {
        this.A01 = r303;
        this.A00 = mailboxFutureImpl;
        this.A06 = number;
        this.A04 = number2;
        this.A07 = number3;
        this.A0B = str;
        this.A05 = number4;
        this.A0A = str2;
        this.A09 = str3;
        this.A08 = str4;
        this.A03 = number5;
        this.A02 = bool;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(5Xd.A00, 21);
        NotificationScope A00 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 25);
        this.A00.setNotification(A1D, A00);
        MailboxSecureMessageJNI.dispatchVOOOOOOOOOOOO(7, mailbox, this.A06, this.A04, this.A07, this.A0B, this.A05, this.A0A, this.A09, this.A08, this.A03, this.A02, A00);
    }
}
