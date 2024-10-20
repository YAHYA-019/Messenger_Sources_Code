package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: G2r.class */
public final class G2r implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverMatchPlayerController$pollQueue$1$1$onSuccess$2";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FJ0 A01;

    public G2r(FbUserSession fbUserSession, FJ0 fj0) {
        this.A01 = fj0;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FJ0.A03(this.A00, this.A01);
    }
}
