package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: N7e.class */
public final class N7e implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ MailboxFutureImpl A05;
    public final /* synthetic */ 22C A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public N7e(MailboxFutureImpl mailboxFutureImpl, 22C r303, String str, String str2, String str3, String str4, int i, int i2, long j, long j2, long j3) {
        this.A06 = r303;
        this.A00 = i;
        this.A05 = mailboxFutureImpl;
        this.A01 = i2;
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A07 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A09 = str4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxTam", AbE.A00(708), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A05;
        MailboxNullable A0T = 1BL.A0T();
        N85 A00 = N85.A00(this, ActionId.MESSENGER_QUEUE_CREATION);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 1, "MCAMailboxTam", "TamClientNoteReply", A00);
    }
}
