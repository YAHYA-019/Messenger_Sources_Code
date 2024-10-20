package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Cxm.class */
public final class Cxm implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public Cxm(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object obj2;
        MailboxFeature.DbConnectionResolutionCallback A02;
        String str;
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = false;
                A02 = Czm.A02(this, 150);
                str = "MCAMailboxMessageRequest";
                str2 = "OptimisticDeletePendingFolderFromInbox";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A02);
                return;
            case 1:
                C10264sx.A04((FbUserSession) this.A02, (C10264sx) this.A03, this.A01);
                return;
            default:
                mailbox = (Mailbox) obj;
                4uZ.A06("MailboxTam", "runTamClientPendingThreadCount", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = 1BL.A0T();
                A02 = Czl.A00(this, 91);
                str = "MCAMailboxTam";
                str2 = "TamClientPendingThreadCount";
                C1qL c1qL = 22C.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A02);
                return;
        }
    }
}
