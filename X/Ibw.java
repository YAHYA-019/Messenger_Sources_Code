package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.loadgeneratorproxy.mca.MailboxLoadGeneratorProxyJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Ibw.class */
public final class Ibw implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Ibw(MWv mWv, MailboxFutureImpl mailboxFutureImpl, String str, int i) {
        this.A00 = 0;
        this.A02 = mWv;
        this.A03 = mailboxFutureImpl;
        this.A01 = i;
        this.A04 = str;
    }

    public Ibw(MailboxFutureImpl mailboxFutureImpl, 22C r303, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = r303;
        this.A01 = i;
        this.A03 = mailboxFutureImpl;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object obj2;
        Ic0 A00;
        String str;
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj;
                String A1D = 7zM.A1D(MWv.A00, 0);
                NotificationScope A002 = accountSession.getSessionedNotificationCenterCallbackManager().A00(new Ic3(this, 1), A1D);
                7zL.A1O(A002, this.A03, A1D);
                MailboxLoadGeneratorProxyJNI.dispatchVIOOO(0, this.A01, accountSession, this.A04, A002);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                4uZ.A06("MailboxTam", "runTamClientAddStickerToCollection", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = false;
                A00 = Ic0.A00(this, ActionId.APPLY_OPTIMISTICS);
                str = "MCAMailboxTam";
                str2 = "TamClientAddStickerToCollection";
                break;
            case 2:
                mailbox = (Mailbox) obj;
                4uZ.A06("MailboxTam", "runTamClientRemoveCustomStickerFromCollection", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = false;
                A00 = Ic0.A00(this, ActionId.APPLY_FINISHED_LIST);
                str = "MCAMailboxTam";
                str2 = "TamClientRemoveCustomStickerFromCollection";
                break;
            default:
                mailbox = (Mailbox) obj;
                4uZ.A06("MailboxTam", "loadTamClientQueryCustomStickerAttachmentURL", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.CONNECTIVITY_CHANGED);
                str = "MCAMailboxTam";
                str2 = "TamClientQueryCustomStickerAttachmentURL";
                C1qL c1qL = 22C.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
        }
        i = 1;
        C1qL c1qL2 = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
    }
}
