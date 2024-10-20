package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.concurrent.ExecutorService;

/* loaded from: L0j.class */
public final class L0j {
    public 1BY A00;
    public final Context A01;
    public final FbUserSession A02;
    public final C00i A03;
    public final 1PG A04;
    public final FbSharedPreferences A05;
    public final ExecutorService A06;

    public L0j(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        Context A00 = FbInjector.A00();
        FbSharedPreferences A0i = AbJ.A0i();
        ExecutorService executorService = (ExecutorService) 1Bi.A03(16449);
        1PG r0 = (1PG) 1Bi.A03(66265);
        this.A02 = fbUserSession;
        this.A01 = A00;
        this.A05 = A0i;
        Integer num = 1Lo.A05;
        this.A03 = new 1MV(fbUserSession, (1BY) null, 84526);
        this.A06 = executorService;
        this.A04 = r0;
    }

    public static final L0j A00(1BO r301, Object obj) {
        return new L0j(r301, (FbUserSession) obj);
    }
}
