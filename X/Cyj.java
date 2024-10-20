package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cyj.class */
public final class Cyj implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ 5P8 A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public Cyj(MailboxFutureImpl mailboxFutureImpl, 5P8 r303, Number number, Number number2, String str, int i, boolean z, boolean z2) {
        this.A02 = r303;
        this.A00 = i;
        this.A01 = mailboxFutureImpl;
        this.A05 = str;
        this.A03 = number;
        this.A04 = number2;
        this.A06 = z;
        this.A07 = z2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(AbF.A0r(4YT.A00(1544), this.A00), 33);
        this.A01.setNotification(A1D, Czn.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 8));
        MailboxSDKJNI.dispatchVOOOOZZ(19, mailbox, this.A05, this.A03, this.A04, this.A06, this.A07);
    }
}
