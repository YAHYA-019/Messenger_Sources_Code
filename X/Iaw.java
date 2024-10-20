package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Iaw.class */
public final class Iaw implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Iaw(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2;
        Ic0 A00;
        String str;
        String str2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A04;
        if (i2 != 0) {
            obj2 = 1BL.A0T();
            A00 = Ic0.A00(this, ActionId.CARD_DATA_LOADED);
            str = "MCAMailboxSearch";
            str2 = "UniversalSearchAttachmentResults";
            C1qL c1qL = C00683ob.A00;
            i = 0;
        } else {
            obj2 = false;
            A00 = Ic0.A00(this, 24);
            str = "MCAMailboxCommunity";
            str2 = "IssueUpdateCommunityListNewBadgeSeenCount";
            i = 1;
            C1qL c1qL2 = 22I.A00;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
    }
}
