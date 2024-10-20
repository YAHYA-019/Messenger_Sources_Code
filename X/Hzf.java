package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Hzf.class */
public final class Hzf {
    public HUu A00;
    public final C1qN A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final java.util.Map A05;
    public final 1De A06;

    public Hzf(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        this.A04 = 1Bq.A00(16481);
        1BY r0 = r303.A00;
        this.A02 = 1Lm.A03(fbUserSession, r0, 99979);
        this.A03 = GOn.A0g(fbUserSession, r0);
        this.A01 = new C1qN();
        this.A05 = 1BK.A1C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r0 == 7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.Hzf r301, java.lang.String r302) {
        /*
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            com.facebook.rsys.call.gen.CallModel r0 = X.AbL.A0V(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L8e
            r0 = r304
            java.util.ArrayList r0 = r0.remoteParticipants
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L8e
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r305 = r0
            r0 = r304
            java.util.Iterator r0 = r0.iterator()
            r306 = r0
        L2a:
            r0 = r306
            boolean r0 = r0.hasNext()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L64
            r0 = r306
            java.lang.Object r0 = r0.next()
            r308 = r0
            r0 = r308
            r304 = r0
            r0 = r308
            com.facebook.rsys.call.gen.CallParticipant r0 = (com.facebook.rsys.call.gen.CallParticipant) r0
            java.lang.String r0 = r0.userId
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = X.11T.A0O(r0, r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L2a
            r0 = r305
            r1 = r308
            boolean r0 = r0.add(r1)
            goto L2a
        L64:
            r0 = r305
            r1 = 0
            java.lang.Object r0 = X.0QD.A0J(r0, r1)
            com.facebook.rsys.call.gen.CallParticipant r0 = (com.facebook.rsys.call.gen.CallParticipant) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L8e
            r0 = r304
            int r0 = r0.state
            r309 = r0
            r0 = 6
            r307 = r0
            r0 = r309
            r1 = r307
            if (r0 == r1) goto L9b
            r0 = 7
            r307 = r0
            r0 = r309
            r1 = r307
            if (r0 == r1) goto L9b
        L8e:
            r0 = r301
            X.1Br r0 = r0.A02
            X.IRF r0 = X.GOp.A0s(r0)
            r304 = r0
            r0 = r304
            r1 = r302
            r0.A0p(r1)
        L9b:
            r0 = r301
            X.1qN r0 = r0.A01
            r1 = r302
            java.lang.Object r0 = r0.remove(r1)
            r0 = r301
            X.HUu r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lb6
            r0 = r304
            X.GpY r0 = r0.A00
            r304 = r0
            r0 = r304
            X.GpY.A08(r0)
        Lb6:
            r0 = r303
            X.2JN r0 = X.GOo.A0R(r0)
            r308 = r0
            X.HAp r0 = X.HAp.A0M
            r304 = r0
            r0 = r308
            r1 = r304
            r0.A04(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hzf.A00(X.Hzf, java.lang.String):void");
    }
}
