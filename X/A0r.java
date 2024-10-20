package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: A0r.class */
public final class A0r implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ MailboxFutureImpl A05;
    public final /* synthetic */ 22C A06;

    public A0r(MailboxFutureImpl mailboxFutureImpl, 22C r303, int i, int i2, long j, long j2, long j3) {
        this.A06 = r303;
        this.A00 = i;
        this.A05 = mailboxFutureImpl;
        this.A01 = i2;
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxTam", "runTamClientAttachmentGetCountInRange", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A05;
        MailboxNullable A0T = 1BL.A0T();
        A1g A01 = A1g.A01(this, ActionId.APP_WILL_ENTER_FOREGROUND);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 0, "MCAMailboxTam", "TamClientAttachmentGetCountInRange", A01);
    }
}
