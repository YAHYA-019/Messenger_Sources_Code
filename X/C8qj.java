package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8qj, reason: invalid class name */
/* loaded from: 8qj.class */
public final class C8qj extends 2Yf {
    public static final 1Br A05 = 1Bq.A00(66655);
    public FbUserSession A00;
    public DJb A01;
    public 8Kl A02;
    public MigColorScheme A03;
    public AZg A04;

    public C8qj() {
        super("FriendsTabLifeEventsSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        FbUserSession fbUserSession = this.A00;
        MigColorScheme migColorScheme = this.A03;
        8Kl r0 = this.A02;
        DJb dJb = this.A01;
        AZg aZg = this.A04;
        boolean A1X = 1BL.A1X(c1qb, fbUserSession);
        7zT.A1U(migColorScheme, r0, dJb);
        C00i c00i = A05.A00;
        int A00 = 2yD.A00(1fF.A00((1fF) c00i.get()), 36598146475757471L);
        ImmutableList immutableList = r0.A01;
        8TR A002 = C5z5.A00(c1qb);
        StringBuilder A0k = AnonymousClass001.A0k();
        int i = 2131958629;
        if (((1fF) c00i.get()).A04()) {
            i = 2131957047;
        }
        A0k.append(c1qb.A0D(i));
        A0k.append(" (");
        A0k.append(r0.A00);
        A002.A2a(4YV.A0x(A0k));
        A002.A2Z(migColorScheme);
        if (immutableList.size() > A00) {
            A002.A2X(2131958628);
            C5z5 c5z5 = A002.A01;
            c5z5.A08 = A1X;
            c5z5.A01 = new CZF(dJb, 68);
        }
        int size = immutableList.size();
        int i2 = new int[]{A00, size}[0];
        if (size < i2) {
            i2 = size;
        }
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        A0I.A05(A002.A2W());
        A0l.A00(A0I);
        B2B b2b = new B2B();
        b2b.A00 = fbUserSession;
        b2b.A03 = migColorScheme;
        b2b.A02 = dJb;
        b2b.A05 = immutableList.subList(0, i2);
        b2b.A01 = BLX.A02;
        b2b.A04 = aZg;
        2Ys r02 = A0l.A00;
        r02.A00.add(b2b);
        return r02;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qj c8qj = (C8qj) r302;
            MigColorScheme migColorScheme = this.A03;
            MigColorScheme migColorScheme2 = c8qj.A03;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A00;
            FbUserSession fbUserSession2 = c8qj.A00;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            8Kl r0 = this.A02;
            8Kl r02 = c8qj.A02;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            DJb dJb = this.A01;
            DJb dJb2 = c8qj.A01;
            if (dJb != null) {
                if (!dJb.equals(dJb2)) {
                    return false;
                }
            } else if (dJb2 != null) {
                return false;
            }
            AZg aZg = this.A04;
            AZg aZg2 = c8qj.A04;
            if (aZg != null) {
                if (!aZg.equals(aZg2)) {
                    return false;
                }
            } else if (aZg2 != null) {
                return false;
            }
        }
        return true;
    }
}
