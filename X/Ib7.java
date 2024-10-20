package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Ib7.class */
public final class Ib7 implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ PrivacyContext A01;
    public final /* synthetic */ C00683ob A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ String A04;

    public Ib7(MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, C00683ob c00683ob, Number number, String str) {
        this.A02 = c00683ob;
        this.A00 = mailboxFutureImpl;
        this.A01 = privacyContext;
        this.A04 = str;
        this.A03 = number;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A00;
        MailboxNullable mailboxNullable = new MailboxNullable(null);
        PrivacyContext privacyContext = this.A01;
        Ic0 A00 = Ic0.A00(this, ActionId.NEW_START_FOUND);
        C1qL c1qL = C00683ob.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, mailboxNullable, 0, 0, null, privacyContext, "MCAMailboxSearch", "LoadStatusForQuery", A00);
    }
}
