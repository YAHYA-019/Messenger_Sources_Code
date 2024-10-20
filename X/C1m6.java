package X;

import com.facebook.auth.credentials.UserTokenCredentials;

/* renamed from: X.1m6, reason: invalid class name */
/* loaded from: 1m6.class */
public final class C1m6 implements 09L {
    public final C15h A02 = new 3jD(this, 58);
    public final C00i A00 = new 1BQ(33013);
    public final C00i A01 = new 1BV(16781);

    public void AFO() {
        1Ql A0V = 1BL.A0V(this.A00);
        A0V.Cdj(((C1ly) this.A01.get()).A00());
        A0V.commit();
    }

    public String Acp() {
        return "";
    }

    public String Adr() {
        return 1BK.A0R(this.A00).A3a(((C1ly) this.A01.get()).A00(), "");
    }

    public 09N Asq() {
        UserTokenCredentials userTokenCredentials = (UserTokenCredentials) this.A02.get();
        return userTokenCredentials == null ? 09N.A00 : 09N.A00(userTokenCredentials.A00, userTokenCredentials.A01);
    }

    public void CnD(String str) {
        1Ql A0V = 1BL.A0V(this.A00);
        A0V.CaL(((C1ly) this.A01.get()).A00(), str);
        A0V.commit();
    }

    public boolean D6U(09N r302) {
        return false;
    }

    public void clear() {
    }
}
