package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Iy9.class */
public final class Iy9 implements Runnable {
    public static final String __redex_internal_original_name = "RtcInitializer$preWarmRtcEngine$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ Hsf A01;

    public Iy9(FbUserSession fbUserSession, Hsf hsf) {
        this.A01 = hsf;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hsf hsf = this.A01;
        hsf.A01(this.A00, hsf.A03);
    }
}
