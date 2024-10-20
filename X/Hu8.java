package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: Hu8.class */
public final class Hu8 {
    public int A00;
    public HA2 A01;
    public String A02;
    public String A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 2JM A0C;
    public final HVL A0D;
    public final JDA A0E;
    public final Set A0F;
    public final Context A0G;
    public final 1De A0H;
    public final 54D A0I;
    public final Function1 A0J;

    public Hu8(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0H = r303;
        this.A01 = HA2.A02;
        this.A0F = GOn.A1J();
        Context A0A = 7zM.A0A();
        this.A0G = A0A;
        this.A06 = 1Bq.A00(83426);
        this.A07 = 1BK.A0C();
        this.A05 = 7zM.A0Q();
        1BY r0 = r303.A00;
        this.A0A = 1Bu.A03(r0, 114920);
        this.A0B = 1Bu.A03(r0, 115628);
        this.A09 = GOn.A0g(fbUserSession, r0);
        this.A08 = 1Lm.A03(fbUserSession, r0, 114987);
        this.A04 = 1Lm.A03(fbUserSession, r0, 115580);
        54D r02 = new 54D(fbUserSession, A0A);
        this.A0I = r02;
        J9x j9x = new J9x(this, 38);
        this.A0J = j9x;
        r02.A02(j9x, JAX.A00, false);
        this.A0D = new HVL(this);
        this.A0E = new IYz(this, 0);
        this.A0C = IY8.A01(this, 27);
    }

    public void A00(JFh jFh) {
        11T.A0F(jFh, 0);
        Set set = this.A0F;
        if (set.isEmpty()) {
            User Auc = ((1Ex) 1Br.A0B(this.A06)).Auc();
            this.A03 = Auc != null ? Auc.A13 : null;
            ((Ifu) 1Br.A0B(this.A04)).A02.add(this.A0D);
            GOp.A0g(this.A08).A63(this.A0E);
            2JN A0O = GOp.A0O(this.A09);
            2JM r0 = this.A0C;
            Set emptySet = Collections.emptySet();
            11T.A0A(emptySet);
            A0O.A03(r0, emptySet);
        }
        set.add(jFh);
    }

    public void A01(JFh jFh) {
        11T.A0F(jFh, 0);
        if (GOo.A1Y(jFh, this.A0F)) {
            Ifu ifu = (Ifu) 1Br.A0B(this.A04);
            ifu.A02.remove(this.A0D);
            GOp.A0g(this.A08).CeY(this.A0E);
            GOp.A0O(this.A09).A02(this.A0C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (X.1Br.A07(((X.HUn) X.1Br.A0B(r301.A0B)).A00).AZk(36318376598974979L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A07
            r302 = r0
            r0 = r302
            X.2yD r0 = X.1Br.A07(r0)
            r303 = r0
            r0 = 36313604890434313(0x81030800021b09, double:3.028208183636311E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.2yD.A03(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L42
            r0 = r301
            X.1Br r0 = r0.A0B
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.HUn r0 = (X.HUn) r0
            X.1Br r0 = r0.A00
            X.2yD r0 = X.1Br.A07(r0)
            r303 = r0
            r0 = 36318376598974979(0x81075f00003203, double:3.0312258313315564E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
            r0 = r307
            if (r0 == 0) goto L45
        L42:
            r0 = 1
            r306 = r0
        L45:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hu8.A02():boolean");
    }
}
