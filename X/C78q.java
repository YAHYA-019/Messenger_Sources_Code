package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.78q, reason: invalid class name */
/* loaded from: 78q.class */
public final class C78q implements 74E {
    public final 1Br A00;
    public final 1Br A01;
    public final FbUserSession A02;
    public final 2Of A03;

    public C78q(FbUserSession fbUserSession, 2Of r303) {
        11T.A0F(fbUserSession, 1);
        11T.A0F(r303, 2);
        this.A02 = fbUserSession;
        this.A03 = r303;
        this.A01 = 1Bq.A00(16385);
        this.A00 = 1Bu.A00(68914);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0074, code lost:
    
        if (((X.2yD) r301.A01.A00.get()).AZk(36318479678648992L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BQh(X.5vW r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            X.5vV r0 = (X.5vV) r0
            r302 = r0
            r0 = r302
            X.5fv r0 = r0.A00
            r304 = r0
            X.5gN r0 = X.C5gN.A00
            r305 = r0
            r0 = r304
            r1 = r305
            X.5PP r0 = r0.AxW(r1)
            X.5wn r0 = (X.C5wn) r0
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L7e
            r0 = r305
            java.lang.String r0 = r0.A04
            r306 = r0
        L2f:
            r0 = r304
            X.5fu r0 = (X.C5fu) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.A0I
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L77
            java.lang.String r0 = "2191329907595522"
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L77
            r0 = r301
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36318479678648992(0x810777000732a0, double:3.031291019332471E-306)
            r307 = r0
            r0 = r304
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = 1
            r303 = r0
            r0 = r309
            if (r0 != 0) goto L7c
        L77:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L7c:
            r0 = r303
            return r0
        L7e:
            r0 = 0
            r309 = r0
            r0 = 0
            r306 = r0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78q.BQh(X.5vW):boolean");
    }

    public void BoE(Context context, View view, 5vW r304) {
        Long l;
        11T.A0G(context, 0, r304);
        C5fv c5fv = ((5vV) r304).A00;
        C5wn c5wn = (C5wn) c5fv.AxW(C5gN.A00);
        9YN r0 = (9YN) 1Br.A0B(this.A00);
        FbUserSession fbUserSession = this.A02;
        Integer num = null;
        if (c5wn != null) {
            num = c5wn.A01;
            l = c5wn.A02;
        } else {
            l = null;
        }
        r0.A00(context, fbUserSession, Boolean.valueOf(((C5fu) c5fv).A0H), num, l, false);
        this.A03.AQN(C6zs.A02);
    }
}
