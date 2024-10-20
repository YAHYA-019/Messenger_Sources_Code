package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.5d5, reason: invalid class name */
/* loaded from: 5d5.class */
public final class C5d5 extends 2QB {
    public 1PA A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;

    public C5d5(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A01 = fbUserSession;
        this.A03 = 1Bq.A00(16385);
        this.A02 = 1Bq.A00(16458);
    }

    public static final void A00(FbUserSession fbUserSession, C5d5 c5d5) {
        MailboxFeature mailboxFeature = new MailboxFeature(((MailboxFeature) 4YU.A0n(fbUserSession, c5d5.A04, 33148)).mMailboxApiHandleMetaProvider);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A1c(mailboxFeature, A0P, 19), A0P, false);
        A0P.addResultCallback(new CzS(c5d5, 0));
    }

    public void A06() {
        if (((2yD) this.A03.A00.get()).AZk(36323255681829301L)) {
            Context A00 = FbInjector.A00();
            11T.A0A(A00);
            1P9 r0 = new 1P9((1I7) 1Hv.A02(A00, 65728));
            r0.A05(new D0R(this, 7), 1BJ.A00(ActionId.DISPLAYED));
            1PA A02 = r0.A02();
            this.A00 = A02;
            A02.A00();
            A00(this.A01, this);
        }
    }

    public void A07() {
        1PA r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }
}
