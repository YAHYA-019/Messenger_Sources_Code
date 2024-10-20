package X;

import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.tigon.TigonErrorException;

/* loaded from: Fgg.class */
public final class Fgg implements GraphQLService.DataCallbacks {
    public final GraphQLService.DataCallbacks A00;

    public Fgg(GraphQLService.DataCallbacks dataCallbacks) {
        this.A00 = dataCallbacks;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onError(TigonErrorException tigonErrorException, Summary summary) {
        ReqContext A04 = AnonymousClass018.A04("GraphQLConsistency_onError", ReqContextTypeResolver.resolveName("graphql_java"));
        try {
            this.A00.onError(tigonErrorException, summary);
            if (A04 != null) {
                A04.close();
            }
        } catch (Throwable th) {
            if (A04 != null) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onUpdate(Tree tree, Summary summary) {
        ReqContext A04 = AnonymousClass018.A04("GraphQLConsistency_onUpdate", ReqContextTypeResolver.resolveName("graphql_java"));
        try {
            this.A00.onUpdate(tree, summary);
            if (A04 != null) {
                A04.close();
            }
        } catch (Throwable th) {
            if (A04 != null) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
