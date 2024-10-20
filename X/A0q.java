package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.shim.mca.MailboxShimJNI;
import java.util.List;

/* loaded from: A0q.class */
public final class A0q implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ 5P5 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public A0q(MailboxFutureImpl mailboxFutureImpl, 5P5 r303, String str, List list, long j, long j2, boolean z) {
        this.A03 = r303;
        this.A02 = mailboxFutureImpl;
        this.A01 = j;
        this.A00 = j2;
        this.A05 = list;
        this.A04 = str;
        this.A06 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(5P5.A00, 0);
        NotificationScope A00 = A1j.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 21);
        this.A02.setNotification(A1D, A00);
        MailboxShimJNI.dispatchVJJOOOOZ(0, this.A01, this.A00, mailbox, this.A05, this.A04, A00, this.A06);
    }
}
