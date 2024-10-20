package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cxu.class */
public final class Cxu implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Cxu(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A01 = i;
        this.A03 = obj;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        if (this.A00 == 0) {
            String A1D = 7zM.A1D(AbF.A0r(1BJ.A00(2111), this.A01), 38);
            NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 17);
            7zL.A1O(A00, this.A03, A1D);
            MailboxSDKJNI.dispatchVOOO(91, mailbox, this.A04, A00);
            return;
        }
        4uZ.A06("MailboxTam", 1BJ.A00(1489), this.A01);
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        MailboxNullable A0T = 1BL.A0T();
        Czl A002 = Czl.A00(this, 88);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, "MCAMailboxTam", "TamClientQuerySavedSticker", A002);
    }
}
