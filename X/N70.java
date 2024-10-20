package X;

import com.facebook.auth.login.ui.AuthFragmentLogoViewGroup;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: N70.class */
public final class N70 implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    public N70(int i, int i2, long j, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NotificationScope A00;
        long j;
        int i;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                MailboxNullable A0T = 1BL.A0T();
                N85 A002 = N85.A00(this, 0);
                String A003 = AbE.A00(3);
                String A004 = AbstractC00603o4.A00(25);
                C1qL c1qL = AnonymousClass206.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 1, A003, A004, A002);
                return;
            case 1:
                String A1D = 7zM.A1D(AbF.A0r(GOm.A00(66), this.A01), 13);
                A00 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 10);
                7zL.A1O(A00, this.A04, A1D);
                j = this.A02;
                i = 32;
                MailboxSDKJNI.dispatchVJOO(i, j, mailbox, A00);
                return;
            case 2:
                String A1D2 = 7zM.A1D(AbF.A0r(4YT.A00(258), this.A01), 2);
                A00 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D2, 19);
                7zL.A1O(A00, this.A04, A1D2);
                j = this.A02;
                i = 72;
                MailboxSDKJNI.dispatchVJOO(i, j, mailbox, A00);
                return;
            case 3:
                String A1D3 = 7zM.A1D(AbF.A0r(4YT.A00(AuthFragmentLogoViewGroup.LOGIN_GROUP_ANIM_DELAY_MS), this.A01), 18);
                A00 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D3, 23);
                7zL.A1O(A00, this.A04, A1D3);
                j = this.A02;
                i = 81;
                MailboxSDKJNI.dispatchVJOO(i, j, mailbox, A00);
                return;
            default:
                String A1D4 = 7zM.A1D(AbF.A0r(1BJ.A00(2095), this.A01), 34);
                A00 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D4, 24);
                7zL.A1O(A00, this.A04, A1D4);
                j = this.A02;
                i = 88;
                MailboxSDKJNI.dispatchVJOO(i, j, mailbox, A00);
                return;
        }
    }
}
