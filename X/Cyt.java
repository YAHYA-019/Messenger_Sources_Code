package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.Attachment;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cyt.class */
public final class Cyt implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Attachment A03;
    public final /* synthetic */ 5P8 A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    public Cyt(MailboxFutureImpl mailboxFutureImpl, Attachment attachment, 5P8 r304, Number number, Number number2, String str, String str2, String str3, String str4, String str5, int i, long j) {
        this.A04 = r304;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = j;
        this.A03 = attachment;
        this.A0A = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A08 = str4;
        this.A06 = number;
        this.A05 = number2;
        this.A07 = str5;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(AbF.A0r(4YT.A00(1467), this.A00), 26);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 42);
        this.A02.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVJOOOOOOOOOO(63, this.A01, mailbox, this.A03, this.A0A, this.A0B, this.A09, this.A08, this.A06, this.A05, this.A07, A00);
    }
}
