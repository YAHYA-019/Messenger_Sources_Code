package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: A0m.class */
public final class A0m implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public A0m(Object obj, Object obj2, String str, int i, long j, long j2, long j3) {
        this.A00 = i;
        this.A04 = obj;
        this.A05 = obj2;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A06 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        A1g A01;
        String str;
        String str2;
        int i = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A05;
        if (i != 0) {
            A01 = A1g.A01(this, ActionId.MQTT_DISCONNECTED);
            str = "MCAMailboxThreadActionSystem";
            str2 = "InsertBusinessThreadActionSystem";
        } else {
            A01 = A1g.A01(this, 49);
            str = "MCAMailboxExtendedReactions";
            str2 = "OptimisticUpsertOrDeleteSharedAlbumReaction";
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, false, 0, 1, str, str2, A01);
    }
}
