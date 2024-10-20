package X;

import com.facebook.analyticslogging.mca.MailboxAnalyticsLoggingJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.util.NotificationScope;

/* loaded from: N6q.class */
public final class N6q implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public N6q(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        N6r n6r;
        1xH r313;
        C19d c19d;
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl2;
        Object obj2;
        N85 A00;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                Mailbox mailbox2 = (Mailbox) obj;
                String A1D = 7zM.A1D(5FT.A00, 0);
                NotificationScope A002 = N89.A00(mailbox2.getSessionedNotificationCenterCallbackManager(), this, A1D, 0);
                7zL.A1O(A002, this.A02, A1D);
                MailboxAnalyticsLoggingJNI.dispatchVOO(0, mailbox2, A002);
                return;
            case 1:
                MailboxFutureImpl mailboxFutureImpl3 = (MailboxFutureImpl) this.A02;
                MailboxNullable A0T = 1BL.A0T();
                N85 A003 = N85.A00(this, 55);
                C1qL c1qL = 1yI.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl3, A0T, 0, 0, "MCAMailboxHighlightsTab", "HighlightsTabFetchRange", A003);
                return;
            case 2:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                obj2 = false;
                A00 = N85.A00(this, 66);
                str = "MCAMailboxMemories";
                str2 = "FetchConsentForInboxTray";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, obj2, 0, 1, str, str2, A00);
                return;
            case 3:
                C2wz c2wz = (C2wz) obj;
                if (c2wz != null) {
                    boolean z = c2wz.A02;
                    if (c2wz.A01) {
                        if (z) {
                            1xF r0 = (1xF) this.A02;
                            C2cx A004 = 1xF.A00(r0);
                            1Um AQV = A004.mMailboxApiHandleMetaProvider.AQV(2);
                            mailboxFutureImpl = new MailboxFutureImpl(AQV);
                            1Um.A00(AQV, new LXL(mailboxFutureImpl, A004, 2), mailboxFutureImpl);
                            n6r = new N6r(this.A01, r0, 0);
                            mailboxFutureImpl.addResultCallback(n6r);
                            return;
                        }
                        r313 = (1xH) this.A01;
                        c19d = 0EI.A00;
                        r313.A04(c19d);
                        return;
                    }
                }
                r313 = (1xH) this.A01;
                c19d = new C19d(null);
                r313.A04(c19d);
                return;
            case 4:
                C2wx c2wx = (C2wx) obj;
                if (c2wx != null) {
                    boolean z2 = c2wx.A02;
                    if (c2wx.A01) {
                        if (z2) {
                            1xF r02 = (1xF) this.A02;
                            C2cx A005 = 1xF.A00(r02);
                            1Um AQV2 = A005.mMailboxApiHandleMetaProvider.AQV(2);
                            mailboxFutureImpl = new MailboxFutureImpl(AQV2);
                            1Um.A00(AQV2, new LXL(mailboxFutureImpl, A005, 1), mailboxFutureImpl);
                            n6r = new N6r(this.A01, r02, 1);
                            mailboxFutureImpl.addResultCallback(n6r);
                            return;
                        }
                        r313 = (1xH) this.A01;
                        c19d = 0EI.A00;
                        r313.A04(c19d);
                        return;
                    }
                }
                r313 = (1xH) this.A01;
                c19d = new C19d(null);
                r313.A04(c19d);
                return;
            default:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                obj2 = 1BL.A0T();
                A00 = N85.A00(this, 84);
                str = "MCAMailboxRtcCallEvents";
                str2 = 1BJ.A00(849);
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, obj2, 0, 1, str, str2, A00);
                return;
        }
    }
}
