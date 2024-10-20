package X;

import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.tigon.TigonErrorException;

/* loaded from: Fgi.class */
public final class Fgi implements GraphQLService.DataCallbacks {
    public final ReqContext A00;
    public final GraphQLService.DataCallbacks A01;

    public Fgi(GraphQLService.DataCallbacks dataCallbacks, String str) {
        this.A01 = dataCallbacks;
        this.A00 = AnonymousClass018.A03(str, ReqContextTypeResolver.resolveName("graphql_java"));
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onError(TigonErrorException tigonErrorException, Summary summary) {
        int resolveName = ReqContextTypeResolver.resolveName("graphql_java");
        ReqContext reqContext = this.A00;
        ReqContext A02 = AnonymousClass018.A02(reqContext, reqContext.getTag(), resolveName);
        try {
            this.A01.onError(tigonErrorException, summary);
        } finally {
        }
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onUpdate(Tree tree, Summary summary) {
        int resolveName = ReqContextTypeResolver.resolveName("graphql_java");
        ReqContext reqContext = this.A00;
        ReqContext A02 = AnonymousClass018.A02(reqContext, reqContext.getTag(), resolveName);
        try {
            this.A01.onUpdate(tree, summary);
        } finally {
        }
    }
}
