package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.orca.mca.MailboxOrcaJNI;
import java.util.List;

/* loaded from: Cym.class */
public final class Cym implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ 22B A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public Cym(MailboxFutureImpl mailboxFutureImpl, 22B r303, String str, String str2, List list, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = r303;
        this.A00 = i;
        this.A01 = mailboxFutureImpl;
        this.A04 = str;
        this.A05 = list;
        this.A03 = str2;
        this.A08 = z;
        this.A06 = z2;
        this.A07 = z3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxOrca", "ensureAndLoadThreadForParticipants", this.A00);
        String A1D = 7zM.A1D(22B.A00, 1);
        NotificationScope CcE = mailbox.getSessionedNotificationCenterCallbackManager().CcE(new Czn(this, 7), A1D, 1);
        this.A01.setNotification(A1D, CcE);
        MailboxOrcaJNI.dispatchVOOOOOOZZZZZ(1, mailbox, this.A04, null, this.A05, this.A03, CcE, true, false, this.A08, this.A06, this.A07);
    }
}
