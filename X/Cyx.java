package X;

import android.net.Uri;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$MediaSendOptions;
import com.facebook.sdk.mca.MailboxSDK$Reply;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cyx.class */
public final class Cyx implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ LoggingOption A04;
    public final /* synthetic */ MailboxSDK$MediaSendOptions A05;
    public final /* synthetic */ MailboxSDK$Reply A06;
    public final /* synthetic */ 5P8 A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;

    public Cyx(Uri uri, MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, MailboxSDK$MediaSendOptions mailboxSDK$MediaSendOptions, MailboxSDK$Reply mailboxSDK$Reply, 5P8 r308, Number number, Number number2, Number number3, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A07 = r308;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A02 = mailboxFutureImpl2;
        this.A0G = str;
        this.A0F = str2;
        this.A01 = uri;
        this.A08 = number;
        this.A0D = str3;
        this.A0E = str4;
        this.A09 = number2;
        this.A0A = number3;
        this.A06 = mailboxSDK$Reply;
        this.A05 = mailboxSDK$MediaSendOptions;
        this.A04 = loggingOption;
        this.A0B = str5;
        this.A0C = str6;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        C1qL A0r = AbF.A0r(4YT.A00(1464), this.A00);
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(A0r, this.A03, mailbox);
        String A1D = 7zM.A1D(A0r, 25);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 23);
        this.A02.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOOOOOOOOOOOO(9, mailbox, this.A0G, this.A0F, this.A01, this.A08, this.A0D, this.A0E, this.A09, this.A0A, this.A06, this.A05, this.A04, null, this.A0B, this.A0C, A00, listenForTaskCompletion);
    }
}
