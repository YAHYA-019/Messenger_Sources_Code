package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: I2h.class */
public final class I2h {
    public JI5 A00;
    public JNE A01;
    public HqE A02;
    public IRF A03;
    public final FbUserSession A04;
    public final 1De A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1BP A08;

    public I2h(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        this.A04 = fbUserSession;
        this.A08 = FbInjector.A00;
        1BY r0 = r303.A00;
        this.A06 = 1Bu.A03(r0, 99980);
        this.A07 = 1Bu.A03(r0, 147464);
    }

    public static JNe A00(1Br r301) {
        return ((I2h) r301.A00.get()).A01();
    }

    public JNe A01() {
        JNE jne;
        JNe jNe = null;
        if (GOp.A0p(this.A06).A07() && (jne = this.A01) != null) {
            jNe = jne.Ait();
        }
        return jNe;
    }
}
