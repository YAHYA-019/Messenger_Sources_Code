package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: G2s.class */
public final class G2s implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverMatchPlayerController$pollQueue$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FJ0 A01;

    public G2s(FbUserSession fbUserSession, FJ0 fj0) {
        this.A01 = fj0;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FJ0 fj0 = this.A01;
        F5C f5c = (F5C) 1Br.A0B(fj0.A0K);
        String str = fj0.A0D;
        EjW ejW = new EjW(this.A00, fj0);
        FbUserSession A0D = AbK.A0D(f5c.A00.A00);
        AbI.A0o(f5c.A01).A08(C2083Db8.A00(ejW, 36), "poll_queue_method_tag", new G6k(f5c, A0D, str, 7));
    }
}
