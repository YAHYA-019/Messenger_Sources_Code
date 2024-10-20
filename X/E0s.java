package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: E0s.class */
public final class E0s extends 2Yf {
    public long A00;
    public long A01;
    public C7z0 A02;
    public 1Im A03;
    public GEx A04;
    public FEp A05;
    public boolean A06;

    public E0s() {
        super("GraphQLRootQuerySection");
        this.A06 = true;
        long j = -1;
        this.A00 = j;
        this.A01 = j;
    }

    public Object A0M(2Yf r302) {
        return ((E0s) r302).A05;
    }

    public void A0N(2Yf r302, 2Yf r303, C1qb c1qb) {
        ((E0s) r303).A05 = ((E0s) r302).A05;
    }

    public void A0O(C1qb c1qb) {
        boolean z;
        E0c e0c = (E0c) ((2Yf) this).A03;
        FEp fEp = this.A05;
        Et0 et0 = e0c.A03;
        C7z0 c7z0 = this.A02;
        if (fEp != null) {
            synchronized (et0) {
                et0.A01 = c1qb;
            }
            synchronized (et0) {
                et0.A00 = c7z0;
            }
            synchronized (fEp) {
                fEp.A00 = et0;
                List list = fEp.A03;
                if (!list.isEmpty()) {
                    ArrayList A17 = 1BK.A17(list);
                    list.clear();
                    int size = A17.size();
                    for (int i = 0; i < size; i++) {
                        et0.A00((GraphQLResult) A17.get(i));
                    }
                }
            }
            synchronized (fEp) {
                z = !fEp.A01;
            }
            if (z) {
                2Yg.A0H(c1qb, 0S2.A00, (Throwable) null, false);
                FEp.A00(fEp);
            }
        }
    }

    public void A0P(C1qb c1qb) {
        GEx gEx = this.A04;
        long j = this.A01;
        long j2 = this.A00;
        boolean z = this.A06;
        QuickPerformanceLogger A0d = DKE.A0d();
        4fE r0 = (4fE) 1Bn.A0E(((1Iw) c1qb).A0D, (1BY) null, 68126);
        1Bi.A03(16449);
        this.A05 = new FEp(r0, gEx, A0d, j, j2, z);
    }

    public void A0Q(C1qb c1qb) {
        FEp fEp = this.A05;
        if (fEp != null) {
            synchronized (fEp) {
                fEp.A01 = false;
            }
            FEp.A00(fEp);
        }
    }

    public void A0R(C1qb c1qb) {
        E0c e0c = (E0c) ((2Yf) this).A03;
        FEp fEp = this.A05;
        Et0 et0 = e0c.A03;
        if (fEp != null) {
            synchronized (et0) {
                et0.A01 = null;
            }
            synchronized (et0) {
                et0.A00 = null;
            }
            synchronized (fEp) {
                fEp.A00 = null;
            }
        }
    }

    public void A0X(2Yv r302, 2Yv r303) {
        E0c e0c = (E0c) r302;
        E0c e0c2 = (E0c) r303;
        e0c2.A05 = e0c.A05;
        e0c2.A01 = e0c.A01;
        e0c2.A07 = e0c.A07;
        e0c2.A02 = e0c.A02;
        e0c2.A06 = e0c.A06;
        e0c2.A03 = e0c.A03;
        e0c2.A00 = e0c.A00;
        e0c2.A04 = e0c.A04;
    }

    public void A0Y(C1qp c1qp) {
        if (c1qp != null) {
            this.A02 = (C7z0) c1qp.A01(C7z0.class);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.Et0, java.lang.Object] */
    public void A0a(C1qb c1qb) {
        E0c e0c = (E0c) ((2Yf) this).A03;
        ELK elk = ELK.A04;
        ELJ elj = ELJ.A04;
        ?? obj = new Object();
        F8A f8a = new F8A();
        e0c.A02 = elk;
        e0c.A01 = elj;
        e0c.A03 = obj;
        e0c.A04 = f8a;
    }

    public boolean A0c(2Yf r302, 2Yf r303, C1qb c1qb, C1qb c1qb2) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.9TF, java.lang.Object] */
    public 2Ys A0d(C1qb c1qb) {
        E0c e0c = (E0c) ((2Yf) this).A03;
        ELK elk = e0c.A02;
        Object obj = e0c.A06;
        Object obj2 = e0c.A05;
        ELJ elj = e0c.A01;
        Throwable th = e0c.A07;
        02W.A06(elk != ELK.A02 || (obj == null && th != null), "Fetch state is DOWNLOAD_ERROR but response model/fetch error are not properly set.");
        1Im r310 = c1qb.A0J() == null ? null : ((E0s) c1qb.A0J()).A03;
        ?? obj3 = new Object();
        ((9TF) obj3).A03 = obj;
        ((9TF) obj3).A02 = obj2;
        ((9TF) obj3).A01 = elk;
        ((9TF) obj3).A04 = th;
        ((9TF) obj3).A00 = elj;
        return (2Ys) r310.A00((Object) obj3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        2Yf A0g = super.A0g(z);
        if (!z) {
            A0g.A03 = new Object();
        }
        return A0g;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0s e0s = (E0s) r302;
            if (this.A06 != e0s.A06 || this.A00 != e0s.A00 || this.A01 != e0s.A01) {
                return false;
            }
            GEx gEx = this.A04;
            GEx gEx2 = e0s.A04;
            if (gEx != null) {
                if (!gEx.equals(gEx2)) {
                    return false;
                }
            } else if (gEx2 != null) {
                return false;
            }
            C7z0 c7z0 = this.A02;
            C7z0 c7z02 = e0s.A02;
            if (c7z0 != null) {
                if (!c7z0.equals(c7z02)) {
                    return false;
                }
            } else if (c7z02 != null) {
                return false;
            }
        }
        return true;
    }
}
