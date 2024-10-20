package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.memories.mca.MailboxMemoriesJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;
import com.facebook.threadsubscriptions.mca.MailboxThreadSubscriptionsJNI;

/* loaded from: A0c.class */
public final class A0c implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public A0c(Object obj, Object obj2, Object obj3, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = j;
        this.A05 = str;
        this.A03 = obj;
        this.A04 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        NotificationScope listenForTaskCompletion;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        A1g A01;
        PrivacyContext privacyContext;
        String A00;
        String str;
        int i;
        Mailbox mailbox2;
        MailboxFutureImpl mailboxFutureImpl2;
        9fM r312;
        A1g A012;
        String str2;
        String str3;
        NativeHolder nativeHolder;
        MailboxObservableImpl mailboxObservableImpl;
        Object obj2;
        switch (this.A00) {
            case 0:
                nativeHolder = (NativeHolder) MailboxMemoriesJNI.dispatchOIJOOO(10, 0, this.A01, obj, this.A05, A1d.A00(this, 31));
                mailboxObservableImpl = (MailboxObservableImpl) this.A04;
                obj2 = this.A03;
                1XK r0 = (1XK) obj2;
                r0.A01(nativeHolder);
                mailboxObservableImpl.setResult(r0);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(GsM.A00, (MailboxFutureImpl) this.A04, mailbox);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A01 = A1g.A01(this, 100);
                privacyContext = null;
                A00 = GOm.A00(ActionId.APPLY_FINISHED_LIST_AGAIN);
                str = "FetchAllReactionsV2Details";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, listenForTaskCompletion, privacyContext, A00, str, A01);
                return;
            case 2:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                r312 = new 9fL((Number) null, (Number) null);
                A012 = A1g.A01(this, ActionId.QUERY_READY);
                str2 = "MCAMailboxRollCall";
                str3 = "OptimisticCreateRollCall";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, r312, 0, 1, str2, str3, A012);
                return;
            case 3:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A04;
                r312 = new 9fM((Number) null, (java.util.Map) null);
                A012 = A1g.A01(this, ActionId.VIDEO_PLAYING);
                str2 = "MCAMailboxSharedAlbum";
                str3 = "OptimisticCreateSharedAlbum";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, r312, 0, 1, str2, str3, A012);
                return;
            case 4:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                privacyContext = (PrivacyContext) this.A04;
                A01 = A1g.A01(this, 128);
                listenForTaskCompletion = null;
                A00 = "MCAMailboxStatus";
                str = "RichStatusRevoke";
                i = 1;
                C1qL c1qL = 2Tk.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, i, listenForTaskCompletion, privacyContext, A00, str, A01);
                return;
            default:
                nativeHolder = (NativeHolder) MailboxThreadSubscriptionsJNI.dispatchOJOOO(2, this.A01, obj, this.A05, new A03(this, 24));
                mailboxObservableImpl = (MailboxObservableImpl) this.A03;
                obj2 = this.A04;
                1XK r02 = (1XK) obj2;
                r02.A01(nativeHolder);
                mailboxObservableImpl.setResult(r02);
                return;
        }
    }
}
