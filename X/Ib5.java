package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.util.NotificationScope;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.stories.mca.MailboxStoriesJNI;

/* loaded from: Ib5.class */
public final class Ib5 implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Ib5(Object obj, Object obj2, String str, int i, long j) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = str;
        this.A02 = obj;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                Hy1 hy1 = (Hy1) obj;
                QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) this.A03;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerPoint(1042231970, (int) this.A01, "eb_status_end");
                }
                Boolean bool = hy1.A00;
                Number number = hy1.A01;
                8Lu r0 = new 8Lu(6, number != null ? 7zN.A0j(number) : null, bool);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("backupEnabled: ");
                A0k.append(r0.A00);
                A0k.append(", onBoardTime: ");
                0fH.A0j("[MP] MediaEncryptedBackupHandler", AnonymousClass001.A0a(r0.A01, A0k));
                HwK.A00.put(this.A04, r0);
                ((1xH) this.A02).A04(r0);
                return;
            case 1:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T = 1BL.A0T();
                Ic0 A00 = Ic0.A00(this, ActionId.LEGACY_MARKER);
                C1qL c1qL = GsM.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 0, "MCAMailboxReactionV2", "GetReactionsV2CountForReaction", A00);
                return;
            default:
                Mailbox mailbox = (Mailbox) obj;
                String A1D = 7zM.A1D(1yC.A00, 7);
                NotificationScope A002 = Ic4.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 22);
                7zL.A1O(A002, this.A03, A1D);
                MailboxStoriesJNI.dispatchVJOOO(3, this.A01, mailbox, this.A04, A002);
                return;
        }
    }
}
