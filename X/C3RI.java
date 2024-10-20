package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.FbInjector;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3RI, reason: invalid class name */
/* loaded from: 3RI.class */
public final class C3RI {
    public 2Ps A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 3Je A0G;
    public final 1G2 A0H;
    public final Set A0I;
    public final FbUserSession A0J;
    public final FbUserSession A0K;
    public final 1Fv A0L;
    public final ViewerContext A0M;
    public final 1BP A0N;
    public final 1De A0O;

    public C3RI(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0O = r303;
        this.A0J = fbUserSession;
        this.A0N = FbInjector.A00;
        this.A0I = new LinkedHashSet();
        this.A01 = 0S2.A00;
        this.A09 = 1Bq.A00(66606);
        this.A07 = 1Bq.A00(66265);
        this.A0D = 1Bq.A00(84105);
        1BY r0 = r303.A00;
        this.A0A = 1Bu.A03(r0, 68142);
        this.A08 = 1BK.A0E();
        this.A06 = 1Bq.A00(16462);
        this.A0F = 1Bq.A00(16432);
        ViewerContext Aue = fbUserSession.Aue();
        this.A0M = Aue;
        1Fv r02 = (1Fv) 1Bi.A03(66351);
        this.A0L = r02;
        11T.A0D(Aue);
        FbUserSession A08 = r02.A08(Aue);
        this.A0K = A08;
        this.A05 = 1Lm.A03(A08, r0, 115386);
        this.A0B = 1Lm.A03(fbUserSession, r0, 83976);
        this.A0C = 1Lm.A03(fbUserSession, r0, 16686);
        this.A0H = 1G3.A00(1NK.A1z, "should_send_request_resnapshot");
        this.A0E = 1Bq.A00(66774);
        this.A0G = new 3Je(this);
        if (1PG.A03((1PG) 1Br.A0B(this.A07), true)) {
            C21S.A00(new Iad(this, 2), (1Uj) 1Br.A0B(this.A0C));
            A02(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r302 == X.0S2.A0C) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.C3RI r301, java.lang.Integer r302) {
        /*
            r0 = r301
            boolean r0 = r0.A03
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L26
            java.lang.Integer r0 = X.0S2.A01
            r305 = r0
            r0 = r302
            r1 = r305
            if (r0 == r1) goto L26
            java.lang.Integer r0 = X.0S2.A0C
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L28
        L26:
            r0 = 1
            r303 = r0
        L28:
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r301
            X.1Br r0 = r0.A0D
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.C2y r0 = (X.C2y) r0
            r306 = r0
            java.lang.Integer r0 = X.0S2.A01
            r305 = r0
            r0 = r302
            r1 = r305
            if (r0 != r1) goto L46
            r0 = 1
            r304 = r0
        L46:
            r0 = r306
            r1 = r304
            r0.A00 = r1
            r0 = r301
            r1 = r302
            r0.A01 = r1
            r0 = r301
            X.1Br r0 = r0.A0F
            java.lang.Object r0 = X.1Br.A0B(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r306 = r0
            X.S8F r0 = new X.S8F
            r305 = r0
            r0 = r305
            r1 = r301
            r0.<init>(r1)
            r0 = r306
            r1 = r305
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RI.A00(X.3RI, java.lang.Integer):void");
    }

    public Integer A01() {
        return ((C2bq) 1Br.A0B(this.A09)).A00() ? this.A01 : 0S2.A00;
    }

    public final void A02(boolean z) {
        MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(this.A0B);
        long parseLong = Long.parseLong(this.A0J.A02);
        PrivacyContext A00 = ((AnonymousClass224) 1Br.A0B(this.A0E)).A00("367103207806489");
        Iai iai = new Iai(2, this, z);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, iai);
        1Um.A02(AQV, new Czh(3, parseLong, A00, mailboxFeature, A0Q), A0Q, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011e, code lost:
    
        if (r302 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RI.A03(boolean, boolean):void");
    }
}
