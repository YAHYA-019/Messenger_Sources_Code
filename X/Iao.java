package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Iao.class */
public final class Iao implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public Iao(int i, long j, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object A0T;
        Ic0 A00;
        String A002;
        String str;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        switch (i2) {
            case 0:
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 0);
                A002 = AbE.A00(3);
                str = "ActFetchThreadIdDeprecatedDoNotUse";
                i = 1;
                C1qL c1qL = AnonymousClass206.A00;
                break;
            case 1:
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 70);
                A002 = "MCAMailboxLocationSharing";
                str = "GetLiveLocationSessions";
                i = 0;
                break;
            case 2:
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 71);
                A002 = "MCAMailboxLocationSharing";
                str = "GetLiveLocationSharers";
                i = 0;
                break;
            case 3:
                A0T = false;
                A00 = Ic0.A00(this, ActionId.APP_MAIN);
                A002 = "MCAMailboxSticker";
                str = "IssueFetchStickerForLogging";
                i = 1;
                break;
            case 4:
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.MESSENGER_DELTA_REQUEST);
                A002 = "MCAMailboxStickerPicker";
                str = "FetchSavedSticker";
                i = 0;
                break;
            default:
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.FILE_SYSTEM_FAIL);
                A002 = "MCAMailboxStories";
                str = "StorySettingsByOwnerId";
                C1qL c1qL2 = 1yC.A00;
                i = 0;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
    }
}
