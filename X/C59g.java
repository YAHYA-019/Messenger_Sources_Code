package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.59g, reason: invalid class name */
/* loaded from: 59g.class */
public final class C59g implements AnonymousClass555 {
    public final int A00;
    public final 2MQ A01;
    public final 2Re A02;
    public final C83o A03;
    public final AnonymousClass553 A04;
    public final C1ut A05;
    public final MigColorScheme A06;
    public final Integer A07;
    public final String A08;
    public final boolean A09;

    public C59g(2MQ r302, 2Re r303, C83o c83o, AnonymousClass553 anonymousClass553, C1ut c1ut, MigColorScheme migColorScheme, Integer num, String str, int i, boolean z) {
        if (r302 == 2MQ.A1i) {
            throw new IllegalStateException("Check failed.");
        }
        this.A01 = r302;
        this.A02 = r303;
        this.A09 = z;
        if (migColorScheme == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.A06 = migColorScheme;
        this.A07 = num;
        this.A08 = str;
        this.A04 = anonymousClass553 == null ? AnonymousClass553.A01 : anonymousClass553;
        this.A00 = i;
        this.A03 = c83o;
        this.A05 = c1ut;
    }

    @Override // X.AnonymousClass556
    public boolean BVf(AnonymousClass556 anonymousClass556) {
        11T.A0F(anonymousClass556, 0);
        boolean z = false;
        if (!11T.A0O(anonymousClass556.getClass(), C59g.class)) {
            return false;
        }
        C59g c59g = (C59g) anonymousClass556;
        if (this.A01 == c59g.A01 && this.A02 == c59g.A02 && this.A09 == c59g.A09 && 11T.A0O(this.A06, c59g.A06) && this.A07 == c59g.A07 && this.A00 == c59g.A00 && this.A03 == c59g.A03 && this.A05 == c59g.A05) {
            z = true;
        }
        return z;
    }
}
