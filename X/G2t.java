package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: G2t.class */
public final class G2t implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverMatchPlayerController$startOfflineMatching$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FJ0 A01;

    public G2t(FbUserSession fbUserSession, FJ0 fj0) {
        this.A01 = fj0;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FJ0 fj0 = this.A01;
        F5C f5c = (F5C) 1Br.A0B(fj0.A0K);
        Er6 er6 = fj0.A0L.A03;
        String str = er6 != null ? er6.A0g : null;
        String str2 = fj0.A0B;
        AbI.A0o(f5c.A01).A08(C2083Db8.A00(new EjX(this.A00, fj0), 35), "offline_match_method_tag", new G6p(AbK.A0D(f5c.A00.A00), f5c, str, str2, 2));
    }
}
