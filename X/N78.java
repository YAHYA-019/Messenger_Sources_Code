package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N78.class */
public final class N78 implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 8yV A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public N78(8yV r302, MailboxFutureImpl mailboxFutureImpl, String str, String str2, long j, boolean z) {
        this.A01 = r302;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A02, false, 0, 1, "MCAMailboxCommunityChatSuggestedActions", "UpsertSuggestedAction", N85.A00(this, 29));
    }
}
