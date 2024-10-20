package X;

import com.facebook.graphql.executor.GraphQLResult;

/* loaded from: Hs1.class */
public final class Hs1 {
    public C7z0 A00;
    public C7z0 A01;
    public final 1Br A02 = 1Bq.A00(32913);

    public final void A00(GraphQLResult graphQLResult, String str) {
        synchronized (this) {
            if (graphQLResult == null) {
                C7z0 c7z0 = this.A01;
                if (c7z0 != null) {
                    c7z0.Bf9(str, true);
                }
            } else {
                C7z0 c7z02 = this.A01;
                if (c7z02 != null) {
                    c7z02.BfB(graphQLResult, str, true);
                }
            }
        }
    }

    public final void A01(String str) {
        synchronized (this) {
            C7z0 c7z0 = this.A01;
            if (c7z0 != null) {
                c7z0.Bcr(str);
            }
        }
    }
}
