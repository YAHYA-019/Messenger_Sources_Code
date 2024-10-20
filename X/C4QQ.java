package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4QQ, reason: invalid class name */
/* loaded from: 4QQ.class */
public final class C4QQ extends 4AY implements Runnable {
    public static final String __redex_internal_original_name = "FacebookPushServerRegisterJobImpl";
    public 1BY A00;
    public final C49f A01;
    public final FbUserSession A0A;
    public final 4AN A0B;
    public final 1OZ A0C;
    public final C00i A04 = 1BQ.A02(49302);
    public final C00i A05 = 1BQ.A02(16448);
    public final C00i A03 = 1BV.A01((1BY) null, 33031);
    public final C00i A02 = 1BQ.A02(16458);
    public final C00i A06 = 1BQ.A02(17077);
    public final C00i A08 = 1BQ.A02(66658);
    public final C15h A09 = new LuE(this, 13);
    public final C00i A07 = 1BQ.A02(83604);

    public C4QQ(FbUserSession fbUserSession, C49f c49f, 1BO r304, 4AN r305, 1OZ r306) {
        this.A00 = new 1BY(r304);
        this.A0A = fbUserSession;
        this.A01 = c49f;
        this.A0C = r306;
        this.A0B = r305;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((1GU) this.A02.get()).AAq();
        FbUserSession fbUserSession = this.A0A;
        4rF r0 = (4rF) this.A04.get();
        if (A04(fbUserSession, this.A0B, this.A0C, r0)) {
            return;
        }
        this.A01.C2v(false);
    }
}
