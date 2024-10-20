package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: E0l.class */
public final class E0l extends 2Yf {
    public 06Z A00;
    public FbUserSession A01;
    public 2JX A02;
    public Edo A03;
    public GF3 A04;
    public MigColorScheme A05;
    public ImmutableList A06;
    public ImmutableList A07;
    public Boolean A08;
    public String A09;

    public E0l() {
        super("FxImPhotoSettingSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        FbUserSession fbUserSession = this.A01;
        06Z r0 = this.A00;
        MigColorScheme migColorScheme = this.A05;
        ImmutableList immutableList = this.A06;
        2JX r02 = this.A02;
        GF3 gf3 = this.A04;
        Edo edo = this.A03;
        Boolean bool = this.A08;
        ImmutableList immutableList2 = this.A07;
        String str = this.A09;
        1Bn.A0A(83249);
        FHk fHk = (FHk) 1Bn.A0A(99771);
        boolean contains = immutableList2.contains("PROFILE_PHOTO");
        1Du A0v = AbI.A0v(r02, 2JX.class, 1218662232, 407646008);
        String str2 = "";
        String str3 = str2;
        while (A0v.hasNext()) {
            2JY A0P = 7zL.A0P(A0v);
            String A0t = A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLMAIdentitySyncField", 97427706);
            if (A0t != null && A0t.equals("PROFILE_PHOTO")) {
                str3 = A0P.A0r(-645515464);
                str2 = A0P.A0r(507156368);
            }
        }
        2Yr r03 = new 2Yr();
        if (!1JF.A0B(str2)) {
            2hP A0I = 2hO.A0I(c1qb);
            2KD A00 = 2K3.A00(c1qb);
            A00.A2n();
            A00.A2d();
            A00.A2Y();
            A00.A2z(str2);
            4YU.A1L(A00, 2RH.A03);
            A0I.A05(7zN.A0Z(migColorScheme, A00));
            r03.A00(A0I);
        }
        if (!1JF.A0B(str3)) {
            DKH.A1L(r03, 2hO.A0I(c1qb), CJM.A01(new Fk3(r0, fbUserSession, r02, c1qb, edo, fHk, gf3, migColorScheme, immutableList, bool, str, contains), migColorScheme, str3, contains), 55M.A00(c1qb));
        }
        String A0r = r02.A0r(2090926805);
        if (!1JF.A0B(A0r)) {
            2hP A0I2 = 2hO.A0I(c1qb);
            C1rq A01 = C1rg.A01(c1qb, null, 0);
            QCF qcf = new QCF(c1qb, new QKJ());
            QKJ qkj = qcf.A01;
            qkj.A01 = migColorScheme;
            BitSet bitSet = qcf.A02;
            bitSet.set(1);
            qkj.A04 = A0r;
            qkj.A02 = immutableList;
            bitSet.set(2);
            qkj.A00 = new FXP(2);
            bitSet.set(0);
            C1rs.A03(bitSet, qcf.A03);
            qcf.A0J();
            A01.A2f(qkj);
            7zO.A1K(A01, 2RH.A03);
            A0I2.A04(A01);
            r03.A00(A0I2);
        }
        return r03.A00;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0l e0l = (E0l) r302;
            MigColorScheme migColorScheme = this.A05;
            MigColorScheme migColorScheme2 = e0l.A05;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A01;
            FbUserSession fbUserSession2 = e0l.A01;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            06Z r0 = this.A00;
            06Z r02 = e0l.A00;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            Boolean bool = this.A08;
            Boolean bool2 = e0l.A08;
            if (bool != null) {
                if (!bool.equals(bool2)) {
                    return false;
                }
            } else if (bool2 != null) {
                return false;
            }
            ImmutableList immutableList = this.A06;
            ImmutableList immutableList2 = e0l.A06;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            2JX r03 = this.A02;
            2JX r04 = e0l.A02;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            ImmutableList immutableList3 = this.A07;
            ImmutableList immutableList4 = e0l.A07;
            if (immutableList3 != null) {
                if (!immutableList3.equals(immutableList4)) {
                    return false;
                }
            } else if (immutableList4 != null) {
                return false;
            }
            String str = this.A09;
            String str2 = e0l.A09;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            Edo edo = this.A03;
            Edo edo2 = e0l.A03;
            if (edo != null) {
                if (!edo.equals(edo2)) {
                    return false;
                }
            } else if (edo2 != null) {
                return false;
            }
            GF3 gf3 = this.A04;
            GF3 gf32 = e0l.A04;
            if (gf3 != null) {
                if (!gf3.equals(gf32)) {
                    return false;
                }
            } else if (gf32 != null) {
                return false;
            }
        }
        return true;
    }
}
