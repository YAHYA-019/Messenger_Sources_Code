package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;

/* renamed from: X.6vt, reason: invalid class name */
/* loaded from: 6vt.class */
public final class C6vt {
    /* JADX WARN: Multi-variable type inference failed */
    public C79j A00(Context context, FbUserSession fbUserSession, 1pK r304, 2S4 r305, ThreadKey threadKey, 6vO r307, C07684ke c07684ke, C5j5 c5j5, 2Of r310, 2Oi r311, 1Va r312, HeterogeneousMap heterogeneousMap, C6rj c6rj, 6tF r315, 2Og r316, 6vP r317, 6O9 r318) {
        6rM r335;
        Object obj;
        7xP r336;
        C07684ke c07684ke2 = c07684ke;
        11T.A0F(c5j5, 1);
        11T.A0F(threadKey, 2);
        11T.A0F(fbUserSession, 3);
        11T.A0F(r316, 4);
        11T.A0F(r310, 5);
        11T.A0F(r311, 6);
        11T.A0F(c6rj, 8);
        11T.A0F(r315, 10);
        11T.A0F(r304, 11);
        11T.A0F(r305, 14);
        11T.A0F(r312, 15);
        11T.A0F(heterogeneousMap, 16);
        if (ThreadKey.A0n(threadKey)) {
            throw AnonymousClass001.A0N("Secret Conversation thread type is not supported");
        }
        1Bn.A0A(66982);
        6vP r3352 = null;
        if (c07684ke == null) {
            2xJ r0 = 2Gs.A00;
            ThreadThemeInfo threadThemeInfo = 2xJ.A00;
            C1pq.A08("threadThemeInfo", threadThemeInfo);
            c07684ke2 = new C07684ke(threadThemeInfo);
        }
        ThreadThemeInfo threadThemeInfo2 = c07684ke2.A00;
        11T.A0A(threadThemeInfo2);
        ThreadViewColorScheme threadViewColorScheme = (ThreadViewColorScheme) 1Bn.A0E(context, (1BY) null, 68548);
        C66d A00 = ((C66c) 1Bn.A0A(67807)).A00(threadKey);
        C01i A002 = C01g.A00(C03i.A02, new AnonymousClass834(r317, 41));
        C5jn c5jn = ((C5ju) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 67785)).AgW(threadKey).A02;
        6yI r02 = new 6yI(threadViewColorScheme, threadThemeInfo2);
        if (!r02.Ao4(context).isEmpty()) {
            r3352 = r317;
        }
        C6yp c6yp = new C6yp(context, fbUserSession, r304, r305, threadKey, c5j5, r310, r311, r312, heterogeneousMap, new C6yo() { // from class: X.6yl
            public final 1Br A00 = 1Bq.A00(16385);

            /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
            
                if (((X.2yD) r301.A00.A00.get()).AZk(36323040934447286L) == false) goto L6;
             */
            @Override // X.C6yo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean Cz9() {
                /*
                    r301 = this;
                    boolean r0 = X.2sM.A00
                    r302 = r0
                    r0 = r302
                    if (r0 == 0) goto L30
                    r0 = r301
                    X.1Br r0 = r0.A00
                    X.00i r0 = r0.A00
                    r303 = r0
                    r0 = r303
                    java.lang.Object r0 = r0.get()
                    X.2yD r0 = (X.2yD) r0
                    r304 = r0
                    r0 = 36323040934447286(0x810b9d000f48b6, double:3.034175575866015E-306)
                    r305 = r0
                    r0 = r304
                    r1 = r305
                    boolean r0 = r0.AZk(r1)
                    r307 = r0
                    r0 = 1
                    r302 = r0
                    r0 = r307
                    if (r0 != 0) goto L34
                L30:
                    r0 = 0
                    r302 = r0
                    r0 = 0
                    r303 = r0
                L34:
                    r0 = r302
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6yl.Cz9():boolean");
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
            
                if (((X.2yD) r301.A00.A00.get()).AZk(36323040934447286L) == false) goto L8;
             */
            @Override // X.C6yo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean CzA() {
                /*
                    r301 = this;
                    java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
                    r302 = r0
                    r0 = r302
                    long r0 = r0.maxMemory()
                    r303 = r0
                    r0 = 268435456(0x10000000, double:1.32624737E-315)
                    r305 = r0
                    r0 = r303
                    r1 = r305
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    r307 = r0
                    r0 = r307
                    if (r0 <= 0) goto L23
                    boolean r0 = X.2sM.A00
                    r307 = r0
                    r0 = r307
                    if (r0 == 0) goto L4e
                L23:
                    r0 = r301
                    X.1Br r0 = r0.A00
                    X.00i r0 = r0.A00
                    r302 = r0
                    r0 = r302
                    java.lang.Object r0 = r0.get()
                    X.2yD r0 = (X.2yD) r0
                    r308 = r0
                    r0 = 36323040934447286(0x810b9d000f48b6, double:3.034175575866015E-306)
                    r309 = r0
                    r0 = r308
                    r1 = r309
                    boolean r0 = r0.AZk(r1)
                    r311 = r0
                    r0 = 1
                    r307 = r0
                    r0 = r311
                    if (r0 != 0) goto L53
                L4e:
                    r0 = 0
                    r307 = r0
                    r0 = 0
                    r302 = r0
                L53:
                    r0 = r307
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6yl.CzA():boolean");
            }
        }, c6rj, r02, r316, r3352, A00, c5jn, A002, C6yj.A01(threadKey));
        C6yq c6yq = new C6yq(context, threadViewColorScheme);
        boolean A0z = threadKey.A0z();
        if (A0z && (r304 instanceof C6yx)) {
            r335 = new 6rM(r307, c6yq, r315, c6yp, r318);
            obj = new Object();
            r336 = 7xP.A00;
        } else if (A0z) {
            r335 = new 6rM(r307, c6yq, r315, c6yp, r318);
            obj = 6zO.A04;
            r336 = 6zZ.A00;
        } else if (threadKey.A1H()) {
            r335 = new 6rM(r307, c6yq, r315, c6yp, r318);
            obj = new Object();
            r336 = AT0.A00;
        } else if (threadKey.A0y()) {
            r335 = new C6rO(r307, c6yq, r315, c6yp, r318, ((71L) 1Bi.A03(66805)).A00());
            obj = AA8.A07;
            r336 = ASz.A00;
        } else {
            r335 = new 6rM(r307, c6yq, r315, c6yp, r318);
            obj = 6zO.A04;
            r336 = 7VK.A00;
        }
        return new C6qu(r335, obj, r336).A01();
    }
}
