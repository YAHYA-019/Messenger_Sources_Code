package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$MentionsParams;
import com.facebook.sdk.mca.MailboxSDK$XMASendOptions;
import com.facebook.sdk.mca.MailboxSDK$XMASenderCopyOptions;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Ibq.class */
public final class Ibq implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ LoggingOption A04;
    public final /* synthetic */ MailboxSDK$MentionsParams A05;
    public final /* synthetic */ MailboxSDK$XMASendOptions A06;
    public final /* synthetic */ MailboxSDK$XMASenderCopyOptions A07;
    public final /* synthetic */ 5P8 A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public Ibq(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, MailboxSDK$MentionsParams mailboxSDK$MentionsParams, MailboxSDK$XMASendOptions mailboxSDK$XMASendOptions, MailboxSDK$XMASenderCopyOptions mailboxSDK$XMASenderCopyOptions, 5P8 r308, Number number, String str, String str2, String str3, int i, int i2) {
        this.A08 = r308;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A02 = mailboxFutureImpl2;
        this.A01 = i2;
        this.A0C = str;
        this.A0B = str2;
        this.A0A = str3;
        this.A09 = number;
        this.A06 = mailboxSDK$XMASendOptions;
        this.A07 = mailboxSDK$XMASenderCopyOptions;
        this.A04 = loggingOption;
        this.A05 = mailboxSDK$MentionsParams;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", 4YT.A00(1471), this.A00);
        C1qL c1qL = 5P8.A00;
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(c1qL, this.A03, mailbox);
        String A1D = 7zM.A1D(c1qL, 25);
        NotificationScope A00 = Ic4.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 12);
        this.A02.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVIOOOOOOOOOOOO(17, this.A01, mailbox, this.A0C, this.A0B, this.A0A, this.A09, this.A06, this.A07, this.A04, this.A05, null, A00, listenForTaskCompletion);
    }
}
