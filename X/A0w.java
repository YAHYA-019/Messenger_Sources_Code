package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* loaded from: A0w.class */
public final class A0w implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public A0w(Object obj, Object obj2, Object obj3, String str, int i, int i2, long j, long j2) {
        this.A00 = i2;
        this.A04 = obj;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A01 = i;
        this.A03 = j;
        this.A02 = j2;
        this.A07 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NotificationScope listenForTaskCompletion;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        A1g A01;
        PrivacyContext privacyContext;
        String str;
        String str2;
        int i;
        Mailbox mailbox = (Mailbox) obj;
        if (this.A00 != 0) {
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            bool = false;
            privacyContext = (PrivacyContext) this.A06;
            A01 = A1g.A01(this, 98);
            listenForTaskCompletion = null;
            str = "MCAMailboxQP";
            str2 = "QuickPromotionContextualEventUpdate";
            i = 1;
            C1qL c1qL = AnonymousClass231.A00;
        } else {
            listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(C8yd.A00, (MailboxFutureImpl) this.A06, mailbox);
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            bool = false;
            A01 = A1g.A01(this, 85);
            privacyContext = null;
            str = "MCAMailboxMSGPinnedMessages";
            str2 = "OptimisticSetPinnedMessage";
            i = 1;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, listenForTaskCompletion, privacyContext, str, str2, A01);
    }
}
