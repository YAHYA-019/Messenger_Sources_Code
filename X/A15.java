package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$MediaSendOptions;
import com.facebook.sdk.mca.MailboxSDK$Reply;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: A15.class */
public final class A15 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ LoggingOption A03;
    public final /* synthetic */ MailboxSDK$MediaSendOptions A04;
    public final /* synthetic */ MailboxSDK$Reply A05;
    public final /* synthetic */ 5P8 A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;

    public A15(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, MailboxSDK$MediaSendOptions mailboxSDK$MediaSendOptions, MailboxSDK$Reply mailboxSDK$Reply, 5P8 r307, Number number, Number number2, Number number3, Number number4, String str, String str2, String str3, String str4, int i) {
        this.A06 = r307;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A0E = str;
        this.A0D = str2;
        this.A0A = number;
        this.A0C = str3;
        this.A09 = number2;
        this.A07 = number3;
        this.A08 = number4;
        this.A05 = mailboxSDK$Reply;
        this.A04 = mailboxSDK$MediaSendOptions;
        this.A03 = loggingOption;
        this.A0B = str4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", 4YT.A00(1472), this.A00);
        C1qL c1qL = 5P8.A00;
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(c1qL, this.A02, mailbox);
        String A1D = 7zM.A1D(c1qL, 25);
        NotificationScope A00 = A1k.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 31);
        this.A01.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOOOOOOOOOOOOO(11, mailbox, this.A0E, this.A0D, this.A0A, this.A0C, this.A09, null, null, this.A07, this.A08, this.A05, this.A04, this.A03, null, this.A0B, null, A00, listenForTaskCompletion);
    }
}
