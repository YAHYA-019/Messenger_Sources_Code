package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N6s.class */
public final class N6s implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public N6s(int i, long j, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1xF r310;
        1xH r305;
        long j;
        Integer num;
        int i;
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object A0T;
        int i2;
        N85 A00;
        String A002;
        String str;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                i2 = 1;
                A00 = N85.A00(this, 1);
                A002 = AbE.A00(3);
                str = "SecureMessageFetchUnreadPeerDeviceChangeAlertCount";
                C1qL c1qL = AnonymousClass206.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i2, A002, str, A00);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A00 = N85.A00(this, 31);
                A002 = "MCAMailboxComposerMenu";
                str = "PersistentMenuCtasViewByThreadKey";
                i2 = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i2, A002, str, A00);
                return;
            case 2:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A00 = N85.A00(this, 32);
                A002 = "MCAMailboxComposerMenu";
                str = "PersistentMenuSettingByThreadKey";
                i2 = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i2, A002, str, A00);
                return;
            case 3:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A00 = N85.A00(this, 33);
                A002 = "MCAMailboxContactShareSettings";
                str = "ContactShareSettingsById";
                C1qL c1qL2 = 22Z.A00;
                i2 = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i2, A002, str, A00);
                return;
            case 4:
                C2wz c2wz = (C2wz) obj;
                if (c2wz != null) {
                    boolean z = c2wz.A02;
                    if (c2wz.A01) {
                        r310 = (1xF) this.A03;
                        if (!z) {
                            r305 = new 1xH();
                            1xF.A00(r310).A00().addResultCallback(new N6q(r305, r310, 4));
                            j = this.A01;
                            num = (Integer) this.A02;
                            i = 0;
                            r305.A03(new N6a(r310, num, i, j));
                            return;
                        }
                        1xF.A01(r310).A00();
                        return;
                    }
                }
                1xF.A01((1xF) this.A03).A04("TRIGGER_EXPIRATION_STATUS_QUERY_THREW_FAIL_WHILE_ENABLING");
                return;
            case 5:
                C2wx c2wx = (C2wx) obj;
                if (c2wx != null) {
                    boolean z2 = c2wx.A02;
                    if (c2wx.A01) {
                        r310 = (1xF) this.A03;
                        if (!z2) {
                            r305 = new 1xH();
                            1xF.A00(r310).A01().addResultCallback(new N6q(r305, r310, 3));
                            j = this.A01;
                            num = (Integer) this.A02;
                            i = 1;
                            r305.A03(new N6a(r310, num, i, j));
                            return;
                        }
                        1xF.A01(r310).A00();
                        return;
                    }
                }
                1xF.A01((1xF) this.A03).A04("TRIGGER_EXPIRATION_STATUS_QUERY_THREW_FAIL_WHILE_ENABLING");
                return;
            case 6:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = false;
                A00 = N85.A00(this, 74);
                A002 = "MCAMailboxPushNotifications";
                str = "OptimisticallyUpdateGlobalMuteCallUntil";
                i2 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i2, A002, str, A00);
                return;
            default:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A00 = N85.A00(this, 76);
                A002 = "MCAMailboxPushNotifications";
                str = "RemoveNotifications";
                i2 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i2, A002, str, A00);
                return;
        }
    }
}
