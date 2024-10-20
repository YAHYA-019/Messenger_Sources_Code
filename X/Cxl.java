package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Cxl.class */
public final class Cxl implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public Cxl(int i, long j, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.DbConnectionResolutionCallback A02;
        String str;
        String str2;
        int i = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        MailboxNullable A0T = 1BL.A0T();
        switch (i) {
            case 0:
                A02 = Czm.A02(this, 7);
                str = "MCAMailboxAIBots";
                str2 = "AIBot3PCustomCommands";
                break;
            case 1:
                A02 = Czm.A02(this, 24);
                str = "MCAMailboxColorFilterSettings";
                str2 = "FetchColorFilterSetting";
                break;
            default:
                A02 = Czl.A00(this, 23);
                str = "MCAMailboxRTC";
                str2 = "RtcThreadOngoingCallsByThreadKey";
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
    }
}
