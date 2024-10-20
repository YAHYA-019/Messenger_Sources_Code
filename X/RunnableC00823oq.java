package X;

import android.app.Activity;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3oq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3oq.class */
public final class RunnableC00823oq implements Runnable {
    public static final String __redex_internal_original_name = "AnalyticsActivityListener$2";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 1vT A01;
    public final /* synthetic */ FbUserSession A02;

    public RunnableC00823oq(Activity activity, 1vT r303, FbUserSession fbUserSession) {
        this.A01 = r303;
        this.A02 = fbUserSession;
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        1vT r0 = this.A01;
        FbUserSession fbUserSession = this.A02;
        ((C1is) r0.A01.get()).A08(this.A00, fbUserSession);
    }
}
