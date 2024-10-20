package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Fl0.class */
public final class Fl0 implements GJp {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ GL5 A01;
    public final /* synthetic */ Eq3 A02;
    public final /* synthetic */ String A03;

    public Fl0(FbUserSession fbUserSession, GL5 gl5, Eq3 eq3, String str) {
        this.A02 = eq3;
        this.A00 = fbUserSession;
        this.A01 = gl5;
        this.A03 = str;
    }

    @Override // X.GJp
    public void C9a() {
    }

    @Override // X.GJp
    public void C9b(String str) {
        ((F8y) this.A02.A02.get()).A00(this.A00, true);
        this.A01.AGY(-1, str);
    }

    @Override // X.GJp
    public void CZX() {
    }

    @Override // X.GJp
    public void onCancel() {
        this.A01.AGC(-1, this.A03);
    }
}
