package X;

import com.facebook.graphql.enums.GraphQLStringDefUtil;
import java.util.Iterator;

/* loaded from: Ewj.class */
public final class Ewj {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;

    public Ewj(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 16428);
        this.A01 = 1Bu.A03(r0, 85227);
    }

    public final void A00() {
        String A0k;
        C1706Aqc A23;
        String A0k2;
        C1706Aqc A232;
        String A0k3;
        if (!A01()) {
            DKG.A0Z(this.A01).A02(BOk.A09, 1Br.A03(this.A02)).A00();
            0fH.A0k("CoplayEndGameUtils", "onForceEndCoplay called with empty match id");
            return;
        }
        1BY r0 = this.A00.A00;
        2JX r02 = ((FAb) 1Lm.A03(AbK.A0D(r0), r0, 99472).get()).A00;
        if (r02 == null || (A0k = r02.A0k()) == null) {
            return;
        }
        Ifv ifv = (Ifv) 1Lm.A03(AbK.A0D(r0), r0, 99474).get();
        Long A0n = 1BK.A0n(A0k);
        ERJ erj = ERJ.A02;
        2JX A1Q = r02.A1Q();
        String str = null;
        Long A0n2 = (A1Q == null || (A232 = A1Q.A23()) == null || (A0k3 = A232.A0k()) == null) ? null : 1BK.A0n(A0k3);
        2JX A0L = 1BL.A0L(r02, 1842113458, 793426188);
        Long A0n3 = (A0L == null || (A0k2 = A0L.A0k()) == null) ? null : 1BK.A0n(A0k2);
        String A0t = r02.A0t(GraphQLStringDefUtil.A00(), "GraphQLGamingCoplayMatchStatus", 1489066924);
        ERK erk = null;
        if (A0t != null) {
            switch (A0t.hashCode()) {
                case -2026200673:
                    if (A0t.equals("RUNNING")) {
                        erk = ERK.A04;
                        break;
                    }
                    break;
                case 35394935:
                    if (A0t.equals("PENDING")) {
                        erk = ERK.A03;
                        break;
                    }
                    break;
                case 1692410292:
                    if (A0t.equals("ABANDONED")) {
                        erk = ERK.A01;
                        break;
                    }
                    break;
                case 1899449145:
                    if (A0t.equals("CONCLUDED")) {
                        erk = ERK.A02;
                        break;
                    }
                    break;
            }
        }
        ifv.A00(erj, erk, A0n, A0n2, A0n3);
        FAb fAb = (FAb) 1Lm.A03(AbK.A0D(r0), r0, 99472).get();
        if (A1Q != null && (A23 = A1Q.A23()) != null) {
            str = A23.A0j();
        }
        fAb.A02();
        Iterator it = fAb.A0E.iterator();
        while (it.hasNext()) {
            ((ETl) it.next()).A02(str);
        }
        fAb.A08(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r0.A0k() == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01() {
        /*
            r301 = this;
            r0 = 99472(0x18490, float:1.3939E-40)
            r302 = r0
            r0 = r301
            X.1De r0 = r0.A00
            X.1BY r0 = r0.A00
            r303 = r0
            r0 = r303
            com.facebook.auth.usersession.FbUserSession r0 = X.AbK.A0D(r0)
            r1 = r303
            r2 = r302
            X.1Br r0 = X.1Lm.A03(r0, r1, r2)
            java.lang.Object r0 = r0.get()
            X.FAb r0 = (X.FAb) r0
            X.2JX r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2e
            r0 = r304
            java.lang.String r0 = r0.A0k()
            r303 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            if (r0 != 0) goto L33
        L2e:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L33:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ewj.A01():boolean");
    }
}
