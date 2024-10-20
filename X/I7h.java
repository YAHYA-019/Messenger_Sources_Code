package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: I7h.class */
public final class I7h {
    public final FbUserSession A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;

    public I7h(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A09 = A03;
        this.A00 = 1Br.A03(A03);
        this.A04 = 1BK.A0E();
        this.A02 = 7zM.A0d();
        this.A08 = 1Bu.A03(r0, 82710);
        this.A07 = 1Bq.A00(83005);
        this.A06 = 1Bu.A03(r0, 98321);
        this.A05 = 1Bu.A03(r0, 82592);
        this.A03 = 1Bu.A03(r0, 67527);
    }

    public static final List A00(I7h i7h, String str) {
        long A00 = 1Br.A00(i7h.A02);
        1G2 A002 = 1G3.A00(51K.A0Y, str);
        C00i c00i = i7h.A04.A00;
        String A0r = 4YV.A0r(1BK.A0S(c00i), A002);
        if (AnonymousClass001.A1O(A0r.length())) {
            return 7zU.A0r(A00);
        }
        try {
            List A0M = 0CU.A0M(A0r, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
            ArrayList A0z = 1BL.A0z(A0M);
            Iterator it = A0M.iterator();
            while (it.hasNext()) {
                4YU.A1W(A0z, Long.parseLong(4YU.A13(AnonymousClass001.A0i(it))));
            }
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj : A0z) {
                if (AnonymousClass001.A1P((AnonymousClass001.A05(obj) > (A00 - 300000) ? 1 : (AnonymousClass001.A05(obj) == (A00 - 300000) ? 0 : -1)))) {
                    A0s.add(obj);
                }
            }
            return 0QD.A0P(Long.valueOf(A00), A0s);
        } catch (NumberFormatException unused) {
            1Ql A0U = 1BL.A0U(c00i);
            A0U.Cdj(A002);
            A0U.commit();
            return 7zU.A0r(A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0096, code lost:
    
        r314 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x006b, code lost:
    
        if (X.GOp.A0N(r302.A05).A01(r0, X.0S2.A0C) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0093, code lost:
    
        if (((X.5VV) X.1Br.A0B(r302.A06)).A01(r312).contains(X.5VW.A06) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009b, code lost:
    
        return r314;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(com.facebook.messaging.model.threadkey.ThreadKey r301, X.I7h r302, java.lang.String r303) {
        /*
            r0 = r301
            boolean r0 = r0.A0x()
            r304 = r0
            r0 = r302
            X.1Br r0 = r0.A07
            r305 = r0
            r0 = r305
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.C9V r0 = (X.C9V) r0
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L9c
            r0 = r302
            com.facebook.auth.usersession.FbUserSession r0 = r0.A00
            r307 = r0
            r0 = r303
            long r0 = java.lang.Long.parseLong(r0)
            r308 = r0
            r0 = r302
            X.1Br r0 = r0.A09
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.1EZ r0 = (X.1EZ) r0
            com.facebook.auth.viewercontext.ViewerContext r0 = r0.ChJ()
            java.lang.String r0 = r0.mUserId
            long r0 = X.AbG.A03(r0)
            r310 = r0
            r0 = r308
            r1 = r310
            com.facebook.messaging.model.threadkey.ThreadKey r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0H(r0, r1)
            r305 = r0
            r0 = r306
            r1 = r307
            r2 = r305
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A00(r1, r2)
            r312 = r0
            r0 = r302
            X.1Br r0 = r0.A05
            X.I3a r0 = X.GOp.A0N(r0)
            r313 = r0
            java.lang.Integer r0 = X.0S2.A0C
            r305 = r0
            r0 = r313
            r1 = r307
            r2 = r305
            boolean r0 = r0.A01(r1, r2)
            r314 = r0
            r0 = r314
            if (r0 == 0) goto L96
        L6e:
            r0 = r302
            X.1Br r0 = r0.A06
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.5VV r0 = (X.5VV) r0
            r1 = r312
            com.google.common.collect.ImmutableSet r0 = r0.A01(r1)
            r313 = r0
            X.5VW r0 = X.5VW.A06
            r305 = r0
            r0 = r313
            r1 = r305
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = 0
            r314 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L99
        L96:
            r0 = 1
            r314 = r0
        L99:
            r0 = r314
            return r0
        L9c:
            r0 = r302
            com.facebook.auth.usersession.FbUserSession r0 = r0.A00
            r305 = r0
            r0 = r306
            r1 = r305
            r2 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A00(r1, r2)
            r312 = r0
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7h.A01(com.facebook.messaging.model.threadkey.ThreadKey, X.I7h, java.lang.String):boolean");
    }
}
