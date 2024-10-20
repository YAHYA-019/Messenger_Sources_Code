package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cys.class */
public final class Cys implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ LoggingOption A03;
    public final /* synthetic */ 5P8 A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ byte[] A0B;

    public Cys(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, 5P8 r305, Number number, String str, String str2, String str3, String str4, byte[] bArr, int i, boolean z) {
        this.A04 = r305;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A06 = str;
        this.A09 = str2;
        this.A07 = str3;
        this.A05 = number;
        this.A0B = bArr;
        this.A03 = loggingOption;
        this.A08 = str4;
        this.A0A = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        C1qL A0r = AbF.A0r(4YT.A00(1127), this.A00);
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(A0r, this.A02, mailbox);
        String A1D = 7zM.A1D(A0r, 11);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 36);
        this.A01.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOOOOOOOOZ(50, mailbox, this.A06, this.A09, this.A07, null, this.A05, this.A0B, null, null, this.A03, this.A08, A00, listenForTaskCompletion, this.A0A);
    }
}
