package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.5dc, reason: invalid class name */
/* loaded from: 5dc.class */
public final class C5dc extends 1XK implements 1XM {
    public final /* synthetic */ 22I A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5dc(22I r302, 1Um r303) {
        super(r303);
        this.A00 = r302;
    }

    public 1X9 A00() {
        22I r0 = this.A00;
        C1qL c1qL = 22I.A00;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new A1T(1, r0, this, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }
}
