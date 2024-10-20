package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.6k3, reason: invalid class name */
/* loaded from: 6k3.class */
public final class C6k3 {
    public C6k5 A00;
    public final C1qM A01;
    public final 1Uj A02;
    public final C01i A03;
    public final FbUserSession A04;

    public C6k3(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A04 = fbUserSession;
        this.A02 = (1Uj) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 16686);
        this.A03 = C01g.A01(new AnonymousClass831(this, 2));
        this.A01 = new C1qM() { // from class: X.6k4
            @Override // X.C1qM
            public final void CNu(Set set) {
                if (set.contains("avatars_info_values")) {
                    C6k3 c6k3 = C6k3.this;
                    c6k3.A00(new AnonymousClass836(c6k3, 1));
                }
            }
        };
    }

    public final void A00(Function1 function1) {
        MailboxFeature mailboxFeature = (MailboxFeature) this.A03.getValue();
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Cze(mailboxFeature, mailboxFutureImpl, 0))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(new A1b(function1, 0));
    }
}
