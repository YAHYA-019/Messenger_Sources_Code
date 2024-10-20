package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function1;

/* renamed from: X.770, reason: invalid class name */
/* loaded from: 770.class */
public final class AnonymousClass770 implements 74E {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;
    public final 2Of A07;
    public final 6yJ A08;
    public final 2Og A09;
    public final Function1 A0A;
    public final C66e A0B;

    public AnonymousClass770(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 2Of r305, 6yJ r306, 2Og r307, C66e c66e, Function1 function1) {
        11T.A0F(context, 1);
        11T.A0F(r305, 2);
        11T.A0F(fbUserSession, 3);
        11T.A0F(r307, 4);
        11T.A0F(threadKey, 5);
        11T.A0F(r306, 6);
        this.A00 = context;
        this.A07 = r305;
        this.A01 = fbUserSession;
        this.A09 = r307;
        this.A06 = threadKey;
        this.A08 = r306;
        this.A0B = c66e;
        this.A0A = function1;
        this.A02 = 1Bq.A00(67699);
        this.A05 = 1Bu.A00(66641);
        this.A04 = 1Bq.A00(66642);
        this.A03 = 1Bq.A00(16385);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b3, code lost:
    
        if (r305 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(android.view.View r301, final X.AnonymousClass770 r302, final X.5vW r303) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass770.A00(android.view.View, X.770, X.5vW):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if ((!((X.C5ft) r0).A01.isEmpty()) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        if ((!r0.isEmpty()) == false) goto L11;
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
            r0 = r304
            boolean r0 = r0 instanceof X.C5ft
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L38
            r0 = r304
            r303 = r0
            r0 = r304
            X.5ft r0 = (X.C5ft) r0
            com.google.common.collect.ImmutableList r0 = r0.A01
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L3b
        L38:
            r0 = 0
            r306 = r0
        L3b:
            r0 = r304
            boolean r0 = r0 instanceof X.5gR
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L69
            r0 = r304
            r303 = r0
            r0 = r304
            X.5gR r0 = (X.5gR) r0
            com.facebook.xapp.messaging.threadview.model.video.VideoAttachment r0 = r0.A00
            com.google.common.collect.ImmutableList r0 = r0.A00()
            r303 = r0
            r0 = r303
            X.11T.A0A(r0)
            r0 = r303
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
            r0 = 1
            r307 = r0
            r0 = r305
            if (r0 != 0) goto L6c
        L69:
            r0 = 0
            r307 = r0
        L6c:
            r0 = r301
            X.2Og r0 = r0.A09
            r303 = r0
            r0 = r303
            X.06Z r0 = r0.BdK()
            r308 = r0
            r0 = r308
            if (r0 == 0) goto La1
            r0 = 349(0x15d, float:4.89E-43)
            r305 = r0
            r0 = r305
            java.lang.String r0 = X.7zK.A00(r0)
            r303 = r0
            r0 = r308
            r1 = r303
            androidx.fragment.app.Fragment r0 = r0.A0b(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La1
            r0 = r303
            boolean r0 = r0.isAdded()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La1
        L9f:
            r0 = 0
            return r0
        La1:
            r0 = r304
            X.5fu r0 = (X.C5fu) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.A0I
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L9f
            r0 = r306
            if (r0 != 0) goto Lbb
            r0 = r307
            if (r0 == 0) goto L9f
        Lbb:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass770.BQh(X.5vW):boolean");
    }

    public void BoE(Context context, View view, 5vW r304) {
        11T.A0F(context, 0);
        11T.A0F(view, 1);
        11T.A0F(r304, 2);
        06Z BdK = this.A09.BdK();
        if (BdK != null) {
            C5fv c5fv = ((5vV) r304).A00;
            if (((c5fv instanceof C5ft) && !((C5ft) c5fv).A01.isEmpty()) || (c5fv instanceof 5gR) || (c5fv instanceof 7Hd)) {
                11T.A0F(c5fv, 0);
                if (AnonymousClass001.A1W(C5fv.A00(c5fv), 0S2.A01)) {
                    7Hh AxW = c5fv.AxW(5tS.A00);
                    if (AxW == null || !AxW.A01 || ((79A) 1Br.A0B(this.A05)).A00(BdK, new AQj(21, this, view, context, r304))) {
                        return;
                    }
                }
                A00(view, this, r304);
            }
        }
    }
}
