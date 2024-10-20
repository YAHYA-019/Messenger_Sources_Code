package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;

/* loaded from: Bv9.class */
public final class Bv9 {
    public final BDA A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Context A03;
    public final FbUserSession A04;

    public Bv9(Context context, FbUserSession fbUserSession) {
        this.A03 = context;
        this.A04 = fbUserSession;
        1Br A00 = 1Lm.A00(context, fbUserSession, 16686);
        this.A01 = A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        this.A00 = new MailboxFeature(AbI.A0f(A00));
        this.A02 = AbG.A0U();
    }
}
