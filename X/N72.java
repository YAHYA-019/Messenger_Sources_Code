package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* loaded from: N72.class */
public final class N72 implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public N72(int i, long j, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NotificationScope listenForTaskCompletion;
        MailboxFutureImpl mailboxFutureImpl;
        PrivacyContext privacyContext;
        Object A0s;
        N85 A00;
        String A002;
        String str;
        int i;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(C6ku.A00, (MailboxFutureImpl) this.A04, mailbox);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                privacyContext = null;
                A0s = 7zL.A0s((Object) null);
                A00 = N85.A00(this, 2);
                A002 = 7zK.A00(6);
                str = "IssueFetchAvatarFeatureConfigs";
                i = 1;
                break;
            case 1:
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                listenForTaskCompletion = null;
                A0s = 7zL.A0s((Object) null);
                privacyContext = (PrivacyContext) this.A04;
                A00 = N85.A00(this, 60);
                A002 = "MCAMailboxInThreadBanner";
                str = "InThreadBannerOverflowMenu";
                i = 0;
                break;
            default:
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0s = false;
                privacyContext = (PrivacyContext) this.A04;
                A00 = N85.A00(this, ActionId.LEGACY_MARKER);
                listenForTaskCompletion = null;
                A002 = "MCAMailboxShim";
                str = "SHIMClientHybridThreadRemoveThreadImageOptimistic";
                i = 1;
                C1qL c1qL = 5P5.A00;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0s, 0, i, listenForTaskCompletion, privacyContext, A002, str, A00);
    }
}
