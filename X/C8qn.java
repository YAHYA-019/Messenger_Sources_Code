package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8qn, reason: invalid class name */
/* loaded from: 8qn.class */
public final class C8qn extends 2Yf {
    public FbUserSession A00;
    public 9Wy A01;
    public C9kr A02;
    public 95Z A03;
    public MigColorScheme A04;
    public ImmutableList A05;
    public boolean A06;

    public C8qn() {
        super("FriendsTabActiveNowSection");
        this.A06 = true;
    }

    public static final 2hO A0I(C1qb c1qb, MigColorScheme migColorScheme, int i) {
        Object[] A1b;
        String str;
        String string = 4YU.A0E(c1qb).getString(2131957062);
        if (i == 0) {
            A1b = new Object[]{string};
            str = "%s";
        } else {
            A1b = AnonymousClass001.A1b(string, i);
            str = "%s (%d)";
        }
        String A0w = 7zO.A0w(str, A1b);
        11T.A0D(A0w);
        2hP A0I = 2hO.A0I(c1qb);
        8TR A00 = C5z5.A00(c1qb);
        A00.A2a(A0w);
        A00.A2Z(migColorScheme);
        A0I.A04(A00);
        return A0I.A02();
    }

    public void A0X(2Yv r302, 2Yv r303) {
        ((C8og) r303).A00 = ((C8og) r302).A00;
    }

    public void A0a(C1qb c1qb) {
        C8og c8og = (C8og) ((2Yf) this).A03;
        Object A0A = 1Bn.A0A(85245);
        if (A0A != null) {
            c8og.A00 = (CQH) A0A;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Throwable, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2Ys A0d(X.C1qb r302) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8qn.A0d(X.1qb):X.2Ys");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qn c8qn = (C8qn) r302;
            ImmutableList immutableList = this.A05;
            ImmutableList immutableList2 = c8qn.A05;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            C9kr c9kr = this.A02;
            C9kr c9kr2 = c8qn.A02;
            if (c9kr != null) {
                if (!c9kr.equals(c9kr2)) {
                    return false;
                }
            } else if (c9kr2 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A00;
            FbUserSession fbUserSession2 = c8qn.A00;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            95Z r0 = this.A03;
            95Z r02 = c8qn.A03;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            MigColorScheme migColorScheme = this.A04;
            MigColorScheme migColorScheme2 = c8qn.A04;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            9Wy r03 = this.A01;
            9Wy r04 = c8qn.A01;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            if (this.A06 != c8qn.A06) {
                return false;
            }
        }
        return true;
    }
}
