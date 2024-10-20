package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$Reply;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cyo.class */
public final class Cyo implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ LoggingOption A04;
    public final /* synthetic */ MailboxSDK$Reply A05;
    public final /* synthetic */ 5P8 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public Cyo(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, MailboxSDK$Reply mailboxSDK$Reply, 5P8 r306, String str, String str2, int i, int i2) {
        this.A06 = r306;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A02 = mailboxFutureImpl2;
        this.A01 = i2;
        this.A08 = str;
        this.A07 = str2;
        this.A05 = mailboxSDK$Reply;
        this.A04 = loggingOption;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        C1qL A0r = AbF.A0r(4YT.A00(1468), this.A00);
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(A0r, this.A03, mailbox);
        String A1D = 7zM.A1D(A0r, 25);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 24);
        this.A02.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVIOOOOOOO(15, this.A01, mailbox, this.A08, this.A07, this.A05, this.A04, A00, listenForTaskCompletion);
    }
}
