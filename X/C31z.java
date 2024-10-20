package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;

/* renamed from: X.31z, reason: invalid class name */
/* loaded from: 31z.class */
public final class C31z implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ 22C A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C31z(MailboxFutureImpl mailboxFutureImpl, 22C r303, String str, int i, int i2, long j, boolean z, boolean z2) {
        this.A04 = r303;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = i2;
        this.A02 = j;
        this.A05 = str;
        this.A07 = z;
        this.A06 = z2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxTam", "mCATamAttachmentManagerResolveContentToken", this.A00);
        String str = (String) 22C.A00.A00(37);
        NotificationScope A00 = mailbox.getSessionedNotificationCenterCallbackManager().A00(new Czo(str, this, 60), str);
        this.A03.setNotification(str, A00);
        MailboxTamJNI.dispatchVIJOOOOZZ(6, this.A01, this.A02, mailbox, this.A05, null, A00, this.A07, this.A06);
    }
}
