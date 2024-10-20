package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Cyr.class */
public final class Cyr implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ 1xC A04;
    public final /* synthetic */ MailboxFutureImpl A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public Cyr(1xC r302, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, String str3, int i, long j, long j2, long j3, boolean z) {
        this.A04 = r302;
        this.A05 = mailboxFutureImpl;
        this.A00 = i;
        this.A03 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = number;
        this.A09 = str3;
        this.A0A = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(1xC.A00, 44);
        NotificationScope A00 = Czn.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 3);
        this.A05.setNotification(A1D, A00);
        MailboxCoreJNI.dispatchVIJJJOOOOOOOZ(20, this.A00, this.A03, this.A01, this.A02, mailbox, this.A08, this.A07, this.A06, this.A09, null, A00, this.A0A);
    }
}
