package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;
import java.util.List;

/* loaded from: N7a.class */
public final class N7a implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ 5Xd A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ java.util.Map A09;

    public N7a(MailboxFutureImpl mailboxFutureImpl, 5Xd r303, Number number, Number number2, Number number3, String str, String str2, String str3, List list, java.util.Map map) {
        this.A01 = r303;
        this.A00 = mailboxFutureImpl;
        this.A03 = number;
        this.A04 = number2;
        this.A02 = number3;
        this.A07 = str;
        this.A08 = list;
        this.A06 = str2;
        this.A05 = str3;
        this.A09 = map;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(5Xd.A00, 20);
        NotificationScope A00 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 27);
        this.A00.setNotification(A1D, A00);
        MailboxSecureMessageJNI.dispatchVOOOOOOOOOO(10, mailbox, this.A03, this.A04, this.A02, this.A07, this.A08, this.A06, this.A05, this.A09, A00);
    }
}
