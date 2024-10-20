package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cyp.class */
public final class Cyp implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ LoggingOption A02;
    public final /* synthetic */ 5P8 A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public Cyp(MailboxFutureImpl mailboxFutureImpl, LoggingOption loggingOption, 5P8 r304, Number number, Number number2, String str, String str2, String str3, int i) {
        this.A03 = r304;
        this.A00 = i;
        this.A01 = mailboxFutureImpl;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A04 = number;
        this.A02 = loggingOption;
        this.A05 = number2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(AbF.A0r(4YT.A00(1405), this.A00), 27);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 37);
        this.A01.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOOO(53, mailbox, this.A08, this.A07, this.A06, this.A04, this.A02, this.A05, A00);
    }
}
