package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: C4h.class */
public final class C4h {
    public final C1qM A00 = new CxO(this, 17);
    public final MailboxCallback A01;
    public final 1yC A02;
    public final C21N A03;

    public C4h(MailboxCallback mailboxCallback, 1yC r303, C21N c21n) {
        this.A02 = r303;
        this.A03 = c21n;
        this.A01 = mailboxCallback;
    }

    public void A00() {
        1yC r0 = this.A02;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new Cxo(1, 10, r0, A0P), A0P, false);
        A0P.addResultCallback(this.A01);
    }
}
