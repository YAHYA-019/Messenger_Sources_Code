package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.3ay, reason: invalid class name */
/* loaded from: 3ay.class */
public final class C3ay implements MailboxCallback {
    public final /* synthetic */ 1xC A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;

    public C3ay(1xC r302, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, Number number5, Number number6) {
        this.A00 = r302;
        this.A01 = mailboxFutureImpl;
        this.A07 = number;
        this.A06 = number2;
        this.A04 = number3;
        this.A05 = number4;
        this.A03 = number5;
        this.A02 = number6;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String str = (String) 1xC.A00.A00(28);
        NotificationScope A00 = mailbox.getSessionedNotificationCenterCallbackManager().A00(new Czo(str, this, 5), str);
        this.A01.setNotification(str, A00);
        MailboxCoreJNI.dispatchVOOOOOOOOZZ(48, mailbox, this.A07, this.A06, this.A04, this.A05, this.A03, this.A02, A00, true, false);
    }
}
