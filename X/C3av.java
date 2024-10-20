package X;

import com.facebook.mplwaisyncmonitor.mca.MailboxMPLWaiSyncMonitorJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;

/* renamed from: X.3av, reason: invalid class name */
/* loaded from: 3av.class */
public final class C3av implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public C3av(Object obj, int i, Object obj2, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object A0T;
        Ic0 ic0;
        String A00;
        String str;
        int i;
        switch (this.A00) {
            case 0:
                MailboxMPLWaiSyncMonitorJNI.dispatchVIIOOZ(0, this.A01, this.A02, obj, "thread_list", false);
                ((MailboxObservableImpl) this.A04).setResult(null);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                4uZ.A06("MailboxOrca", "loadThreadRangesInfoV2", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                A0T = 1BL.A0T();
                ic0 = new Ic0(this, 84);
                A00 = 4YT.A00(94);
                str = "ThreadRangesInfoV2";
                C1qL c1qL = 22B.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A00, str, ic0);
                return;
            default:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                A0T = false;
                ic0 = new Ic0(this, 93);
                A00 = "MCAMailboxQP";
                str = "RemoveQpTriggerEvent";
                i = 1;
                C1qL c1qL2 = AnonymousClass231.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A00, str, ic0);
                return;
        }
    }
}
