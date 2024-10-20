package X;

import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.tigon.TigonErrorException;

/* loaded from: Fgj.class */
public final class Fgj implements GraphQLService.OperationCallbacks {
    public final ReqContext A00;
    public final GraphQLService.OperationCallbacks A01;

    public Fgj(GraphQLService.OperationCallbacks operationCallbacks, String str) {
        this.A01 = operationCallbacks;
        this.A00 = AnonymousClass018.A03(str, ReqContextTypeResolver.resolveName("graphql_java"));
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.OperationCallbacks
    public void onError(TigonErrorException tigonErrorException) {
        int resolveName = ReqContextTypeResolver.resolveName("graphql_java");
        ReqContext reqContext = this.A00;
        ReqContext A02 = AnonymousClass018.A02(reqContext, reqContext.getTag(), resolveName);
        try {
            this.A01.onError(tigonErrorException);
        } finally {
        }
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.OperationCallbacks
    public void onSuccess() {
        int resolveName = ReqContextTypeResolver.resolveName("graphql_java");
        ReqContext reqContext = this.A00;
        ReqContext A02 = AnonymousClass018.A02(reqContext, reqContext.getTag(), resolveName);
        try {
            this.A01.onSuccess();
        } finally {
        }
    }
}
