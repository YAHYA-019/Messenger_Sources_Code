package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.concurrent.Executor;

/* renamed from: X.2j8, reason: invalid class name */
/* loaded from: 2j8.class */
public final class C2j8 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final C01i A05;
    public final C21h A06;
    public final MailboxCallback A07;

    public C2j8(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A03 = 1Bq.A00(66774);
        this.A02 = 1Bq.A00(16467);
        this.A00 = 1Lm.A00(context, fbUserSession, 16686);
        this.A01 = 1Lm.A00(context, fbUserSession, 33231);
        this.A04 = 1Lm.A00(context, fbUserSession, 66801);
        this.A05 = C01g.A01(new C2xn(this, 39));
        this.A06 = new C2j9(this);
        this.A07 = new C3b7(this, 35);
    }

    public static final void A00(C2j8 c2j8) {
        MailboxFeature mailboxFeature = (MailboxFeature) c2j8.A01.A00.get();
        Object value = c2j8.A05.getValue();
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new A0C(9, mailboxFeature, mailboxFutureImpl, value))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback((Executor) c2j8.A02.A00.get(), c2j8.A07);
    }

    public final void A01() {
        C21S.A01(this.A06, (1Uj) this.A00.A00.get());
    }

    public final void A02() {
        A01();
        C21S.A00(this.A06, (1Uj) this.A00.A00.get());
        A00(this);
    }
}
