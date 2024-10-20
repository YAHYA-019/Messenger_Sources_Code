package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: N77.class */
public final class N77 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C6ku A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public N77(C6ku c6ku, MailboxFutureImpl mailboxFutureImpl, String str, String str2, String str3, int i) {
        this.A01 = c6ku;
        this.A02 = mailboxFutureImpl;
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        MailboxNullable A0T = 1BL.A0T();
        N85 A00 = N85.A00(this, 3);
        String A002 = 7zK.A00(6);
        C1qL c1qL = C6ku.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 0, A002, "AvatarArtifactsSync", A00);
    }
}
