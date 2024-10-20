package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.Executor;

/* loaded from: AGj.class */
public final class AGj implements Runnable {
    public static final String __redex_internal_original_name = "PymkGenerationStatusFetcher$fetchStatusQueryInBackground$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 9Xz A02;
    public final /* synthetic */ C9J1 A03;

    public AGj(Context context, FbUserSession fbUserSession, 9Xz r304, C9J1 c9j1) {
        this.A02 = r304;
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = c9j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        9Xz r0 = this.A02;
        Context context = this.A00;
        FbUserSession fbUserSession = this.A01;
        C9J1 c9j1 = this.A03;
        boolean A1Z = 7zP.A1Z(c9j1);
        8I2 r02 = (8I2) 1Lo.A04(context, fbUserSession, (1BY) null, 68127);
        r0.A00 = r02;
        if (r02 != null) {
            if (r02.A0L("pymk_generation_status:")) {
                return;
            }
            C3sa A0L = 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "MsgrPeopleYouMayKnowGenerationStatus", (String) null, "fbandroid", -90003542, 0, 3222825176L, 3222825176L, false, A1Z));
            8HH r03 = new 8HH(r0, c9j1, 3);
            8I2 r04 = r0.A00;
            if (r04 != null) {
                r04.A0I(A0L, r03, "pymk_generation_status:", (Executor) r0.A01.get());
                return;
            }
        }
        11T.A0L("graphServiceObserverHolder");
        throw 0Q8.createAndThrow();
    }
}
