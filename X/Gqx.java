package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqx.class */
public final class Gqx extends GS2 {
    public String A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 2Qe A08;
    public final Context A09;
    public final HIp A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqx(FbUserSession fbUserSession, Context context) {
        super("DominantSpeakerModeParticipantContainerPresenter");
        1BL.A1F(fbUserSession, context);
        this.A01 = fbUserSession;
        this.A09 = context;
        this.A06 = 1Bu.A01(context, 114920);
        this.A02 = GOn.A0a(context, fbUserSession);
        this.A03 = GOn.A0e(context, fbUserSession);
        this.A07 = 1Lm.A00(context, fbUserSession, 114851);
        this.A04 = 1Lm.A00(context, fbUserSession, 114987);
        this.A05 = GOn.A0Z(context, fbUserSession);
        1Bu.A00(115688).get();
        this.A0A = (HIp) 1Bn.A0A(115689);
        this.A08 = new Gyx(this, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r0.A03.A03.equals(r0) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.Gqx r301) {
        /*
            r0 = r301
            java.lang.String r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L7b
            r0 = r301
            X.1Br r0 = r0.A05
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            X.2QO r0 = X.GOn.A0z(r0)
            X.I9O r0 = r0.Ai6()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r304
            X.3Oh r0 = r0.A03
            java.lang.String r0 = r0.A03
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L3c
        L39:
            r0 = 0
            r307 = r0
        L3c:
            r0 = r301
            X.1Br r0 = r0.A04
            X.JOG r0 = X.GOp.A0g(r0)
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.BUm(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L7c
            r0 = r307
            if (r0 == 0) goto L7c
            r0 = r303
            X.2QN r0 = X.AbJ.A0j(r0)
            r304 = r0
            r0 = r304
            boolean r0 = r0.A0R
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L7c
        L67:
            X.RrK r0 = new X.RrK
            r304 = r0
            r0 = r304
            r1 = r307
            r2 = r302
            r3 = r305
            r4 = r308
            r0.<init>(r1, r2, r3, r4)
            r0 = r301
            r1 = r304
            r0.A0Z(r1)
        L7b:
            return
        L7c:
            r0 = 0
            r305 = r0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gqx.A00(X.Gqx):void");
    }
}
