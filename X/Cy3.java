package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cy3.class */
public final class Cy3 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ 5P8 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public Cy3(MailboxFutureImpl mailboxFutureImpl, 5P8 r303, String str, int i, boolean z) {
        this.A02 = r303;
        this.A00 = i;
        this.A01 = mailboxFutureImpl;
        this.A03 = str;
        this.A04 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(AbF.A0r(4YT.A00(1482), this.A00), 28);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 50);
        this.A01.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOZ(87, mailbox, this.A03, A00, this.A04);
    }
}
