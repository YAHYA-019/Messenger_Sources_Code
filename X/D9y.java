package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: D9y.class */
public final class D9y implements Runnable {
    public static final String __redex_internal_original_name = "AccountLinkTaskManager$linkAccount$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 7eJ A01;
    public final /* synthetic */ RL1 A02;
    public final /* synthetic */ Btv A03;
    public final /* synthetic */ String A04;

    public D9y(FbUserSession fbUserSession, 7eJ r303, RL1 rl1, Btv btv, String str) {
        this.A03 = btv;
        this.A04 = str;
        this.A00 = fbUserSession;
        this.A01 = r303;
        this.A02 = rl1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Btv btv = this.A03;
        AbI.A0o(btv.A04).A08(new C1614Amv(btv, this.A02, 1), this.A04, new DBG(2, this.A01, btv, this.A00));
    }
}
