package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: N71.class */
public final class N71 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public N71(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj;
                String A1D = 7zM.A1D(1xC.A00, 48);
                NotificationScope A00 = N89.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 2);
                7zL.A1O(A00, this.A02, A1D);
                MailboxCoreJNI.dispatchVOOOO(4, accountSession, this.A04, this.A03, A00);
                return;
            case 1:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, false, 0, 1, "MCAMailboxRtcCallEvents", "RtcCallEventBatchedWriteWithPseudoThreadCreation", N85.A00(this, 82));
                return;
            default:
                Mailbox mailbox = (Mailbox) obj;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, (MailboxFutureImpl) this.A02, false, 0, 1, MailboxFeature.listenForTaskCompletion(2Tk.A00, (MailboxFutureImpl) this.A04, mailbox), null, "MCAMailboxStatus", "RichStatusOnDemandFetch", N85.A00(this, ActionId.RTMP_STREAM_PREPARED));
                return;
        }
    }
}
