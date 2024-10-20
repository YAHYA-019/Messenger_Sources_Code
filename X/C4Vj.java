package X;

import com.facebook.graphservice.fb.GraphQLServiceJNI;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.pando.IPandoGraphQLService;

/* renamed from: X.4Vj, reason: invalid class name */
/* loaded from: 4Vj.class */
public final class C4Vj implements GraphQLService.Token {
    public IPandoGraphQLService.Token A00;
    public final /* synthetic */ GraphQLServiceJNI A01;

    public C4Vj(GraphQLServiceJNI graphQLServiceJNI, IPandoGraphQLService.Token token) {
        this.A01 = graphQLServiceJNI;
        this.A00 = token;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.Token, X.C3rz
    public void cancel() {
        this.A00.cancel();
    }
}
