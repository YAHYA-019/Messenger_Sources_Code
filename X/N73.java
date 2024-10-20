package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* loaded from: N73.class */
public final class N73 implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public N73(int i, long j, Object obj, Object obj2, Object obj3) {
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
        Object obj2;
        N85 A00;
        PrivacyContext privacyContext;
        String str;
        String str2;
        int i;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(MS2.A00, (MailboxFutureImpl) this.A04, mailbox);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = false;
                A00 = N85.A00(this, 5);
                privacyContext = null;
                str = "MCAMailboxBMOPBuyerViewFeatureCapabilities";
                str2 = "FetchBMOPBuyerViewFeatureCapabilities";
                i = 1;
                break;
            case 1:
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = false;
                privacyContext = (PrivacyContext) this.A04;
                A00 = N85.A00(this, 7);
                listenForTaskCompletion = null;
                str = "MCAMailboxCallHistory";
                str2 = "MarkMissedCallsAsSeenForThreadKey";
                i = 1;
                break;
            case 2:
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = false;
                privacyContext = (PrivacyContext) this.A04;
                A00 = N85.A00(this, 8);
                listenForTaskCompletion = null;
                str = "MCAMailboxCallHistory";
                str2 = "MarkMissedCallsAsSeenForArmadilloThreadKey";
                i = 1;
                break;
            case 3:
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                listenForTaskCompletion = null;
                obj2 = 7zL.A0s((Object) null);
                privacyContext = (PrivacyContext) this.A04;
                A00 = N85.A00(this, 59);
                str = "MCAMailboxInThreadBanner";
                str2 = "InThreadBannerCta";
                i = 0;
                break;
            default:
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                listenForTaskCompletion = null;
                obj2 = 7zL.A0s((Object) null);
                privacyContext = (PrivacyContext) this.A04;
                A00 = N85.A00(this, 98);
                str = "MCAMailboxSharing";
                str2 = "ShouldFetchLifeEventsOnDemand";
                i = 0;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, listenForTaskCompletion, privacyContext, str, str2, A00);
    }
}
