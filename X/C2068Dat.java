package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Dat, reason: case insensitive filesystem */
/* loaded from: Dat.class */
public final class C2068Dat extends 1RM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FEp A01;

    public C2068Dat(FEp fEp, int i) {
        this.A01 = fEp;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        Et0 et0;
        GraphQLResult graphQLResult = (GraphQLResult) obj;
        FEp fEp = this.A01;
        int i = this.A00;
        synchronized (fEp) {
            et0 = fEp.A00;
        }
        QuickPerformanceLogger quickPerformanceLogger = fEp.A02;
        quickPerformanceLogger.markerAnnotate(9043996, i, "data_freshness", ((AbstractC08294mh) graphQLResult).A01.name());
        short s = 33;
        if (((AbstractC08294mh) graphQLResult).A03 != null) {
            s = 2;
        }
        quickPerformanceLogger.markerEnd(9043996, i, s);
        if (et0 != null) {
            et0.A00(graphQLResult);
        } else {
            synchronized (fEp) {
                fEp.A03.add(graphQLResult);
            }
        }
    }

    public void A03(Throwable th) {
        Et0 et0;
        C1qb c1qb;
        C7z0 c7z0;
        FEp fEp = this.A01;
        int i = this.A00;
        synchronized (fEp) {
            et0 = fEp.A00;
        }
        if (th == null) {
            throw AnonymousClass001.A0Q("freshness");
        }
        fEp.A02.markerEnd(9043996, i, (short) 3);
        if (et0 != null) {
            synchronized (et0) {
                c1qb = et0.A01;
                c7z0 = et0.A00;
            }
            if (c1qb != null) {
                if (c7z0 != null) {
                    c7z0.ARr(th.getMessage());
                }
                ELK elk = ELK.A02;
                ELJ elj = ELJ.A04;
                if (c1qb.A0J() != null) {
                    c1qb.A0H(new C2l4(new Object[]{elk, null, elj, null, th}, 0), "updateState:GraphQLRootQuerySection.updateState");
                }
                2Yg.A0H(c1qb, 0S2.A0N, (Throwable) null, true);
            }
        }
    }
}
