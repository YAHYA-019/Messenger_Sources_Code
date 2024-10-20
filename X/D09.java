package X;

import android.content.pm.PackageManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: D09.class */
public final class D09 implements 2QP {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Set A06;
    public final FbUserSession A07;
    public final 1De A08;
    public final 1Br A09;
    public final 1Br A0A;

    public D09(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A07 = fbUserSession;
        1BY r0 = r303.A00;
        this.A00 = 1Bu.A03(r0, 114745);
        this.A0A = 1Lm.A03(fbUserSession, r0, 114831);
        this.A03 = 1Lm.A03(fbUserSession, r0, 99977);
        this.A09 = 1Lm.A03(fbUserSession, r0, 33088);
        this.A05 = 1Lm.A03(fbUserSession, r0, 33102);
        this.A04 = 1Bu.A03(r0, 82159);
        this.A02 = 1Bq.A00(100169);
        this.A01 = 1Bu.A03(r0, 82592);
        this.A06 = 7zL.A15();
    }

    private final boolean A00() {
        C00i c00i = this.A03.A00;
        if (!AbJ.A0j(c00i).A0Q) {
            ThreadSummary threadSummary = AbJ.A0j(c00i).A06;
            if (threadSummary == null) {
                return false;
            }
            Iterator<E> it = 2Gt.A03(threadSummary).iterator();
            while (it.hasNext()) {
                User A00 = ((23F) 1Br.A0B(this.A05)).A00(C28p.A01(4YU.A0W(it)));
                if (A00 == null || !A00.A0F()) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A01() {
        return AnonymousClass001.A1N(((PackageManager) 1Br.A0B(this.A02)).hasSystemFeature(JQw.A00(223)) ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0080, code lost:
    
        if (((X.I3a) X.1Br.A0B(r301.A01)).A01(r0, X.0S2.A03) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A04
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.Bmc r0 = (X.Bmc) r0
            r302 = r0
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = r0.A07
            r303 = r0
            r0 = 83981(0x1480d, float:1.17682E-40)
            r304 = r0
            r0 = r302
            X.1De r0 = r0.A00
            X.1BY r0 = r0.A00
            r1 = r304
            X.1BV r0 = X.1BV.A01(r0, r1)
            r305 = r0
            r0 = r302
            X.1Br r0 = r0.A01
            r306 = r0
            r0 = r306
            X.2yD r0 = X.1Br.A07(r0)
            r302 = r0
            r0 = 2342155089390669657(0x208101a500010f59, double:4.058870542132514E-152)
            r307 = r0
            r0 = r302
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L83
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.Hne r0 = (X.Hne) r0
            r306 = r0
            r0 = r306
            r1 = r303
            boolean r0 = r0.A00(r1)
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L83
            r0 = r301
            boolean r0 = r0.A00()
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L83
            r0 = r301
            X.1Br r0 = r0.A01
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.I3a r0 = (X.I3a) r0
            r310 = r0
            java.lang.Integer r0 = X.0S2.A03
            r306 = r0
            r0 = r310
            r1 = r303
            r2 = r306
            boolean r0 = r0.A01(r1, r2)
            r304 = r0
            r0 = 1
            r309 = r0
            r0 = r304
            if (r0 != 0) goto L89
        L83:
            r0 = 0
            r309 = r0
            r0 = 0
            r306 = r0
        L89:
            r0 = r309
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D09.A02():boolean");
    }

    public final boolean A03() {
        if (A00()) {
            return false;
        }
        C00i c00i = this.A03.A00;
        if (!AbJ.A0j(c00i).A0V) {
            if (!((I3a) 1Br.A0B(this.A01)).A01(this.A07, 0S2.A04)) {
                return false;
            }
        }
        ThreadSummary threadSummary = AbJ.A0j(c00i).A06;
        return threadSummary == null || !C2o7.A01(threadSummary);
    }

    public java.util.Map CYl() {
        LinkedHashMap A1C = 1BK.A1C();
        A1C.put("Is PiP enabled", String.valueOf(A01()));
        return A1C;
    }
}
