package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: G2q.class */
public final class G2q implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverMatchPlayerController$pollQueue$1$1$onSuccess$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FJ0 A01;

    public G2q(FbUserSession fbUserSession, FJ0 fj0) {
        this.A01 = fj0;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FJ0.A03(this.A00, this.A01);
    }
}
