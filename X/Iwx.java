package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Iwx.class */
public final class Iwx implements Runnable {
    public static final String __redex_internal_original_name = "MultiwayVideoEscalationManager$getVideoEscalationTimeoutRunnable$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ Hhe A01;

    public Iwx(FbUserSession fbUserSession, Hhe hhe) {
        this.A00 = fbUserSession;
        this.A01 = hhe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((IRF) 4YU.A0n(this.A00, this.A01.A02, 99979)).A0v(false);
    }
}
