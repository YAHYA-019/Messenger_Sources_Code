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

/* loaded from: A16.class */
public final class A16 implements MailboxCallback {
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
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;

    public A16(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, MailboxSDK$MediaSendOptions mailboxSDK$MediaSendOptions, MailboxSDK$Reply mailboxSDK$Reply, 5P8 r307, Number number, Number number2, Number number3, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A06 = r307;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A0E = str;
        this.A0D = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A07 = number;
        this.A0F = str5;
        this.A08 = number2;
        this.A04 = mailboxSDK$MediaSendOptions;
        this.A09 = number3;
        this.A05 = mailboxSDK$Reply;
        this.A03 = loggingOption;
        this.A0C = str6;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", 4YT.A00(1462), this.A00);
        C1qL c1qL = 5P8.A00;
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(c1qL, this.A02, mailbox);
        String A1D = 7zM.A1D(c1qL, 25);
        NotificationScope A00 = A1k.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 29);
        this.A01.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOOOOOOOOOOO(5, mailbox, this.A0E, this.A0D, this.A0A, null, this.A0B, this.A07, this.A0F, this.A08, this.A04, this.A09, this.A05, this.A03, this.A0C, A00, listenForTaskCompletion);
    }
}
