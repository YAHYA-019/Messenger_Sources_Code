package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphservice.interfaces.Summary;

/* loaded from: Et0.class */
public final class Et0 {
    public C7z0 A00;
    public C1qb A01;

    public void A00(GraphQLResult graphQLResult) {
        C1qb c1qb;
        synchronized (this) {
            c1qb = this.A01;
        }
        if (c1qb != null) {
            Object obj = ((AbstractC08294mh) graphQLResult).A03;
            int ordinal = ((AbstractC08294mh) graphQLResult).A01.ordinal();
            ELJ elj = ordinal != 0 ? ordinal != 2 ? ELJ.A01 : ELJ.A02 : ELJ.A03;
            ELK elk = ELK.A03;
            Summary summary = ((AbstractC08294mh) graphQLResult).A02;
            if (c1qb.A0J() != null) {
                c1qb.A0H(new C2l4(new Object[]{elk, obj, elj, summary, null}, 0), "updateState:GraphQLRootQuerySection.updateState");
            }
            2Yg.A0H(c1qb, 0S2.A0C, (Throwable) null, false);
        }
    }
}
