package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Cxt.class */
public final class Cxt implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ BDD A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public Cxt(MailboxFutureImpl mailboxFutureImpl, BDD bdd, String str, String str2, int i) {
        this.A02 = bdd;
        this.A01 = mailboxFutureImpl;
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, false, 0, 1, "MCAMailboxRanking", "IssueBCFRealTimeRankingRequest", Czl.A00(this, 18));
    }
}
