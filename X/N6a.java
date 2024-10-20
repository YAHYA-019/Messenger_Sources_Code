package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N6a.class */
public final class N6a implements 1xJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public N6a(1xF r302, Integer num, int i, long j) {
        this.A00 = i;
        this.A03 = r302;
        this.A01 = j;
        this.A02 = num;
    }

    public /* bridge */ /* synthetic */ void Cit(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        N6r n6r;
        int i = this.A00;
        boolean A0O = 11T.A0O(obj, 0EI.A00);
        1xF r0 = (1xF) this.A03;
        if (i != 0) {
            if (A0O) {
                C2cx A00 = 1xF.A00(r0);
                Long valueOf = Long.valueOf(this.A01);
                1Um AQV = A00.mMailboxApiHandleMetaProvider.AQV(2);
                mailboxFutureImpl = new MailboxFutureImpl(AQV);
                1Um.A00(AQV, new LXD(1, valueOf, mailboxFutureImpl, A00), mailboxFutureImpl);
                n6r = new N6r(this.A02, r0, 3);
                mailboxFutureImpl.addResultCallback(n6r);
                return;
            }
            1xF.A01(r0).A04(1BJ.A00(682));
        }
        if (A0O) {
            C2cx A002 = 1xF.A00(r0);
            Long valueOf2 = Long.valueOf(this.A01);
            1Um AQV2 = A002.mMailboxApiHandleMetaProvider.AQV(2);
            mailboxFutureImpl = new MailboxFutureImpl(AQV2);
            1Um.A00(AQV2, new LXD(2, valueOf2, mailboxFutureImpl, A002), mailboxFutureImpl);
            n6r = new N6r(this.A02, r0, 2);
            mailboxFutureImpl.addResultCallback(n6r);
            return;
        }
        1xF.A01(r0).A04(1BJ.A00(682));
    }
}
