package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Ibe.class */
public final class Ibe implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ LoggingOption A03;
    public final /* synthetic */ 5P8 A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public Ibe(MailboxFutureImpl mailboxFutureImpl, LoggingOption loggingOption, 5P8 r304, Number number, String str, String str2, int i, long j) {
        this.A04 = r304;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = j;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = number;
        this.A03 = loggingOption;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", "reactToMessage", this.A00);
        String A1D = 7zM.A1D(5P8.A00, 27);
        NotificationScope A00 = Ic4.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 17);
        this.A02.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVJOOOOOOOO(52, this.A01, mailbox, this.A07, this.A06, this.A05, null, this.A03, null, A00);
    }
}
