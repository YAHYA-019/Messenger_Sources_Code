package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: A0z.class */
public final class A0z implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ 5P8 A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public A0z(MailboxFutureImpl mailboxFutureImpl, 5P8 r303, Number number, String str, String str2, String str3, String str4, int i, int i2) {
        this.A03 = r303;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = i2;
        this.A08 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A04 = number;
        this.A07 = str4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", 4YT.A00(1357), this.A00);
        String A1D = 7zM.A1D(5P8.A00, 61);
        NotificationScope A00 = A1k.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 33);
        this.A02.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVIOOOOOOOO(21, this.A01, mailbox, this.A08, this.A05, this.A06, this.A04, this.A07, null, A00);
    }
}
