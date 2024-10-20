package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphservice.interfaces.Summary;

/* renamed from: X.Daz, reason: case insensitive filesystem */
/* loaded from: Daz.class */
public final class C2074Daz extends 1RM {
    public final /* synthetic */ C3sa A00;
    public final /* synthetic */ F9Q A01;
    public final /* synthetic */ 7qB A02;
    public final /* synthetic */ 5iL A03;
    public final /* synthetic */ boolean A04;

    public C2074Daz(C3sa c3sa, F9Q f9q, 7qB r304, 5iL r305, boolean z) {
        this.A03 = r305;
        this.A04 = z;
        this.A02 = r304;
        this.A01 = f9q;
        this.A00 = c3sa;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        Summary summary;
        GraphQLResult graphQLResult = (GraphQLResult) obj;
        boolean z = this.A04;
        7qB r0 = this.A02;
        r0.A01 = !z || ((summary = ((AbstractC08294mh) graphQLResult).A02) != null && summary.isNetworkComplete);
        5iL r02 = this.A03;
        5iL.A02(graphQLResult, this.A01, r0, r02);
        5iL.A04(5iL.A00(this.A00.A00, graphQLResult, r0, r02, (Throwable) null), r02);
    }

    public void A03(Throwable th) {
        7qB r0 = this.A02;
        r0.A01 = true;
        5iL r02 = this.A03;
        5iL.A02((GraphQLResult) null, this.A01, r0, r02);
        5iL.A04(5iL.A00(this.A00.A00, (GraphQLResult) null, r0, r02, th), r02);
    }
}
