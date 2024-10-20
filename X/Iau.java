package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Iau.class */
public final class Iau implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ PrivacyContext A01;
    public final /* synthetic */ 2AV A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public Iau(MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, 2AV r304, String str, boolean z) {
        this.A02 = r304;
        this.A00 = mailboxFutureImpl;
        this.A01 = privacyContext;
        this.A03 = str;
        this.A04 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A00, false, 0, 1, null, this.A01, "MCAMailboxPresence", "ReportUserPresenceSetting", Ic0.A00(this, 91));
    }
}
