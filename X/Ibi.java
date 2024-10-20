package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Ibi.class */
public final class Ibi implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ LoggingOption A02;
    public final /* synthetic */ 5P8 A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public Ibi(MailboxFutureImpl mailboxFutureImpl, LoggingOption loggingOption, 5P8 r304, Number number, String str, String str2, String str3, String str4, int i) {
        this.A03 = r304;
        this.A00 = i;
        this.A01 = mailboxFutureImpl;
        this.A05 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A04 = number;
        this.A02 = loggingOption;
        this.A07 = str4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", "forwardGroupWithThreadIdentifier", this.A00);
        String A1D = 7zM.A1D(5P8.A00, 11);
        NotificationScope A00 = Ic4.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 16);
        this.A01.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOOOOZ(51, mailbox, this.A05, this.A08, this.A06, this.A04, this.A02, this.A07, null, A00, false);
    }
}
