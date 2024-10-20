package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.4kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kq.class */
public final class C07764kq extends 1XK implements 1XM {
    public final /* synthetic */ 22B A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07764kq(1Um r302, 22B r303) {
        super(r302);
        this.A00 = r303;
    }

    public 1X9 A00() {
        22B r0 = this.A00;
        C1qL c1qL = 22B.A00;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new 5SD(mailboxFutureImpl, this, r0))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }

    public MailboxFutureImpl A02(int i) {
        22B r0 = this.A00;
        C1qL c1qL = 22B.A00;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Cxw(i, 3, r0, mailboxFutureImpl, this))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }

    public void A03(int i) {
        22B r0 = this.A00;
        C1qL c1qL = 22B.A00;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new Cxw(i, 2, r0, mailboxFutureImpl, this))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A04(String str) {
        22B r0 = this.A00;
        C1qL c1qL = 22B.A00;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new 7TZ(mailboxFutureImpl, this, r0, str))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
