package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.Attachment;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cyv.class */
public final class Cyv implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Attachment A04;
    public final /* synthetic */ 5P8 A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ boolean A0E;

    public Cyv(MailboxFutureImpl mailboxFutureImpl, Attachment attachment, 5P8 r304, Number number, Number number2, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, long j, boolean z) {
        this.A05 = r304;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = i2;
        this.A02 = j;
        this.A04 = attachment;
        this.A0C = str;
        this.A0B = str2;
        this.A0A = str3;
        this.A07 = number;
        this.A09 = str4;
        this.A0D = str5;
        this.A06 = number2;
        this.A08 = str6;
        this.A0E = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(AbF.A0r(4YT.A00(1463), this.A00), 26);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 40);
        this.A03.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVIJOOOOOOOOOOOOOZZ(61, this.A01, this.A02, mailbox, this.A04, this.A0C, this.A0B, this.A0A, this.A07, null, this.A09, this.A0D, this.A06, this.A08, null, A00, true, this.A0E);
    }
}
