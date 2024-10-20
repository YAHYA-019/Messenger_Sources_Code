package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$SendTextMessageOptionalParams;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cyk.class */
public final class Cyk implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ LoggingOption A03;
    public final /* synthetic */ MailboxSDK$SendTextMessageOptionalParams A04;
    public final /* synthetic */ 5P8 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public Cyk(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, MailboxSDK$SendTextMessageOptionalParams mailboxSDK$SendTextMessageOptionalParams, 5P8 r306, String str, String str2, int i) {
        this.A05 = r306;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = mailboxSDK$SendTextMessageOptionalParams;
        this.A03 = loggingOption;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        C1qL A0r = AbF.A0r(4YT.A00(1474), this.A00);
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(A0r, this.A02, mailbox);
        String A1D = 7zM.A1D(A0r, 26);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 43);
        this.A01.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOO(67, mailbox, this.A07, this.A06, this.A04, this.A03, A00, listenForTaskCompletion);
    }
}
