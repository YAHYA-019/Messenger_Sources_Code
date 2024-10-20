package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N6u.class */
public final class N6u implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public N6u(int i, long j, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0016. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object A0T;
        N85 A00;
        String str;
        String str2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        switch (i2) {
            case 0:
                A0T = 1BL.A0T();
                A00 = N85.A00(this, 4);
                str = "MCAMailboxBMOPBuyerViewFeatureCapabilities";
                str2 = "GetBmopBuyerViewFeatureCapabilities";
                C1qL c1qL = MS2.A00;
                i = 0;
                break;
            case 1:
                A0T = 1BL.A0T();
                A00 = N85.A00(this, 9);
                str = "MCAMailboxCallHistory";
                str2 = "UnseenMissedCallsCountForThread";
                i = 0;
                break;
            case 2:
                A0T = false;
                A00 = N85.A00(this, 14);
                str = "MCAMailboxCallHistory";
                str2 = "PurgeCallLog";
                i = 1;
                break;
            case 3:
                A0T = false;
                A00 = N85.A00(this, 27);
                str = "MCAMailboxCommunityChatSuggestedActions";
                str2 = "UpsertBannerDismissTimestampMs";
                i = 1;
                break;
            case 4:
                A0T = false;
                A00 = N85.A00(this, 61);
                str = "MCAMailboxInThreadBanner";
                str2 = "FetchBanners";
                i = 1;
                break;
            case 5:
                A0T = false;
                A00 = N85.A00(this, 62);
                str = "MCAMailboxInThreadBanner";
                str2 = "ExecuteCTA";
                i = 1;
                break;
            default:
                A0T = false;
                A00 = N85.A00(this, 63);
                str = "MCAMailboxInThreadBanner";
                str2 = "DeleteExpiredBanners";
                i = 1;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, A00);
    }
}
