package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: A0p.class */
public final class A0p implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public A0p(Object obj, Object obj2, String str, String str2, String str3, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2;
        A1g A01;
        String str;
        String str2;
        int i = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        if (i != 0) {
            obj2 = 1BL.A0T();
            A01 = A1g.A01(this, ActionId.ABORTED);
            str = "MCAMailboxRollCall";
            str2 = "OptimisticConvertAttachmentMessageToRollCall";
        } else {
            obj2 = false;
            A01 = A1g.A01(this, 77);
            str = "MCAMailboxMemories";
            str2 = "RecordMemoryEngagementEvent";
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, 1, str, str2, A01);
    }
}
