package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Ib9.class */
public final class Ib9 implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ GsD A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public Ib9(MailboxFutureImpl mailboxFutureImpl, GsD gsD, String str, String str2, long j) {
        this.A02 = gsD;
        this.A01 = mailboxFutureImpl;
        this.A00 = j;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, false, 0, 1, "MCAMailboxSticker", "IssueAnimateStickerInSearchResults", Ic0.A00(this, ActionId.APP_DID_ENTER_BACKGROUND));
    }
}
