package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.93b, reason: invalid class name */
/* loaded from: 93b.class */
public final class C93b extends AbstractC07504k2 {
    public final AtomicReference A00;
    public final FbUserSession A01;
    public final 1De A02;
    public final ThreadKey A03;

    public C93b(FbUserSession fbUserSession, 1De r303, ThreadKey threadKey) {
        11T.A0F(fbUserSession, 3);
        this.A02 = r303;
        this.A03 = threadKey;
        this.A01 = fbUserSession;
        this.A00 = new AtomicReference();
    }

    @Override // X.AbstractC07504k2
    public void A06() {
        C8y9 c8y9 = (C8y9) 4YU.A0n(this.A01, this.A02, 67535);
        long A0r = this.A03.A0r();
        1Um AQV = c8y9.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A0O(8, A0r, new C8yw(AQV, c8y9), c8y9, A0P), A0P, false);
        A1d.A01(A0P, this, 94);
    }

    @Override // X.AbstractC07504k2
    public void A07() {
        1XK r0 = (1XK) this.A00.getAndSet(null);
        if (r0 != null) {
            r0.D5r();
        }
    }
}
