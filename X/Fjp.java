package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Fjp.class */
public final class Fjp implements GF7 {
    public final /* synthetic */ E1q A00;

    public Fjp(E1q e1q) {
        this.A00 = e1q;
    }

    @Override // X.GF7
    public void C0C(boolean z) {
        E1q e1q = this.A00;
        1BY r0 = e1q.A01.A00;
        FbUserSession A0D = AbK.A0D(r0);
        if (z) {
            JOS jos = (JOS) 1Lm.A07(A0D, r0, 99475);
            FAS fas = (FAS) 1Lm.A07(A0D, r0, 99471);
            jos.AFp();
            fas.A0J.clear();
        }
        E1q.A01(A0D, e1q);
    }
}
