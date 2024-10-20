package X;

import android.content.Context;
import com.facebook.memories.mca.MailboxMemoriesJNI;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;

/* loaded from: A0n.class */
public final class A0n implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public A0n(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A06 = str;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        PrivacyContext privacyContext;
        A1g A01;
        NotificationScope notificationScope;
        String str;
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                NativeHolder nativeHolder = (NativeHolder) MailboxMemoriesJNI.dispatchOJOOOO(12, this.A01, obj, this.A06, this.A04, A1d.A00(this, 32));
                MailboxObservableImpl mailboxObservableImpl = (MailboxObservableImpl) this.A03;
                1XK r0 = (1XK) this.A05;
                r0.A01(nativeHolder);
                mailboxObservableImpl.setResult(r0);
                return;
            case 1:
                if (7zP.A1W(obj)) {
                    7zR.A0a().A0M((BOn) this.A03, Long.valueOf(this.A01), this.A06, false);
                    8Gt r02 = (8Gt) this.A05;
                    4YV.A11(r02.A0C).execute(new AGA((Context) this.A02, r02, (ThreadViewParams) this.A04));
                    return;
                }
                return;
            case 2:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                privacyContext = (PrivacyContext) this.A05;
                A01 = A1g.A01(this, 91);
                notificationScope = null;
                str = "MCAMailboxPolls";
                str2 = "IssueMostLikelyToPollCreationForThreadTask";
                i = 1;
                C1qL c1qL = 8yY.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, notificationScope, privacyContext, str, str2, A01);
                return;
            default:
                mailbox = (Mailbox) obj;
                notificationScope = MailboxFeature.listenForTaskCompletion(8yY.A00, (MailboxFutureImpl) this.A05, mailbox);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A01 = A1g.A01(this, 92);
                privacyContext = null;
                str = "MCAMailboxPolls";
                str2 = "IssuePollCreationForThreadTask";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, notificationScope, privacyContext, str, str2, A01);
                return;
        }
    }
}
