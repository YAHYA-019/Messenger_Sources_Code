package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;

/* renamed from: X.3xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xp.class */
public final class C03323xp implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ PrivacyContext A02;
    public final /* synthetic */ C00683ob A03;
    public final /* synthetic */ String A04;

    public C03323xp(MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, C00683ob c00683ob, String str, long j) {
        this.A03 = c00683ob;
        this.A01 = mailboxFutureImpl;
        this.A02 = privacyContext;
        this.A00 = j;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A01;
        MailboxNullable mailboxNullable = new MailboxNullable(null);
        PrivacyContext privacyContext = this.A02;
        C4W1 c4w1 = new C4W1(this, 0);
        String A00 = GOm.A00(ActionId.APP_FIRST_VIEW_CONTROLLER);
        C1qL c1qL = C00683ob.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, mailboxNullable, 0, 0, null, privacyContext, "MCAMailboxSearch", A00, c4w1);
    }
}
