package X;

import com.facebook.msys.mci.AccountSession;

/* loaded from: Iae.class */
public final class Iae implements AYU {
    public final AccountSession A00;
    public final 1Um A01 = new Iaf(this);

    public Iae(AccountSession accountSession) {
        this.A00 = accountSession;
    }

    public final 1Um AQV(int i) {
        if (i == 2) {
            return this.A01;
        }
        throw AnonymousClass001.A0L(0Pz.A0d("MailboxApiHandleProviderType with type ", " is not supported by AccountSessionMailboxApiHandleMetaProvider.", i));
    }
}
