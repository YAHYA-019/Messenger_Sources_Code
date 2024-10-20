package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.6yp, reason: invalid class name */
/* loaded from: 6yp.class */
public final class C6yp implements C6qv {
    public final Context A00;
    public final FbUserSession A01;
    public final 1pK A02;
    public final 2S4 A03;
    public final ThreadKey A04;
    public final C5j5 A05;
    public final 2Of A06;
    public final 2Oi A07;
    public final 1Va A08;
    public final HeterogeneousMap A09;
    public final C6yo A0A;
    public final C6rj A0B;
    public final 6yM A0C;
    public final 2Og A0D;
    public final 6vP A0E;
    public final C66e A0F;
    public final C5jn A0G;
    public final C01i A0H;
    public final C01i A0I;
    public final boolean A0J;

    public C6yp(Context context, FbUserSession fbUserSession, 1pK r304, 2S4 r305, ThreadKey threadKey, C5j5 c5j5, 2Of r308, 2Oi r309, 1Va r310, HeterogeneousMap heterogeneousMap, C6yo c6yo, C6rj c6rj, 6yM r314, 2Og r315, 6vP r316, C66e c66e, C5jn c5jn, C01i c01i, boolean z) {
        11T.A0F(c5jn, 11);
        this.A04 = threadKey;
        this.A09 = heterogeneousMap;
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A0C = r314;
        this.A03 = r305;
        this.A08 = r310;
        this.A06 = r308;
        this.A0E = r316;
        this.A0G = c5jn;
        this.A0D = r315;
        this.A0F = c66e;
        this.A0J = z;
        this.A05 = c5j5;
        this.A02 = r304;
        this.A0B = c6rj;
        this.A07 = r309;
        this.A0A = c6yo;
        this.A0H = c01i;
        this.A0I = C01g.A00(C03i.A02, new AnonymousClass832(this, 2));
    }

    @Override // X.C6qv
    public C6zG AVG() {
        return null;
    }

    @Override // X.C6qv
    public Context AWp() {
        return this.A00;
    }

    @Override // X.C6qv
    public C6yo AaY() {
        return this.A0A;
    }

    @Override // X.C6qv
    public 2Of AbO() {
        return this.A06;
    }

    @Override // X.C6qv
    public 6yM Ad4() {
        return this.A0C;
    }

    @Override // X.C6qv
    public 1Va Akk() {
        return this.A08;
    }

    @Override // X.C6qv
    public 1pK Alf() {
        return this.A02;
    }

    @Override // X.C6qv
    public FbUserSession Alj() {
        return this.A01;
    }

    @Override // X.C6qv
    public 78B Ao5() {
        return (78B) this.A0H.getValue();
    }

    @Override // X.C6qv
    public 2Og Aoc() {
        return this.A0D;
    }

    @Override // X.C6qv
    public C66e AwD() {
        return this.A0F;
    }

    @Override // X.C6qv
    public C6zG AwI() {
        return null;
    }

    @Override // X.C6qv
    public 75G Awp() {
        return (75G) this.A0I.getValue();
    }

    @Override // X.C6qv
    public C01i Awt() {
        return null;
    }

    @Override // X.C6qv
    public C5jn AxD() {
        return this.A0G;
    }

    @Override // X.C6qv
    public C6rj B6S() {
        return this.A0B;
    }

    @Override // X.C6qv
    public boolean BAl() {
        return this.A0J;
    }

    @Override // X.C6qv
    public 2Oi BBY() {
        return this.A07;
    }

    @Override // X.C6qv
    public HeterogeneousMap BF6() {
        return this.A09;
    }

    @Override // X.C6qv
    public ThreadKey BF7() {
        return this.A04;
    }

    @Override // X.C6qv
    public 2S4 BFS() {
        return this.A03;
    }

    @Override // X.C6qv
    public C5j5 BJ2() {
        return this.A05;
    }
}
