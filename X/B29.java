package X;

import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.communitymessaging.categorycreation.CreateOrRenameCategoryDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import java.util.BitSet;

/* loaded from: B29.class */
public final class B29 extends 2Yf {
    public 06Z A00;
    public FbUserSession A01;
    public CallerContext A02;
    public 8Lu A03;
    public Bcq A04;
    public MigColorScheme A05;

    public B29() {
        super("ManageAndOrganizeSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        FbUserSession fbUserSession = this.A01;
        MigColorScheme migColorScheme = this.A05;
        Bcq bcq = this.A04;
        06Z r0 = this.A00;
        CallerContext callerContext = this.A02;
        8Lu r02 = this.A03;
        11T.A0F(c1qb, 0);
        11T.A0G(fbUserSession, 1, migColorScheme);
        7zT.A11(3, bcq, r0, callerContext, r02);
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        C1rq A01 = C1rg.A01(c1qb, null, 0);
        AwS A00 = B0H.A00(c1qb);
        A00.A2Y(c1qb.A0D(2131954028));
        A00.A01.A07 = false;
        A00.A2X(migColorScheme);
        A01.A2f(A00.A2W());
        2cM A012 = 2cK.A01(c1qb, (String) null, 0);
        A012.A0q(40.0f);
        A012.A0S();
        AwU A013 = B11.A01(c1qb);
        A013.A2Z(c1qb.A0D(2131954245));
        A013.A01.A05 = true;
        A013.A2Y(migColorScheme);
        A013.A2X(2Yg.A09(c1qb, B29.class, "ManageAndOrganizeSection", 2036748691));
        A012.A2d(A013);
        4YU.A1N(A012, 2RH.A07);
        A012.A2c();
        A01.A2f(A012.A00);
        A0I.A04(A01);
        AbG.A1O(A0l, A0I);
        7zL.A1K(c1qb);
        QOM qom = new QOM();
        qom.A01 = migColorScheme;
        qom.A02 = (ImmutableMap) r02.A00;
        qom.A00 = bcq;
        A0l.A01(qom);
        2hP A0I2 = 2hO.A0I(c1qb);
        8A3 A002 = 8A4.A00(c1qb);
        A002.A2X(migColorScheme);
        A0I2.A04(A002);
        A0l.A00(A0I2);
        2hP A0I3 = 2hO.A0I(new C1qb(c1qb));
        AwS A003 = B0H.A00(c1qb);
        A003.A2Y(c1qb.A0D(2131954033));
        A003.A2X(migColorScheme);
        A0I3.A05(A003.A2W());
        A0l.A00(A0I3);
        1Du it = ((ImmutableCollection) r02.A01).iterator();
        while (it.hasNext()) {
            ThreadSummary A0j = AbF.A0j(it);
            2hP A0I4 = 2hO.A0I(new C1qb(c1qb));
            C36o c36o = new C36o(new 1Iw(c1qb), new AnonymousClass376());
            AnonymousClass376 anonymousClass376 = c36o.A01;
            anonymousClass376.A01 = fbUserSession;
            BitSet bitSet = c36o.A02;
            bitSet.set(2);
            c36o.A2W(!CAi.A00(A0j));
            anonymousClass376.A03 = A0j;
            bitSet.set(4);
            anonymousClass376.A04 = migColorScheme;
            bitSet.set(1);
            anonymousClass376.A00 = r0;
            bitSet.set(3);
            anonymousClass376.A02 = callerContext;
            bitSet.set(0);
            C1rs.A04(bitSet, c36o.A03);
            c36o.A0J();
            A0I4.A05(anonymousClass376);
            A0l.A00(A0I4);
        }
        2Ys r03 = A0l.A00;
        11T.A0A(r03);
        return r03;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.fragment.app.Fragment, X.Al3] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2hj, java.lang.Object] */
    public Object A0e(1Im r302, Object obj) {
        C2hl c2hl;
        String str;
        int i = r302.A01;
        if (i != 1463818325) {
            c2hl = null;
            if (i == 2036748691) {
                Bcq bcq = r302.A00.A01.A04;
                11T.A0F(bcq, 1);
                BzH bzH = CreateOrRenameCategoryDialogFragment.A07;
                ?? r0 = bcq.A00;
                06Z A08 = 7zN.A08((Fragment) r0);
                ThreadKey threadKey = r0.A02;
                if (threadKey == null) {
                    str = "threadKey";
                } else {
                    String str2 = r0.A04;
                    if (str2 != null) {
                        bzH.A00(A08, threadKey, (Long) null, str2, (String) null);
                        return null;
                    }
                    str = "groupId";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        } else {
            c2hl = new C2hl(new Object());
        }
        return c2hl;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B29 b29 = (B29) r302;
            CallerContext callerContext = this.A02;
            CallerContext callerContext2 = b29.A02;
            if (callerContext != null) {
                if (!callerContext.equals(callerContext2)) {
                    return false;
                }
            } else if (callerContext2 != null) {
                return false;
            }
            8Lu r0 = this.A03;
            8Lu r02 = b29.A03;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            MigColorScheme migColorScheme = this.A05;
            MigColorScheme migColorScheme2 = b29.A05;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A01;
            FbUserSession fbUserSession2 = b29.A01;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            06Z r03 = this.A00;
            06Z r04 = b29.A00;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            Bcq bcq = this.A04;
            Bcq bcq2 = b29.A04;
            if (bcq != null) {
                if (!bcq.equals(bcq2)) {
                    return false;
                }
            } else if (bcq2 != null) {
                return false;
            }
        }
        return true;
    }
}
