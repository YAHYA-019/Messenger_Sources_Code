package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Cza.class */
public final class Cza implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public Cza(MailboxFutureImpl mailboxFutureImpl, 22C r303, String str, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = r303;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
        this.A05 = str;
    }

    public Cza(Object obj, Object obj2, String str, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A04 = obj;
        this.A01 = i;
        this.A02 = j;
        this.A05 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        MailboxFeature.DbConnectionResolutionCallback A02;
        String str;
        String str2;
        int i;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                A02 = Czm.A02(this, ActionId.CONNECTIVITY_CHANGED);
                str = "MCAMailboxPublicChats";
                str2 = "FetchDiscoverableChatParticipants";
                i = 1;
                C1qL c1qL = BDc.A00;
                break;
            case 1:
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                A02 = Czl.A00(this, 61);
                str = "MCAMailboxStatus";
                str2 = "RichStatusOptimisticMarkRead";
                i = 1;
                C1qL c1qL2 = 2Tk.A00;
                break;
            case 2:
                4uZ.A06("MailboxTam", 7zK.A00(419), this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                A02 = Czl.A00(this, 75);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadSaveDraftMessage";
                i = 1;
                C1qL c1qL3 = 22C.A00;
                break;
            case 3:
                4uZ.A06("MailboxTam", "runTamClientThreadSessionDeactivate", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                A02 = Czl.A00(this, 92);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadSessionDeactivate";
                i = 1;
                C1qL c1qL32 = 22C.A00;
                break;
            default:
                4uZ.A06("MailboxTam", "runTamClientThreadUpdateName", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                bool = false;
                A02 = Czl.A00(this, 93);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadUpdateName";
                i = 1;
                C1qL c1qL322 = 22C.A00;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A02);
    }
}
