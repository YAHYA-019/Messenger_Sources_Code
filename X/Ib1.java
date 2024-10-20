package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Ib1.class */
public final class Ib1 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Ib1(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1FX r304;
        9Pv A03;
        DFP dfp;
        ImmutableList of;
        switch (this.A00) {
            case 0:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                MailboxNullable A0T = 1BL.A0T();
                Ic0 A00 = Ic0.A00(this, 43);
                C1qL c1qL = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 0, "MCAMailboxCommunity", "GetSeenCountForMessage", A00);
                return;
            case 1:
                if (AnonymousClass001.A1V(obj)) {
                    79V.A01((FbUserSession) this.A01, (79V) this.A03, (SettableFuture) this.A02, this.A04);
                    return;
                } else {
                    r304 = (1FX) this.A02;
                    A03 = ((79V) this.A03).A03((Gsi) null);
                    break;
                }
            case 2:
                1qX A14 = 7zM.A14((MailboxNullable) obj);
                if (A14 != null) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    int A002 = 1qX.A00(A14);
                    for (int i = 0; i < A002; i++) {
                        String A0k = 7zP.A0k(A14, i);
                        if (A0k != null) {
                            Boolean bool = Boolean.FALSE;
                            String string = A14.mResultSet.getString(i, 0);
                            C1pq.A08("messageId", string);
                            ImmutableList A02 = C10264sx.A02(7zP.A0l(A14, i));
                            ThreadSummary threadSummary = (ThreadSummary) this.A02;
                            53N r318 = threadSummary.A0n.A0w() ? 53N.A0D : 53N.A05;
                            String valueOf = String.valueOf(A14.mResultSet.getLong(i, 6));
                            String str = this.A04;
                            C1pq.A08("threadKey", str);
                            builder.m11011add((Object) new MessageSearchMessageModel(threadSummary, r318, A02, bool, Long.valueOf(A14.mResultSet.getLong(i, 3)), Long.valueOf(A14.mResultSet.getLong(i, 2)), null, A0k, string, null, null, valueOf, A14.mResultSet.getString(i, 7), A14.mResultSet.getString(i, 7), str, 4YU.A06(A14.mResultSet.getLong(i, 2)), false));
                        }
                    }
                    dfp = (DFP) this.A01;
                    of = builder.build();
                } else {
                    dfp = (DFP) this.A01;
                    of = ImmutableList.of();
                }
                11T.A0A(of);
                dfp.Bq7(of);
                return;
            default:
                if (AnonymousClass001.A1V(obj)) {
                    79P r0 = (79P) this.A03;
                    FbUserSession fbUserSession = (FbUserSession) this.A01;
                    79P.A02(fbUserSession, r0);
                    Gs6 gs6 = new Gs6(fbUserSession, r0, (SettableFuture) this.A02, this.A04);
                    r0.A00 = gs6;
                    C21S.A00(gs6, (1Uj) 1Lm.A05(r0.A08, fbUserSession, 16686));
                    return;
                }
                r304 = (1FX) this.A02;
                A03 = 79P.A01(((79P) this.A03).A05);
                break;
        }
        r304.set(A03);
    }
}
