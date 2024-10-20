package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.ExecutionException;

/* loaded from: Ceo.class */
public final class Ceo implements C4Av {
    public 1BY A00;
    public final C00i A02 = AbH.A0H();
    public final C00i A01 = 7zN.A0D(83653);

    public Ceo(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        boolean z = false;
        if (!r302.A01()) {
            return false;
        }
        FbUserSession A00 = r302.A00();
        1BY r0 = this.A00;
        C5d7 c5d7 = (C5d7) 1Lo.A04((Context) null, A00, r0, 67241);
        Object A04 = 1Lo.A04((Context) null, A00, r0, 67931);
        2FT A01 = c5d7.A01();
        1Kd.A0D(this.A02, D4p.A00(A04, this, 50), A01);
        try {
            1Yz.A00(A01);
            z = true;
        } catch (ExecutionException unused) {
        }
        return z;
    }
}
