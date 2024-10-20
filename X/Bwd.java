package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Bwd.class */
public final class Bwd {
    public long A00;
    public final 1Br A03;
    public final Context A05;
    public final FbUserSession A06;
    public final MutableLiveData A02 = 7zL.A0H();
    public final 1Br A04 = AbG.A0U();
    public C1qM A01 = new CxO(this, 6);

    public Bwd(Context context, FbUserSession fbUserSession, long j) {
        this.A05 = context;
        this.A06 = fbUserSession;
        this.A00 = j;
        this.A03 = 1Lm.A00(context, fbUserSession, 33183);
        C21S.A00(this.A01, AbI.A0f(1Lm.A00(context, fbUserSession, 16686)));
    }
}
