package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Ias.class */
public final class Ias implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ PrivacyContext A01;
    public final /* synthetic */ C00683ob A02;
    public final /* synthetic */ String A03;

    public Ias(MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, C00683ob c00683ob, String str) {
        this.A02 = c00683ob;
        this.A00 = mailboxFutureImpl;
        this.A01 = privacyContext;
        this.A03 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A00;
        MailboxNullable mailboxNullable = new MailboxNullable(null);
        PrivacyContext privacyContext = this.A01;
        Ic0 A00 = Ic0.A00(this, ActionId.RTMP_CONNECTION_RELEASE);
        C1qL c1qL = C00683ob.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, mailboxNullable, 0, 0, null, privacyContext, "MCAMailboxSearch", "GetSearchErrorStateInfo", A00);
    }
}
