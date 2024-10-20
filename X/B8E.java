package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: B8E.class */
public final class B8E extends C9R {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final FbUserSession A03;
    public final C10264sx A04;
    public final BhJ A05;
    public final C1e A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8E(FbUserSession fbUserSession, C1qb c1qb, 2YJ r304, C10264sx c10264sx, BhJ bhJ, C9Z c9z, C1e c1e, String str) {
        super(c1qb, r304, c9z, str);
        7zR.A1O(c10264sx, fbUserSession);
        this.A07 = str;
        this.A04 = c10264sx;
        this.A03 = fbUserSession;
        this.A06 = c1e;
        this.A05 = bhJ;
        this.A01 = true;
        this.A02 = true;
    }
}
