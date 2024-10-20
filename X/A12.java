package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$Reply;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: A12.class */
public final class A12 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ LoggingOption A03;
    public final /* synthetic */ MailboxSDK$Reply A04;
    public final /* synthetic */ 5P8 A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    public A12(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, MailboxSDK$Reply mailboxSDK$Reply, 5P8 r306, Number number, String str, String str2, String str3, String str4, String str5, int i) {
        this.A05 = r306;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A0B = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A07 = str5;
        this.A06 = number;
        this.A04 = mailboxSDK$Reply;
        this.A03 = loggingOption;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", 4YT.A00(1466), this.A00);
        C1qL c1qL = 5P8.A00;
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(c1qL, this.A02, mailbox);
        String A1D = 7zM.A1D(c1qL, 25);
        NotificationScope A00 = A1k.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 30);
        this.A01.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOOOOOOOO(7, mailbox, this.A0B, this.A0A, this.A08, this.A09, null, this.A07, null, this.A06, this.A04, this.A03, A00, listenForTaskCompletion);
    }
}
