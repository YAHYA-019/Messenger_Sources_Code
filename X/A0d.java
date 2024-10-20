package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: A0d.class */
public final class A0d implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ 8yC A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public A0d(MailboxFutureImpl mailboxFutureImpl, 8yC r303, String str, String str2, long j, long j2) {
        this.A03 = r303;
        this.A02 = mailboxFutureImpl;
        this.A01 = j;
        this.A00 = j2;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A02, false, 0, 1, "MCAMailboxRollCall", "OptimisticContributeToTextPrompt", A1g.A01(this, ActionId.ACTION_BAR_COMPLETE));
    }
}
