package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.21f, reason: invalid class name */
/* loaded from: 21f.class */
public final class C21f {
    public java.util.Map A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final C21h A05;
    public final Set A06;
    public final C01i A07;
    public final 1De A08;

    public C21f(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A06 = new LinkedHashSet();
        this.A02 = 1Lm.A03(fbUserSession, r303.A00, 65963);
        this.A03 = 1Bq.A00(67341);
        this.A04 = 1Bq.A00(66774);
        this.A01 = 1Bq.A00(16387);
        this.A07 = C01g.A01(new C2xn(this, 25));
        this.A00 = new LinkedHashMap();
        this.A05 = new C21g(this);
    }
}
