package X;

import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoGraphQLRequest;
import java.util.concurrent.Executor;

/* loaded from: Fkw.class */
public final class Fkw implements IPandoGraphQLService {
    public final IPandoGraphQLService A00;

    public Fkw(IPandoGraphQLService iPandoGraphQLService) {
        this.A00 = iPandoGraphQLService;
    }

    @Override // com.facebook.pando.IPandoGraphQLService
    public PandoGraphQLConsistencyJNI graphQLConsistency() {
        return this.A00.graphQLConsistency();
    }

    @Override // com.facebook.pando.IPandoGraphQLService
    public IPandoGraphQLService.Result initiate(String str, PandoGraphQLRequest pandoGraphQLRequest, GI4 gi4, Executor executor) {
        11T.A0F(pandoGraphQLRequest, 1);
        IPandoGraphQLService.Result initiate = this.A00.initiate(str, pandoGraphQLRequest, new Fks(gi4), executor);
        return new IPandoGraphQLService.Result(initiate.tree, new Fkv(gi4, initiate.cancelToken));
    }
}
