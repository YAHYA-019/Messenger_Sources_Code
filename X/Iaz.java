package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Iaz.class */
public final class Iaz implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Iaz(Object obj, Object obj2, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        CEM cem;
        Ic0 A00;
        String str;
        String str2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        switch (i2) {
            case 0:
                cem = false;
                A00 = Ic0.A00(this, 16);
                str = "MCAMailboxCommunity";
                str2 = "FetchMessageSeenCount";
                i = 1;
                C1qL c1qL = 22I.A00;
                break;
            case 1:
                cem = 1BL.A0T();
                A00 = Ic0.A00(this, 56);
                str = "MCAMailboxFTS";
                str2 = "MessengerFTSACTQueryMessagesOfAllThreads";
                i = 1;
                break;
            case 2:
                cem = new CEM();
                A00 = Ic0.A00(this, 108);
                str = AbE.A00(302);
                str2 = "EligibleClientMessagesForReminder";
                i = 1;
                C1qL c1qL2 = C5gf.A00;
                break;
            default:
                cem = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.APP_DID_BECOME_ACTIVE);
                str = "MCAMailboxSticker";
                str2 = "StickerSearchResultsQuery";
                i = 0;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, cem, 0, i, str, str2, A00);
    }
}
