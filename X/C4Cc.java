package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.privacy.acs.VoprfRistretto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;

/* renamed from: X.4Cc, reason: invalid class name */
/* loaded from: 4Cc.class */
public final class C4Cc {
    public C4Cg A00;
    public final C4Cb A01;
    public final 4CZ A02;
    public final C4Ce A03;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.4Cg] */
    /* JADX WARN: Type inference failed for: r307v2, types: [X.4QO, X.4Ce] */
    public C4Cc(1Fi r302, C4Cb c4Cb, 4CZ r304, String str) {
        C4Cd c4Cd;
        if (r302 == null) {
            ?? c4Ce = new C4Ce(str);
            c4Ce.A00 = AnonymousClass001.A0u();
            c4Cd = c4Ce;
        } else {
            c4Cd = new C4Cd(r302, str);
        }
        this.A02 = r304;
        this.A01 = c4Cb;
        this.A03 = c4Cd;
        C4Cf c4Cf = new C4Cf(this);
        ?? obj = new Object();
        obj.A04 = str;
        obj.A03 = "";
        obj.A01 = c4Cf;
        obj.A02 = c4Cd;
        obj.A00 = new VoprfRistretto();
        this.A00 = obj;
    }

    public void A00(final MIV miv, byte[] bArr) {
        ArrayList A0s;
        C4Cg c4Cg = this.A00;
        Kpo kpo = new Kpo(c4Cg, new MIV() { // from class: X.4W3
            public void COe(C4S0 c4s0) {
                miv.COe(c4s0);
            }

            public void onFailure(Throwable th) {
                this.A03.A04();
                miv.onFailure(th);
            }
        }, bArr);
        C4Ce c4Ce = c4Cg.A02;
        synchronized (c4Ce) {
            try {
                new ArrayList(C4Ce.A00(c4Ce).values());
            } catch (JSONException unused) {
                A0s = AnonymousClass001.A0s();
            }
        }
        Iterator it = A0s.iterator();
        KSz kSz = null;
        while (it.hasNext()) {
            KSz kSz2 = (KSz) it.next();
            if (System.currentTimeMillis() > kSz2.A03) {
                String str = kSz2.A05;
                synchronized (c4Ce) {
                    11T.A0F(str, 0);
                    try {
                        HashMap A00 = C4Ce.A00(c4Ce);
                        A00.remove(str);
                        C4Ce.A02(c4Ce, A00);
                    } catch (JSONException unused2) {
                        c4Ce.A04();
                    }
                }
            } else if (kSz == null) {
                kSz = kSz2;
            }
        }
        if (kSz != null) {
            kpo.A00(kSz);
            return;
        }
        System.currentTimeMillis();
        C4Cf c4Cf = c4Cg.A01;
        String str2 = c4Cg.A04;
        Khi khi = new Khi(kpo, c4Cg);
        4CZ r0 = c4Cf.A00.A02;
        11T.A0F(str2, 0);
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        graphQlQueryParamSet.A05("projectName", str2);
        2Jf r02 = new 2Jf(2JX.class, (Class) null, "ACSConfigQuery", (String) null, "fbandroid", 786590834, 0, 316187590L, 316187590L, false, true);
        r02.A00 = graphQlQueryParamSet;
        r0.A00.ARJ(new LW2(khi), new LW4(khi, r0), C3sa.A00(r02), r0.A01);
    }
}
