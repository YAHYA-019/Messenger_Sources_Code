package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Ian.class */
public final class Ian implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Ian(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2;
        Ic0 A00;
        String str;
        String str2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A02;
        switch (i2) {
            case 0:
                obj2 = false;
                A00 = Ic0.A00(this, 35);
                str = "MCAMailboxCommunity";
                str2 = "UpdateUserSettingsForCommunities";
                i = 1;
                C1qL c1qL = 22I.A00;
                break;
            case 1:
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.ACTIVITY_RESUME);
                str = "MCAMailboxStories";
                str2 = "OrcaFetchStoryAttributionDataByStoryIds";
                C1qL c1qL2 = 1yC.A00;
                i = 0;
                break;
            case 2:
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.ACTIVITY_START);
                str = "MCAMailboxStories";
                str2 = "OrcaFetchStoryOverlaysByStoryIds";
                C1qL c1qL22 = 1yC.A00;
                i = 0;
                break;
            case 3:
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.BEGIN_START_ACTIVITY);
                str = "MCAMailboxStories";
                str2 = "OrcaFetchStoryReactionsByStoryIds";
                C1qL c1qL222 = 1yC.A00;
                i = 0;
                break;
            default:
                obj2 = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.END_START_ACTIVITY);
                str = "MCAMailboxStories";
                str2 = "OrcaFetchStoryViewersByStoryIds";
                C1qL c1qL2222 = 1yC.A00;
                i = 0;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, A00);
    }
}
