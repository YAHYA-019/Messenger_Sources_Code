package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: Ibf.class */
public final class Ibf implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ 22C A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    public Ibf(MailboxFutureImpl mailboxFutureImpl, 22C r303, List list, List list2, List list3, int i, long j, long j2) {
        this.A04 = r303;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = list;
        this.A06 = list2;
        this.A07 = list3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxTam", "runTamClientPollUpdate", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        Ic0 A00 = Ic0.A00(this, ActionId.PRIVACY_VIOLATION);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxTam", "TamClientPollUpdate", A00);
    }
}
