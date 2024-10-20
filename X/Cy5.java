package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Cy5.class */
public final class Cy5 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BDa A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public Cy5(BDa bDa, MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, String str, String str2, int i) {
        this.A01 = bDa;
        this.A03 = mailboxFutureImpl;
        this.A02 = mailboxFutureImpl2;
        this.A00 = i;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, this.A02, false, 0, 1, MailboxFeature.listenForTaskCompletion(BDa.A00, this.A03, mailbox), null, "MCAMailboxGroupLinks", "OptimisticJoinThreadViaInviteLink", Czm.A02(this, ActionId.MQTT_CONNECTING));
    }
}
