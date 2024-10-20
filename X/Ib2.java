package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: Ib2.class */
public final class Ib2 implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Ib2(int i, long j, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                MailboxNullable mailboxNullable = new MailboxNullable(null);
                PrivacyContext privacyContext = (PrivacyContext) this.A04;
                Ic0 A00 = Ic0.A00(this, 44);
                C1qL c1qL = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, mailboxNullable, 0, 0, null, privacyContext, "MCAMailboxCommunity", "GetThreadPointQueryTtrc", A00);
                return;
            case 1:
                1qX A14 = 7zM.A14((MailboxNullable) obj);
                if (A14 == null || 1qX.A00(A14) <= 0 || A14.mResultSet.getNullableLong(0, 0) == null) {
                    return;
                }
                ((1Uj) ((C00i) this.A03).get()).A06(new Iby(this.A04, 24));
                0fH.A0j("MsysSearchMessageFetcher", 1BK.A15(Locale.US, "Completed loading the message in thread pk = %d", Arrays.copyOf(1BK.A1Z(this.A01), 1)));
                JFR jfr = (JFR) this.A02;
                Long nullableLong = A14.mResultSet.getNullableLong(0, 0);
                if (nullableLong == null) {
                    throw 1BK.A0h();
                }
                jfr.Bq2(nullableLong.longValue());
                return;
            default:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, new MailboxNullable(null), 0, 0, null, (PrivacyContext) this.A04, "MCAMailboxUserRestrict", "GetMessengerRestrictActionState", new Ibz(this, 20));
                return;
        }
    }
}
