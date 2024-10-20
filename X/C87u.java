package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.analyticslogging.mca.MailboxAnalyticsLoggingJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.87u, reason: invalid class name */
/* loaded from: 87u.class */
public final class C87u implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C87u(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object A0T;
        A1g A01;
        String str;
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                MailboxAdvancedCryptoTransportJNI.dispatchVOZ(21, obj, this.A03);
                7zO.A1V(this.A02);
                return;
            case 1:
                Mailbox mailbox2 = (Mailbox) obj;
                String A1D = 7zM.A1D(5FT.A00, 1);
                NotificationScope CcE = mailbox2.getSessionedNotificationCenterCallbackManager().CcE(new A1k(A1D, this, 11), A1D, 1);
                7zL.A1O(CcE, this.A02, A1D);
                MailboxAnalyticsLoggingJNI.dispatchVOOZ(1, mailbox2, CcE, this.A03);
                return;
            case 2:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A01 = A1g.A01(this, 20);
                str = "MCAMailboxCommunity";
                str2 = "GetBumpedCommunityThreadsActivity";
                C1qL c1qL = 22I.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, A01);
                return;
            default:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = false;
                A01 = A1g.A01(this, 95);
                str = "MCAMailboxProfessionalMode";
                str2 = "UpdateProModeBusinessToolsSettings";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, A01);
                return;
        }
    }
}
