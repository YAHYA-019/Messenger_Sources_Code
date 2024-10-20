package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N75.class */
public final class N75 implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public N75(Object obj, Object obj2, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2;
        N85 A00;
        String str;
        String str2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        switch (i2) {
            case 0:
                obj2 = false;
                A00 = N85.A00(this, 28);
                str = "MCAMailboxCommunityChatSuggestedActions";
                str2 = "UpsertBannerImpression";
                i = 1;
                break;
            case 1:
                obj2 = false;
                A00 = N85.A00(this, 37);
                str = "MCAMailboxCore";
                str2 = "MessagePointQuery";
                i = 1;
                C1qL c1qL = 1xC.A00;
                break;
            case 2:
                obj2 = false;
                A00 = N85.A00(this, 93);
                str = 7zK.A00(7);
                str2 = "GetSharedAlbumContributions";
                i = 1;
                break;
            case 3:
                obj2 = false;
                A00 = N85.A00(this, 94);
                str = 7zK.A00(7);
                str2 = "GetSharedAlbums";
                i = 1;
                break;
            default:
                obj2 = 1BL.A0T();
                A00 = N85.A00(this, ActionId.APP_DID_FINISH_LAUNCHING);
                str = "MCAMailboxTamReportingShim";
                str2 = "TamQueryReportShim";
                i = 1;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
    }
}
