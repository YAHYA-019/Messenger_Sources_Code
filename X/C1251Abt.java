package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Abt, reason: case insensitive filesystem */
/* loaded from: Abt.class */
public final class C1251Abt implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C1251Abt(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        MailboxFeature.DbConnectionResolutionCallback A02;
        String str;
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj;
                String A1D = 7zM.A1D(1xC.A00, 32);
                NotificationScope A00 = Czo.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 3);
                7zL.A1O(A00, this.A03, A1D);
                MailboxCoreJNI.dispatchVIOO(28, this.A01, accountSession, A00);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A02 = Czm.A02(this, ActionId.WAIT_FOR_BLOCKERS);
                str = "MCAMailboxParentThreadUtil";
                str2 = "UpdateParentThreadReadState";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A02);
            case 2:
                MailboxFutureImpl mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T = 1BL.A0T();
                int i2 = this.A01;
                Czl A002 = Czl.A00(this, 25);
                C1qL c1qL = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl2, A0T, 0, i2, "MCAMailboxSearch", "GetNumberOfContacts", A002);
                return;
            case 3:
                mailbox = (Mailbox) obj;
                4uZ.A06("MailboxTam", "runTamClientErrorNotificationsRemoveOld", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A02 = Czl.A00(this, 85);
                str = "MCAMailboxTam";
                str2 = "TamClientErrorNotificationsRemoveOld";
                break;
            default:
                mailbox = (Mailbox) obj;
                4uZ.A06("MailboxTam", "runTamClientThreadBannerMigrateToMessageRequestExplicitAccept", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A02 = Czl.A00(this, 89);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadBannerMigrateToMessageRequestExplicitAccept";
                break;
        }
        i = 1;
        C1qL c1qL2 = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, str, str2, A02);
    }
}
