package X;

import com.facebook.forwarding.mca.MailboxForwardingJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;

/* loaded from: N7h.class */
public final class N7h implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ MWu A05;
    public final /* synthetic */ MailboxFutureImpl A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    public N7h(MWu mWu, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, String str3, String str4, int i, int i2, long j, long j2, long j3) {
        this.A05 = mWu;
        this.A06 = mailboxFutureImpl;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A04 = j2;
        this.A02 = j3;
        this.A08 = str;
        this.A0A = str2;
        this.A09 = str3;
        this.A07 = number;
        this.A0B = str4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(MWu.A00, 3);
        NotificationScope A00 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 3);
        this.A06.setNotification(A1D, A00);
        MailboxForwardingJNI.dispatchVIIIJJJOOOOOOOOOOOOOZ(0, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE, this.A01, this.A00, this.A03, this.A04, this.A02, mailbox, this.A08, this.A0A, null, null, null, this.A09, null, null, null, this.A07, this.A0B, A00, false);
    }
}
